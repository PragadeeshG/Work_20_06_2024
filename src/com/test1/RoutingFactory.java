package com.test1;

public class RoutingFactory {
	private String serializerCode;
	private String adaptersMeta;
	private String factoryCode;
	private String creator;
	private String concreteCreator;
	private boolean product;
	private String concreteProduct;
	private String tightCoupling;
	private String singleresponsibilityModel;
	private String scalability;
	private String limitedConcerns;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public RoutingFactory() {

	}

	public RoutingFactory(String serializerCode, String adaptersMeta, String factoryCode, String creator,
			String concreteCreator, boolean product, String concreteProduct, String tightCoupling,
			String singleresponsibilityModel, String scalability, String limitedConcerns, String creationDate,
			String modifiedDate, String entityState) {
		super();
		this.serializerCode = serializerCode;
		this.adaptersMeta = adaptersMeta;
		this.factoryCode = factoryCode;
		this.creator = creator;
		this.concreteCreator = concreteCreator;
		this.product = product;
		this.concreteProduct = concreteProduct;
		this.tightCoupling = tightCoupling;
		this.singleresponsibilityModel = singleresponsibilityModel;
		this.scalability = scalability;
		this.limitedConcerns = limitedConcerns;
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

	public String getFactoryCode() {
		return factoryCode;
	}

	public void setFactoryCode(String factoryCode) {
		this.factoryCode = factoryCode;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getConcreteCreator() {
		return concreteCreator;
	}

	public void setConcreteCreator(String concreteCreator) {
		this.concreteCreator = concreteCreator;
	}

	public boolean isProduct() {
		return product;
	}

	public void setProduct(boolean product) {
		this.product = product;
	}

	public String getConcreteProduct() {
		return concreteProduct;
	}

	public void setConcreteProduct(String concreteProduct) {
		this.concreteProduct = concreteProduct;
	}

	public String getTightCoupling() {
		return tightCoupling;
	}

	public void setTightCoupling(String tightCoupling) {
		this.tightCoupling = tightCoupling;
	}

	public String getSingleresponsibilityModel() {
		return singleresponsibilityModel;
	}

	public void setSingleresponsibilityModel(String singleresponsibilityModel) {
		this.singleresponsibilityModel = singleresponsibilityModel;
	}

	public String getScalability() {
		return scalability;
	}

	public void setScalability(String scalability) {
		this.scalability = scalability;
	}

	public String getLimitedConcerns() {
		return limitedConcerns;
	}

	public void setLimitedConcerns(String limitedConcerns) {
		this.limitedConcerns = limitedConcerns;
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
