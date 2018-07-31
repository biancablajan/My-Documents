package me.licenta.mydocuments;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

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

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String email = etEmail.getText().toString();
                final String password = etPassword.getText().toString();

                Response.Listener <String> responseListener = new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        // convert the response into a JSON object, surrounded with try/catch
                        try {
                            JSONObject jsonResponse = new JSONObject(response);
                            boolean success = jsonResponse.getBoolean("success");

                            if (success){
                                //get the info from the jsonResponse and then send it to the MainActivity
                                String fullName = jsonResponse.getString("full_name");

                                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                                intent.putExtra("full_name", fullName);

                                //start the activity
                                LoginActivity.this.startActivity(intent);
                                finish();

                            }else{
                                AlertDialog.Builder builder = new AlertDialog.Builder(LoginActivity.this);
                                builder.setMessage("Login Failed")
                                        .setNegativeButton("Retry",null)
                                        .create()
                                        .show();

                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }

                    }
                };
                LoginRequest loginRequest = new LoginRequest(email, password, responseListener);
                RequestQueue queue = Volley.newRequestQueue(LoginActivity.this);
                queue.add(loginRequest);
            }
        });

    }
}


