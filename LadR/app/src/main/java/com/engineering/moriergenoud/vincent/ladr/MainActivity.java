package com.engineering.moriergenoud.vincent.ladr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    /*private variable declaration*/

    private TextView mWelcomeText;
    private TextView mSpinnerText;
    private EditText mFirstNameInput;
    private EditText mLastNameInput;
    private EditText mLiscenceImput;
    private Spinner mCarSpinner;
    private Button mSubmitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
