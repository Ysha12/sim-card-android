package com.example.sim_card;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Register extends AppCompatActivity implements View.OnClickListener{
    Button btnReg;
    EditText fName,lName,email,NID,address,role,repass, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);



        NID =(EditText) findViewById(R.id.editNID);
        fName=(EditText) findViewById(R.id.editFname);
        lName=(EditText) findViewById(R.id.editLname);
        email=(EditText) findViewById(R.id.editEmail);
        address=(EditText) findViewById(R.id.editAddress);
        role=(EditText) findViewById(R.id.editRole);
        password=(EditText) findViewById(R.id.editPass);
        repass=(EditText) findViewById(R.id.editRetrypass);
        btnReg=(Button) findViewById(R.id.btnReg);


        btnReg.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnReg:
                break;
        }
    }
}