package com.example.shan.traumatrace;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Patient1 extends AppCompatActivity {

    private Button button;
    DataPatient myDb;
    EditText editicu,editvendilator,edittheater,editm1,editm2,editm3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient1);

        myDb = new DataPatient(this);


        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                click();


            }
        });
    }
    public void click(){
        Intent i=new Intent(this,Result.class);
        startActivity(i);
    }
}
