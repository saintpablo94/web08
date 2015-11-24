package exam.test08;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("exam/test08/beans.xml");

		System.out.println("객체이름 출력");

		for (String name : ctx.getBeanDefinitionNames()) {
			System.out.println(name);
		}
		
		Car car1 = (Car) ctx.getBean("car1");
		System.out.println(car1);
		
		Car car2 = (Car) ctx.getBean("car2");
		System.out.println(car2);
		
		Engine engine = car1.engine ;
		engine.cc = 3000;
		
		System.out.println(car1);
		System.out.println(car2);
	}
}
