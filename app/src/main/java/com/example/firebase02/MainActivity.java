package com.example.firebase02;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {



    CardView add;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        add = findViewById(R.id.addStudent);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(getApplicationContext(),"usama",Toast.LENGTH_LONG).show();
                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
            }
        });
    }
    public void AddStudent(View view) {
        Intent intent=new Intent(MainActivity.this,MainActivity2.class);
        startActivity(intent);
    }

    public void searchStudent(View view) {
        Intent intent=new Intent(this,searchStudent.class);
        intent.putExtra("option","Search");
        startActivity(intent);
    }

    public void UpdateStudent(View view) {
        Intent intent=new Intent(this,update_srudent.class);
        intent.putExtra("option","Update");
        startActivity(intent);
    }

    public void deleteStudent(View view) {
        Intent intent=new Intent(this,delete_student.class);
        intent.putExtra("option","Delete");
        startActivity(intent);
    }
}