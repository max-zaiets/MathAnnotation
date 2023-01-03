package sum;

import sum.annotation.Math;
import sum.handler.SumHandler;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        SumHandler sum = new SumHandler();
        Class<?> cl = SumHandler.class;
        try {
            Method method = cl.getMethod("sumNumbers",int.class,int.class);
            Math math = method.getAnnotation(Math.class);
            sum.sumNumbers(math.num1(), math.num2());

        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }

    }
}
