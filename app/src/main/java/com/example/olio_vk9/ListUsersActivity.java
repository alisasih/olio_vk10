package com.example.olio_vk9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ListUsersActivity extends AppCompatActivity {

    private TextView userOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_users);
    }

    public void listUsers(View view) {
        UserStorage.getInstance().listUsers();
    }
}