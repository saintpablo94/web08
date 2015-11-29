package exam.test20;

import java.text.SimpleDateFormat;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"exam/test20/beans.xml");

		Car car1 = (Car) ctx.getBean("car1");
		System.out.println(car1.getEngine());
		
		/*Car car2 = (Car) ctx.getBean("car2");
		System.out.println(car2);*/
	}
}
