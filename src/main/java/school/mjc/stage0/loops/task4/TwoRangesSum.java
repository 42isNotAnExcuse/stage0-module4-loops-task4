package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    // Write a program that will consume 2 args:
    // the first is number to skip, the second to iterate till.
    // You should consider the cases:
    // 3.1. when numberToSkip is greater than lastInRow
    // -> output is:"number to skip is bugger then the last"
    // 3.2. when lastInRow is negative
    // -> output is:"last number in row is negative"
    // 3.3. for the rest cases
    // -> output is: "skipped sum is number" "counted sum is number",
    // where number is an actual sum of them:
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        String large = "number to skip is bugger then the last";
        String neg = "last number in row is negative";
        String skSum = "skipped sum is %d";
        String cdSum = "counted sum is %d";
        int sk = 0;
        int cd = 0;

        if (numberToSkip > lastInRow) {
            System.out.println(large);
            return;
        } else if (lastInRow < 0) {
            System.out.println(neg);
            return;
        }
        for (int i = 0; i <= lastInRow; i++) {
            if (i <= numberToSkip) {
                sk += i;
            } else {
                cd += i;
            }
        }
        System.out.printf(skSum + "%n", sk);
        System.out.printf(cdSum + "%n", cd);
    }
}
