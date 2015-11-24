package exam.test02;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("exam/test02/beans.xml");
		
		System.out.println("객체이름 출력");
		
		for(String name : ctx.getBeanDefinitionNames()){
			System.out.println(name);
		}
		
		System.out.println("별령");
		
		for(String alias : ctx.getAliases("score2")){
			System.out.println(alias);
		}
		
		Score score = (Score) ctx.getBean("score");
		Score score2 = (Score) ctx.getBean("score2");
		Score score3 = (Score) ctx.getBean("score3");
		Score score4 = (Score) ctx.getBean("score4");
		
		Score scoreOk = (Score) ctx.getBean("score-ok");
		
		System.out.println("꺼내기");
		
		if(score !=null) System.out.println("score find");
		if(score2 !=null) System.out.println("score2 find");
		if(score3 !=null) System.out.println("score3 find");
		if(score4 !=null) System.out.println("score4 find");
		if(scoreOk !=null) System.out.println("score-ok find");
		
		System.out.println("score 비교");
		
		if(score==score2) System.out.println("score==score2");
		if(score2==score3) System.out.println("score2==score3");
		if(score3==score4) System.out.println("score3==score4");
		if(score4==scoreOk) System.out.println("scor4e==scoreOk");
		
		
		System.out.println("합계 : "+score.sum());
		System.out.println("평균 : "+score.average() );
		
		ctx.close();
		
	}

}
