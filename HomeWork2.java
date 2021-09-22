package lesson2;


public class HomeWork2 {
    public static void main(String[] args) {
        System.out.println(within10and20(10, 1));
        posOrNeg(3);
        System.out.println(positiveNum(-2));
        printWordNTimes("  ▲\n ▲ ▲\n", 1);
    }

    private static boolean within10and20(int a, int b) {
        int sum = a + b;
        return (a + b >= 10) && (a + b <= 20);
    }

    private static void posOrNeg(int num) {
        if (num >= 0)
            System.out.println(num + " positive");
        else
            System.out.println(num + " negative");
    }

    private static boolean positiveNum(int nums1) {
        return nums1 >= 0;
    }

    private static void printWordNTimes(String word, int times) {
        for (int i = 0; i < times; i++) {
            System.out.print(word);
        }
        System.out.println();
    }
}
