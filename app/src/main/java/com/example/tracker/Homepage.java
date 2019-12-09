package com.example.tracker;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Homepage extends AppCompatActivity {
protected void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_homepage);
}
public void processRegisterClick(View view){
    Intent intent =new Intent(this,MainActivity.class);
startActivity(intent);


}
}

