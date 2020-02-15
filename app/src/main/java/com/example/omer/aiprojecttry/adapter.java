package com.example.omer.aiprojecttry;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class adapter extends RecyclerView.Adapter<adapter.ExampleViewHolder>
{

    private  ArrayList<Exampleitem>mpaymentlist;

    public static class ExampleViewHolder extends RecyclerView.ViewHolder
    {

        public TextView mTextView1;
        public TextView mTextView2;
        public ImageView a;
        public ImageView a1;
        public ImageView a2;
        public ImageView a3;
        public EditText ab;
        public EditText ab2;


        public ExampleViewHolder(@NonNull View itemView) {
            super(itemView);
            a = itemView.findViewById(R.id.imageView2);
            a1 = itemView.findViewById(R.id.imageView3);
            a2 = itemView.findViewById(R.id.imageView4);
            a3 = itemView.findViewById(R.id.imageView5);
            ab= itemView.findViewById(R.id.editText);
            ab2=itemView.findViewById(R.id.editText2);
            ab.setClickable(false);
            ab.setFocusable(false);
            ab2.setClickable(false);
            ab2.setFocusable(false);


        }




    }
    public adapter(ArrayList<Exampleitem> exampleItemArrayList)
    {
        mpaymentlist =exampleItemArrayList;

    }

    @NonNull
    @Override
    public ExampleViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i)
    {
        View v=LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.final_list,viewGroup,false);
        ExampleViewHolder evh=new ExampleViewHolder(v);
        return evh;
    }

    @Override
    public void onBindViewHolder(@NonNull ExampleViewHolder exampleViewHolder, int i) {
        Exampleitem currentItem=mpaymentlist.get(i);

        if(currentItem.getImageResource1().equals("red"))
        {
            exampleViewHolder.a.setImageResource(R.drawable.red_colour);
        }
        if(currentItem.getImageResource1().equals("blue"))
        {
            exampleViewHolder.a.setImageResource(R.drawable.blue);
        }
        if(currentItem.getImageResource1().equals("green"))
        {
            exampleViewHolder.a.setImageResource(R.drawable.green);
        }
        if(currentItem.getImageResource1().equals("yellow"))
        {
            exampleViewHolder.a.setImageResource(R.drawable.yellow);
        }
        if(currentItem.getImageResource1().equals("pink"))
        {
            exampleViewHolder.a.setImageResource(R.drawable.pink);
        }
        if(currentItem.getImageResource1().equals("orange"))
        {
            exampleViewHolder.a.setImageResource(R.drawable.orange);
        }



        if(currentItem.getImageResource2().equals("red"))
        {
            exampleViewHolder.a1.setImageResource(R.drawable.red_colour);
        }
        if(currentItem.getImageResource2().equals("blue"))
        {
            exampleViewHolder.a1.setImageResource(R.drawable.blue);
        }
        if(currentItem.getImageResource2().equals("green"))
        {
            exampleViewHolder.a1.setImageResource(R.drawable.green);
        }
        if(currentItem.getImageResource2().equals("yellow"))
        {
            exampleViewHolder.a1.setImageResource(R.drawable.yellow);
        }
        if(currentItem.getImageResource2().equals("pink"))
        {
            exampleViewHolder.a1.setImageResource(R.drawable.pink);
        }
        if(currentItem.getImageResource2().equals("orange"))
        {
            exampleViewHolder.a1.setImageResource(R.drawable.orange);
        }




        if(currentItem.getImageResource3().equals("red"))
        {
            exampleViewHolder.a2.setImageResource(R.drawable.red_colour);
        }
        if(currentItem.getImageResource3().equals("blue"))
        {
            exampleViewHolder.a2.setImageResource(R.drawable.blue);
        }
        if(currentItem.getImageResource3().equals("green"))
        {
            exampleViewHolder.a2.setImageResource(R.drawable.green);
        }
        if(currentItem.getImageResource3().equals("yellow"))
        {
            exampleViewHolder.a2.setImageResource(R.drawable.yellow);
        }
        if(currentItem.getImageResource3().equals("pink"))
        {
            exampleViewHolder.a2.setImageResource(R.drawable.pink);
        }
        if(currentItem.getImageResource3().equals("orange"))
        {
            exampleViewHolder.a2.setImageResource(R.drawable.orange);
        }




        if(currentItem.getImageResource4().equals("red"))
        {
            exampleViewHolder.a3.setImageResource(R.drawable.red_colour);
        }
        if(currentItem.getImageResource4().equals("blue"))
        {
            exampleViewHolder.a3.setImageResource(R.drawable.blue);
        }
        if(currentItem.getImageResource4().equals("green"))
        {
            exampleViewHolder.a3.setImageResource(R.drawable.green);
        }
        if(currentItem.getImageResource4().equals("yellow"))
        {
            exampleViewHolder.a3.setImageResource(R.drawable.yellow);
        }
        if(currentItem.getImageResource4().equals("pink"))
        {
            exampleViewHolder.a3.setImageResource(R.drawable.pink);
        }
        if(currentItem.getImageResource4().equals("orange"))
        {
            exampleViewHolder.a3.setImageResource(R.drawable.orange);
        }



        exampleViewHolder.ab.setText(currentItem.getEdittext1());
        exampleViewHolder.ab2.setText(currentItem.getEdittext2());





    }

    @Override
    public int getItemCount() {
        return mpaymentlist.size();
    }
}

