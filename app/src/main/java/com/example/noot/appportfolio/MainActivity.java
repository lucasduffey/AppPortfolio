package com.example.noot.appportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void spotify_clicked(View view){
        Toast.makeText(getApplicationContext(), "launch spotify app", Toast.LENGTH_SHORT).show(); // makeText(Context context, CharSequence text, int duration)
    }
    public void scores_clicked(View view){
        Toast.makeText(getApplicationContext(), "launch scores app", Toast.LENGTH_SHORT).show(); // makeText(Context context, CharSequence text, int duration)
    }
    public void library_clicked(View view){
        Toast.makeText(getApplicationContext(), "launch library app", Toast.LENGTH_SHORT).show(); // makeText(Context context, CharSequence text, int duration)
    }
    public void build_clicked(View view){
        Toast.makeText(getApplicationContext(), "launch build app", Toast.LENGTH_SHORT).show(); // makeText(Context context, CharSequence text, int duration)
    }
    public void xyz_clicked(View view){
        Toast.makeText(getApplicationContext(), "launch xyz app", Toast.LENGTH_SHORT).show(); // makeText(Context context, CharSequence text, int duration)
    }
    public void capstone_clicked(View view){
        Toast.makeText(getApplicationContext(), "launch capstone app", Toast.LENGTH_SHORT).show(); // makeText(Context context, CharSequence text, int duration)
    }
}


 /*
// within onCreate -  OnClickListener method
        final Button spotify_app = (Button) findViewById(R.id.spotify_app);
        final Button scores_button = (Button) findViewById(R.id.scores_app);
        final Button library_app = (Button) findViewById(R.id.library_app);
        final Button build_app = (Button) findViewById(R.id.build_app);
        final Button xyz_app = (Button) findViewById(R.id.xyz_app);
        final Button capstone_app = (Button) findViewById(R.id.capstone_app);


        spotify_app.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "launch spotify app", Toast.LENGTH_SHORT).show(); // makeText(Context context, CharSequence text, int duration)
            }
        });

        scores_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "launch scores app", Toast.LENGTH_SHORT).show(); // makeText(Context context, CharSequence text, int duration)
            }
        });
        library_app.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "launch library app", Toast.LENGTH_SHORT).show(); // makeText(Context context, CharSequence text, int duration)
            }
        });
        build_app.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "launch build app", Toast.LENGTH_SHORT).show(); // makeText(Context context, CharSequence text, int duration)
            }
        });
        xyz_app.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "launch zyz app", Toast.LENGTH_SHORT).show(); // makeText(Context context, CharSequence text, int duration)
            }
        });
        capstone_app.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "launch capstone app", Toast.LENGTH_SHORT).show(); // makeText(Context context, CharSequence text, int duration)
            }
        });
        */
