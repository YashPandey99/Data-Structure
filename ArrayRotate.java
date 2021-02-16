import java.util.*;
public class ArrayRotate {
    public static void main(String[] args) {
        int n,i,d,j,k;
    Scanner sc =  new Scanner(System.in);
    n =sc.nextInt();
    int arr[] = new int[n];
    for(i=0;i<n;i++){
        arr[i]=sc.nextInt();    
    } 
    d =sc.nextInt();
    int ary[]= new int[d];
   
    
    for(j=0;j<d;j++){
        ary[j]= arr[j];
    } 
   
    int temp,a;
    temp = arr[0];
    for (a = 0; a < n-1 ; a++){
        arr[a] = arr[a + 1];
        arr[n-1] = temp; 
     }
     for (a = 0; a < n ; a++){
        System.out.print(arr[a]);
     }
    }
}
    