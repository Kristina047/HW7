import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int[] arr = new int[]{1, 2, 3};
        double[] arr1 = {1.57, 7.654, 9.986};
        String[] seasons = {"Winter", "Spring", "Summer", "Autumn"};

        System.out.println("Задача 2");
        int[] arr2 = {1, 2, 3};
        for (int i = 0; i < arr2.length; i++) {
            if (i == arr2.length - 1) {
                System.out.println(arr2[i]);
                break;
            }
            System.out.print(arr2[i] + ",");
        }

        double[] arr3 = {1.57, 7.654, 9.986};
        for (int i = 0; i < arr3.length; i++) {
            if (i == arr3.length - 1) {
                System.out.println(arr3[i]);
                break;
            }
            System.out.print(arr3[i] + ",");
        }


        String[] seasons1 = {"Winter", "Spring", "Summer", "Autumn"};
        for (int i = 0; i < seasons1.length; i++) {
            if (i == seasons1.length - 1) {
                System.out.println(seasons1[i]);
                break;
            }
            System.out.print(seasons1[i] + ",");
        }


        System.out.println("Задача 3");
        int[] arr5 = {1, 2, 3};
        for (int i = arr5.length - 1; i >= 0; i--) {
            if (i == arr5.length - 3) {
                System.out.println(arr5[i]);
                break;
            }
            System.out.print(arr5[i] + ",");
        }
        double[] arr6 = {1.57, 7.654, 9.986};
        for (int i = arr6.length - 1; i >= 0; i--) {
            if (i == arr6.length - 3) {
                System.out.println(arr6[i]);
                break;
            }
            System.out.print(arr3[i] + ",");
        }


        String[] seasons2 = {"Winter", "Spring", "Summer", "Autumn"};
        for (int i = seasons2.length - 1; i >= 0; i--) {
            if (i == seasons2.length - 4) {
                System.out.println(seasons2[i]);
                break;
            }
            System.out.print(seasons2[i] + ",");
        }
        System.out.println("Задача 4");
        int[] arr7 = {1, 2, 3};
        for (int i = 0; i < 3; i++)
            if (arr7[i]%2!=0) {
                arr7[i] += 1;
            }
        System.out.print(Arrays.toString(arr7));


        }
    }


