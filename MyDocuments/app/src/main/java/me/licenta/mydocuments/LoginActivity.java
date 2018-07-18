package me.licenta.mydocuments;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // declare the input fields of EditText class type to be found in the view by their ids
        final EditText etEmail = (EditText) findViewById(R.id.etEmail);
        final EditText etPassword = (EditText) findViewById(R.id.etPassword);

        // declare the Login button of class Button to be found in the view by its id
        final Button buttonLogin = (Button) findViewById(R.id.buttonLogin);

        // declare the Register now text of class TextView to be found in the view by its id
        final TextView registerLink = (TextView) findViewById(R.id.tvRegisterNow);

        //Create a click listener, so if the textView is clicked, the instructions from the OnClick method are followed.
        registerLink.setOnClickListener(new View.OnClickListener() {
            @Override
            //Go from the Login page to the Register page using a click on the textView
            public void onClick(View v) {
                Intent registerLink = new Intent(LoginActivity.this, RegisterActivity.class);
                LoginActivity.this.startActivity(registerLink);

            }
        });
        }

    //public void setContentView(int contentView) {
       //this.contentView = contentView;
        //setContentView(R.layout.activity_login);
   // }
}

