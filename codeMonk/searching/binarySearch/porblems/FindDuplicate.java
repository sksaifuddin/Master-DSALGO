import java.util.Arrays;

// Check whether there are any duplicate elements in the array.

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