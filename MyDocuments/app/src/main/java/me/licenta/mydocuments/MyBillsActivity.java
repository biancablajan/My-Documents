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
                finish();
                Intent iwBack = new Intent(MyBillsActivity.this,MainActivity.class);
                MyBillsActivity.this.startActivity(iwBack);
            }
        });

        //declare UPLOAD A BILL Button and create a Listener to redirect to Upload a Bill page when clicking on it
        final Button buttonUploadABill = (Button) findViewById(R.id.buttonUploadABill);
        buttonUploadABill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent buttonUploadABill = new Intent(MyBillsActivity.this, UploadABillActivity.class);
                MyBillsActivity.this.startActivity(buttonUploadABill);
            }
        });

        //declare VIEW MY BILLS Button and create a Listener to redirect to View My Bills page when clicking on it
        final Button buttonViewMyBills = (Button) findViewById(R.id.buttonViewMyBills);
        buttonViewMyBills.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent buttonViewMyBills = new Intent(MyBillsActivity.this, ViewMyBillsActivity.class);
                MyBillsActivity.this.startActivity(buttonViewMyBills);
            }
        });

        //declare SHOW ME STATISTICS Button and create a Listener to redirect to Show Me Statistics page when clicking on it
        final Button buttonShowMeStatistics = (Button) findViewById(R.id.buttonShowMeStatistics);
        buttonShowMeStatistics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent buttonShowMeStatistics = new Intent(MyBillsActivity.this, ShowMeStatisticsActivity.class);
                MyBillsActivity.this.startActivity(buttonShowMeStatistics);
            }
        });

    }
}

