package school.mjc.stage0.loops.task4;

public class NumberToBreakOn {
    // Write a program that will consume 2 args:
    // the first is number to break on,
    // the second to iterate till,
    // if number to iterate till is less than to break with
    // num2it < breOn -> sout("iterating till the end")
    // and print all the numbers till the end,
    // otherwise all numbers till toBreakWith.
    public void printNumbersUntilWithBreakOn(int toBreakWith, int numberToGoUntil) {
        int stop = toBreakWith;

        if (numberToGoUntil < stop) {
            System.out.println("iterating till the end");
            stop = numberToGoUntil;
        }
        for (int i = 1; i <= stop; i++) {
            System.out.println(i);
        }
    }
}
