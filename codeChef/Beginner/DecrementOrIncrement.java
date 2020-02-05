import java.util.Scanner;

class DecrementOrIncrement {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    if(num % 4 == 0) {
        num++;
    } else {
        num--;
    }
    System.out.println(num);
  }
}