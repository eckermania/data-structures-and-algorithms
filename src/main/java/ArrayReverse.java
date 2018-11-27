import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] input1 = new int[5];
        input1[0] = 1;
        input1[1] = 2;
        input1[2] = 3;
        input1[3] = 4;
        input1[4] = 5;

        reverseArray(input1);
        System.out.println(Arrays.toString(input1));
    }
    public static int[] reverseArray(int[] input) {
        int hold;
        for(int i= 0; i<input.length/2; i++) {
            hold = input[i];
            input[i] = input[input.length - 1 - i];
            input[input.length - 1 - i] = hold;
        }
        return input;
    }
}
