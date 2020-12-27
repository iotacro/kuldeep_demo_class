package org.probuilder.kuldeep_demo_scroll;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class RegisterData extends AppCompatActivity {

    private TextView userData;
    private TextView passData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_data);
        {
            userData=findViewById(R.id.userData);
            passData=findViewById(R.id.passData);
        }

        Intent intent=getIntent();
        String uname= intent.getStringExtra("userName");
        String pass=intent.getStringExtra("password");


        userData.setText(uname);
        passData.setText(pass);


    }
}