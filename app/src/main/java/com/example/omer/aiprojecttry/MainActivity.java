package com.example.omer.aiprojecttry;



import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.support.annotation.NonNull;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    }
    public void player(View view)
    {
        Intent p = new Intent(this,playermode.class);
        startActivity(p);
    }
    public void ai(View view)
    {
        Intent p = new Intent(this,aimode.class);
        startActivity(p);
    }
    public void open(View view)
    {
        Intent p = new Intent(this,two_player.class);
        startActivity(p);
    }

}
