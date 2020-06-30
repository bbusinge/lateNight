package com.businge.iNavigate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button letsGetPro,openWebPage,toast,dialPhone,viewIntent,showLocation;
    String TAG = "--Main_Activity--";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView)findViewById(R.id.textView);
        letsGetPro = (Button)findViewById(R.id.letsGetPro);
        openWebPage = (Button)findViewById(R.id.openWebPage);
        toast = (Button)findViewById(R.id.toast);
        dialPhone = (Button)findViewById(R.id.dialPhone);
        viewIntent = (Button)findViewById(R.id.viewIntent);
        showLocation = (Button)findViewById(R.id.showLocation);
        Log.i(TAG, "--onCreate--");

    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.i(TAG,"-- onStart --");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.i(TAG,"-- onResume --");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.i(TAG,"-- onPause --");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.i(TAG,"-- onStop --");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.i(TAG,"-- onRestart --");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i(TAG,"-- onDestroy --");
    }

    button.setOnItemClickListener(new AdapterView.onItemClickListener(){
      @Override
      public void onClick(View view){

          switch (view.getId()){
              case R.id.showLocation:
                  textView.setText("You clicked on Show Location");
          //                intent = new Intent(getApplicationContext(),MainActivity1.class);
                  Log.d("TAG","Yo clicked on Show Location");
                  break;
              case R.id.openWebPage:
                  textView.setText("You have clicked on Open WebPage");
                  Log.d("TAG","You clicked on Open WebPage");
                  break;
              case R.id.letsGetPro:
                  textView.setText("You have clicked on let's getPro");
                  Log.d("TAG","You clicked on let's getPro");
                  break;
              case R.id.viewIntent:
                  textView.setText("You have clicked on View Intent");
                  Log.d("TAG","You clicked on View Intent");
                  break;
              case R.id.dialPhone:
                  textView.setText("You have clicked on Open Dial Phone");
                  Log.d("TAG","You clicked on Open Dial Phone");
                  break;
              case R.id.toast:
                  textView.setText("You have clicked on Toast");
                  Log.d("TAG","You clicked on Toast");
                  break;
              }
    });


            }
}
