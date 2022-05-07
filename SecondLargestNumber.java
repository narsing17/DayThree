public class SecondLargestNumber {
    public static int getSecondLargest(int[] a, int total) {
        int temp;
        for (int x = 0; x < total; x++) {
            for (int y = +1; y < total; y++) {
                if (a[x] > a[y]) {
                    temp = a[x];
                    a[x] = a[y];
                    a[y] = temp;
                }
            }
        }
        return a[total - 2];
    }

    public static void main(String args[]) {
        int arrayOne[] = {1, 7, 4, 2, 9};
        int arrayTwo[] = {11, 77, 44, 22, 99, 55};
        System.out.println("Second Largest: " + getSecondLargest(arrayOne, 5));
        System.out.println("Second Largest: " + getSecondLargest(arrayTwo, 6));
    }
}

