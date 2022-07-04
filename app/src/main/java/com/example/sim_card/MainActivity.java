package com.example.sim_card;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btnLogout;
    EditText useraName, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        useraName =(EditText) findViewById(R.id.editUser);
        password=(EditText) findViewById(R.id.editPass);
        btnLogout=(Button) findViewById(R.id.btnLogout);


        btnLogout.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnLogout:
                break;
        }
    }
}
