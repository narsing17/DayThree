public class SmallestElement {
    public static void main(String[] args) {
        
        int[] arr = new int[]{25, 11, 7, 75, 56};

        int min = arr[0];

        for (int x : arr) {
            if (x < min)
                min = x;
        }
        System.out.println("Smallest element present in given array: " + min);
    }
}
