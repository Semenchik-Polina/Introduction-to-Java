package by.bsuir.semenchik.fundamental.task3.runner;

import by.bsuir.semenchik.fundamental.task3.util.TanValues;

public class Runner {

    public static void main(String args[]) {
        for (double[] item : TanValues.calculate(0.5, 5, 0.5)) {
            System.out.println(item[0] + " | " + item[1] + "\r");
        }
    }

}
