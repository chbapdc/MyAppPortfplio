package com.example.chbap.myappportfplio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
 public void showToastPopularMovie(View view){
        Toast toast = Toast.makeText(getApplicationContext(),"Popular Movie Movie",Toast.LENGTH_SHORT);
        toast.show();
 }
    public void showToastSTOCKHAWK(View view){
        Toast toast = Toast.makeText(getApplicationContext(),"STOCK HAWK",Toast.LENGTH_SHORT);
        toast.show();
    }
    public void showToastBUILDITBIGGER(View view){
        Toast toast = Toast.makeText(getApplicationContext(),"BUILD IT BIGGER",Toast.LENGTH_SHORT);
        toast.show();
    }
    public void showToastMAKEYOURAPPMATERIAL(View view){
        Toast toast = Toast.makeText(getApplicationContext(),"MAKE YOUR APP MATERIAL",Toast.LENGTH_SHORT);
        toast.show();
    }
    public void showToastGOUBIQUITOUS(View view){
        Toast toast = Toast.makeText(getApplicationContext(),"GO UBIQUITOUS",Toast.LENGTH_SHORT);
        toast.show();
    }
    public void showToastCAPSTONE(View view){
        Toast toast = Toast.makeText(getApplicationContext(),"CAPSTONE",Toast.LENGTH_SHORT);
        toast.show();
    }
}
