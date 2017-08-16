package com.project.newview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;





public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void gotologinpage(View view){
        Intent loginpage = new Intent(MainActivity.this, login.class);
        startActivity(loginpage);
    }

    public void gotoregisterpage(View view){
        Intent registerpage = new Intent(MainActivity.this, register.class);
        startActivity(registerpage);
    }
}
