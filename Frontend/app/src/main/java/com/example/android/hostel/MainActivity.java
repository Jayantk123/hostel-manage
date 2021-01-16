package com.example.android.hostel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText email, password;
    private Button login;
    private String eUsername = "admin", ePassword = "123";
    boolean valid  ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = findViewById(R.id.eEmail);
        password = findViewById(R.id.ePassword);
        login = findViewById(R.id.eLogin);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String inputemail = email.getText().toString();
                String inputpassword = password.getText().toString();
                if (inputemail.isEmpty() || inputpassword.isEmpty())
                {
                    Toast.makeText(MainActivity.this,"PLEASE ENTER THE DETAILS",Toast.LENGTH_SHORT).show();

                }
                else
                    {
                    valid = validate(inputemail, inputpassword);
                    if (valid==false)
                    {
                        Toast.makeText(MainActivity.this, "Incorrect Details", Toast.LENGTH_SHORT).show();

                    }
                    else  {
                        Toast.makeText(MainActivity.this, "LOGIN SUCCESSFULL", Toast.LENGTH_SHORT).show();

                        Intent intent = new Intent(MainActivity.this, BOOK.class);
                        startActivity(intent);
                    }
                }


            }

        });

}


     boolean validate (String email, String password) {
        if (email.equals(eUsername) && password.equals(ePassword))
        {
            return true;
        }

            return false;

    }
}
