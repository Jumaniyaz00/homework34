package com.example.homework34;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SekondActivity extends AppCompatActivity {

    TextView txtPerson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sekond);
        txtPerson =findViewById(R.id.txt_person);
        Intent intent = getIntent();
        Person person = (Person) intent.getSerializableExtra("key");
        txtPerson.setText(person.toString());

    }
}
