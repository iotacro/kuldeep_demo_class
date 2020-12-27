package org.probuilder.kuldeep_demo_scroll;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText userNameEditText;
    private EditText passEditText;
    private Button sinpBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        {
            userNameEditText=findViewById(R.id.userNameEditText);
            passEditText=findViewById(R.id.passwordEditText);
            sinpBtn=findViewById(R.id.sinupBtn);
        }

        sinpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
//                Toast.makeText(MainActivity.this,"Hello Button clcik ho rahi hai",Toast.LENGTH_SHORT).show();
//                Intent intent=new Intent(MainActivity.this,RegisterData.class);   // 1 ki kaha se sa raha hu    2 kaha par jana hai
//                startActivity(intent);


                  checkValidation();

            }
        });


    }

    public void checkValidation()
    {
        String userName=userNameEditText.getText().toString();
        String pass=passEditText.getText().toString();

        if (TextUtils.isEmpty(userName))
        {
            userNameEditText.setError("Enter UserName");

        } else if(TextUtils.isEmpty(pass ))
        {
            passEditText.setError("Enter Password");
        }else{

//            startActivity(new Intent(MainActivity.this,RegisterData.class));

            Intent intent=new Intent(MainActivity.this,RegisterData.class);
            intent.putExtra("userName",userName);
            intent.putExtra("password",pass);
            startActivity(intent);







        }



    }
}