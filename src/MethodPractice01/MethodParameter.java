package MethodPractice01;

public class MethodParameter {
    public static void main(String[] args) {
        average(4, 6);
        System.out.println("Hi");
        average(2, 7);

    }

    public static void average(int a, int b) {
        int avg = (a + b) / 2;
        System.out.println("The average is : " + avg);


    }
}
