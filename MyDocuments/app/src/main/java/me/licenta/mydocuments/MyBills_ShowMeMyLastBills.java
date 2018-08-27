package me.licenta.mydocuments;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MyBills_ShowMeMyLastBills extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mybills_showmemylastbills);

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

        final String ServiceName = getIntent().getStringExtra("Service Name");
        final String DueDate = getIntent().getStringExtra("Due Date");
        final String TotalPayment = getIntent().getStringExtra("Total Payment");

        final TextView DueDateOrange = (TextView) findViewById(R.id.dueDateOrange);
        final TextView TotalPaymentOrange = (TextView) findViewById(R.id.TotalPaymentOrange);
        if (ServiceName != null){
        if (ServiceName.contains("Orange")) {
            DueDateOrange.setText(DueDate);
            TotalPaymentOrange.setText(TotalPayment);
        }}

        final TextView DueDateEon = (TextView) findViewById(R.id.DueDateEon);
        final TextView TotalPaymentEon = (TextView) findViewById(R.id.TotalPaymentEon);
        if (ServiceName != null){
        if (ServiceName.contains("E.ON")){
            DueDateOrange.setText(DueDate);
            TotalPaymentEon.setText(TotalPayment);
        }}
    }
    //==============================================================================================
    public void clickOnBack() {
        Intent iwBack = new Intent(MyBills_ShowMeMyLastBills.this, MyBillsActivity.class);
        MyBills_ShowMeMyLastBills.this.startActivity(iwBack);
    }
}
