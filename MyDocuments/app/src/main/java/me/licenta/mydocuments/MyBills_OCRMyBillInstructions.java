package me.licenta.mydocuments;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MyBills_OCRMyBillInstructions extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mybills_ocrmybillinstructions);

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
        });
        //declare PROCEED button and create a Listener to redirect to OCR My Bill page when clicking on it
        final Button buttonProceed = (Button) findViewById(R.id.buttonProceed);
        buttonProceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        clickOnProceed();
                        finish();
                    }
                }, 1000);
            }
        });
    }
//==================================================================================================
public void clickOnBack() {
    Intent iwBack = new Intent(MyBills_OCRMyBillInstructions.this, MyBillsActivity.class);
    MyBills_OCRMyBillInstructions.this.startActivity(iwBack);
}

    public void clickOnProceed(){
        Intent buttonProceed = new Intent(MyBills_OCRMyBillInstructions.this, MyBills_OCRMyBills.class);
        MyBills_OCRMyBillInstructions.this.startActivity(buttonProceed);
    }

}
