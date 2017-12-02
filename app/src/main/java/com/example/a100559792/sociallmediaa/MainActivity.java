package com.example.a100559792.sociallmediaa;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView mediaList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mediaList = (ListView)findViewById(R.id.mediaList);

        List<String> array_list = new ArrayList<String>();
        array_list.add("UOIT");
        array_list.add("UOIT Engineering");
        array_list.add("UOIT Computer Science");
        array_list.add("Ridgeback Hacks");


        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                array_list );



        mediaList.setAdapter(arrayAdapter);
        mediaList.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapter,View v, int position, long id){

                if(position == 0) {
                    Intent twitterIntent = new Intent(MainActivity.this, TwitterFeed.class);
                    //based on item add info to intent
                    startActivity(twitterIntent);
                }
                else if(position == 1){
                    Intent engineeringIntent = new Intent(MainActivity.this, UOITEngFeed.class);
                    //based on item add info to intent
                    startActivity(engineeringIntent);
                }
                else if(position == 3){
                    Intent compsciIntent = new Intent(MainActivity.this, UOITCompSciFeed.class);
                    //based on item add info to intent
                    startActivity(compsciIntent);
                }
            }
        });
    }
}
