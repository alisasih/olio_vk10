package com.example.olio_vk9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import java.lang.String;
import android.content.Intent;

public class AskInformationActivity extends AppCompatActivity {

    public EditText editFirstName;
    public EditText editLastName;
    public EditText editEmail;
    public String degreeProgram;

    CheckBox optionCandidate, optionMaster, optionDoctoral, optionSwim;
    public String degree = "";

    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ask_information);

        context = this;
    }

    public void addUser(View view) {

        editFirstName = (EditText)findViewById(R.id.firstnamee);
        String firstName = editFirstName.getText().toString();
        editLastName = (EditText)findViewById(R.id.lastname);
        String lastName = editLastName.getText().toString();
        editEmail = (EditText)findViewById(R.id.email);
        String email = editEmail.getText().toString();

        RadioGroup degreeOptions = findViewById(R.id.degreeOptions);
        switch (degreeOptions.getCheckedRadioButtonId()) {
            case R.id.tite:
                degreeProgram = "Tietotekniikka";
                break;
            case R.id.tuta:
                degreeProgram = "Tuotantotalous";
                break;
            case R.id.late:
                degreeProgram = "Laskennallinen tekniikka";
                break;
            case R.id.sate:
                degreeProgram = "Sähkötekniikka";
                break;
        }
        optionCandidate = (CheckBox) findViewById(R.id.candidate);
        optionMaster = (CheckBox) findViewById(R.id.maister);
        optionDoctoral = (CheckBox) findViewById(R.id.doctor);
        optionSwim = (CheckBox) findViewById(R.id.swim);
        degree = "";

        if(optionCandidate.isChecked()) {
            degree += " - " + optionCandidate.getText().toString() + "\n";
        }
        if(optionMaster.isChecked()) {
            degree += " - " + optionMaster.getText().toString() + "\n";
        }
        if(optionDoctoral.isChecked()) {
            degree += " - " + optionDoctoral.getText().toString() + "\n";
        }
        if(optionSwim.isChecked()) {
            degree += " - " + optionSwim.getText().toString() + "\n";
        }

        UserStorage.getInstance().addUser(new User(firstName, lastName, email, degreeProgram, degree));
    }

    public void switchToUserViewActivity(View view) {
        Intent intent = new Intent(this, ListUsersActivity.class);
        startActivity(intent);
    }

}