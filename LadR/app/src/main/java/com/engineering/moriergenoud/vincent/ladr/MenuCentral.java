package com.engineering.moriergenoud.vincent.ladr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;


public class MenuCentral extends AppCompatActivity {

    private Button mStationConnexionButton;
    private Button mPersonnalDataButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_central);

        mPersonnalDataButton  = (Button) findViewById(R.id.activity_personalData_btn);
        mStationConnexionButton = (Button) findViewById(R.id.activity_stationConnexion_btn);


}
}
