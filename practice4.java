import java.util.*;
class practice4{
    public static void main(String[]args){
        int[] arr={2,2,2,2,1};
      

        int n=0;
        int j=0;
        int i=0; 
        while(i<j){
            if(arr[i]!=arr[i+1]){
                n=arr[i];
            }
            
            i++;
        
        }
       
        System.out.println(n);
    }
}