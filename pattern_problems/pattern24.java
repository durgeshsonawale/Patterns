import java.util.*;
import java.lang.*;
class pattern24{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j<(n-i-1))System.out.print("  ");
                else System.out.print(i+1+" ");
            }
            for(int j=n-2;j>=0;j--){
                if(j<(n-i-1))System.out.print("  ");
                else System.out.print(i+1+" ");
            }
            System.out.println();
        }
    }
}