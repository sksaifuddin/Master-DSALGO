
/**
*  Question: Find if the array contains a duplicate
*  Source url: BOOK: DSA made Easy, pageNo-301 , Problem 1. 
*  Techniques used: Sorting
*  Complexity = O(nlogn)
*/


import java.util.Arrays;

class FindDuplicate {
  public static void main(String args[]) {
      int arr[] = {4,2,1,4,6,5}; boolean flag= false;
      Arrays.sort(arr);
      for(int i=0; i<arr.length-1; i++) {
          if(arr[i] == arr[i+1]) {
              System.out.println("Duplicate found");
              flag = true;
              break;
          }
      }

      if(flag == false) {
        System.out.println("No Duplicate found");
      }
  }
}

// complexity = O(nlogn)