public class ReverseOrder {
    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 4};
        System.out.println("Array in original Order ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Array in reverse order: ");

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
