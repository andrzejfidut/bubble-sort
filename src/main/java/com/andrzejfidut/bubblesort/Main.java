package com.andrzejfidut.bubblesort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        SortUtils sort = new SortUtils();

        int[] numbers1 = {1, 2, 3, 4, 5};
        System.out.println("Przed sortowaniem numbers-1: \n" + Arrays.toString(numbers1));
        int[] sort1 = sort.sort1(numbers1);
        System.out.println("Po sortowaniu numbers-1: \n" + Arrays.toString(sort1));

        int[] numbers2 = {5, 4, 3, 2, 1};
        System.out.println("Przed sortowaniem numbers-2: \n" + Arrays.toString(numbers2));
        int[] sort2 = sort.sort2(numbers2);
        System.out.println("Po sortowaniu numbers-2: \n" + Arrays.toString(sort2));

        int[] sortThree = sort.sort3(sort.array3());
        System.out.println("Po sortowaniu numbers-3: \n" + Arrays.toString(sortThree));

        int[] sortFour = sort.sort4(sort.array4());
        System.out.println("Po sortowaniu numbers-4: \n" + Arrays.toString(sortFour));

        int[] numbers5 = {5, 2, 3, 1, 4};
        System.out.println("Przed sortowaniem numbers-5: \n" + Arrays.toString(numbers5));
        int[] sort5 = sort.sort5(numbers5);
        System.out.println("Po sortowaniu numbers-5: \n" + Arrays.toString(sort5));
    }
}
