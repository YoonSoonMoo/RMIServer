package daou.platform.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import daou.platform.service.RmiService;

/**
 * RMI서버 메인 클래스
 * @author daou
 *
 */
public class RMIServer {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		RmiService service = context.getBean("rmiServiceImpl",RmiService.class);
		System.out.println("Server Start!!!!!");
	}
}