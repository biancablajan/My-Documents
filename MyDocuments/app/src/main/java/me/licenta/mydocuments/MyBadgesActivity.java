package me.licenta.mydocuments;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.scanlibrary.ScanActivity;
import com.scanlibrary.ScanConstants;

import java.io.File;
import java.io.IOException;

import static java.sql.DriverManager.println;

public class MyBadgesActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mybadges);


        //declare Back Image view and create a Listener to redirect to previous page when clicking on it
        final ImageView iwBack = (ImageView) findViewById(R.id.iwBack);
        iwBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        clickOnBack();
                        finish();
                    }
                }, 1000);


            }

            ;
        });

        final Button buttonUpload = (Button) findViewById(R.id.buttonUpload);
        buttonUpload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        upload();
                        finish();
                    }
                }, 1000);


            }
        });

        final Button buttonGallery = (Button) findViewById(R.id.buttonGallery);
        buttonGallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        clickOnGallery();
                        finish();
                    }
                }, 1000);

            }
        });


    }
    //=================================================================================================
    public void upload() {
        final String CURRENT_FOLDER = "My Wallet/My Badges";
        int REQUEST_CODE = 99;
        int preference = ScanConstants.OPEN_CAMERA;
        Intent intent = new Intent(MyBadgesActivity.this, ScanActivity.class);
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

    public void clickOnBack() {
        Intent iwBack = new Intent(MyBadgesActivity.this, MyWalletActivity.class);
        MyBadgesActivity.this.startActivity(iwBack);
    }

    public void clickOnGallery() {
        Intent buttonGallery = new Intent(MyBadgesActivity.this, View_MyBadges.class);
        MyBadgesActivity.this.startActivity(buttonGallery);
    }
}





