import org.w3c.dom.ls.LSOutput;

import java.util.function.*;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;
    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    BinaryOperator<Integer> devide = (x, y) -> {
        int answer = 0;
        if (y != 0) {
            answer = x / y;
        } else {
            this.errorln.accept(y);
        }
        return answer;
    };
    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;
    Predicate<Integer> isPositive = x -> x > 0;
    Consumer<Integer> println = System.out::println;
    Consumer<Integer> errorln = z -> System.out.printf("Делить на %d нельзя \n", z);
}
