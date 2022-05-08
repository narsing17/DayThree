public class EvenPosition {
    public static void main(String[] args) {


        int[] arr = new int[]{1, 2, 3, 4, 5};
        System.out.println(" Array even position: ");
        for (int x = 1; x < arr.length; x = x + 2) {
            System.out.println(arr[x]);
        }
    }
}
