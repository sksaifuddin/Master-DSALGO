import java.util.Scanner;

class BinarySearch {
  public static void main(String args[]) {
        int input[] = {2,3,4,5,6};
        int number = 5;
        int first = 0;
        int last = input.length - 1;
        int middle = (first + last) / 2;
        while (first <= last) {
            if (input[middle] < number) {
                first = middle + 1;
            } else if (input[middle] == number) {
                System.out.printf(number + " found at location %d %n", middle);
                break;
            } else {
                last = middle - 1;
            }
            middle = (first + last) / 2;
        }
        if (first > last) {
            System.out.println(number + " is not present in the list.\n");
        }
    }
   
  }