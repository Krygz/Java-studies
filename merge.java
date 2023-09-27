import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {	    

	
	public static void main(String[] args){
		
  int [ ] arr1 = {1,2,3,4,5};
  int [] arr2 = {6,7,8,9};
      
  int n1 = arr1.length;
  int n2 = arr2.length;
  
 int [] arr3 = new int[n1+n2]; 
  mergeArray(arr1, n1, arr2, n2 , arr3);
  
  for(int i = 0 ;i < n1 + n2; i++) {
	  
	  System.out.print(arr3[i] +" ");
	  
	  
  } 
	}	
	public static void mergeArray(int[] arr1, int n1, int[] arr2 , int n2 ,int[] arr3) {
		  int i = 0;
		  int j = 0;
		  int k = 0;
		  
		  
		  while(i < n1) {
			  arr3[k++] = arr1[i++];  
			 
		  }
		  while(j < n2) {
			  arr3[k++] = arr2[j++];
			  
		  }
		  
		  Arrays.sort(arr3);
	  }
}



