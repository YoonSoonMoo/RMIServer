package daou.platform.model;


/**
 * SMS 멧세지가 디폴트 설정되어 있음
 * @author user
 *
 */
public class Message {

	protected String cmpMsgGropuId = "1";
	protected String usrId = "incross2101";
	protected String smsGb = "1";
	protected String usedCd = "00"; //SMS
	protected String reservedFg = "I"; //즉시발송
	protected String reservedDttm;
	protected String savedFg = "0"; // 메세지 서버(텔링크서버)에 저장 하지 않음 
	protected String rcvPhnId = "";
	protected String sndPhnId= "";
	protected String assignCd = "00000"; // 특정 통신사 지정 디폴트는 없음
	protected String sndMsg = "";
	protected String callbackUrl="";
	protected String contentCnt = "0"; // 0 : SMS 디폴트 
	protected String contectMimeType = ""; // SMS는 공백 LMS 경우는 text/plain 입력
	protected String contentPath="";
	protected String smsStatus = "0";
	protected String msgTitle="";
	protected String etcChar1="";
	protected String etcChar2="";
	protected String etcChar3="";
	protected String etcChar4="";
	protected String etcInt5="";
	protected String etcInt6="";
	protected String aspId=""; //가맹점 아이디 
	
	private Message(){}
	
	/**
	 * 멧세지 타입을 넣는다 
	 * SMS / LMS
	 * @param messageType
	 * @return
	 */
	/**
	 * @param messageType 멧세지 타입 ( SMS / LMS)  
	 * @param recvTelNo 문자받을 사람 전화번호 (- 없이)
	 * @param sendTelNo 문자보내는 사람 전화번호 (- 없이)
	 * @param title 문자 타이틀 8자리까지
	 * @param message 문자본문
	 * @param 가맹점 아이디 필수
	 * @return
	 */
	public Message (String messageType, String recvTelNo , String sendTelNo,String title, String message,String aspId){
		
		if(messageType.equals("LMS") || messageType.equals("MMS")){
			usedCd = "10";
			contentCnt = "1";
			contectMimeType = "text/plain";
		}
		
		this.rcvPhnId = recvTelNo;
		this.sndPhnId = sendTelNo;
		this.msgTitle = title;
		this.sndMsg = message;
		this.aspId = aspId;
	}
	
	public String getAspId() {
		return aspId;
	}

	public void setAspId(String aspId) {
		this.aspId = aspId;
	}

	public String getCmpMsgGropuId() {
		return cmpMsgGropuId; //고정값
	}
	public String getUsrId() {
		return usrId; // 회사아이디
	}
	public String getSmsGb() {
		return smsGb; // 기업
	}
	/**
	 * 00 : SMS
	 * 10 : LMS
	 * 20 : MMS 이미지만
	 * 21 : 이미지 + txt
	 * @return
	 */
	public String getUsedCd() {
		return usedCd; 
	}

	/**
	 * I : 즉시발송
	 * R : 예약발송
	 * @return
	 */
	public String getReservedFg() {
		return reservedFg;
	}
	public void setReservedFg(String reservedFg) {
		this.reservedFg = reservedFg;
	}
	
	/**
	 * 공백일 경우 to_char(sysdate, 'YYYYMMDDHH24MISS') 데이타베이스 처리
	 * reservedFg 가 [R:예약발송] 일경우에만 해당
	 * @return
	 */
	public String getReservedDttm() {
		return reservedDttm;
	}
	/**
	 * YYYYMMDDHH24MISS 형식으로 설정 
	 * 공백일 경우 to_char(sysdate, 'YYYYMMDDHH24MISS') 데이타베이스 처리
	 * @param reservedDttm
	 */
	public void setReservedDttm(String reservedDttm) {
		this.reservedDttm = reservedDttm;
	}
	
	/**
	 * 서버의 저장여부 디폴트는 0 저장하지 않음
	 * @return
	 */
	public String getSavedFg() {
		return savedFg;
	}

	/**
	 * 전화받는 사람의 전화번호
	 * @return
	 */
	public String getRcvPhnId() {
		return rcvPhnId;
	}
	/**
	 * 전화받는 사람의 전화번호 하이픈 없이 입력
	 * @param rcvPhnId
	 */
	public void setRcvPhnId(String rcvPhnId) {
		this.rcvPhnId = rcvPhnId;
	}
	/**
	 * 보내는 사람 전화번호
	 * @return
	 */
	public String getSndPhnId() {
		return sndPhnId;
	}
	/**
	 * 보내는 사람 전화번호 하이픈 없이 입력
	 * @param sndPhnId
	 */
	public void setSndPhnId(String sndPhnId) {
		this.sndPhnId = sndPhnId;
	}
	/**
	 * 통신사 지정
	 * 00000 : 없음
	 * 01 : SKT
	 * 02 : KT
	 * 03 : LGT
	 * @return
	 */
	public String getAssignCd() {
		return assignCd;
	}
	
	/**
	 * 통신사 지정
	 * 00000 : 없음
	 * 01 : SKT
	 * 02 : KT
	 * 03 : LGT
	 * @param assignCd
	 */
	public void setAssignCd(String assignCd) {
		this.assignCd = assignCd;
	}
	/**
	 * 전송 멧세지
	 * @return
	 */
	public String getSndMsg() {
		return sndMsg;
	}
	/**
	 * 전송멧세지 설정
	 * @param sndMsg
	 */
	public void setSndMsg(String sndMsg) {
		this.sndMsg = sndMsg;
	}
	/**
	 * 콜백 URL 
	 * @return
	 */
	public String getCallbackUrl() {
		return callbackUrl;
	}
	/**
	 * 콜백 URL 설정
	 * @param callbackUrl
	 */
	public void setCallbackUrl(String callbackUrl) {
		this.callbackUrl = callbackUrl;
	}
	/**
	 * 첨부된 컨텐츠 개수
	 * SMS : 0
	 * LMS : 1
	 * MMS : 텍스트 + 이미지 수 입력
	 * @return
	 */
	public String getContentCnt() {
		return contentCnt;
	}
	/**
	 * 첨부된 컨텐츠 개수
	 * SMS : 0
	 * LMS : 1
	 * MMS : 텍스트 + 이미지 수 입력
	 * @param contentCnt
	 */
	public void setContentCnt(String contentCnt) {
		this.contentCnt = contentCnt;
	}
	/**
	 * 컨텐츠 마임 타입
	 * LMS 경우 text/plain 반드시 설정해 주어야 함
	 * @return
	 */
	public String getContectMimeType() {
		return contectMimeType;
	}
	/**
	 * 	 * 컨텐츠 마임 타입
	 * LMS 경우 text/plain 반드시 설정해 주어야 함
	 * @param contectMimeType
	 */
	public void setContectMimeType(String contectMimeType) {
		this.contectMimeType = contectMimeType;
	}
	/**
	 * 컨텐츠 패스
	 * 루트에서 컨텐츠 직전까지의 패스를 포함
	 * @return
	 */
	public String getContentPath() {
		return contentPath;
	}
	/**
	 * 컨텐츠 패스 설정
	 *
	 * @param contentPath
	 */
	public void setContentPath(String contentPath) {
		this.contentPath = contentPath;
	}
	/**
	 * 메세지 상태  디폴트는 0 : 전송대기
	 * @return
	 */
	public String getSmsStatus() {
		return smsStatus;
	}
	/**
	 * 멧세지의 타이틀
	 * @return
	 */
	public String getMsgTitle() {
		return msgTitle;
	}
	/**
	 * 멧세지의 타이틀을 설정 한글최대 8자리
	 * @param msgTitle
	 */
	public void setMsgTitle(String msgTitle) {
		this.msgTitle = msgTitle;
	}
	
	/**
	 * 사용자 지정필드1
	 * @return
	 */
	public String getEtcChar1() {
		return etcChar1;
	}
	/**
	 * 사용자 지정필드2
	 * @param etcChar1
	 */
	public void setEtcChar1(String etcChar1) {
		this.etcChar1 = etcChar1;
	}
	/**
	 * 사용자 지정필드2
	 * @return
	 */
	public String getEtcChar2() {
		return etcChar2;
	}
	/**
	 * 사용자 지정필드2
	 * @param etcChar2
	 */
	public void setEtcChar2(String etcChar2) {
		this.etcChar2 = etcChar2;
	}
	/**
	 * 사용자 지정필드3
	 * @return
	 */
	public String getEtcChar3() {
		return etcChar3;
	}
	/**
	 * 사용자 지정필드3
	 * @param etcChar3
	 */
	public void setEtcChar3(String etcChar3) {
		this.etcChar3 = etcChar3;
	}
	/**
	 * 사용자 지정필드4
	 * @return
	 */
	public String getEtcChar4() {
		return etcChar4;
	}
	/**
	 * 사용자 지정필드4
	 * @param etcChar4
	 */
	public void setEtcChar4(String etcChar4) {
		this.etcChar4 = etcChar4;
	}
	/**
	 * 사용자 지정필드5 INT
	 * @return
	 */
	public String getEtcInt5() {
		return etcInt5;
	}
	/**
	 * 사용자 지정필드5 INT
	 * @param etcInt5
	 */
	public void setEtcInt5(String etcInt5) {
		this.etcInt5 = etcInt5;
	}
	/**
	 * 사용자 지정필드6 INT
	 * @return
	 */
	public String getEtcInt6() {
		return etcInt6;
	}
	/**
	 * 사용자 지정필드6 INT
	 * @param etcInt6
	 */
	public void setEtcInt6(String etcInt6) {
		this.etcInt6 = etcInt6;
	}
}
