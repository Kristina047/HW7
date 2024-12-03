public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int[] arr = new int[]{1,2,3};
        double[] arr1 = {1.57, 7.654, 9.986};
        String[] seasons  = {"Winter", "Spring", "Summer", "Autumn"};

        System.out.println("Задача 2");
        int[] arr2 = new int[]{1,2,3};
        arr2 [0] = 1;
        arr2 [1] = 2;
        arr2 [2] = 3;
        for (int i = 0; i < arr2.length ; i++) {
            System.out.print(arr2[i]+",");
        } System.out.println();

        double[] arr3 = {1.57, 7.654, 9.986};
        arr3 [0] = 1.57;
        arr3 [1] = 7.654;
        arr3 [2] = 9.986;
        for (int i = 0; i < arr3.length ; i++) {
            System.out.print(arr3[i]+",");
        }
        System.out.println();

        String[] seasons1  = {"Winter", "Spring", "Summer", "Autumn"};
        seasons1 [0] = "Winter";
        seasons1 [1] = "Spring";
        seasons1 [2] = "Summer";
        seasons1 [3] = "Autumn";
        for (int i = 0; i < seasons1.length ; i++) {
            System.out.print(seasons1[i]+",");
        }

    }
}

