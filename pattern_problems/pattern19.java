import java.util.*;
import java.lang.*;
class pattern19{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<=n/2;i++){
            for(int j=0;j<=n/2;j++){
                if(j<(n/2-i+1))System.out.print("* ");
                else System.out.print("  ");
            }
            for(int j=n/2-1;j>=0;j--){
                if(j<(n/2-i+1))System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
        for(int i=n/2-1;i>=0;i--){
            for(int j=0;j<=n/2;j++){
                if(j<(n/2-i+1))System.out.print("* ");
                else System.out.print("  ");
            }
            for(int j=n/2-1;j>=0;j--){
                if(j<(n/2-i+1))System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}