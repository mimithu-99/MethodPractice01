package MethodPractice;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Algebra obj = new Algebra();
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println("Sum of input number is:");
     int ans = obj.add(x, y);
        System.out.println(ans);

        
    }
}
