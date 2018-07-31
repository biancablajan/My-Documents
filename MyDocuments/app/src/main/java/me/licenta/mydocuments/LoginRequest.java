package me.licenta.mydocuments;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;
// String request allows to make requests to the login.php file from the server and get a response as a string
public class LoginRequest extends StringRequest {
    private static final String LOGIN_REQUEST_URL = "http://mydocumentsapp.000webhostapp.com/Login.php";
    private Map<String, String> params;

    public LoginRequest(String email,String password, Response.Listener<String> listener) {
        super(Request.Method.POST, LOGIN_REQUEST_URL, listener, null);
        params = new HashMap<>();
        params.put("email", email);
        params.put("password", password);
    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}
