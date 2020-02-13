import java.util.Arrays;

class MaximumTimes {
  public static void main(String args[]) {
      int arr[] = { 4,4,2,2,3,3,3,3,1,5 };
      int count = 0; int maxCount = 0; int maxCountIndex = 0;
      Arrays.sort(arr);
        for(int i=0; i<arr.length;i++) {
            if(arr[i] == arr[i+1]) {
                count++;
                maxCountIndex = i;
            }
        }
  }
}