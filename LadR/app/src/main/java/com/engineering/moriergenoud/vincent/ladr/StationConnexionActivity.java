package com.engineering.moriergenoud.vincent.ladr;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class StationConnexionActivity extends AppCompatActivity {

    String TransfertClientNumber;
    String ClientToStationKey;

    private TextView mClientNumber;
    private TextView mClientToStationKey;
    private Button mStartCommunication;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_station_connexion);

        mClientNumber = findViewById(R.id.client_number_txt);
        mClientToStationKey = findViewById(R.id.activation_key_txt);
        mStartCommunication = findViewById(R.id.activity_ClientToStationConnexion_btn);


        TransfertClientNumber=getIntent().getExtras().getString("ClientNumber2");
        mClientNumber.setText(TransfertClientNumber);

        ClientToStationKey = getIntent().getExtras().getString("ClientToStationActivationKey");
        mClientToStationKey.setText(ClientToStationKey);

        mStartCommunication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getBaseContext(),"search for the station's peripherals ", Toast.LENGTH_LONG).show();
                setContentView(R.layout.activity_station_connexion_in_progression);
            }
        });

        }
}
// TO DO FOR THE REVIEW:
//1.CLEAN AND DESCRIBE THE CODE CONTENANT
//2.ADD THE ACTUAL HOURS (IN LINKS WITH THE SMARTPHONE CLOCK) ON STATIONCONNEXIONACTIVITY
//3. ADD THE HOURS OF RESERVATION END TOO (FOR THE MOMENT, NOT IMPORTANT =>ACTUAL HOURS +1)
