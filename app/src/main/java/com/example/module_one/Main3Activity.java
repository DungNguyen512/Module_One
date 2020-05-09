package com.example.module_one;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Main3Activity extends AppCompatActivity implements View.OnClickListener {

    EditText txtEmail, txtPassword;
    Button btnLogIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        txtEmail = findViewById(R.id.edtEmail);
        txtPassword = findViewById(R.id.edtPassword);
        btnLogIn = findViewById(R.id.btnLogIn);
        btnLogIn.setOnClickListener(Main3Activity.this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnLogIn) {
            String email = txtEmail.getText().toString().trim();
            if (!TextUtils.isEmpty(email)) {
                Toast.makeText(Main3Activity.this, "Wellcome" + " " + email, Toast.LENGTH_LONG).show();
            }
        }

    }
}
