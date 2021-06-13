package com.example.projectapp;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;


public class ShowTransports extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_show_transports);
        TextView location = (TextView) findViewById(R.id.locationShowTransports);
        location.setText(MainActivity.currentLocation);
        String local= MainActivity.currentLocation;
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,MainActivity.cityTransports.get(local));
        ListView lista = findViewById(R.id.lista);
        lista.setAdapter(adapter);

        /*
        //ir para o create trips com filtro do bus
        Button bustrip = findViewById(R.id.bus);
        bustrip.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View v) {
                CT_SearchResults.bus = true;
                CT_SearchResults.train = false;
                CT_SearchResults.metro = false;
                Intent goToCreateTrip = new Intent(getApplicationContext(), CT_Locations.class);
                startActivity(goToCreateTrip);
            }

        });
        //ir para o create trips com filtro do train

        Button traintrip = findViewById(R.id.train);
        traintrip.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View v) {
                CT_SearchResults.bus = false;
                CT_SearchResults.train = true;
                CT_SearchResults.metro = false;
                Intent goToCreateTrip = new Intent(getApplicationContext(), CT_Locations.class);
                startActivity(goToCreateTrip);
            }

        });
        //ir para o create trips com filtro do metro

        Button metrotrip = findViewById(R.id.metro);
        metrotrip.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View v) {
                CT_SearchResults.train = false;
                CT_SearchResults.bus = false;
                CT_SearchResults.metro = true;
                Intent goToCreateTrip = new Intent(getApplicationContext(), CT_Locations.class);
                startActivity(goToCreateTrip);
            }

        });

        // ir para a pagina do taxi harcoded
        Button taxi = findViewById(R.id.taxi);
        taxi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToPrivateTransport = new Intent(getApplicationContext(),taxiprivate.class ); //checkar
                startActivity(goToPrivateTransport);
            }

        });*/
    }
}