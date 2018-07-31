package me.licenta.mydocuments;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //get Full Name from server
        Intent intent = getIntent();
        String fullName =intent.getStringExtra("full_name");

        final TextView welcomeMessage = (TextView) findViewById(R.id.tvWelcomeMsg);

        //text view will get the value when getting the full name from the server to "Welcome to My Documents, " full name
        String message = "Welcome to My Documents, " +fullName;
        welcomeMessage.setText(message);

        //declare MY BILLS button and create a Listener to redirect to My Bills page when clicking the button
        final Button buttonMyBills = (Button) findViewById(R.id.buttonMyBills);
        buttonMyBills.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent buttonMyBills = new Intent(MainActivity.this, MyBillsActivity.class);
                MainActivity.this.startActivity(buttonMyBills);
            }
        });

        //declare MY CERTIFICATES button and create a Listener to redirect to My Certificates page when clicking the button
        final Button buttonMyCertificates = (Button) findViewById(R.id.buttonMyCertificates);
        buttonMyCertificates.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent buttonMyCertificates = new Intent(MainActivity.this, MyCertificatesActivity.class);
                MainActivity.this.startActivity(buttonMyCertificates);
            }
        });

        //declare MY WALLET button and create a Listener to redirect to My Wallet page when clicking the button
        final Button buttonMyWallet = (Button) findViewById(R.id.buttonMyWallet);
        buttonMyWallet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent buttonMyWallet = new Intent(MainActivity.this, MyWalletActivity.class);
                MainActivity.this.startActivity(buttonMyWallet);
            }
        });

        //declare Logout text view and return to Login
        final TextView tvLogOut = (TextView) findViewById(R.id.tvLogOut);
        tvLogOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tvLogOut = new Intent(MainActivity.this,LoginActivity.class);
                MainActivity.this.startActivity(tvLogOut);
                finish();
            }
        });




    }
}
