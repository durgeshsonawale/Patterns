import java.util.*;
import java.lang.*;
class pattern31{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==n-i-1)System.out.print("* ");
                else System.out.print(n-j+" ");
                
            }
            System.out.println();
        }
    }
}