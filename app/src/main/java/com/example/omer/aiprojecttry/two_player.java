package com.example.omer.aiprojecttry;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class two_player extends AppCompatActivity {
    Spinner b,b1,b2,b3;
    Spinner w,w1;

    Button button;
    String [] list = {"red","blue","green","yellow","pink","orange"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_player);
        button=findViewById(R.id.button);
        b=findViewById(R.id.spinner7);
        b1=findViewById(R.id.spinner8);
        b2=findViewById(R.id.spinner9);
        b3=findViewById(R.id.spinner10);

        ArrayAdapter<String> x = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,list);
        x.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        b.setAdapter(x);
        b1.setAdapter(x);
        b2.setAdapter(x);
        b3.setAdapter(x);
        String[] t = new String[4];
        }

        public void play(View view0)
    {
        int c[]=new int[4];
        mastermind z=new mastermind();
        String e = b.getSelectedItem().toString();
        String e1 = b1.getSelectedItem().toString();
        String e2 = b2.getSelectedItem().toString();
        String e3 = b3.getSelectedItem().toString();
        System.out.println(e+e1+e2+e3);
        if(e.equals(e1) || e.equals(e2) || e.equals(e3) || e1.equals(e2) || e1.equals(e3) || e2.equals(e3))
        {
            Toast.makeText(this, "You have entered the same color twice.", Toast.LENGTH_LONG).show();
        }
        else {
            String[] t = new String[6];
            t[0] = e;
            t[1] = e1;
            t[2] = e2;
            t[3] = e3;
        }

        if(e == "red")
        {
            c[1] =1 ;
        }
        if(e == "blue")
        {
            c[1] =2 ;
        }
        if(e == "green")
        {
            c[1] =3 ;
        }
        if(e == "yellow")
        {
            c[1] =4 ;
        }
        if(e == "pink")
        {
            c[1] =5 ;
        }
        if(e=="orange")
        {
            c[1]=6;
        }





        if(e1 == "red")
        {
            c[2] =1 ;
        }
        if(e1 == "blue")
        {
            c[2] =2 ;
        }
        if(e1 == "green")
        {
            c[2] =3 ;
        }
        if(e1 == "yellow")
        {
            c[2] =4 ;
        }
        if(e1 == "pink")
        {
            c[2] =5 ;
        }
        if(e1=="orange")
        {
            c[2]=6;
        }





        if(e2 == "red")
        {
            c[3] =1 ;
        }
        if(e2 == "blue")
        {
            c[3] =2 ;
        }
        if(e2 == "green")
        {
            c[3] =3 ;
        }
        if(e2 == "yellow")
        {
            c[3] =4 ;
        }
        if(e2 == "pink")
        {
            c[3] =5 ;
        }

        if(e2=="orange")
        {
            c[3]=6;
        }



        if(e3 == "red")
        {
            c[3] =1 ;
        }
        if(e3 == "blue")
        {
            c[3] =2 ;
        }
        if(e3 == "green")
        {
            c[3] =3 ;
        }
        if(e3 == "yellow")
        {
            c[3] =4 ;
        }
        if(e3 == "pink")
        {
            c[3] =5 ;
        }
        if(e3=="orange")
        {
            c[3]=6;
        }




        z.twoset(c[1],c[2],c[3],c[4]);
        startActivity(new Intent(this, playermode.class));


    }
    public void player(View view)
    {
        Intent p = new Intent(this,playermode.class);
        startActivity(p);
    }



}
