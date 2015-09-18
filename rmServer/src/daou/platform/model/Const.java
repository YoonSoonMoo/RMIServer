package daou.platform.model;

public class Const {

	/**
	 * 로그의 레벨 정의
	 * 
	 * @author yoon
	 */
	public enum LOG_LEVEL {
		//로그레벨 디버그
		DEBUG,
		//로그레벨 정보
		INFO,
		//로그레벨 에러
		ERROR;
	}
	
	
	/**
	 * 처리 결과값
	 * @author daou
	 *
	 */
	public enum RESULT {
		// 성공
		SUCCESS,
		// 실패
		FAIL;
	}
}
