public class MyClass {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i <= arr.length; i++) { //Error: potential IndexOutOfBoundsException
            arr[i] = i * 2; 
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}