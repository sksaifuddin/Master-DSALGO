import java.util.Scanner;

class binarySearch {
  public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int res=-1;
      int max_size = sc.nextInt();
      int arr[] = new int[max_size];
    int low=0; int high = max_size-1;int mid = 0;
        for(int i=0; i<max_size; i++) {
            arr[i] = sc.nextInt();
        }
    int key = sc.nextInt();
    while(low<=high) {
        mid = low+(high-low)/2;
        if(arr[mid] == key) {
            res = mid;
        } else if(arr[mid] < key) {
            low = mid+1;
        } else {
           high = mid-1;
        }

        break;

    }
    System.out.println("key is at value"+ res);


  }
}