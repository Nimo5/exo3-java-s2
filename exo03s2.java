import java.util.Scanner;
import java.util.Arrays;
public class exo03s2 {
    public static void main(String[] args){
        int n=-1;
        Scanner val =new Scanner(System.in);
        do{
        System.out.print("enter the number of table one : ");
        n=val.nextInt();
        if(n<=0){System.out.println("enter n>0");}
        }while(n<=0);
        int t1[]= new int[100];
        for(int i=0; i<n; i++){
            System.out.print("t["+(i+1)+"]=");
            t1[i]=val.nextInt();
        }
        int t2[] = new  int[n];
        for(int i=0; i<n; i++){
            t2[i]=t1[i]*t1[i];
        }
        for ( int value : t2 ){
            System.out.print(value + " " );
        }
         int index=0;
        int t3[] =new int[10];
        for (int blabla:t3) {
            t3[index]=(int)(Math.random()*95)+5;
        }
        System.out.println(" ");
        Arrays.sort(t3);
        for ( int value : t3){
            System.out.println(value+" ");
        }
        int minval =Arrays.stream(t3).min().getAsInt();
        int maxval =Arrays.stream(t3).max().getAsInt();
        System.out.println(" min is "+minval);
        System.out.println(" max is "+maxval);

        val.close();


    }
}
