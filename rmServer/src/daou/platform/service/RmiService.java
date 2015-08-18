package daou.platform.service;

import daou.platform.model.RmiLog;

/**
 * RMI 서비스의 인터페이스
 * @author daou
 *
 */
public interface RmiService {
	
	/**
	 * 리모트서버로 로그를 전송한다.
	 * @return
	 */
	public String sendLogService(RmiLog log);
}
