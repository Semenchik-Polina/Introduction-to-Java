package by.bsuir.semenchik.fundamental.task4.runner;

import by.bsuir.semenchik.fundamental.task4.util.ArrWithPrimeNumb;

public class Runner {

    public static void main(String args[]) {
        int[] array = {2, 8, 9, 13};
        StringBuilder builder = new StringBuilder();
        for (Integer item : ArrWithPrimeNumb.primeNumbPlaces(array)) {
            builder.append(item).append(" ");
        }
        System.out.print(builder.toString());
    }

}
