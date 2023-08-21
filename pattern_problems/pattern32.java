import java.util.*;
import java.lang.*;
class pattern32{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<2*i;j++){
                if(j%2==1)System.out.print(i+" ");
                else System.out.print("! ");
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            for(int j=1;j<2*i;j++){
                if(j%2==1)System.out.print(i+" ");
                else System.out.print("! ");
            }
            System.out.println();
        }
    }
}