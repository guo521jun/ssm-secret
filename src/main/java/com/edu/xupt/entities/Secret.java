package com.edu.xupt.entities;

public class Secret {

	private int id;
	private String user;
	private String password;
	private String pk;
	private String rk;
	private String msg;
	private String encodeMsg;
	private String decodeMsg;
	private int isHandled;
	
	public Secret() {}
	
	public Secret(int id, String user, String password, String pk, String rk, String msg, String encodeMsg,
			String decodeMsg, int isHandled) {
		super();
		this.id = id;
		this.user = user;
		this.password = password;
		this.pk = pk;
		this.rk = rk;
		this.msg = msg;
		this.encodeMsg = encodeMsg;
		this.decodeMsg = decodeMsg;
		this.isHandled = isHandled;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPk() {
		return pk;
	}
	public void setPk(String pk) {
		this.pk = pk;
	}
	public String getRk() {
		return rk;
	}
	public void setRk(String rk) {
		this.rk = rk;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getEncodeMsg() {
		return encodeMsg;
	}
	public void setEncodeMsg(String encodeMsg) {
		this.encodeMsg = encodeMsg;
	}
	public String getDecodeMsg() {
		return decodeMsg;
	}
	public void setDecodeMsg(String decodeMsg) {
		this.decodeMsg = decodeMsg;
	}
	public int getIsHandled() {
		return isHandled;
	}
	public void setIsHandled(int isHandled) {
		this.isHandled = isHandled;
	}

	@Override
	public String toString() {
		return "Secret [id=" + id + ", user=" + user + ", password=" + password + ", pk=" + pk + ", rk=" + rk + ", msg="
				+ msg + ", encodeMsg=" + encodeMsg + ", decodeMsg=" + decodeMsg + ", isHandled=" + isHandled + "]";
	}
	
}
