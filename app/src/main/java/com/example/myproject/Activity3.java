package com.example.myproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Activity3 extends AppCompatActivity implements View.OnClickListener{
    private ImageView brigdeview, seaview, treeview;
    private Button button1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        brigdeview= (ImageView) findViewById(R.id.brigdepic);
        seaview= (ImageView) findViewById(R.id.seapic);
        treeview= (ImageView) findViewById(R.id.treepic);

        brigdeview.setOnClickListener(this);
        seaview.setOnClickListener(this);
        treeview.setOnClickListener(this);

        button1 = (Button) findViewById(R.id.btn);
        button1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                openActivity4();
            }
        });

    }
    @Override
    public void onClick(View view){
        if (view.getId()==R.id.brigdepic)
        {
            brigdeview.setVisibility(View.GONE);
            seaview.setVisibility(View.VISIBLE);
        }

         else if (view.getId()==R.id.seapic)
        {
            seaview.setVisibility(View.GONE);
            treeview.setVisibility(View.VISIBLE);
        }

        else if(view.getId()==R.id.treepic)
        {
            treeview.setVisibility(View.GONE);
            brigdeview.setVisibility(View.VISIBLE);
        }
    }

    public void openActivity4(){
        Intent btnIntent = new Intent(this, Activity4.class);
        startActivity(btnIntent);

    }



}
