//Array of Products of All Elements Except Itself

class ProdOfALL {
  public static void main(String args[]) {
        int a[] = {1,2,3,4};
        int res[] = new int[a.length];
        int k=0;
        for (int i = 0; i < a.length; i++) {
            int prod = 1;
            for (int j = 0; j < a.length; j++) {
                if(i != j) {
                    prod = prod * a[j];
                }
            }
            res[k] = prod;
            k++;
        }
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
  }
}