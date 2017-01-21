package homework.homework_2016_09_24.artur_khachatryan;

public class Main {

    public static void main(String[] args) {
       spiral(5);


    }
    public static void spiral (int x){
        int [][] a = new int [x][x];
        int k = 1 ;

        for (int t = 1;t <= 3 ; t++ ) {    if (t == 3){ for(int i = 4;i >= 0; i--){ a[i][4] = k++;}  break ;}

            int c = 2 ;
            int cc = 1 ;
            int ccc = 2 ;
            if (t == 2){c++; cc--; ccc++;}

            for  (int i = c ; i >= cc ; i--)   { a[i][ccc] = k++; }


            int l = 2;
            int ll = 1;
            int lll = 1;
            if (t == 2) { l++;  ll--;   lll--; }
            for  (int j = l ; j >= ll ; j--)   { if (a[lll][j] != 0) continue;
                                                                               a[lll][j] = k++; }

            int z = 1;
            int zz = 3;
            int zzz = 1;
            if (t == 2){ z--;  zz++; zzz--; }
            for  (int f = z ; f <= zz ; f++)   { if (a[f] [zzz] != 0 ) continue ;
                                                                                  a [f][zzz] = k++ ;}


            int h = 1;
            int hh = 3;
            int hhh = 3;
            if (t == 2){h--;  hh++;  hhh++;}
            for  (int e = h ; e <= hh ; e++)   { if ( a[hhh] [e] != 0 ) continue ;
                                                                                   a [hhh] [e] = k++ ;}

        }



        printArray(a);
    }


    public static void printArray (int [] [] s){

        for (int i = 0; i <= 4; i++){
            for (int j = 0 ; j <= 4 ; j++){

                System.out.print(s [i] [j]);
            }

            System.out.println();
        }
    }

}
