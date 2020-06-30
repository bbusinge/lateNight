package com.businge.iNavigate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    String TAG = "--Main_Activity--";
    //TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.i(TAG, "--Activity_Two--");
        Toast.makeText(this, " Activity 2", Toast.LENGTH_SHORT).show();


//        receive data from mainActivity
        Bundle bundle = getIntent().getExtras();
//        assert bundle != null;
        String str = bundle.getString("KEY");
        Toast.makeText(this, str, Toast.LENGTH_SHORT).show();

    }
}