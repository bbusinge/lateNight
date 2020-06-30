package com.businge.iNavigate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
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

        letsGetPro.setOnClickListener(this);
        openWebPage.setOnClickListener(this);
        toast.setOnClickListener(this);
        dialPhone.setOnClickListener(this);
        viewIntent.setOnClickListener(this);
        showLocation.setOnClickListener(this);


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

    @Override
    public void onClick(View view){

        switch (view.getId()){
            case R.id.showLocation:
                textView.setText("You clicked on Show Location");
                //                intent = new Intent(getApplicationContext(),MainActivity1.class);
                Log.d("TAG","Yo clicked on Show Location");
                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("geo: 1.7647646, 31.7860329. 2"));
                Toast.makeText(getApplicationContext(),"Mujooga", Toast.LENGTH_SHORT).show();
                startActivity(intent1);
                break;
            case R.id.openWebPage:
                textView.setText("You have clicked on Open WebPage");
                Log.d("TAG","You clicked on Open WebPage");
                Intent intent2 = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.schoolnetuganda.com/highsecondary/kabalega-secondary-school"));
                Toast.makeText(getApplicationContext(),"Mujooga", Toast.LENGTH_SHORT).show();
                startActivity(intent2);
                break;
            case R.id.letsGetPro:
                textView.setText("You have clicked on let's getPro");
                Log.d("TAG","You clicked on let's getPro");
                Intent intent3 = new Intent(getApplicationContext(),MainActivity2.class);
                Toast.makeText(getApplicationContext(),"Mujooga", Toast.LENGTH_SHORT).show();
                startActivity(intent3);
                break;
            case R.id.viewIntent:
                textView.setText("You have clicked on View Intent");
                Log.d("TAG","You clicked on View Intent");
                Intent intent4 = new Intent(MainActivity.this,MainActivity2.class);
                intent4.putExtra("KEY", "Well done sir, data well received ");
                Toast.makeText(getApplicationContext(),"Mujooga", Toast.LENGTH_SHORT).show();
                startActivity(intent4);
                break;
            case R.id.dialPhone:
                textView.setText("You have clicked on Open Dial Phone");
                Log.d("TAG","You clicked on Open Dial Phone");
                Intent intent5 = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+256785459184"));
                Toast.makeText(getApplicationContext(),"Mujooga", Toast.LENGTH_SHORT).show();
                startActivity(intent5);
                break;
            case R.id.toast:
                textView.setText("You have clicked on Toast");
                Log.d("TAG","You clicked on Toast");
                Intent intent6 = new Intent(Intent.ACTION_VIEW);
                Toast.makeText(getApplicationContext(),"Mujooga", Toast.LENGTH_SHORT).show();
                startActivity(intent6);

                break;
        }

    }




            }

