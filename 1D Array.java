import java.util.*;
public class Main{
public static void main (String arg[]){
Scanner sc = new Scanner(System.in);
int n =  sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++){//to get the value
    arr[i]=sc.nextInt();
}
for(int i=0;i<n;i++){//to print the value
    System.out.println(arr[i]);
}
}
}
