package com.example.olio_vk9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import java.lang.String;

public class AskInformationActivity extends AppCompatActivity {

    public EditText editFirstName;

    public EditText editLastName;

    public EditText editEmail;

    public String degreeProgram;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ask_information);
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
        UserStorage.getInstance().addUser(new User(firstName, lastName, email, degreeProgram));
    }
    public void listUsers(View view) {
        UserStorage.getInstance().listUsers();
    }
}