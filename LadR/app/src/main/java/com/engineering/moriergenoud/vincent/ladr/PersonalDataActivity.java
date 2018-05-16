package com.engineering.moriergenoud.vincent.ladr;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;


public class PersonalDataActivity extends AppCompatActivity {

    private TextView mDisplayFirstName;
    private TextView mDisplayLastName;
    private TextView mDisplayLicence;
    private TextView mDisplayClientNumber;
    private TextView mDisplayCarModel;
    String TransfertFirstName;
    String TransfertLastName;
    String TransfertLicence;
    String TransfertCarModel;
    String TransfertClientNumber;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_data);

        mDisplayFirstName = findViewById(R.id.activity_display_firstname_txt);
        mDisplayLastName = findViewById(R.id.activity_display_lastname_txt);
        mDisplayLicence = findViewById(R.id.activity_display_lisence_txt);
        mDisplayCarModel = findViewById(R.id.activity_display_car_model_txt);
        mDisplayClientNumber = findViewById(R.id.activity_display_client_txt);

        TransfertFirstName = getIntent().getExtras().getString("FirstName2");
        mDisplayFirstName.setText(TransfertFirstName);

        TransfertLastName = getIntent().getExtras().getString("LastName2");
        mDisplayLastName.setText(TransfertLastName);

        TransfertLicence = getIntent().getExtras().getString("Licence2");
        mDisplayLicence.setText(TransfertLicence);

        TransfertCarModel = getIntent().getExtras().getString("CarModel2");
        mDisplayCarModel.setText(TransfertCarModel);

        TransfertClientNumber = getIntent().getExtras().getString("ClientNumber2");
        mDisplayClientNumber.setText(TransfertClientNumber);
    }

}