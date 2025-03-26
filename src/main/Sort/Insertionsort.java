public class Insertionsort {
    public static void main(String[] args) {
        int a[] = {5, 1, 6, 2, 4, 3};

        for (int i = 1; i < a.length; i++) {
            int key = i;
            for (int j = i-1; j >= 0; j--) {
                if (a[key] < a[j]) {
                    int temp = 0;
                    temp = a[key];
                    a[key] = a[j];
                    a[j]=temp;
                    key--;

                } else {
                    key--;

                }



                }
            }
        for (int k = 0; k <= a.length - 1; k++) {
            System.out.println(a[k]);
        }
    }
}
