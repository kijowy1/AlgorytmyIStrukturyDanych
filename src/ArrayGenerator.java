import java.util.Arrays;
import java.util.Random;

public class ArrayGenerator {

    private static final Random random = new Random();

    public static int[] generateRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(10000);
        }
        return arr;
    }

    public static int[] generateIncreasingArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = i;
        }
        return arr;
    }

    public static int[] generateDecreasingArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = size - i;
        }
        return arr;
    }

    public static int[] generateConstantArray(int size, int value) {
        int[] arr = new int[size];
        Arrays.fill(arr, value);
        return arr;
    }

    public static int[] generateAShapedArray(int size) {
        int[] arr = new int[size];
        int halfSize = size / 2;
        for (int i = 0; i < halfSize; i++) {
            arr[i] = i;
        }
        for (int i = halfSize; i < size; i++) {
            arr[i] = size - i;
        }
        return arr;
    }
}