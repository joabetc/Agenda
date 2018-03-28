package com.example.jtcosta.agenda;

import android.widget.EditText;
import android.widget.RatingBar;

import com.example.jtcosta.agenda.model.Student;

/**
 * Created by jtcosta on 28/03/2018.
 */

public class FormHelper {

    private final EditText nameField;
    private final EditText addressField;
    private final EditText phoneField;
    private final EditText siteField;
    private final RatingBar scoreField;

    public FormHelper(FormActivity activity) {
        nameField = (EditText) activity.findViewById(R.id.form_edit_name);
        addressField = (EditText) activity.findViewById(R.id.form_edit_address);
        phoneField = (EditText) activity.findViewById(R.id.form_edit_phone);
        siteField = (EditText) activity.findViewById(R.id.form_edit_site);
        scoreField = (RatingBar) activity.findViewById(R.id.form_rating_score);
    }

    public Student getStudent() {
        Student student = new Student();
        student.setName(nameField.getText().toString());
        student.setName(addressField.getText().toString());
        student.setName(phoneField.getText().toString());
        student.setName(siteField.getText().toString());
        student.setScore(Double.valueOf(scoreField.getProgress()));
        return student;
    }
}
