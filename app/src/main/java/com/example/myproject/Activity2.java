package com.example.myproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;

public class Activity2 extends AppCompatActivity {
    private boolean table_flg = false;
    private Button nextButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        nextButton = (Button) findViewById(R.id.nextbutton);
        nextButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                openActivity3();
            }
        });
    }

    public void collapseTable(View view) {
        TableLayout table = findViewById(R.id.table);
        Button switchBtn = findViewById(R.id.switchBtn);

        table.setColumnCollapsed(1, table_flg);
        table.setColumnCollapsed(2, table_flg);

        if (table_flg) {
            table_flg = false;
            switchBtn.setText("Show Text");
        } else {
            table_flg = true;
            switchBtn.setText("Hide Text");
        }

    }

    public void openActivity3(){
        Intent nextIntent = new Intent(this, Activity3.class);
        startActivity(nextIntent);

    }
}
