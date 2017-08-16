package com.project.newview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class register extends AppCompatActivity implements AdapterView.OnItemSelectedListener {


    Spinner spinner_industry;
    private EditText txtEmail;
    private EditText txtPswd;
    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        txtEmail = (EditText) findViewById(R.id.emailET);
        txtPswd = (EditText) findViewById(R.id.passwordET);
        firebaseAuth=FirebaseAuth.getInstance();

        spinner_industry = (Spinner) findViewById(R.id.spinner_Industry);

        // Create an ArrayAdapter using the string array and a default spinner layout
        //industries= getResources().getStringArray(R.array.industry_names);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, INDUSTRIES);
        //adapter = ArrayAdapter.createFromResource(this, R.array.industry_names, android.R.layout.simple_spinner_item);
        // Drop down layout style - list view with radio button
        //adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner_industry.setAdapter(adapter);
        spinner_industry.setOnItemSelectedListener(this);
    }


    static final String[] INDUSTRIES = new String[]{
            "Accommodations", "Accounting", "Advertising", "Aerospace", "Agriculture & Agribusiness", "Air Transportation",
            "Apparel & Accessories", "Auto", "Banking", "Beauty & Cosmetics", "Biotechnology", "Chemical", "Communications",
            "Computer", "Construction", "Consulting", "Consumer Products", "Education", "Electronics", "Employment", "Energy",
            "Entertainment & Recreation", "Fashion", "Financial Services", "Fine Arts", "Food & Beverage", "Green Technology",
            "Health", "Information", "Information Technology", "Insurance", "Journalism & News", "Legal Services", "Manufacturing",
            "Media & Broadcasting", "Medical Devices & Supplies", "Motion Pictures & Video", "Music", "Pharmaceutical",
            "Public Administration", "Public Relations", "Publishing", "Rail", "Real Estate", "Retail", "Service", "Sports",
            "Technology", "Telecommunications", "Tourism", "Transportation", "Travel", "Utilities", "Video Game", "Web Services"

    };


    public void gotologinpage_Click(View v){

//        final ProgressDialog progressDialog = ProgressDialog.show(register.this,"Please wait...", "Processing..",true);
//        (firebaseAuth.createUserWithEmailAndPassword(txtEmail.getText().toString(),txtPswd.getText().toString())).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
//            @Override
//            public void onComplete(@NonNull Task<AuthResult> task) {
//                progressDialog.dismiss();
//                if(task.isSuccessful()){
//                    Toast.makeText(register.this, "Registration successful", Toast.LENGTH_LONG).show();
//                    Intent i = new Intent(register.this,login.class);
//                    startActivity(i);
//                }
//                else
//                {
//                    Toast.makeText(register.this,"Registration successful", Toast.LENGTH_LONG).show();
//                }
//            }
//        });



    }


    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

        Toast.makeText(this, INDUSTRIES[i], Toast.LENGTH_LONG).show();

    }

    public void onNothingSelected(AdapterView<?> parent) {
        //Another Interface callback
    }

    public void gotoprofile(View view){
        Intent profilepage = new Intent(register.this, ProfileActivity.class);
        startActivity(profilepage);

    }
}




