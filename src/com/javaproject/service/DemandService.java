package com.javaproject.service;

import java.util.List;

import com.javaproject.Model.Demand;

public interface DemandService {

	public boolean addProduct(String userId, String prodId, int demandQty);

	public boolean addProduct(Demand userDemand);

	public boolean removeProduct(String userId, String prodId);

	public List<Demand> haveDemanded(String prodId);

}
