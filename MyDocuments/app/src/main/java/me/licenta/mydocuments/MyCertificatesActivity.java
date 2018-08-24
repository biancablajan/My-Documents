package me.licenta.mydocuments;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MyCertificatesActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mycertificates);

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
                },1000);
            }
        });

        //declare DOCUMENTS FROM MY CAR button and create a Listener to redirect to corresponding page when clicking on it
        final Button buttonDocumentsFromMyCar = (Button) findViewById(R.id.buttonDocumentsFromMyCar);
        buttonDocumentsFromMyCar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        clickOnDocumentsFromMyCar();
                        finish();
                    }
                },1000);
            }
        });

        //declare MY DIPLOMAS button and create a Listener to redirect to corresponding page when clicking on it
        final Button buttonMyDiplomas = (Button) findViewById(R.id.buttonMyDiplomas);
        buttonMyDiplomas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        clickOnMyDiplomas();
                        finish();
                    }
                },1000);
            }
        });

        //declare MY WARRANTIES button and create a Listener to redirect to corresponding page when clicking on it
        final Button buttonMyWarranties = (Button) findViewById(R.id.buttonMyWarranties);
        buttonMyWarranties.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        clickOnMyWarranties();
                        finish();
                    }
                },1000);
            }
        });

        //declare MY CONTRACTS button and create a Listener to redirect to corresponding page when clicking on it
        final Button buttonMyContracts = (Button) findViewById(R.id.buttonMyContracts);
        buttonMyContracts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        clickOnMyContracts();
                        finish();
                    }
                },1000);
            }
        });

        //declare OTHER CERTIFICATES button and create a Listener to redirect to corresponding page when clicking on it
        final Button buttonOtherCertificates = (Button) findViewById(R.id.buttonOtherCertificates);
        buttonOtherCertificates.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        clickOnOtherCertificates();
                        finish();
                    }
                },1000);
            }
        });


    }
    //==============================================================================================
    public void clickOnBack(){
        Intent iwBack = new Intent(MyCertificatesActivity.this, MainActivity.class);
        MyCertificatesActivity.this.startActivity(iwBack);
    }

    public void clickOnDocumentsFromMyCar(){
        Intent buttonDocumentsFromMyCar = new Intent(MyCertificatesActivity.this, DocumentsFromMyCarActivity.class);
        MyCertificatesActivity.this.startActivity(buttonDocumentsFromMyCar);
    }

    public void clickOnMyDiplomas(){
        Intent buttonMyDiplomas = new Intent(MyCertificatesActivity.this, MyDiplomasActivity.class);
        MyCertificatesActivity.this.startActivity(buttonMyDiplomas);
    }

    public void clickOnMyWarranties(){
        Intent buttonMyWarranties = new Intent(MyCertificatesActivity.this, MyWarrantiesActivity.class);
        MyCertificatesActivity.this.startActivity(buttonMyWarranties);
    }

    public void clickOnMyContracts() {
        Intent buttonMyContracts = new Intent(MyCertificatesActivity.this, MyContractsActivity.class);
        MyCertificatesActivity.this.startActivity(buttonMyContracts);
    }

    public void clickOnOtherCertificates(){
        Intent buttonOtherCertificates = new Intent(MyCertificatesActivity.this, OtherCertificatesActivity.class);
        MyCertificatesActivity.this.startActivity(buttonOtherCertificates);
    }
}
