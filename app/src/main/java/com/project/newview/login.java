package com.project.newview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class login extends AppCompatActivity {

    private EditText txtEmail;
    private EditText txtPswd;
    private Button btnsign;
    private TextView tvMsg;


//    private FirebaseAuth mAuth;
//    FirebaseAuth.AuthStateListener mAuthListener;


//  private ProgressDialog progressDialog;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        txtEmail = (EditText) findViewById(R.id.emailET);
        txtPswd = (EditText) findViewById(R.id.passwordET);
        btnsign = (Button) findViewById(R.id.bt_signin);
        tvMsg = (TextView) findViewById(R.id.tv_msg);
    }

        //Assign instances
//        mAuth = FirebaseAuth.getInstance();
//        mAuthListener = new FirebaseAuth.AuthStateListener() {
//            @Override
//            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
//
//                FirebaseUser user = firebaseAuth.getCurrentUser();
//                if (user != null) {
//
//                } else {
//                    startActivity(new Intent(login.this, ProfileActivity.class));
//                }
//            }
//        };
//
//    }
//        if(firebaseAuth.getCurrentUser()!=null){
//            finish();
//            startActivity(new Intent(getApplicationContext(),ProfileActivity.class));
//        }
//        progressDialog= new ProgressDialog(this);

    //Assign ID

//
//        btnsign.setOnClickListener(this);
//        tvMsg.setOnClickListener(this);

    //Onclick Listener
//        btnsign.setOnClickListener(new View.OnClickListener()
//        {
//        public void onClick (View v){
//        String email = txtEmail.getText().toString().trim();
//        String password = txtPswd.getText().toString().trim();
//
//        if (!TextUtils.isEmpty(email) && !TextUtils.isEmpty(password)) {
//            mAuth.createUserWithEmailAndPassword(email, password).
//                    addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
//                        @Override
//                        public void onComplete(@NonNull Task<AuthResult> task) {
//                            if (task.isSuccessful()) {
//                                //user is successfully registered and logged
//                                //profile Activity here
//
//                                startActivity(new Intent(login.this, ProfileActivity.class));
//                                Toast.makeText(login.this, "Registered Successfully", Toast.LENGTH_SHORT).show();
//                            }
//                            else {
//                                Toast.makeText(login.this, "Could not Register", Toast.LENGTH_SHORT).show();
//                            }
//                        }
//                    });
//                }
//            }
//
//    });



//    @Override
//    protected void onStart(){
//        super.onStart();
//        mAuth.addAuthStateListener(mAuthListener);
//    }
//
//    @Override
//    protected void onStop(){
//        super.onStop();
//        mAuth.removeAuthStateListener(mAuthListener);
//    }

    public void gotoprofile(View view){
        Intent profilepage = new Intent(login.this, ProfileActivity.class);
            startActivity(profilepage);

    }


   public void gotoregisterpage(View view){
        Intent registerpage = new Intent(login.this, register.class);
        startActivity(registerpage);
    }


//    private void registerUser(){
//        String email= txtEmail.getText().toString().trim();
//        String password = txtPswd.getText().toString().trim();
//
//        if(TextUtils.isEmpty(email)){
//            //email is empty
//            Toast.makeText(this, "Please Enter Email", Toast.LENGTH_SHORT).show();
//            //stop function executing further
//            return;
//        }
//
//        if(TextUtils.isEmpty(password)){
//            //password is empty
//            Toast.makeText(this, "Please Enter Password", Toast.LENGTH_SHORT).show();
//            //stop function executing further
//            return;
//
//        }
//        //if validations are ok
//        // we will first show progressbar
//
//        progressDialog.setMessage("Registering User");
//        progressDialog.show();
//        firebaseAuth.createUserWithEmailAndPassword(email,password).
//                addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
//                    @Override
//                    public void onComplete(@NonNull Task<AuthResult> task) {
//                        progressDialog.dismiss();
//                        if(task.isSuccessful()){
//                            //user is successfully registered and logged
//                            //profile Activity here
//                            finish();
//                            startActivity(new Intent(getApplicationContext(),ProfileActivity.class));
//                            Toast.makeText(login.this,"Registered Successfully", Toast.LENGTH_SHORT).show();
//                        }
//                        else{
//                            Toast.makeText(login.this,"Could not Register", Toast.LENGTH_SHORT).show();
//                        }
//                    }
//                });
//    }
//
//    @Override
//    public void onClick(View view) {
//        if(view==btnsign){
//            registerUser();
//        }
//        if(view==tvMsg){
//            ///will open login activity here
//            finish();
//            startActivity(new Intent(this,ProfileActivity.class));
//
//        }
//    }


}





