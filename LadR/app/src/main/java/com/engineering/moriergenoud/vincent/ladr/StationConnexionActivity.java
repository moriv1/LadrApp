package com.engineering.moriergenoud.vincent.ladr;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class StationConnexionActivity extends AppCompatActivity {

    String TransfertClientNumber;
    String ClientToStationKey;

    private TextView mClientNumber;
    private TextView mClientToStationKey;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_station_connexion);

        mClientNumber = findViewById(R.id.client_number_txt);
        mClientToStationKey = findViewById(R.id.activation_key_txt);


        TransfertClientNumber=getIntent().getExtras().getString("ClientNumber2");
        mClientNumber.setText(TransfertClientNumber);

        ClientToStationKey = getIntent().getExtras().getString("ClientToStationActivationKey");
        mClientToStationKey.setText(ClientToStationKey);



        }
}
