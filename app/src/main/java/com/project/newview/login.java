package com.project.newview;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class login extends AppCompatActivity {

    private EditText txtEmail;
    private EditText txtPswd;
    private FirebaseAuth firebaseAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        txtEmail = (EditText) findViewById(R.id.emailET);
        txtPswd = (EditText) findViewById(R.id.passwordET);
        firebaseAuth=FirebaseAuth.getInstance();


    }


    public void gotoqrpage(View v){

        final ProgressDialog progressDialog = ProgressDialog.show(login.this,"Please wait...", "Processing..",true);
        (firebaseAuth.createUserWithEmailAndPassword(txtEmail.getText().toString(),txtPswd.getText().toString())).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                progressDialog.dismiss();
                if(task.isSuccessful()){
                    Toast.makeText(login.this, "Login successful", Toast.LENGTH_LONG).show();
                    Intent i = new Intent(login.this,qrcode.class);
                    startActivity(i);
                }
                else
                {
                    Log.e("ERROR", task.getException().toString());
                    Toast.makeText(login.this, task.getException().getMessage(),Toast.LENGTH_LONG).show();
                }
            }
        });

    }


   public void gotoregisterpage(View view){
        Intent registerpage = new Intent(login.this, register.class);
        startActivity(registerpage);
    }
}





