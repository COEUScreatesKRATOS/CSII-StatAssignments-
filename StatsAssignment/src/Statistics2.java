import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author ChrisHardingBrown
 * 
 */

public class Statistics2 {

    /**
     * @param args
     */

    private final int[] userNumData;
    private final int arrayLength;

    public Statistics2() {
        System.out.println("Please enter your numbers (separtated by spaces) and then press enter:");
        // ask user for number using scanner
        // parse and populate
        // sort array
        final Scanner input = new Scanner(System.in);

        final String strNums = input.nextLine();

        final String[] userToken = strNums.trim().split(" ");

        userNumData = new int[userToken.length];

        arrayLength = userNumData.length;

        for (int i = 0; i < userToken.length; i++) {

            final int num = Integer.parseInt(userToken[i]);
            userNumData[i] = num;

        }
        System.out.println(Arrays.toString(userNumData));

        for (int i = 0; i < arrayLength; i++) {
            for (int j = i + 1; j < arrayLength; j++) {
                if (userNumData[i] > userNumData[j]) {
                    final int temp = userNumData[i];
                    userNumData[i] = userNumData[j];
                    userNumData[j] = temp;
                }
            }
            System.out.println(Arrays.toString(userNumData));
        }
        System.out.println(Arrays.toString(userNumData));

    }

    public double Mean() {
        double sum = 0;
        for (int i = 0; i < arrayLength; i++) {
            sum += userNumData[i];
        }
        return sum / arrayLength;
    }

    public double Median() {
        final int middleNum = arrayLength / 2;

        if ((arrayLength) % 2 == 1) {
            return userNumData[middleNum];
        } else {
            return userNumData[middleNum - 1] + userNumData[middleNum] / 2.0;
        }

    }

    public int Mode() {

        int Value = 0;
        int vCount = 0;

        for (final int element2 : userNumData) {
            int count = 0;
            for (final int element3 : userNumData) {
                if (element3 == element2) {
                    ++count;
                }
            }
            if (count > vCount) {
                vCount = count;
                Value = element2;
            }
        }
        return Value;

    }

    public void Print() {
        System.out.println("The mean of the numbers = " + Mean());
        System.out.println("The Median of the numbers = " + Median());
        System.out.println("The Mode of the numbers = " + Mode());
    }

}
