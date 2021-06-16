package edu.rit.sugandha.multimedia;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    ActionBarDrawerToggle mtoggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerLayout=findViewById(R.id.drawer);
        navigationView=findViewById(R.id.navigation);
       // navigationView.setBackgroundColor(getResources().getColor(R.color.design_default_color_primary));
        mtoggle=new ActionBarDrawerToggle(this,drawerLayout,R.string.open,R.string.close);
        drawerLayout.addDrawerListener(mtoggle);

        mtoggle.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

     navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
         @Override
         public boolean onNavigationItemSelected(@NonNull MenuItem item) {
             switch (item.getItemId())
             {


                 case R.id.audio:
                     Intent i1=new Intent(MainActivity.this,Prayer.class);
                     startActivity(i1);
                     break;



                 case R.id.RateUs:
                     Intent i3=new Intent(MainActivity.this,Days.class);
                     startActivity(i3);
                     break;

                 case R.id.AboutUs:
                     Intent i4=new Intent(MainActivity.this,AboutUs.class);
                     startActivity(i4);
                     break;


             }
             return false;
         }
     });


    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(mtoggle.onOptionsItemSelected(item))
        {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}