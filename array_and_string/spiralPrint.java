import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int arr[][] = new int[r][c];
        
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int minr = 0;
        int minc = 0;
        int maxr=arr.length-1;
        int maxc=arr[0].length-1;
        
        
        int count = 0;
        
        int total= r*c;
        while(count<total){
            //left wall
            for(int i = minr; i<=maxr&&count<total;i++){
                System.out.println(arr[i][minc]);
                count++;
            }
            minc++;
            
            //bottom wall
            for(int j=minc; j<=maxc && count<total;j++){
                System.out.println(arr[maxr][j]);
                count++;
            }
            maxr--;
            
            
            //right wall
            for(int i=maxr;i>=minr &&count<total;i--){
                System.out.println(arr[i][maxc]);
                count++;
            }
            maxc--;
            
            //top wall
            for(int j=maxc;j>=minc &&count<total;j--){
                System.out.println(arr[minr][j]);
                count++;
            }
            minr++;
        }
    }

}
