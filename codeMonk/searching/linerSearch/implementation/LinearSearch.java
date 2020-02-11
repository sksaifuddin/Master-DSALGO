// Program to implememt linear search

import java.util.Scanner;

class LinearSearch {
  public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int max_size = sc.nextInt();int resultIndex = 0;
      int arr[] = new int[max_size];
      for(int i=0; i<max_size; i++) {
          arr[i] = sc.nextInt();
      }
      int searchItem = sc.nextInt();
      for(int i=1;i<max_size; i++) {
          if(searchItem == arr[i]) {
              resultIndex = i;
          }
      }
    System.out.println("the element is at index "+searchItem);
  }
}