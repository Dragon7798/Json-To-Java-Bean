package com.example.start.data;

import com.fasterxml.jackson.annotation.JsonProperty;


public class ResourceData {


	@JsonProperty("Card_Type__c")
	private String Card_Type__c;
	@JsonProperty("Is_Approved_By_AS__c")
	private String Is_Approved_By_AS__c;
	@JsonProperty("Request_Status__c")
	private String Request_Status__c;
	@JsonProperty("Id")
	private String Id;
	@JsonProperty("Entity_Name__c")
	private String Entity_Name__c;
	@JsonProperty("Employee_ID__c")
	private String Employee_ID__c;
	@JsonProperty("Name")
	private String Name;
	@JsonProperty("Official_Email__c")
	private String Official_Email__c;
	@JsonProperty("type")
	private String type;
	@JsonProperty("Employee_Mobile__c")
	private String Employee_Mobile__c;
	@JsonProperty("Credit_Limit__c")
	private String Credit_Limit__c;
	@JsonProperty("Entity_UCIC__c")
	private String Entity_UCIC__c;
	@JsonProperty("Is_Referral_Valid__c")
	private String Is_Referral_Valid__c;
	@JsonProperty("Employee_Designation__c")
	private String Employee_Designation__c;
	
	@JsonProperty("Entity__r")
	private EnityR Entity__r;
	
	@JsonProperty("Application__r")
	private Application Application__r;

	public String getCard_Type__c() {
		return Card_Type__c;
	}

	public void setCard_Type__c(String card_Type__c) {
		Card_Type__c = card_Type__c;
	}

	public String getIs_Approved_By_AS__c() {
		return Is_Approved_By_AS__c;
	}

	public void setIs_Approved_By_AS__c(String is_Approved_By_AS__c) {
		Is_Approved_By_AS__c = is_Approved_By_AS__c;
	}

	public String getRequest_Status__c() {
		return Request_Status__c;
	}

	public void setRequest_Status__c(String request_Status__c) {
		Request_Status__c = request_Status__c;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getEntity_Name__c() {
		return Entity_Name__c;
	}

	public void setEntity_Name__c(String entity_Name__c) {
		Entity_Name__c = entity_Name__c;
	}

	public String getEmployee_ID__c() {
		return Employee_ID__c;
	}

	public void setEmployee_ID__c(String employee_ID__c) {
		Employee_ID__c = employee_ID__c;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getOfficial_Email__c() {
		return Official_Email__c;
	}

	public void setOfficial_Email__c(String official_Email__c) {
		Official_Email__c = official_Email__c;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getEmployee_Mobile__c() {
		return Employee_Mobile__c;
	}

	public void setEmployee_Mobile__c(String employee_Mobile__c) {
		Employee_Mobile__c = employee_Mobile__c;
	}

	public String getCredit_Limit__c() {
		return Credit_Limit__c;
	}

	public void setCredit_Limit__c(String credit_Limit__c) {
		Credit_Limit__c = credit_Limit__c;
	}

	public String getEntity_UCIC__c() {
		return Entity_UCIC__c;
	}

	public void setEntity_UCIC__c(String entity_UCIC__c) {
		Entity_UCIC__c = entity_UCIC__c;
	}

	public String getIs_Referral_Valid__c() {
		return Is_Referral_Valid__c;
	}

	public void setIs_Referral_Valid__c(String is_Referral_Valid__c) {
		Is_Referral_Valid__c = is_Referral_Valid__c;
	}

	public String getEmployee_Designation__c() {
		return Employee_Designation__c;
	}

	public void setEmployee_Designation__c(String employee_Designation__c) {
		Employee_Designation__c = employee_Designation__c;
	}

	public EnityR getEntity__r() {
		return Entity__r;
	}

	public void setEntity__r(EnityR entity__r) {
		Entity__r = entity__r;
	}

	public Application getApplication__r() {
		return Application__r;
	}

	public void setApplication__r(Application application__r) {
		Application__r = application__r;
	}

	@Override
	public String toString() {
		return "ResourceData [Card_Type__c=" + Card_Type__c + ", Is_Approved_By_AS__c=" + Is_Approved_By_AS__c
				+ ", Request_Status__c=" + Request_Status__c + ", Id=" + Id + ", Entity_Name__c=" + Entity_Name__c
				+ ", Employee_ID__c=" + Employee_ID__c + ", Name=" + Name + ", Official_Email__c=" + Official_Email__c
				+ ", type=" + type + ", Employee_Mobile__c=" + Employee_Mobile__c + ", Credit_Limit__c="
				+ Credit_Limit__c + ", Entity_UCIC__c=" + Entity_UCIC__c + ", Is_Referral_Valid__c="
				+ Is_Referral_Valid__c + ", Employee_Designation__c=" + Employee_Designation__c + ", Entity__r="
				+ Entity__r + ", Application__r=" + Application__r + "]";
	}
	
	
	
	
}
