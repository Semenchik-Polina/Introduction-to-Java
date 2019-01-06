package by.bsuir.semenchik.fundamental.task4.util;

import java.util.ArrayList;

public class ArrWithPrimeNumb {

    private static boolean isPrime(int number) {
        boolean result = true;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                result = false;
            }
        }
        return result;
    }

    public static ArrayList<Integer> primeNumbPlaces(int[] array) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (isPrime(array[i])) {
                result.add(i);
            }
        }
        return result;
    }
}
