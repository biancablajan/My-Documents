package me.licenta.mydocuments;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
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
                finish();
                Intent iwBack = new Intent(MyCertificatesActivity.this, MainActivity.class);
                MyCertificatesActivity.this.startActivity(iwBack);
            }
        });

        final Button buttonDocumentsFromMyCar = (Button) findViewById(R.id.buttonDocumentsFromMyCar);
        buttonDocumentsFromMyCar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent buttonDocumentsFromMyCar = new Intent(MyCertificatesActivity.this, DocumentsFromMyCarActivity.class);
                MyCertificatesActivity.this.startActivity(buttonDocumentsFromMyCar);
            }
        });

        final Button buttonMyDiplomas = (Button) findViewById(R.id.buttonMyDiplomas);
        buttonMyDiplomas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent buttonMyDiplomas = new Intent(MyCertificatesActivity.this, MyDiplomasActivity.class);
                MyCertificatesActivity.this.startActivity(buttonMyDiplomas);
            }
        });

        final Button buttonMyWarranties = (Button) findViewById(R.id.buttonMyWarranties);
        buttonMyWarranties.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent buttonMyWarranties = new Intent(MyCertificatesActivity.this, MyWarrantiesActivity.class);
                MyCertificatesActivity.this.startActivity(buttonMyWarranties);
            }
        });

        final Button buttonMyContracts = (Button) findViewById(R.id.buttonMyContracts);
        buttonMyContracts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent buttonMyContracts = new Intent(MyCertificatesActivity.this, MyContracts.class);
                MyCertificatesActivity.this.startActivity(buttonMyContracts);
            }
        });

        final Button buttonOtherCertificates = (Button) findViewById(R.id.buttonOtherCertificates);
        buttonOtherCertificates.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent buttonOtherCertificates = new Intent(MyCertificatesActivity.this, OtherCertificatesActivity.class);
                MyCertificatesActivity.this.startActivity(buttonOtherCertificates);
            }
        });


    }
}
