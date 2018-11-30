package com.example.admin.foot;


import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnSignUp,btnSignIn;
    TextView txtSlogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSignIn=(Button)findViewById(R.id.btnSignIn);
        btnSignUp=(Button)findViewById(R.id.btnSignUp);
        txtSlogin=(TextView)findViewById(R.id.txtslogin);
       // Typeface face=Typeface.createFromAsset(getAssets(),"fonts/NABILA.TTF");
        //txtSlogin.setTypeface(face);
    }

    public void signUp(View view) {
        Intent intent = new Intent(MainActivity.this,SignUp.class);
        startActivity(intent);
    }

    public void signIn(View view) {
        Intent intent = new Intent(MainActivity.this,SignIn.class);
        startActivity(intent);
    }
}
