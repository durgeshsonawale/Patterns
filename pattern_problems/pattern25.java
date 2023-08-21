import java.util.*;
import java.lang.*;
class pattern25{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int counter=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n+i;j++){
                if(j<(n-i-1))System.out.print("   ");
                else {System.out.printf("%-2d ",counter);counter++;}
            }
            System.out.println();
        }
    }
}