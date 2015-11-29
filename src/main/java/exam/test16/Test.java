package exam.test16;

import java.text.SimpleDateFormat;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"exam/test16/beans.xml");

		System.out.println("[CustomDataEditor]");

		SimpleDateFormat dataFormat = (SimpleDateFormat) ctx
				.getBean("dataFormat");

		Tire hankookTire = (Tire) ctx.getBean("hankookTire");
		System.out.println(hankookTire.getMaker());
		System.out.println(dataFormat.format(hankookTire.getCreateDate()));

		Tire kumhoTire = (Tire) ctx.getBean("kumhoTire");
		System.out.println(kumhoTire.getMaker());
		System.out.println(dataFormat.format(kumhoTire.getCreateDate()));

	}
}
