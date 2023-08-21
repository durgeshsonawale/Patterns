import java.util.*;
import java.lang.*;
class pattern12{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<2*n-1;j++){
                
                if(j>=(n-i-1)&&j<=(n+i-1)) {
                    if(count%2==0)System.out.print("* ");
                    else System.out.print("! ");
                    count++;
                    }
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}