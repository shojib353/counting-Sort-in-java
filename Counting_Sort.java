
package counting_sort;

import java.util.Scanner;


public class Counting_Sort {

   
    public static void main(String[] args) {
        
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array=");
        int n=sc.nextInt();//taking array size
        
        int [] A=new int[n];  //array declare
        
        for(int i=0;i<A.length;i++){  //for input array using loop
            System.out.print("\n Enter the "+i+" no value=");
            A[i]=sc.nextInt();    //taking input here
        }
        
             int max = A[0];
     for(int i=0; i<A.length; i++) //finding max value from unsorted array
     {
       if(max < A[i])
       {
          max = A[i];
       }
     }
    System.out.print("max value="+max); 
        
        //int[] A={1,2,4,3,0,2=
        int range=max+1;//using max value for Count array size declareing
        //int count[]={0,0,0,0,0,0,0,0};
        int count[]=new int[range];
        
        for(int i=0;i<range;i++){
        count[i]=0;
        }
        
        
        for(int i=0;i<A.length;i++){   
            count[A[i]]=count[A[i]]+1;  //count array index == A array value
        
        }
        
        System.out.print("\nCount array ={");
        for(int i=0;i<range;i++){ // print count array value
            System.out.print(""+count[i]+",");
        
        }
        System.out.print("}\n");
        for(int i=1;i<range;i++){  //here fibonacci sum apply or cumulative sum
            count[i]=count[i]+count[i-1];
        
        }
        
        System.out.print("\nCount of cumulative sum ={");
        for(int i=0;i<range;i++){ //print the count array after cumulative sum operation
            System.out.print(" "+count[i]+",");
        
        }
        System.out.print("}\n");
        
        
        int[] output=new int[A.length] ; //declare output array.
        for(int i=A.length-1;i>=0;i--){
            count[A[i]]=count[A[i]]-1;  //count index =A[i] ,from this count[A[i]] decrement 1,
            
            output[count[A[i]]]=A[i];  //set the right position on output array from array of A.
            
            
            
        
        }
                
          System.out.print("\nsorted array ={");      
        for(int i=0;i<A.length;i++){//printing sorted array
            System.out.print(output[i]+",");
        
        }
        System.out.print("}\n");
        
        
        
       
        
    }
    
}
