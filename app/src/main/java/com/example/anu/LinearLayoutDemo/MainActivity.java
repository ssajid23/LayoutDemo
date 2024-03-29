package com.example.anu.LinearLayoutDemo;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    ImageView imgView;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context=this;
        getInit();
    }

    public void getInit()
    {
        imgView=(ImageView) findViewById(R.id.profileimage);
        imgView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.profileimage){
            Intent intent = new Intent(context,SecondActivity.class);
            startActivity(intent);
        }

    }
}
