/**
* Java Homework Lesson 3
* 
* @author Slava Grishin
* version 08.11.2021
* list method main int arr doTask1 doTask2 doTask3 doTask4 doTask5 doTask6 doTask7 
*/
class Homework3 {
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0}; // Array for task 1
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1}; // Array for task 3
        int[] arr6 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1}; // Array for task 6
        int[] arr7 = {1, 1, 2, 2}; // Array for task 7
        System.out.println("Task 1: ");
        doTask1(arr1); // Task 1 check
        System.out.println("\nTask 2: ");
        doTask2(100); // Task 2 check
        System.out.println("\nTask 3: ");
        doTask3(arr3); // Task 3 check
        System.out.println("\nTask 4: ");
        doTask4(); // Task 4 check
        System.out.println("\nTask 5: ");
        doTask5(5, 1); // Task 5 check
        System.out.println("\nTask 6: ");
        doTask6(arr6); // Task 6 check
        System.out.println("\nTask 7: ");
        System.out.println(doTask7(arr7)); // Task 7 check
    }


     static void doTask1(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
            System.out.print(arr[i] + " ");
        }
    }


     static void doTask2(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
        }
    }

      static void doTask3(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
            System.out.print(arr[i] + " ");
        }
    }



     static void doTask4() {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }



         static void doTask5(int len, int initialValue){
            int[] arr = new int[len];
            for (int i = 0; i < len; i++) {
                arr[i] = initialValue;
                System.out.print("[" + i + "]" + arr[i] + " ");
            }
        }


         static void doTask6( int[] arr){
            int max = arr[0];
            int min = arr[0];

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
            }
            System.out.println(max);
            System.out.println(min);
        }

         static boolean doTask7 ( int[] arr){
            int rightSum = 0;
            int leftSum = 0;
            for (int i = 0; i < arr.length; i++) {
                rightSum += arr[i];
            }

            for (int i = 0; i < arr.length; i++) {
                leftSum += arr[i];
                if (leftSum == rightSum - leftSum) {
                    return true;
                }
            }
            return false;
        }


    }
