package com.engineering.moriergenoud.vincent.bluetooth_communication;

import android.app.ProgressDialog;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothManager;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.Menu;
import android.widget.TextView;
import android.widget.Toast;

import static android.view.Window.FEATURE_INDETERMINATE_PROGRESS;

public class MainActivity extends AppCompatActivity implements BluetoothAdapter.LeScanCallback{
    private static final String TAG ="BluetoothGattActivity";
    private static final String DEVICE_NAME="Sensor_Tag";

    private BluetoothAdapter mBluetoothAdapter;
    private SparseArray<BluetoothDevice> mDevices;

    private BluetoothGatt mConnectedGatt;

    private TextView mClientNumber, mActivationKey;

    private ProgressDialog mProgress;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        requestWindowFeature(FEATURE_INDETERMINATE_PROGRESS);
        setProgressBarIndeterminate(true);

        mActivationKey=(TextView) findViewById(R.id.key_activation_txt);
        mClientNumber=(TextView)findViewById(R.id.client_number_txt);


        BluetoothManager manager = (BluetoothManager) getSystemService(BLUETOOTH_SERVICE);
        mBluetoothAdapter = manager.getAdapter();

        mDevices = new SparseArray<BluetoothDevice>();

        /*A progress Dialog will be needed while the connection process is taking place.*/
        mProgress =new ProgressDialog(this);
        mProgress.setIndeterminate(true);
        mProgress.setCancelable(false);
    }
    @Override
    protected void onResume(){
        super.onResume();
        /*Bluetooth Supported ?*/
        if(mBluetoothAdapter ==null||!mBluetoothAdapter.isEnabled()) {
            /*Bluetooth is disable*/
            Intent enableBtIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
            startActivity(enableBtIntent);
            finish();
        }
            /*Bluetooth LE Supported*/
            if(!getPackageManager().hasSystemFeature(PackageManager.FEATURE_BLUETOOTH_LE)){
            Toast.makeText(this,"No LE Support",Toast.LENGTH_SHORT).show();
            finish();
            return;
         }
    }
    @Override
    protected void onPause(){
        super.onPause();
        //MAKE SUR DIALOG IS HIDDEN
        mProgress.dismiss();
        //cANCEL any scan in progress
        mHandler.removeCallbacks(mStopRunnable);
        mHandler.removeCallbacks(mStartRunnable);
        mBluetoothAdapter.stopLeScan(this);
    }
    @Override
    protected void onStop(){
        super.onStop();
        //Disconnect from any tag connection
        if(mConnectedGatt!=null){
            mConnectedGatt.disconnect();
            mConnectedGatt=null;
        }
    }
    @Override
    public boolean onCreateOptionMenu(Menu menu){
        //Ad the scan option to the menu
        getMenuInflater().inflate(R.menu.main);
        //Add any devices elements we've discovered to the overflow menu
        for(int i=0;i<mDevices.size();i++){
            BluetoothDevice device = mDevices.valueAt(i);
            menu.add(0,mDevices.keyAt(i),0,device.getName());
        }
        return true;
    }
    @Override
    public boolean OnOptionItemSelected(){

    }












    @Override
    public void onLeScan(BluetoothDevice device, int rssi, byte[] scanRecord) {

    }
}
