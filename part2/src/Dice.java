import java.util.ArrayList;
import java.util.Random;

public class Dice {
    //    rolling dice 6 times keeping 3 biggest records and returning its sum
    public int roll_dice() {
        int i, first = 0, second = 0, third = 0;
        int[] records = new int[6];
        Random randInt = new Random();
        int total = 0;
        int randomNumber = 0;

        for (i = 0; i < records.length; i++) {
            records[i] = randInt.nextInt(6) + 1;
        }

        for (i = 0; i < records.length; i++) {
            /* If current element is greater than
            first*/
            if (records[i] > first) {
                third = second;
                second = first;
                first = records[i];
            }

            /* If arr[i] is in between first and
            second then update second  */
            else if (records[i] > second) {
                third = second;
                second = records[i];
            } else if (records[i] > third)
                third = records[i];
        }

        total = first + second + third;

        return total;
    }

}
