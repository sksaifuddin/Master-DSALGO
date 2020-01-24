// Find Two Numbers that Add up to "n"


// sol1: Brute Force
class FindSum1 {
  public static void main(String args[]) {
    int a[] = {1, 21, 3, 14, 5, 60, 7, 6};
    int n = 27;
    for (int i = 0; i < a.length; i++) {
        for (int j = i; j < a.length; j++) {
            if(a[i] + a[j] == n) {
                System.out.println("a"+ a[i]);
                System.out.println("b"+ a[j]);
            }
        }
    }
  }
}

// sol2: Sorting the Array - Two pointer technique

class FindSum2 {
  public static void main(String args[]) {
     int a[] = {1,3,5,6,7,14,21,60};
     int n = 27;
     int p1=0; int p2= a.length-1;
     int sum = 0;
     while(p1 != p2) {
        sum = a[p1] + a[p2];

         if(sum < n) {
            p1++;
         } else if(sum > n) {
             p2--;
         } else {
            System.out.println("a"+ a[p1]);
            System.out.println("b"+ a[p2]);
            break;
         }
     }
  }
}

