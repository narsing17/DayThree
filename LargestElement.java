public class LargestElement {
    public static void main(String[] args) {


        int[] arr = new int[]{25, 11, 7, 75, 56};

        int max = arr[0];

        for (int x : arr) {

            if (x > max)
                max = x;
        }
        System.out.println("Largest element present in given array: " + max);
    }
}
