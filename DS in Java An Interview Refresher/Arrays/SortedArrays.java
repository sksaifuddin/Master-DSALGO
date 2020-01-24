// Merge Two Sorted Arrays

class SortedArrays {
  public static void main(String args[]) {
        int a[] = {1,3,4,5};
        int b[] = {2,6,7,8};
        int res[] = new int[a.length + b.length];
        int i=0; int j=0; int k = 0;
        while(i < a.length && j < b.length) {
            if(a[i] < b[j]) {
                res[k] = a[i];
                i++;
            } else {
                res[k] = b[j];
                j++;
            }
            k++;
        }

        while(i < a.length) {
            res[k++] = a[i++]; 
        }

        while( j < b.length) {
            res[k++] = b[j++];
        }

        for (int k2 = 0; k2 < res.length; k2++) {
            System.out.println(res[k2]);
        }
  }
}