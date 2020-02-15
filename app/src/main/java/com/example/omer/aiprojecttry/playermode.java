package com.example.omer.aiprojecttry;

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

public class playermode extends AppCompatActivity {
    Spinner b,b1,b2,b3;
    Spinner w,w1;

    Button button;
    String [] list = {"red","blue","green","yellow","pink","orange"};


    ArrayList<Exampleitem> list1 = new ArrayList<>();



    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    public String th;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playermode);
        ArrayList<Exampleitem> exampleList = new ArrayList<>();

        mRecyclerView=findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager=new LinearLayoutManager(playermode.this);
        mAdapter=new adapter(exampleList);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
        int counter=0;

        button=findViewById(R.id.button);
        b=findViewById(R.id.spinner);
        b1=findViewById(R.id.spinner2);
        b2=findViewById(R.id.spinner3);
        b3=findViewById(R.id.spinner4);

        ArrayAdapter<String> x = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,list);
        x.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        b.setAdapter(x);
        b1.setAdapter(x);
        b2.setAdapter(x);
        b3.setAdapter(x);

        //red = 1
        //blue = 2
        //gree = 3
        // yellow = 4
        //pink = 5
        //orange = 6
        String[] t = new String[4];
//        list1.add(new Exampleitem(e,e1,e2,e3));

    test.autoset();

    }
    int count = 0;
    mastermind test = new mastermind();
    public void doit(View view)
    {
        String e = b.getSelectedItem().toString();
        String e1 = b1.getSelectedItem().toString();
        String e2 = b2.getSelectedItem().toString();
        String e3 = b3.getSelectedItem().toString();
        System.out.println(e+e1+e2+e3);
        if(e.equals(e1) || e.equals(e2) || e.equals(e3) || e1.equals(e2) || e1.equals(e3) || e2.equals(e3))
        {
            Toast.makeText(this, "You have entered the same color twice.", Toast.LENGTH_LONG).show();
        }
        else
        {
            String[] t = new String[6];
            t[0] = e;
            t[1] = e1;
            t[2] = e2;
            t[3] = e3;
            test.getdata(t,count);
            count++;

            String a = ""+test.black;
            String b = ""+ test.white;

            list1.add(new Exampleitem(e,e1,e2,e3,a,b));
            mAdapter=new adapter(list1);
            mRecyclerView.setLayoutManager(mLayoutManager);
            mRecyclerView.setAdapter(mAdapter);

            if (count==12)
            {
                Toast.makeText(this,"Awww you lose",Toast.LENGTH_LONG).show();
            }


            if(test.white == 4)
            {
                Toast.makeText(this, "Congrats you won, it took you "+count+" tries.", Toast.LENGTH_LONG).show();
            }
        }
    }
}
