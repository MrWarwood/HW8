import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("HW-8.");

        System.out.println();
        System.out.println(" Задача №1.");
        int[] ints = new int[3];
        ints[0] = 1;
        ints[1] = 2;
        ints[2] = 3;
        System.out.println(ints[0]);
        System.out.println(ints[1]);
        System.out.println(ints[2]);
        System.out.println();


        double[] doubles = {1.57, 7.654, 9.986};
        System.out.println(doubles[0]);
        System.out.println(doubles[1]);
        System.out.println(doubles[2]);
        System.out.println();


        int[] weights = {90, 91, 93, 92, 85, 87, 84, 83,};
        for (int i = 0; i < weights.length; i++) {
            System.out.println(weights[i]);
        }


        System.out.println();
        System.out.println("  Задача №2.");
        for (int i = 0; i < ints.length; i++) {
            if (i != ints.length - 1) {
                System.out.print(ints[i] + ", ");
            } else {
                System.out.print(ints[i]);
            }
        }
        System.out.println();
        for (int a = 0; a < doubles.length; a++) {
            if (a != doubles.length - 1) {
                System.out.print(doubles[a] + ", ");
            } else {
                System.out.print(doubles[a]);
            }
        }
        System.out.println();
        for (int y = 0; y < weights.length; y++) {
            if (y != weights.length - 1) {
                System.out.print(weights[y] + ", ");
            } else {
                System.out.print(weights[y]);
            }
        }

        System.out.println();
        System.out.println("  Задача №3.");
        for (int i = ints.length - 1; i >= 0; i--) {
            System.out.print(ints[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int a = doubles.length - 1; a >= 0; a--) {
            System.out.print(doubles[a]);
            if (a != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int y = weights.length - 1; y >= 0; y--) {
            System.out.print(weights[y]);
            if (y != 0) {
                System.out.print(", ");
            }
        }


        System.out.println();
        System.out.println("  Задача №4.");
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 2 != 0) {
                ints[i]++;
            }
        }
        System.out.println(Arrays.toString(ints));

    }
}