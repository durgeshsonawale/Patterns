import java.util.*;
import java.lang.*;
class pattern7{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==0||j==(n-1)||i==0||i==(n-1))System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}