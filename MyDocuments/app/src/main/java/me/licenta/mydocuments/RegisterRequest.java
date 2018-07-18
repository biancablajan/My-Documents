package me.licenta.mydocuments;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;
// String request allows to make requests to the register.php file from the server and get a response as a string
public class RegisterRequest extends StringRequest {
    private static final String REGISTER_REQUEST_URL = "http://mydocumentsapp.000webhostapp.com/Register.php";
    private Map<String, String> params;

    public RegisterRequest(String full_name, String email,String password, Response.Listener<String> listener) {
        super(Method.POST, REGISTER_REQUEST_URL, listener, null);
        params = new HashMap<>();
        params.put("full_name", full_name);
        params.put("email", email);
        params.put("password", password);
    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}