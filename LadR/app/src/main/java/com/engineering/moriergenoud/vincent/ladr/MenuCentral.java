package com.engineering.moriergenoud.vincent.ladr;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class MenuCentral extends AppCompatActivity {

    private Button mStationConnexionButton;
    private Button mPersonnalDataButton;

    String TransfertFirstName;
    String TransfertLastName;
    String TransfertLicence;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_central);

        mPersonnalDataButton  = (Button) findViewById(R.id.activity_personalData_btn);
        mStationConnexionButton = (Button) findViewById(R.id.activity_stationConnexion_btn);

        TransfertFirstName=getIntent().getExtras().getString("FirstName");
        TransfertLastName=getIntent().getExtras().getString("LastName");
        TransfertLicence=getIntent().getExtras().getString("Licence");

        mStationConnexionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // User clicked the button

                // Inscription successful
                Intent menuCentralIntent = new Intent(MenuCentral.this, StationConnexionActivity.class);
                startActivity(menuCentralIntent);

            }
        });

        mPersonnalDataButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // User clicked the button
                Intent personnalDataActivityIntent = new Intent (MenuCentral.this, PersonnalDataActivity.class);
                personnalDataActivityIntent.putExtra("FirstName2",TransfertFirstName);
                personnalDataActivityIntent.putExtra("LastName2",TransfertLastName);
                personnalDataActivityIntent.putExtra("Licence2",TransfertLicence);
                startActivity(personnalDataActivityIntent);



            }
        });


    }
}

