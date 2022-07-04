package com.example.sim_card;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.sim_card.databinding.ActivityRegisterBinding;

public class Login extends AppCompatActivity implements View.OnClickListener {
    Button btnLog;
    EditText useraName, password;
    TextView reglink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextView regLink = null;
        try {
            reglink.setText("log in success");
        } catch (Exception e) {
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();

        }
        useraName = (EditText) findViewById(R.id.editUser);
        password = (EditText) findViewById(R.id.editPass);
        reglink = (TextView) findViewById(R.id.reglink);
        btnLog = (Button) findViewById(R.id.btnLog);


        btnLog.setOnClickListener(this);
        reglink.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Login();
    }
    public void Login(){
        Intent intent=new Intent(this, Register.class);
        startActivity(intent);
    }
//        switch (view.getId()){
//
//            case R.id.btnLog:
//                break;
//
//            case R.id.reglink:
////                Intent reg= new Intent(this,Register.class);
////                startActivity(reg);
//                startActivity(new Intent(this,Register.class));
//                break;
//        }
    }
