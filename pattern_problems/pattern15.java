import java.util.*;
import java.lang.*;
class pattern15{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n+i;j++){
                if(j<2*i)System.out.print("  ");
                else System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=n-2;i>=0;i--){
            for(int j=0;j<n+i;j++){
                if(j<2*i)System.out.print("  ");
                else System.out.print("* ");
            }
            System.out.println();
        }
    }
}