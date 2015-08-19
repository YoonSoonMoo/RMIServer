package daou.platform.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

import daou.platform.model.RmiLog;

@Component
public class RmiServiceImpl implements RmiService{

	/** 클라이언트의 로그를 취합하는 메인 로거  */
	private static Log logger = LogFactory.getLog(RmiServiceImpl.class);
	
	@Override
	public String sendLogService(RmiLog log) {
		
		StringBuilder builder = new StringBuilder();
		builder.append("[").append(log.getServerIp()).append("]");
		builder.append("[").append(log.getServerName()).append("]");
		builder.append(" ").append(log.getMsg());
		
		switch (log.getLogLever()) {
		case DEBUG:
			logger.debug(builder.toString());
			break;
		case INFO:
			logger.info(builder.toString());
			break;
		case ERROR:
			logger.error(builder.toString());
			break;
		default:
			logger.debug(builder.toString());
			break;
		}

		return "OK";
	}

	@Override
	public void connectTest(String message) {
		
		System.out.println("connect test!");
		logger.info(message);
		
	}

}
