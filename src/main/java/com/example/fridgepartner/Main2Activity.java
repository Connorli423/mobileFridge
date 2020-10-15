package com.example.fridgepartner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.view.View;
import android.widget.Toast;


public class Main2Activity extends AppCompatActivity {
    private Button button1;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAddItemActivity();
            }
        });
        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openListActivity();
            }
        });
    }
    public void openAddItemActivity() {
        Intent intent = new Intent(this, AddItemActivity.class);
        startActivity(intent);
    }
    public void openListActivity() {
        Intent intent = new Intent(this, ListActivity.class);
        startActivity(intent);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.example_menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.alarm:
                startActivity(new Intent(this, ActivityNoti.class));
                return(true);
        }
        switch (item.getItemId()) {
            case R.id.register:
                startActivity(new Intent(this, ActivityRegister.class));
                return(true);
        }
        switch (item.getItemId()) {
            case R.id.login:
                startActivity(new Intent(this, ActivityLogin.class));
                return(true);
        }

        return(super.onOptionsItemSelected(item));

    }

}