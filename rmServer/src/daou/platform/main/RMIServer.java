package daou.platform.main;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import daou.platform.service.RmiService;

/**
 * RMI서버 메인 클래스
 * @author daou
 *
 */
public class RMIServer {

	private static Log log = LogFactory.getLog(RMIServer.class);
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		RmiService service = context.getBean("rmiServiceImpl",RmiService.class);
		log.info("Log4j Server Start");
		System.out.println("Server Start!!!!!");
		
		
	}
}