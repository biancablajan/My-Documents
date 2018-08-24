package me.licenta.mydocuments;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MyWalletActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mywallet);

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

        //declare MY IDENTITY CARD button and create a Listener to redirect to corresponding page when clicking on it
        final Button buttonMyIdentityCard = (Button) findViewById(R.id.buttonMyIdentityCard);
        buttonMyIdentityCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        clickOnMyIdentityCard();
                        finish();
                    }
                },1000);
            }
        });

        //declare MY PASSPORT button and create a Listener to redirect to corresponding page when clicking on it
        final Button buttonMyPassport = (Button) findViewById(R.id.buttonMyPassport);
        buttonMyPassport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        clickOnMyPassport();
                        finish();
                    }
                },1000);
            }
        });

        //declare MY DRIVERS LICENSE button and create a Listener to redirect to corresponding page when clicking on it
        final Button buttonMyDriversLicense = (Button) findViewById(R.id.buttonMyDriversLicense);
        buttonMyDriversLicense.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        clickOnMyDriversLicense();
                        finish();
                    }
                },1000);
            }
        });

        //declare MY TICKETS button and create a Listener to redirect to corresponding page when clicking on it
        final Button buttonMyTickets = (Button) findViewById(R.id.buttonMyTickets);
        buttonMyTickets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        clickOnMyTickets();
                        finish();
                    }
                },1000);
            }
        });

        //declare MY BADGES button and create a Listener to redirect to corresponding page when clicking on it
        final Button buttonMyBadges = (Button) findViewById(R.id.buttonMyBadges);
        buttonMyBadges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        clickOnMyBadges();
                        finish();
                    }
                },1000);
            }
        });

        //declare MY HEALTH CARD button and create a Listener to redirect to corresponding page when clicking on it
        final Button buttonMyHealthCard = (Button) findViewById(R.id.buttonMyHealthCard);
        buttonMyHealthCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        clickOnMyHealthCard();
                        finish();
                    }
                },1000);
            }
        });

    }
    //==============================================================================================
    public void clickOnBack() {
        Intent iwBack = new Intent(MyWalletActivity.this, MainActivity.class);
        MyWalletActivity.this.startActivity(iwBack);
    }

    public void clickOnMyIdentityCard(){
        Intent buttonMyIdentityCard = new Intent(MyWalletActivity.this, MyIdentityCardActivity.class);
        MyWalletActivity.this.startActivity(buttonMyIdentityCard);
    }

    public void clickOnMyPassport(){
        Intent buttonMyPassport = new Intent(MyWalletActivity.this, MyPassportActivity.class);
        MyWalletActivity.this.startActivity(buttonMyPassport);
    }

    public void clickOnMyDriversLicense(){
        Intent buttonMyDriversLicense = new Intent(MyWalletActivity.this, MyDriversLicenseActivity.class);
        MyWalletActivity.this.startActivity(buttonMyDriversLicense);
    }

    public void clickOnMyTickets(){
        Intent buttonMyTickets = new Intent(MyWalletActivity.this, MyTicketsActivity.class);
        MyWalletActivity.this.startActivity(buttonMyTickets);
    }

    public void clickOnMyBadges(){
        Intent buttonMyBadges = new Intent(MyWalletActivity.this, MyBadgesActivity.class);
        MyWalletActivity.this.startActivity(buttonMyBadges);
    }

    public void clickOnMyHealthCard(){
        Intent buttonMyHealthCard = new Intent(MyWalletActivity.this, MyHealthCardActivity.class);
        MyWalletActivity.this.startActivity(buttonMyHealthCard);
    }
}

