package com.test1;

public class RoutingFactoryMeta {
	private String serializerCode;
	private String adaptersMeta;
	private String clearingSys;
	private String clearingTemplate;
	private boolean keyPart;
	private Integer adaptersSystem;
	private boolean currencyRouteExists;
	private String routingName;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public RoutingFactoryMeta() {

	}

	public RoutingFactoryMeta(String serializerCode, String adaptersMeta, String clearingSys, String clearingTemplate,
			boolean keyPart, Integer adaptersSystem, boolean currencyRouteExists, String routingName,
			String creationDate, String modifiedDate, String entityState) {
		super();
		this.serializerCode = serializerCode;
		this.adaptersMeta = adaptersMeta;
		this.clearingSys = clearingSys;
		this.clearingTemplate = clearingTemplate;
		this.keyPart = keyPart;
		this.adaptersSystem = adaptersSystem;
		this.currencyRouteExists = currencyRouteExists;
		this.routingName = routingName;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public String getSerializerCode() {
		return serializerCode;
	}

	public void setSerializerCode(String serializerCode) {
		this.serializerCode = serializerCode;
	}

	public String getAdaptersMeta() {
		return adaptersMeta;
	}

	public void setAdaptersMeta(String adaptersMeta) {
		this.adaptersMeta = adaptersMeta;
	}

	public String getClearingSys() {
		return clearingSys;
	}

	public void setClearingSys(String clearingSys) {
		this.clearingSys = clearingSys;
	}

	public String getClearingTemplate() {
		return clearingTemplate;
	}

	public void setClearingTemplate(String clearingTemplate) {
		this.clearingTemplate = clearingTemplate;
	}

	public boolean isKeyPart() {
		return keyPart;
	}

	public void setKeyPart(boolean keyPart) {
		this.keyPart = keyPart;
	}

	public Integer getAdaptersSystem() {
		return adaptersSystem;
	}

	public void setAdaptersSystem(Integer adaptersSystem) {
		this.adaptersSystem = adaptersSystem;
	}

	public boolean isCurrencyRouteExists() {
		return currencyRouteExists;
	}

	public void setCurrencyRouteExists(boolean currencyRouteExists) {
		this.currencyRouteExists = currencyRouteExists;
	}

	public String getRoutingName() {
		return routingName;
	}

	public void setRoutingName(String routingName) {
		this.routingName = routingName;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
