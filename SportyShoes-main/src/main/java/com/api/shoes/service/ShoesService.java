package com.api.shoes.service;

import java.util.Date;
import java.util.List;

//import com.api.superhero.exceptionHandler.BusinessException;
import com.api.shoes.model.PurchaseReport;
import com.api.shoes.model.Shoes;
import com.api.shoes.model.Subscriber;
//import com.api.superhero.model.SuperHero;

public interface ShoesService {

	//Shoes
	public Shoes createShoe(Shoes shoe);
	public Shoes updateShoe(Shoes shoe);
	public Shoes getShoeById(int id);// throws BusinessException;
	public void deleteShoesById(int id);
	public List<Shoes> getAllShoes();
	public List<Shoes> getAllShoesByCategory(String category);
	public List<Shoes> getAllShoesByBrand(String brand);
	public List<Shoes> getAllShoesByPrice(int price);
	
	//Subscriber
	public Subscriber createSub(Subscriber sub);
	public Subscriber updateSub(Subscriber sub);
	public Subscriber getSubById(int id);// throws BusinessException;
	public void deleteSubById(int id);
//	public Subscriber getSubByName(String name);// throws BusinessException;
//	public void deleteSubByName(String name);
	public List<Subscriber> getAllSubs();
	public List<Subscriber> getAllSubscriberByName(String name);
//	public List<Shoes> getAllShoesByBrand(String brand);
//	public List<Shoes> getAllShoesByPrice(int price);
	
	//Purchase Reports
	public PurchaseReport createPurchaseReport(PurchaseReport pr);
	public PurchaseReport updatePurchaseReport(PurchaseReport pr);
	public PurchaseReport getPurchaseReportById(int id);// throws BusinessException;
	public void deletePurchaseReportById(int id);
//	public PurchaseReport getPurchaseReportByName(String name);// throws BusinessException;
//	public void deletePurchaseReportByName(String name);
	public List<PurchaseReport> getAllPurchaseReports();
	public List<PurchaseReport> getAllPurchaseReportByDate(Date date);
	public List<PurchaseReport> getAllPurchaseReportByCategory(String category);

}

