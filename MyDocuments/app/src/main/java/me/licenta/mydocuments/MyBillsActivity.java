package me.licenta.mydocuments;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

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
                Intent iwBack = new Intent(MyBillsActivity.this,MainActivity.class);
                MyBillsActivity.this.startActivity(iwBack);
            }
        });

        //declare UPLOAD A BILL Button and create a Listener to redirect to Upload a Bill page when clicking on it
        final Button buttonUploadABill = (Button) findViewById(R.id.buttonUploadABill);
        buttonUploadABill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //create class and layout PLS
            }
        });

    }
}
