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

public class aimode extends AppCompatActivity {
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
        setContentView(R.layout.activity_aimode);
        ArrayList<Exampleitem> exampleList = new ArrayList<>();

        mRecyclerView=findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager=new LinearLayoutManager(aimode.this);
        mAdapter=new adapter(exampleList);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);





        //red = 1
        //blue = 2
        //gree = 3
        // yellow = 4
        //pink = 5
        //orange = 6
        String[] t = new String[4];
        test.autoset();
        //int j = 0;
        test.finddomain();
        int[] temp = new int[4];
        for(int i=0;i<12;i++)
        {


            for(int j=0;j<4;j++)
            {
                if(test.player[i][j] == 0)
                {
                    return;
                }
                if(test.player[i][j] == 1)
                {
                    t[j] = "red";
                }
                if(test.player[i][j] == 2)
                {
                    t[j] = "blue";
                }
                if(test.player[i][j] == 3)
                {
                    t[j] = "green";
                }
                if(test.player[i][j] == 4)
                {
                    t[j] = "yellow";
                }
                if(test.player[i][j] == 5)
                {
                    t[j] = "pink";
                }
                if(test.player[i][j] == 6)
                {
                    t[j] = "orange";
                }
                temp[j] = test.player[i][j];
            }
            String a = ""+test.findwhiter(temp,1);
            String b = ""+test.findblacker(temp);

        }

//        list1.add(new Exampleitem(e,e1,e2,e3));



    }
    int count = 0;
    mastermind test = new mastermind();

}
