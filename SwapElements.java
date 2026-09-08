import java.util.*;

class SwapElements{
    public static <T> void swap(T[] arr, int i, int j){
        if(i > arr.length || j > arr.length){
            throw new IndexOutOfBoundsException("Invalid Index");
        }

        T temp = arr[i - 1];
        arr[i - 1] = arr[j - 1];
        arr[j - 1] = temp;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String[] word = {"Apple","Banana","Cherry"};
        swap(word, 1, 3);

        System.out.println(Arrays.toString(word));

        Integer[] num = {10, 12, 14, 16, 18, 20};
        swap(num, 2, 4);

        System.out.println(Arrays.toString(num));
    }
}