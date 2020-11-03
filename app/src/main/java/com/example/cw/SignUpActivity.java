package com.example.cw;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class SignUpActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    Intent intent;
    Intent intent2;
    Intent intent3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        intent = new Intent(this, ActivityTwo.class);
        intent2 = new Intent(this, ActivityThree.class);
        intent3 = new Intent(this, ActivityFour.class);

        bottomNavigationView = (com.google.android.material.bottomnavigation.BottomNavigationView) findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.signup);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.home:
                        startActivity(intent);
                        return true;
                    case R.id.graphs:
                        startActivity(intent2);
                        return true;
                    case R.id.program:
                        startActivity(intent3);
                        return true;
                    case R.id.signup:
                        return true;
                }
                return false;
            }
        });
    }
}