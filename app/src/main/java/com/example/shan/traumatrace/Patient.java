package com.example.shan.traumatrace;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class Patient extends AppCompatActivity {

    private Button button;
    DataPatient myDb;
    EditText editegender,editcatogory,editcondition;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient);



        Spinner mySpinner1 = (Spinner) findViewById(R.id.spinner1);

        ArrayAdapter<String> myAdapter1 = new ArrayAdapter<String>(Patient.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.catagory));

        myAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner1.setAdapter(myAdapter1);


        Spinner mySpinner2 = (Spinner) findViewById(R.id.spinner2);

        ArrayAdapter<String> myAdapter2 = new ArrayAdapter<String>(Patient.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.condition));

        myAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner2.setAdapter(myAdapter2);


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
        Intent i=new Intent(this,Patient1.class);
        startActivity(i);
    }
}
