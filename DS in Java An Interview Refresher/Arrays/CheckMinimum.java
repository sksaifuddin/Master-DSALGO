class CheckMinimum {
  public static void main(String args[]) {
    int a[] = {-20,0,1,2,3};
    int min = a[0];
    for (int i = 0; i < a.length; i++) {
        if(a[i] < min) {
            min = a[i];
        }
    }
    System.out.println(min);
  }
}