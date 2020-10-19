import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {

    // write your code here
    Scanner sc = new Scanner(System.in);
    int r=sc.nextInt();
    int c=sc.nextInt();
    int arr[][] = new int[r][c];
 
    for(int i =0 ;i<arr.length;i++){
        for(int j=0;j<arr[0].length;j++){
            arr[i][j]=sc.nextInt();
        }
    }    
    
    for(int col =0;col<arr[0].length;col++){
        
        if(col%2==0){
            for(int row =0;row <arr.length;row++){
                System.out.println(arr[row][col]);
              
            }
        }else{
            for(int row =arr.length-1;row>=0;row--){
                 System.out.println(arr[row][col]);
                 
            }
        }
    }
}

}
