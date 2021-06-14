package com.example.projectapp;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.Layout;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;


public class ShowTransports extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.O)
    protected  void onBtnClick(String type){
        switch (type.toUpperCase()){
            case "BUS":
                CT_SearchResults.bus = true;
                CT_SearchResults.train = false;
                CT_SearchResults.metro = false;
                Intent goToCreateTripBus = new Intent(getApplicationContext(), CT_Locations.class);
                startActivity(goToCreateTripBus);
                break;
            case "TRAIN":
                CT_SearchResults.bus = false;
                CT_SearchResults.train = true;
                CT_SearchResults.metro = false;
                Intent goToCreateTripTrain = new Intent(getApplicationContext(), CT_Locations.class);
                startActivity(goToCreateTripTrain); break;
            case "METRO":
                CT_SearchResults.bus = false;
                CT_SearchResults.train = false;
                CT_SearchResults.metro = true;
                Intent goToCreateTripMetro = new Intent(getApplicationContext(), CT_Locations.class);
                startActivity(goToCreateTripMetro); break;
            case "MOLICEIRO":
                Intent goToPrivateTransportMoliceiro = new Intent(getApplicationContext(),taxiprivate.class ); //checkar
                startActivity(goToPrivateTransportMoliceiro); break;
            case "TAXI":
                Intent goToPrivateTransportTaxi = new Intent(getApplicationContext(),taxiprivate.class ); //checkar
                startActivity(goToPrivateTransportTaxi); break;
            default:
                CT_SearchResults.bus = true;
                CT_SearchResults.train = true;
                CT_SearchResults.metro = true;
                Intent goToCreateTrip = new Intent(getApplicationContext(), CT_Locations.class);
                startActivity(goToCreateTrip); break;
        }

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_show_transports);
        TextView location = (TextView) findViewById(R.id.locationShowTransports);
        location.setText(MainActivity.currentLocation);
        String local= MainActivity.currentLocation.toLowerCase();
        LinearLayout layout =(LinearLayout) findViewById(R.id.layout);

        if (local.isEmpty()){
            ArrayList<String> fake= new ArrayList<String>();
            fake.add("BUS");
            fake.add("TRAIN");
            fake.add("METRO");

            for(int i = 0; i<fake.size() ; i++) {

                Button btn = new Button(this);

                //set all your button attributes, like text color,background color etc. here
                btn.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT));
                btn.setText(fake.get(i));
                btn.setWidth(890);
                btn.setHeight(260);
                btn.setboun
                //Set onClickListener
                int finalI = i;
                btn.setOnClickListener(new View.OnClickListener() {
                    @RequiresApi(api = Build.VERSION_CODES.O)
                    @Override
                    public void onClick(View v) {

                        // define this method in your activity
                        onBtnClick(fake.get(finalI));
                    }
                });

                //add the button to your linear layout
                layout.addView(btn);
            }
        }else{
            System.out.println(MainActivity.cityTransports + " xDD " + local);
            ArrayList<String> localTransport= new ArrayList(MainActivity.cityTransports.get(local));

            for(int i = 0; i<localTransport.size() ; i++) {

                Button btn = new Button(this);

                //set all your button attributes, like text color,background color etc. here
                btn.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT));
                btn.setText(localTransport.get(i));


                //Set onClickListener
                int finalI = i;
                btn.setOnClickListener(new View.OnClickListener() {
                    @RequiresApi(api = Build.VERSION_CODES.O)
                    @Override
                    public void onClick(View v) {

                        // define this method in your activity
                        onBtnClick(localTransport.get(finalI));
                    }
                });

                //add the button to your linear layout
                layout.addView(btn);
            }

        }
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