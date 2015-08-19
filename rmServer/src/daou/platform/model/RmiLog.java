package daou.platform.model;

import java.io.Serializable;

import daou.platform.main.Const.LOG_LEVEL;

/**
 * RMI용 로그
 * @author daou
 *
 */
public class RmiLog implements Serializable{

	private static final long serialVersionUID = -8848049060809588184L;

	private String logGbn; //로그 구분 1:정보성 2:장애
	private String serverName="";// 로그발송 서버의 이름
	private String serverIp=""; // 발송서버의 아이피
	private LOG_LEVEL logLever; // info , error , debug
	private String msg="";

	public String getLogGbn() {
		return logGbn;
	}

	public void setLogGbn(String logGbn) {
		this.logGbn = logGbn;
	}

	public String getServerName() {
		return serverName;
	}

	public void setServerName(String serverName) {
		this.serverName = serverName;
	}

	public String getServerIp() {
		return serverIp;
	}

	public void setServerIp(String serverIp) {
		this.serverIp = serverIp;
	}

	public LOG_LEVEL getLogLever() {
		return logLever;
	}

	public void setLogLever(LOG_LEVEL logLever) {
		this.logLever = logLever;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
