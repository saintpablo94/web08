package exam.test11;

import java.util.Map.Entry;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("exam/test11/beans.xml");
		
		Tire tire1 = (Tire) ctx.getBean("hankookTire");
		Tire tire2 = (Tire) ctx.getBean("kumhoTire");
		Tire tire3 = (Tire) ctx.getBean("hankookTire");
		
		System.out.println("tire 1 ---> "+tire1.toString());
		System.out.println("tire 2 ---> "+tire2.toString());
		System.out.println("tire 3 ---> "+tire3.toString());
		
		if(tire1 != tire2){
			System.out.println("tire1 != tire2");
		}
		
		if(tire1 == tire3){
			System.out.println("tire1 == tire3");
		}
	}
}
