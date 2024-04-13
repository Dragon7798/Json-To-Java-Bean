package com.example.start.data;

public class MetaData {

	private String status;
	private String message;
	private String code;
	private String version;
	private String time;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "MetaData [status=" + status + ", message=" + message + ", code=" + code + ", version=" + version
				+ ", time=" + time + "]";
	}
	
	
	
	
}
