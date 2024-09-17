package com.example.android.hostel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class optionActivity extends AppCompatActivity {
EditText Username;
EditText Password;
Button login;
Button createId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option);

         Username= findViewById(R.id.username);
        Password = findViewById(R.id.password);
        login = findViewById(R.id.goButton);
        createId = findViewById(R.id.createButton);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String inputemail = Username.getText().toString();
                String inputpassword = Password.getText().toString();
                if (inputemail.isEmpty() || inputpassword.isEmpty())
                {
                    Toast.makeText(optionActivity.this,"PLEASE ENTER THE DETAILS",Toast.LENGTH_SHORT).show();

                }


//                    if (valid ==false)
//                    {
//                        Toast.makeText(optionActivity.this, "Incorrect Details", Toast.LENGTH_SHORT).show();
//
//                    }
                    else  {


                        Intent openToUser = new Intent(optionActivity.this, UserActivity.class);
                        startActivity(openToUser);
                    }
                }




        });
        createId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent optionToCreate = new Intent(optionActivity.this,createProfile.class);
                startActivity(optionToCreate);
            }
        });

}


//     boolean validate (String email, String password) {
//        if (email.equals(Username) && password.equals(Password))
//        {
//            return true;
//        }
//
//            return false;
//
//    }
}
