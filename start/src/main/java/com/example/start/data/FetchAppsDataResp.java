package com.example.start.data;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FetchAppsDataResp {

	private MetaData metaData;
	
	@JsonProperty("resourceData")
	private List<ResourceData> resourceData;

	public MetaData getMetaData() {
		return metaData;
	}

	public void setMetaData(MetaData metaData) {
		this.metaData = metaData;
	}

	public List<ResourceData> getResourceData() {
		return resourceData;
	}

	public void setResourceData(List<ResourceData> resourceData) {
		this.resourceData = resourceData;
	}

	
	

	
	
}
