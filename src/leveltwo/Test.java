package leveltwo;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] timeTakenArray = new int[10];

        for(int i = 0; i < 10; i++) {
            timeTakenArray[i] = i;
        }

        System.out.println(Arrays.toString(timeTakenArray));
    }
}
