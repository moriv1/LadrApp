package com.engineering.moriergenoud.vincent.ladr;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class StationConnexionActivity extends AppCompatActivity {

    /*Variables declaration*/

    private TextView mClientNumber;
    private TextView mClientToStationKey;
    private Button mStartCommunication;

    String TransfertClientNumber;
    String ClientToStationKey;

    /*onCreate void*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_station_connexion);

        /*Link to Layout*/

        mClientNumber = findViewById(R.id.client_number_txt);
        mClientToStationKey = findViewById(R.id.activation_key_txt);
        mStartCommunication = findViewById(R.id.activity_ClientToStationConnexion_btn);

        /*Variable importation from other activities*/

        TransfertClientNumber=getIntent().getExtras().getString("ClientNumber2");
        mClientNumber.setText(TransfertClientNumber);

        ClientToStationKey = getIntent().getExtras().getString("ClientToStationActivationKey");
        mClientToStationKey.setText(ClientToStationKey);

        /*Button activation*/

        mStartCommunication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent deviceControlIntent = new Intent (StationConnexionActivity.this, DeviceControlActivity.class);
                startActivity(deviceControlIntent);
                setContentView(R.layout.actionbar_indetermined_progress);
                Toast.makeText(getBaseContext(),"search for the station's peripherals ", Toast.LENGTH_LONG).show();

            }
        });

    }
}
// TO DO LIST:
//1.ADD THE ACTUAL HOURS (IN LINKS WITH THE SMARTPHONE CLOCK) ON STATIONCONNEXIONACTIVITY
//2. ADD THE HOURS OF RESERVATION END TOO (FOR THE MOMENT, NOT IMPORTANT =>ACTUAL HOURS +1)$
//3. Warning Text for the users to add: ACTIVE BLUETOOTH ON YOUR SMARTPHONE + Active authorization for Bluetooth and localisatrion on your Smarthpones.
