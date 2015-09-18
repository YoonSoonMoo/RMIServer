package daou.platform.main;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import daou.platform.service.RmiService;

/**
 * RMI서버 메인 클래스
 * @author yoonsm
 *
 */
public class RMIServer {

	private static Log log = LogFactory.getLog(RMIServer.class);
	private static ApplicationContext context;
	@SuppressWarnings("unused")
	private static RmiService service;
	
	public static void main(String[] args) {
		
		String [] configLocation = {
				"spring-config.xml"
				,"dataAccessContext.xml"
		};
		
		context = new ClassPathXmlApplicationContext(configLocation);
		service = context.getBean("rmiServiceImpl",RmiService.class);
		
		log.info("RMI Server Start!");
		System.out.println("Server Start!!!!!");
	}
}