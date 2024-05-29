package in.ashokit;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
	
	ApplicationContext context=
			new ClassPathXmlApplicationContext("beans.xml");
	
	PwdService pwd1=context.getBean(PwdService.class);
	
	//PwdService pwd2=context.getBean(PwdService.class);
	
	System.out.println(pwd1.hashCode());
	//System.out.println(pwd1.hashCode());

}
}