package exam.javaeight;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class JavaEightTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Function<String, Integer> toInt = (value) -> Integer.parseInt(value);

		System.out.println(toInt.apply("100"));
		
		
		Consumer<String> println = (value) -> System.out.println("Hello "+ value);
		
		println.accept("world");
		
		Predicate<Integer> toCheck = value -> value > 0 ;
		
		System.out.println(toCheck.test(1));
		
		Supplier checkType = () -> "Hello" ;
		
		System.out.println(checkType);
	}
		
	

}
