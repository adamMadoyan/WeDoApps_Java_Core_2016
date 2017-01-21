package homework.homework_2016_09_17.sergey_melikyan;

class Sergey1 {

    public static void main(String[] args)


    {


        int a = 0;
        int b = 0;
        int c;
        int d=5;
        int t;
        int f=5;


        for (a = 0; a < 8; b++)  // patasxanum e toxeri hamar
        {
            System.out.println();


            for (t=f; t>0; t--)
            {

                System.out.print( " " );
            }
            for (c=d; c<6 ; c++)
            {
                System.out.print( "*" );

            }


            if(b<3)
            {

                f--;
                d = d - 2;
            }

            else if(b>2)
            {

                f++;
                d = d + 2;
            }
            a++;


        }


    }
}










