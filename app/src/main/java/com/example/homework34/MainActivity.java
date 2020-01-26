package com.example.homework34;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    Adapter adapter = new Adapter();
    Person person = new Person("Askar", "teacher", "Asanov", 22);
    Person person1 = new Person("Kubat", "business man", "Aidarov", 29);
    Person person2 = new Person("Jumaniyaz", "student", "Sobirov", 25);
    Person person3 = new Person("Bayel", "business man", "Abdukadrov", 19);
    Person person4 = new Person("Azat", "pilot", "Abdukadrov", 22);
    ArrayList<Person> list = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         recyclerView = findViewById(R.id.main_recyclerview);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(adapter);
        adapter.activity =this;
        list.add(person);
        list.add(person1);
        list.add(person2);
        list.add(person3);
        list.add(person4);
        adapter.update(list);
    }


}
