package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Sorting {

    public static void main(String[] args) {

        System.out.println("Welcome\nPlease choose any of the sorting algorithms below to continue");
        System.out.println("1. Swapping\n2. Insertion sort\n3. Selection Sort");
        System.out.print("Enter your option: ");

        Scanner scanner = new Scanner(System.in);

       try {
           int option = scanner.nextInt();

           while (option < 1 || option > 3) {

               System.out.println("Invalid option. please enter a valid option");
               System.out.print("Enter your option: ");

                option = scanner.nextInt();

           }

           System.out.print("Please enter the number of items to sort: ");

           int size = scanner.nextInt();

           int[] numbers = new int[size];

           for (int i=0; i<size; i++) {
               System.out.print("Enter item "+(i+1+": "));
               numbers[i] = scanner.nextInt();
           }

           if (option == 1) {

               swapping(numbers);

           }else if (option == 2) {

               insertionSort(numbers);

           }else {

               selectionSort(numbers);
           }

       }catch (InputMismatchException e) {

           System.out.println("Option must be a number. Program will exit now");
       }
    }

    private static void swapping(int[] arr) {
        int temp = 0;

        for(int i=0; i < arr.length; i++) {

            for(int j=1; j < (arr.length-i); j++) {

                if(arr[j-1] > arr[j]){

                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        printArray(arr);
    }

    private static void insertionSort(int[] arr) {

        for (int j = 1; j < arr.length; j++) {

            int key = arr[j];
            int i = j-1;

            while ( (i > -1) && ( arr [i] > key ) ) {
                arr [i+1] = arr [i];
                i--;
            }
            arr[i+1] = key;
        }

        printArray(arr);

    }

    private static void selectionSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            int index = i;

            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < arr[index]){
                    index = j;
                }
            }

            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }

        printArray(arr);

    }

    private static void printArray(int[] arr) {
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
