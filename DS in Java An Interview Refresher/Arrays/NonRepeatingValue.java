class NonRepeatingValue {
  public static void main(String args[]) {
    int a[] = {9,2,3,2,3,5};
    boolean isRepeated = false;
    for (int i = 0; i < args.length; i++) {
        for (int j = 0; j < a.length; j++) {
            if(a[i] == a[j] && i != j) {
                isRepeated = true;
                break;
            } 
        }
        if(isRepeated = false) {
            System.out.println(a[i]);
        } else {
            isRepeated = false;
        }
    }
  }
}