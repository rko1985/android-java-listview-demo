package com.myappcompany.russell.listviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Set array
        ListView myListView = findViewById(R.id.myListView);

        //Making array of friends
        final ArrayList<String> myFriends = new ArrayList<String>();

        myFriends.add("john");
        myFriends.add("sara");
        myFriends.add("megan");
        myFriends.add("josh");

        //Converts array to be shown in ListView
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, myFriends);

        //Shows the ListView
        myListView.setAdapter(arrayAdapter);

        //Allows you to click on a friend and display Toast
        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),"Friend selected: " + myFriends.get(i), Toast.LENGTH_LONG).show();
            }
        });
    }
}
