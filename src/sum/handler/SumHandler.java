package sum.handler;

import sum.annotation.Math;

public class SumHandler {
    @Math(num1 = 100, num2 = 200)
    public void sumNumbers(int number1, int number2) {
        System.out.println(number1 + number2);
    }
}
