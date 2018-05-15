package com.engineering.moriergenoud.vincent.ladr;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.Random;


public class PersonnalDataActivity extends AppCompatActivity {

    private TextView mDisplayFirstName;
    private TextView mDisplayLastName;
    private TextView mDisplayLiscence;
    private TextView mDisplayClientNumber;
    private TextView mDisplayCarModel;
    String TransfertFirstName;
    String TransfertLastName;
    String TransfertLiscence;
    String TransfertCarModel;
    String ClientNumber;
    int LengthClientNumber;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personnal_data);

        mDisplayFirstName = findViewById(R.id.activitiy_display_firstname_txt);
        mDisplayLastName = findViewById(R.id.activitiy_display_lastname_txt);
        mDisplayLiscence = findViewById(R.id.activitiy_display_lisence_txt);
        mDisplayCarModel = findViewById(R.id.activitiy_display_car_model_txt);
        mDisplayClientNumber = findViewById(R.id.activitiy_display_client_txt);

        TransfertFirstName = getIntent().getExtras().getString("FirstName2");
        mDisplayFirstName.setText(TransfertFirstName);

        TransfertLastName = getIntent().getExtras().getString("LastName2");
        mDisplayLastName.setText(TransfertLastName);

        TransfertLiscence = getIntent().getExtras().getString("Licence2");
        mDisplayLiscence.setText(TransfertLiscence);

        TransfertCarModel = getIntent().getExtras().getString("CarModel2");
        mDisplayCarModel.setText(TransfertCarModel);

        /*Client number Creation*/
        LengthClientNumber=10;
        char[] chars1 = "ABCDEF012GHIJKL345MNOPQR678STUVWXYZ9".toCharArray();
        StringBuilder sb1 = new StringBuilder();
        Random random1 = new Random();
        for (int i = 0; i < LengthClientNumber; i++)
        {
            char c1 = chars1[random1.nextInt(chars1.length)];
            sb1.append(c1);
        }
        ClientNumber = sb1.toString();
        mDisplayClientNumber.setText(ClientNumber);

    }
}






