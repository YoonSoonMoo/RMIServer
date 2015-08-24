package daou.platform.service;

import java.rmi.Remote;
import java.rmi.RemoteException;

import daou.platform.model.RmiLog;

/**
 * RMI 서비스의 인터페이스
 * @author daou
 *
 */
public interface RmiService extends Remote{
	
	/**
	 * 리모트서버로 로그를 전송한다.
	 * 클라이언트의 모든 로그를 수집하고 로그의 상태에 따른 분기처리를 담당한다.
	 * @return 로그발송 결과
	 */
	public abstract String sendLogService(RmiLog log) throws RemoteException;
	
	/**
	 * 클라이언트에서 설정한 값이 제대로 전달되는지 커넥트 테스트
	 * @param message
	 */
	public abstract void connectTest(String message) throws RemoteException;;
	
}
