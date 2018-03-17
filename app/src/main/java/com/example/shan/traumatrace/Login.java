package com.example.shan.traumatrace;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    private Button button;
    DatabaseHelper myDb;
    EditText editemail,editpassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        myDb = new  DatabaseHelper(this);

        editemail = (EditText)findViewById(R.id.editText9);
        editpassword = (EditText)findViewById(R.id.editText10);


        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isInserted = myDb.insertData(editemail.getText().toString(),editpassword.getText().toString());
                if(isInserted == true)
                    Toast.makeText(Login.this,"Data Inserted",Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(Login.this, "Data not Inserted", Toast.LENGTH_LONG).show();


                click();



            }
        });
    }

    public void click(){
        Intent i=new Intent(this,Patient.class);
        startActivity(i);
    }
}
