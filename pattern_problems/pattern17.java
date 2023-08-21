import java.util.*;
import java.lang.*;
class pattern17{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=n/2 + 1;
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                if(j<m-i-1)System.out.print("* ");
                else System.out.print("  ");
            }
            for(int j=m-2;j>=0;j--){
                if(j<m-i-1)System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
        for(int i=m-2;i>=0;i--){
            for(int j=0;j<m;j++){
                if(j<m-i-1)System.out.print("* ");
                else System.out.print("  ");
            }
            for(int j=m-2;j>=0;j--){
                if(j<m-i-1)System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}