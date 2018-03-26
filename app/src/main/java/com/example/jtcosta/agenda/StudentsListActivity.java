package com.example.jtcosta.agenda;

import android.app.LauncherActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class StudentsListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_students_list);

        String[] students = {"Daniel", "Ronald", "Jeff", "Phil", "Daniel", "Ronald", "Jeff", "Phil", "Daniel", "Ronald", "Jeff", "Phil"};
        ListView studentsList = (ListView) findViewById(R.id.students_list);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, students);
        studentsList.setAdapter(adapter);

        Button buttonNew = (Button) findViewById(R.id.button_new);
        buttonNew.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intentGoToForm = new Intent(StudentsListActivity.this, FormActivity.class);
                startActivity(intentGoToForm);
            }
        });
    }
}
