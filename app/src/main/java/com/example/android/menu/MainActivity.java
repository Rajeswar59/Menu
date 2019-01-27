package com.example.android.menu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    protected void printToLogs(View view){
        TextView menuItem1TextView=(TextView)findViewById(R.id.menu_item_1);
        TextView menuItem2TextView=(TextView)findViewById(R.id.menu_item_2);
        TextView menuItem3TextView=(TextView)findViewById(R.id.menu_item_3);

        Log.i("MainActivity.java",menuItem1TextView.getText().toString());
        Log.i("MainActivity.java",menuItem2TextView.getText().toString());
        Log.i("MainActivity.java",menuItem3TextView.getText().toString());
    }
}
