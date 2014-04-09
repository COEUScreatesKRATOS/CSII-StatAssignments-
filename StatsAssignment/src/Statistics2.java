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

    private int[] userNumData;
    private int[] sorteduserNumData;
    /** Number of Numbers */
    private final int NON = userNumData.length;

    public void Statistics() {
        System.out.println("Please enter your numbers (separtated by spaces) and then press enter:");
        // ask user for number using scanner
        // parse and populate
        // sort array
        final Scanner input = new Scanner(System.in);

        final String strNums = input.nextLine();

        final String[] userToken = strNums.trim().split(" ");

        userNumData = new int[userToken.length];

        for (int i = 0; i < userToken.length; i++) {

            final int num = Integer.parseInt(userToken[i]);
            userNumData[i] = num;

        }

    }

    public double Mean() {
        for (int i = 0; i < non; i++) {
            return ((i + i++) / non);
        }
    }

    public double Median() {
        for (final int element : userNumData) {
            final int middleNum = non / 2;

            if ((non) % 2 == 1) {
                return userNumData[middleNum];
            } else {
                return userNumData[middleNum - 1] + userNumData[middleNum] / 2;
            }
        }

    }

    public int Mode() {
        for (final int element : userNumData) {
            int Value;
            int vCount;

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
    }

    public void Print() {
        System.out.println("The mean of the numbers = " + Mean());
        System.out.println("The Median of the numbers = " + Median());
        System.out.println("The Mode of the numbers = " + Mode());
    }

    public static void main(final String[] args) {
        // TODO Auto-generated method stub

    }

}
