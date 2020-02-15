package com.example.omer.aiprojecttry;
import java.util.Random;
import java.util.Scanner;
public class mastermind
{
    int black;
    int white;

    int[][] player = new int[200][4];
    int[][] player1 = new int[200][4];
    int[] answer = new int[4];


    int i = 3;
    int n = 4;
    int p = 0;
    int[][] p1 = new int[500][4];
    //domain = 1 - 6
    void finddomain()
    {
        player[0][0] = 1;
        player[0][1] = 2;
        player[0][2] = 3;
        player[0][3] = 4;
        int[] m = new int[7];
        m[0] = findblack(0);
        if(m[0] == 4)
        {
            //System.out.println("Found");
            nextstage(0);
            return;
        }
        //System.out.println("Try 1 Black on index 0 = "+m[0]);
        player[1][0] = 1;
        player[1][1] = 2;
        player[1][2] = 5;
        player[1][3] = 6;
        m[1] = findblack(1);
        if(m[1] == 4)
        {
            //System.out.println("Found");
            nextstage(1);
            return;
        }
        //System.out.println("Try 2 Black on index 1 = "+m[1]);
        player[2][0] = 6;
        player[2][1] = 5;
        player[2][2] = 3;
        player[2][3] = 4;
        m[2] = findblack(2);
        if(m[2] == 4)
        {
            //System.out.println("Found");
            nextstage(2);
            return;
        }
        //System.out.println("Try 3 Black on index 2 = "+m[2]);


        if(m[0] == 3 && m[1] == 3)
        {
            int temp2 = 3;
            for(int j = 0;j<2;j++)
            {
                int temp1 = 5;
                for(int k = 0;k<2;k++)
                {
                    player[i][2] = temp1;
                    player[i][3] = temp2;
                    player[i][0] = 1;
                    player[i][1] = 2;
                    temp1++;
                    m[i] = findblack(i);
                    //System.out.println("parent 1 Black on index "+i+" = "+m[i]);
                    if(m[i] == 4)
                    {
                        //System.out.println("Found");
                        nextstage(i);
                        return;
                    }
                    i++;
                }
                temp2++;
            }
        }
        else if(m[0] == 3 && m[2] == 3)
        {
            int temp2 = 1;
            for(int j = 0;j<2;j++)
            {
                int temp1 = 5;
                for(int k = 0;k<2;k++)
                {
                    player[i][2] = temp1;
                    player[i][3] = temp2;
                    player[i][0] = 3;
                    player[i][1] = 4;
                    temp1++;
                    m[i] = findblack(i);
                    //System.out.println("parent 2 Black on index "+i+" = "+m[i]);
                    if(m[i] == 4)
                    {
                        //System.out.println("Found");
                        nextstage(i);
                        return;
                    }
                    i++;
                }
                temp2++;

            }
        }
        else
        {
            int temp2 = 3;
            for(int j = 0;j<2;j++)
            {
                int temp1 = 1;
                for(int k = 0;k<2;k++)
                {
                    player[i][2] = temp1;
                    player[i][3] = temp2;
                    player[i][0] = 5;
                    player[i][1] = 6;
                    temp1++;
                    m[i] = findblack(i);
                    //System.out.println("Try "+i+" parent 3 Black on index "+i+" = "+m[i]);
                    if(m[i] == 4)
                    {
                        //System.out.println("Found");
                        nextstage(i);
                        return;
                    }
                    i++;
                }
                temp2++;

            }
        }
    }
    void print(int i)
    {
        System.out.println("");
        for(int j=0;j<12;j++)
        {
            for(int q = 0;q<4;q++)
            {
                System.out.print(" "+player[j][q]);
            }
            System.out.println("\n");
        }
    }

    void nextstage(int i)
    {
        i++;
        //System.out.println("whites: "+findwhite(i-1));
        int prev = findwhite(i-1);
        if(prev == 4)
        {
            return;
        }
        int k=0;
        int count = 0;
        int j=1;
        while(true)
        {

            prev = findwhite(i-1);
            //System.out.println(" ");
            int temp;
            for(int q = 0;q<4;q++)
            {
                player[i][q] = player[i-1][q];
            }

            // 01 02 03 12 13 23
            switch(count){
                case(0):
                    k = 0;
                    j = 1;
                    //System.out.println("Case 0 ");
                    break;
                case(1):
                    k = 0;
                    j = 2;
                    //System.out.println("Case 1 ");
                    break;
                case(2):
                    k = 0;
                    j = 3;
                    //System.out.println("Case 2 ");
                    break;
                case(3):
                    k = 2;
                    j = 1;
                    //System.out.println("Case 3 ");
                    break;
                case(4):
                    k = 3;
                    j = 1;
                    //System.out.println("Case 4 ");
                    break;
                case(5):
                    k = 2;
                    j = 3;
                    //System.out.println("Case 5 ");
                    break;

            }

            temp = player[i-1][k];
            player[i][k] = player[i][j];
            player[i][j] = temp;

            count++;
            if(count > 5)
            {
                count = 0;
            }
            int w = findwhite(i);
            // System.out.println("Try "+i+" whites: "+w);
            if(w == 4)
            {
                break;
            }

            if(w < prev)
            {
                for(int q = 0;q<4;q++)
                {
                    player[i][q] = player[i-1][q];
                }
            }
            i++;
        }
        return;
    }
    //red = 1
    //blue = 2
    //gree = 3
    // yellow = 4
    //pink = 5
    //orange = 6
    void getdata(String a[],int n)
    {
        int count = n;
        for(int x=0;x<4;x++)
        {
            if(a[x].equals("red"))
            {
                player[count][x] = 1;
            }
            else if(a[x].equals("blue"))
            {
                player[count][x] = 2;
            }
            else if(a[x].equals("green"))
            {
                player[count][x] = 3;
            }
            else if(a[x].equals("yellow"))
            {
                player[count][x] = 4;
            }
            else if(a[x].equals("pink"))
            {
                player[count][x] = 5;
            }
            else if(a[x].equals("orange"))
            {
                player[count][x] = 6;
            }
            black = findblack(n);
            white =  findwhite(n);

        }
    }
    int findwhiter(int arr[],int i)
    {
        int p = i;
        //System.out.println("You have entered "+player[p][0]+" "+player[p][1]+" "+player[p][2]+" "+player[p][3]+" ");
        int white = 0;
        for(int m = 0;m<4;m++)
        {
            if(answer[m] == arr[m])
            {
                white++;
            }
        }
        return white;
    }
    int findwhite(int i)
    {
        int p = i;
        //System.out.println("You have entered "+player[p][0]+" "+player[p][1]+" "+player[p][2]+" "+player[p][3]+" ");
        int white = 0;
        for(int m = 0;m<4;m++)
        {
            if(answer[m] == player[i][m])
            {
                white++;
            }
        }
        return white;
    }
    int findblack(int i)
    {
        int black = 0;
        for(int m = 0;m<4;m++)
        {
            for(int n = 0;n<4;n++)
            {
                if(answer[m] == player[i][n])
                {
                    black++;
                }
            }
        }
        return black;
    }
    int findblacker(int arr[])
    {
        int black = 0;
        for(int m = 0;m<4;m++)
        {
            for(int n = 0;n<4;n++)
            {
                if(answer[m] == arr[n])
                {
                    black++;
                }
            }
        }
        return black;
    }
    void playit()
    {
        int tries = 12;

        Scanner x = new Scanner(System.in);

        for(int i = 0;i<12;i++)
        {
            System.out.println("You have "+tries+" tries left.");
            tries--;
            for(int j=0;j<4;j++)
            {
                System.out.println("Enter value for index "+(j+1));
                int p = x.nextInt();
                player[i][j] = p;
            }

            System.out.println("You have entered "+player[i][0]+" "+player[i][1]+" "+player[i][2]+" "+player[i][3]+" ");
            System.out.println("");

            white = 0;
            black = 0;

            for(int m = 0;m<4;m++)
            {
                if(answer[m] == player[i][m])
                {
                    white++;
                }
            }
            if(white == 4)
            {
                System.out.println("Congrats you found the answer.");
                break;
            }
            else
            {
                for(int m = 0;m<4;m++)
                {
                    for(int n = 0;n<4;n++)
                    {
                        if(answer[m] == player[i][n])
                        {
                            black++;
                        }
                    }
                }
            }
            System.out.println("You have "+black+" correct numbers and "+white+" are in the correct position");

        }
    }
    void set()
{
    answer[0] = 2;
    answer[1] = 1;
    answer[2] = 5;
    answer[3] = 3;
}
void twoset(int a,int b,int c,int d)
{
    answer[0] = a;
    answer[1] = b;
    answer[2] = c;
    answer[3] = d;

}
    void autoset()
    {
        int flag = 0;
        Random rand = new Random();
        int i = 0;
        int n = 4;
        while(i<n)
        {
            flag = 0;
            answer[i] = rand.nextInt() % 7;
            //System.out.print("  "+p1[i]);
            if(answer[i] > 0)
            {
                for(int j=0;j<i;j++)
                {
                    if(answer[i] == answer[j] )
                    {
                        flag ++;
                    }
                }
                if(flag == 0)
                {
                    i++;
                    //System.out.println(" Value "+i);
                }
            }
        }
        System.out.println("You have entered "+answer[0]+" "+answer[1]+" "+answer[2]+" "+answer[3]+" ");

    }
    void autoplay()
    {
        int flag = 0;
        Random rand = new Random();

        while(true)
        {
            while(i<n)
            {
                flag = 0;
                p1[p][i] = rand.nextInt() % 6;
                if(p1[p][i]>0)
                {
                    //System.out.println("someting");
                    for(int j=0;j<i;j++)
                    {
                        //System.out.println("someting");
                        if(p1[p][i] == p1[p][j] )
                        {
                            flag ++;
                        }
                    }
                    if(flag == 0)
                    {
                        i++;
                        //System.out.println(" Value "+i);
                    }
                }
            }
            int o = 0;
            int same = 0;
            while(o<p)
            {
                int t = 0;
                for(int n1 = 0;n1<4;n1++)
                {
                    if(p1[o][n1] == p1[p][n1])
                    {
                        t++;
                    }
                }
                if(t == 4)
                {

                    same = 1;
                }
                o++;
            }
            i = 0;
            System.out.println("");
            System.out.println("Try number "+p);
            System.out.println("You have entered "+p1[p][0]+" "+p1[p][1]+" "+p1[p][2]+" "+p1[p][3]+" ");
            if(same == 1)
            {
                System.out.println("SAME");
            }
            else
            {
                white = 0;
                black = 0;

                for(int m = 0;m<4;m++)
                {
                    if(answer[m] == p1[p][m])
                    {
                        white++;
                    }
                }
                if(white == 4)
                {
                    System.out.println("Congrats you found the answer.");
                    break;
                }
                else
                {
                    for(int m = 0;m<4;m++)
                    {
                        for(int n1 = 0;n1<4;n1++)
                        {
                            if(answer[m] == p1[p][n1])
                            {
                                black++;
                            }
                        }
                    }
                }
                System.out.println("You have "+black+" correct numbers and "+white+" are in the correct position");


                p++;
            }


        }

    }
    void autoplaybetter()
    {
        int flag = 0;
        int starter = 1;
        Random rand = new Random();
        int w[] = new int[4];
        while(i<n)
        {
            flag = 0;
            w[i] = rand.nextInt() % 6;
            if(w[i]>0)
            {
                //System.out.println("someting");
                for(int j=0;j<i;j++)
                {
                    //System.out.println("someting");
                    if(w[i] == w[j] )
                    {
                        flag ++;
                    }
                }
                if(flag == 0)
                {
                    i++;
                    //System.out.println(" Value "+i);
                }
            }
        }
        while(true)
        {
            int prev = 0;
            int o = 0;
            i = 0;
            int same = 0;
            int index = -1;
            System.out.println("");
            System.out.println("Try number "+p);
            System.out.println("You have entered "+w[0]+" "+w[1]+" "+w[2]+" "+w[3]+" ");
            if(same == 1)
            {
                System.out.println("SAME");
            }
            else
            {
                white = 0;
                black = 0;

                for(int m = 0;m<4;m++)
                {
                    if(answer[m] == w[m])
                    {
                        white++;
                    }
                }
                if(white == 4)
                {
                    System.out.println("Congrats you found the answer.");
                    break;
                }
                else
                {
                    for(int m = 0;m<4;m++)
                    {
                        for(int n1 = 0;n1<4;n1++)
                        {
                            if(answer[m] == w[n1])
                            {
                                black++;
                            }
                        }
                    }
                }

                System.out.println("You have "+black+" correct numbers and "+white+" are in the correct position");
                if(starter == 1)
                {
                    prev = black;
                    starter++;
                }
                //change karna hai kuch so that value modifies
                if(black == 4)
                {

                    System.out.println("You have entered "+w[0]+" "+w[1]+" "+w[2]+" "+w[3]+" ");
                    break;
//sort the colours
                }
                else if(prev == black || black > prev )
                {
                    flag = 0;
                    index++;
                    int temp = 0;
                    temp = rand.nextInt() % 6;
                    if(temp>0)
                    {
                        //System.out.println("someting");
                        for(int j=0;j<i;j++)
                        {
                            //System.out.println("someting");
                            if(w[index] == temp )
                            {
                                flag ++;
                            }
                        }
                        if(flag == 0)
                        {
                            w[index] = temp;
                            i++;
                            //System.out.println(" Value "+i);
                        }
                    }
                }
                else
                {
                    if(index == -1)
                    {
                        index = 0;
                    }
                    int temp = 0;
                    flag = 0;
                    temp = rand.nextInt() % 6;
                    if(temp>0)
                    {
                        //System.out.println("someting");
                        for(int j=0;j<i;j++)
                        {
                            //System.out.println("someting");
                            if(w[index] == temp )
                            {
                                flag ++;
                            }
                        }
                        if(flag == 0)
                        {
                            w[index] = temp;
                            i++;
                            //System.out.println(" Value "+i);
                        }
                    }
                }
                prev = black;
                p++;
            }


        }

    }
}
