package com.example.start.data;

public class EnityR {

	private String Id;
	private String Total_Credit_Limit__c;
	private String type;
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getTotal_Credit_Limit__c() {
		return Total_Credit_Limit__c;
	}
	public void setTotal_Credit_Limit__c(String total_Credit_Limit__c) {
		Total_Credit_Limit__c = total_Credit_Limit__c;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "EnityR [Id=" + Id + ", Total_Credit_Limit__c=" + Total_Credit_Limit__c + ", type=" + type + "]";
	}
	

	
	
}


