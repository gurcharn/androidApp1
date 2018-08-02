package com.example.gurcharnsinghsikka.androidtest1;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    String LOG_TAG = "MAIN_ACTIVITY";

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button calculatorButton = (Button) findViewById(R.id.calculatorButton);
        final Button helloWorldButton = (Button) findViewById(R.id.helloWorldButton);
        final Button listViewButton = (Button) findViewById(R.id.listViewButton);
        final Button googleButton = (Button) findViewById(R.id.googleButton);


        calculatorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), Calculator.class);
                startActivity(startIntent);
            }
        });

        helloWorldButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), HelloWorld.class);
                startActivity(startIntent);
            }
        });

        listViewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), List_view.class);
                startActivity(startIntent);
            }
        });

        googleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String googleUrl = "http://www.google.com";
                Uri webAddress = Uri.parse(googleUrl);

                Intent goToGoogle = new Intent(Intent.ACTION_VIEW, webAddress);
                if(goToGoogle.resolveActivity(getPackageManager()) != null) {
                    startActivity(goToGoogle);
                }
            }
        });


    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(LOG_TAG, "app restarts");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(LOG_TAG, "app resumes");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(LOG_TAG, "app pauses");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(LOG_TAG, "app stops");
    }

}
