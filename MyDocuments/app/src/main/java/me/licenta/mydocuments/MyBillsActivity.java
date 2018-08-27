package me.licenta.mydocuments;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.scanlibrary.ScanActivity;
import com.scanlibrary.ScanConstants;

import java.io.IOException;

public class MyBillsActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mybills);

        //declare Back Image view and create a Listener to redirect to previous page when clicking on it
        final ImageView  iwBack= (ImageView) findViewById(R.id.iwBack);
        iwBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        clickOnBack();
                        finish();
                    }
                },1000);
            }
        });
        //declare OCR MY BILL Button and create a Listener to redirect to OCR My Bill Instructions page when clicking on it
        final Button buttonOCRMyBill = (Button) findViewById(R.id.buttonOCRMyBill);
        buttonOCRMyBill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        clickOnOCRMyBill();
                        finish();
                    }
                },1000);
            }
        });

        //declare SCAN WHOLE BILL Button and create a Listener to redirect to Scan Whole Bill page when clicking on it
        final Button buttonScanWholeBill = (Button) findViewById(R.id.buttonScanWholeBill);
        buttonScanWholeBill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        clickOnScanWholeBill();
                        finish();
                    }
                },1000);
            }
        });

        //declare VIEW MY BILLS Button and create a Listener to redirect to View My Bills page when clicking on it
        final Button buttonViewMyBills = (Button) findViewById(R.id.buttonViewMyBills);
        buttonViewMyBills.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        clickOnViewMyBills();
                        finish();
                    }
                },1000);
            }
        });

        //declare SHOW ME MY LAST BILLS Button and create a Listener to redirect to Show Me My Last Bills page when clicking on it
        final Button buttonShowMeMyLastBills = (Button) findViewById(R.id.buttonShowMeMyLastBills);
        buttonShowMeMyLastBills.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        clickOnShowMeMyLastBills();
                        finish();
                    }
                },1000);
            }
        });

    }
    //==============================================================================================
    public void clickOnBack() {
        Intent iwBack = new Intent(MyBillsActivity.this, MainActivity.class);
        MyBillsActivity.this.startActivity(iwBack);
    }

    public void clickOnOCRMyBill(){
        Intent buttonOCRMyBill = new Intent(MyBillsActivity.this, MyBills_OCRMyBillInstructions.class);
        MyBillsActivity.this.startActivity(buttonOCRMyBill);
    }

    public void clickOnScanWholeBill(){
        final String CURRENT_FOLDER = "My Bills";
        int REQUEST_CODE = 99;
        int preference = ScanConstants.OPEN_CAMERA;
        Intent intent = new Intent(MyBillsActivity.this, ScanActivity.class);
        intent.putExtra(ScanConstants.OPEN_INTENT_PREFERENCE, preference);
        intent.putExtra(ScanConstants.CURRENT_FOLDER, CURRENT_FOLDER.toString());
        startActivityForResult(intent, REQUEST_CODE);
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 99 && resultCode == Activity.RESULT_OK) {
            Uri uri = data.getExtras().getParcelable(ScanConstants.SCANNED_RESULT);
            Bitmap bitmap = null;
            try {
                bitmap = MediaStore.Images.Media.getBitmap(getContentResolver(), uri);
                getContentResolver().delete(uri, null, null);
                //scannedImageView.setImageBitmap(bitmap);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void clickOnViewMyBills(){
        Intent buttonViewMyBills = new Intent(MyBillsActivity.this, MyBills_ViewMyBills.class);
        MyBillsActivity.this.startActivity(buttonViewMyBills);
    }

    public void clickOnShowMeMyLastBills(){
        Intent buttonShowMeMyLastBills = new Intent(MyBillsActivity.this, MyBills_ShowMeMyLastBills.class);
        MyBillsActivity.this.startActivity(buttonShowMeMyLastBills);
    }
}