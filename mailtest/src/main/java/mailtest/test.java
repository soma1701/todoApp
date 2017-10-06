package mailtest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	
	public static void main(String[] args) {
		
		ApplicationContext context =
	             new ClassPathXmlApplicationContext("Spring-Mail.xml");

	    	JavaMail mm = (JavaMail) context.getBean("mail");
	        mm.sendMail("somasingh1701@gmail.com",
	    		   "soma.singh.2406@gmail.com",
	    		   "Testing123",
	    		   "Testing only");
	        System.out.println("mail sucess");
	}

}
