package com.btechbuddy.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button myButton;
    EditText myUsername;
    EditText myPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myButton = findViewById(R.id.button);
        myPassword = findViewById(R.id.password);
        myUsername = findViewById(R.id.username);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String username = myUsername.getText().toString();
                String password = myPassword.getText().toString();
                Log.d("Username", username);
                Log.d("password", password);
                if(username.isEmpty()&&password.isEmpty()){
                    Toast.makeText(getApplicationContext(),"Username and Password should not be Empty",Toast.LENGTH_LONG).show();
                }

                else if(username.isEmpty()){
                    Toast.makeText(getApplicationContext(),"Username should not be Empty",Toast.LENGTH_LONG).show();
                }
                else if(username.length()<6){
                Toast.makeText(getApplicationContext(),"Username should have atleat 6 Characters",Toast.LENGTH_LONG).show();
                }

                else if(password.isEmpty()){
                    Toast.makeText(getApplicationContext(),"Password should not be Empty",Toast.LENGTH_LONG).show();
                }
                else if(password.length()<6){
                Toast.makeText(getApplicationContext(),"Password should have atleat 6 Characters",Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(getApplicationContext(),"Form Validated",Toast.LENGTH_LONG).show();
                    Intent newActivity = new Intent(MainActivity.this,Dashboard.class);
                    newActivity.putExtra("name", username);
                    newActivity.putExtra("pwd",password);
                    startActivity(newActivity);
                }

            }
        });

    }

    /*For Future Reference*/
   /* public void onClickButton(View view) {
        System.out.println("Button Clicked");
    }*/
}
