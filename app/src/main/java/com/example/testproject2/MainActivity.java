package com.example.testproject2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Switch;

import com.example.testproject2.databinding.ActivityMainBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity  extends DrawerBaseActivity {
BottomNavigationView bottomNavigationView;

    ActivityMainBinding activityMainBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(activityMainBinding.getRoot());

        bottomNavigationView=findViewById(R.id.bottom_navigator);
        bottomNavigationView.setSelectedItemId(R.id.home);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId())
                {
                    case R.id.seasons:
                        startActivity(new Intent(getApplicationContext(),Seasons_Activity.class));
                        overridePendingTransition(0,0);
                        return true;

                        case R.id.home:
                            return true;

                            case R.id.stats:
                                startActivity(new Intent(getApplicationContext(),Stats_Activity.class));
                                overridePendingTransition(0,0);
                                return true;

                    case R.id.menu:
                        startActivity(new Intent(getApplicationContext(),Menu_Activity.class));
                        overridePendingTransition(0,0);
                        return true;


                }
                return false;
            }
        });
    }
}