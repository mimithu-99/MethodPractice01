package MethodPractice02;

public class MyClass {
    void addNumber(int a, int b){
        int sum = a + b;
        System.out.println(sum);
    }
    int addNumber2(int a, int b){
        return a + b;
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.addNumber(20, 70);

        int results = obj.addNumber2(10, 20);
        System.out.println("The results is:" + results);

    }
}
