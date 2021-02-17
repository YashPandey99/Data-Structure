import java.util.*;
public class ArrayRotate {
    public static void main(String[] args) {
        int n,i,d,j;
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
   
    int a;
    int f=d;
    while(f>0){
    for (a = 0; a < n-1 ; a++){
        arr[a] = arr[a + 1];
        
     }
        f--;
        }
        for(int p=0;p<n-d;p++){
            arr[d+p]=ary[p];
        }   


     for (a = 0; a < n ; a++){
        System.out.print(arr[a]);
     }
    
    }
}
    