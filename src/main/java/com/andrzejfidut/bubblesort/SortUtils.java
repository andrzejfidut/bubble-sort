package com.andrzejfidut.bubblesort;

import java.util.Arrays;

public class SortUtils {

    int[] sort1(int[] numbers1) {
        boolean changed = false;
        for (int i = 0; i < numbers1.length - 1; i++) {
            int currentNumber = numbers1[i];
            int nextNumber = numbers1[i + 1];
            if (currentNumber > nextNumber) {
                numbers1[i] = nextNumber;
                numbers1[i + 1] = currentNumber;
                changed = true;
            }
        }
        return changed ? sort1(numbers1) : numbers1;
    }

    int[] sort2(int[] numbers2) {
        boolean changed = false;
        for (int i = 0; i < numbers2.length - 1; i++) {
            int currentNumber = numbers2[i];
            int nextNumber = numbers2[i + 1];
            if (currentNumber > nextNumber) {
                numbers2[i] = nextNumber;
                numbers2[i + 1] = currentNumber;
                changed = true;
            }
        }
        return changed ? sort2(numbers2) : numbers2;
    }

    int[] array3() {
        int[] numbers3 = new int[99];
        for (int i = 0; i < numbers3.length; i++) {
            numbers3[i] = i + 1;
            System.out.println("Przed sortowaniem numbers-3: \n" + Arrays.toString(new int[]{numbers3[i]}));
        }
        return numbers3;
    }

    int[] sort3(int[] array3) {
        boolean changed = false;
        for (int i = 1; i < array3.length - 1; i++) {
            int currentNumber = array3[i];
            int nextNumber = array3[i + 1];
            if (currentNumber > nextNumber) {
                array3[i] = nextNumber;
                array3[i + 1] = currentNumber;
                changed = true;
            }
        }
        return changed ? sort3(array3) : array3;
    }

    int[] array4() {
        int[] numbers4 = new int[100];
        for (int i = numbers4.length - 1; i > 0; i--) {
            numbers4[i] = i;
            System.out.println("Przed sortowaniem numbers-4: \n" + numbers4[i]);
        }
        return numbers4;
    }

    int[] sort4(int[] numbers4) {
        boolean changed = false;
        for (int i = 1; i < numbers4.length - 1; i++) {
            int currentNumber = numbers4[i];
            int nextNumber = numbers4[i + 1];
            if (currentNumber > nextNumber) {
                numbers4[i] = nextNumber;
                numbers4[i - 1] = currentNumber;
                changed = true;
            }
        }
        return changed ? sort4(numbers4) : numbers4;
    }

    int[] sort5(int[] numbers5) {
        boolean changed = false;
        for (int i = 0; i < numbers5.length - 1; i++) {
            int currentNumber = numbers5[i];
            int nextNumber = numbers5[i + 1];
            if (currentNumber > nextNumber) {
                numbers5[i] = nextNumber;
                numbers5[i + 1] = currentNumber;
                changed = true;
            }
        }
        return changed ? sort2(numbers5) : numbers5;
    }
}
