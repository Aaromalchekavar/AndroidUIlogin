package com.btechbuddy.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Dashboard extends AppCompatActivity {
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        text = findViewById(R.id.textView);
        text.setText("Username is "+ getIntent().getStringExtra("name") + "\n" + " Password is "+getIntent().getStringExtra("pwd") + "\n"+" Thankyou!!!!");

    }
}