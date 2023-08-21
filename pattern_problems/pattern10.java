import java.util.*;
import java.lang.*;
class pattern10{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<2*n-1;j++){
                if(j>=(n-i-1)&&j<=(n+i-1))System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}