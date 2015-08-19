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
	 * 클라이언트의 모든 로그를 수집하고 로그의 상태에 따른 분기처리를 담당한다.
	 * @return
	 */
	public String sendLogService(RmiLog log);
	
	/**
	 * 클라이언트에서 설정한 값이 제대로 전달되는지 커넥트 테스트
	 * @param message
	 */
	public void connectTest(String message);
	
}
