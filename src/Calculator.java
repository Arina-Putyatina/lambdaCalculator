import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Calculator implements Supplier {

    static Supplier<Calculator> instance = Calculator::new;
    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    //    BinaryOperator<Integer> devide = (x, y) -> x / y; В таком виде выдает ошибку деления на ноль, требуется проверка
    BinaryOperator<Integer> devide = (x, y) -> y != 0 ? x / y : 0; // вернем 0, если y = 0
    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;
    Predicate<Integer> isPositive = x -> x > 0;
    Consumer<Integer> println = System.out::println;

    @Override
    public Object get() {
        return null;
    }
}
