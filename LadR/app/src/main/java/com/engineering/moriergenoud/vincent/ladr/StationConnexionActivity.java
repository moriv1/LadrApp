package com.engineering.moriergenoud.vincent.ladr;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class StationConnexionActivity extends AppCompatActivity {

    String TransfertClientNumber;

    private TextView mClientTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_station_connexion);

        mClientTest = findViewById(R.id.Client_view);

        TransfertClientNumber=getIntent().getExtras().getString("ClientNumber2");
        mClientTest.setText(TransfertClientNumber);
        }
}
