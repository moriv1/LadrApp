package com.engineering.moriergenoud.vincent.ladr;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;


public class MainActivity extends AppCompatActivity {

    /*private variable declaration*/

    private EditText mFirstNameInput;
    private EditText mLastNameInput;
    private EditText mLicenceInput;
    private Spinner mCarSpinner;
    private Button mSubmitButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFirstNameInput = (EditText) findViewById(R.id.activity_main_first_name_input);
        mLastNameInput = (EditText) findViewById(R.id.activity_main_last_name_input);
        mLicenceInput = (EditText) findViewById(R.id.activity_main_license_input);
        mSubmitButton = (Button) findViewById(R.id.activity_main_submit_btn);

        /*Spinner Configuration*/
        mCarSpinner = (Spinner) findViewById(R.id.activity_main_spinner);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.car_spinner, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        mCarSpinner.setAdapter(adapter);

        mSubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // User clicked the button

                // Inscription successful
                Intent menuCentralIntent = new Intent(MainActivity.this, MenuCentral.class);
                startActivity(menuCentralIntent);

            }
        });
    }
}



