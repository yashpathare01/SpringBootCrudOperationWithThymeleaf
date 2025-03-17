package com.brightLink.thymeleafCrudOnBikeDB.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Bike {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bikeId;
	@Column
	private String bikeModel;
	@Column
	private String bikeCompany;
	@Column
	private float bikePrice;
	
	
	public int getBikeId() {
		return bikeId;
	}
	public void setBikeId(int bikeId) {
		this.bikeId = bikeId;
	}
	public String getBikeModel() {
		return bikeModel;
	}
	public void setBikeModel(String bikeModel) {
		this.bikeModel = bikeModel;
	}
	public String getBikeCompany() {
		return bikeCompany;
	}
	public void setBikeCompany(String bikeCompany) {
		this.bikeCompany = bikeCompany;
	}
	public float getBikePrice() {
		return bikePrice;
	}
	public void setBikePrice(float bikePrice) {
		this.bikePrice = bikePrice;
	}
	
	
}
