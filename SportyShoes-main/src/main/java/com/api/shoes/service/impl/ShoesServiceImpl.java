package com.api.shoes.service.impl;

import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.api.shoes.exceptionHandler.BusinessException;
import com.api.shoes.model.PurchaseReport;
import com.api.shoes.model.Shoes;
import com.api.shoes.model.Subscriber;
//import com.api.superhero.model.SuperHero;
//import com.api.superhero.repository.SuperHeroRepository;
import com.api.shoes.repository.PurchaseRepository;
import com.api.shoes.repository.ShoeRepository;
import com.api.shoes.repository.SubscriberRepository;
import com.api.shoes.service.ShoesService;

@Service
public class ShoesServiceImpl implements ShoesService{
//
//	@Autowired
//	private SuperHeroRepository repository;
	@Autowired
	private ShoeRepository repositoryShoes;
	@Autowired
	private SubscriberRepository repositorySub;
	@Autowired
	private PurchaseRepository repositoryPR;
	

	// Shoes
	@Override
	public Shoes createShoe(Shoes shoe) {

		return repositoryShoes.save(shoe);
	}

	@Override
	public Shoes updateShoe(Shoes shoe) {

		return repositoryShoes.save(shoe);
	}

	@Override
	public Shoes getShoeById(int id) {
		Shoes shoe = null;
		shoe = repositoryShoes.findById(id).get();
		return shoe;
	}

	@Override
	public void deleteShoesById(int id) {
		
		repositoryShoes.deleteById(id);
	}

	@Override
	public List<Shoes> getAllShoes() {

		return repositoryShoes.findAll();
	}

	@Override
	public List<Shoes> getAllShoesByCategory(String category) {
		return repositoryShoes.findByCategory(category);
	}

	@Override
	public List<Shoes> getAllShoesByBrand(String brand) {
		return repositoryShoes.findByBrand(brand);
	}

	@Override
	public List<Shoes> getAllShoesByPrice(int price) {
		return repositoryShoes.findByPrice(price);
	}

	
	
	// Subscribers
	@Override
	public Subscriber createSub(Subscriber sub) {
		return repositorySub.save(sub);
	}

	@Override
	public Subscriber updateSub(Subscriber sub) {
		return repositorySub.save(sub);
	}

	@Override
	public Subscriber getSubById(int id) {
		Subscriber sub = null;
		sub = repositorySub.findById(id).get();
		return sub;
	}

	@Override
	public void deleteSubById(int id) {
		repositorySub.deleteById(id);
	}


	@Override
	public List<Subscriber> getAllSubs() {
		return repositorySub.findAll();
	}

	@Override
	public List<Subscriber> getAllSubscriberByName(String name) {
		return repositorySub.findByName(name);
	}

	
	
	
	// Purchase Reports
	@Override
	public PurchaseReport createPurchaseReport(PurchaseReport pr) {
		return repositoryPR.save(pr);
	}

	

	
	@Override
	public PurchaseReport updatePurchaseReport(PurchaseReport pr) {
		return repositoryPR.save(pr);
	}

	@Override
	public PurchaseReport getPurchaseReportById(int id) {
		PurchaseReport pr = null;
		pr = repositoryPR.findById(id).get();
		return pr;
	}

	@Override
	public void deletePurchaseReportById(int id) {
		repositoryPR.deleteById(id);
		
	}

	@Override
	public List<PurchaseReport> getAllPurchaseReports() {
		// TODO Auto-generated method stub
		return repositoryPR.findAll();
	}
	
	@Override
	public List<PurchaseReport> getAllPurchaseReportByDate(Date date) {
		// TODO Auto-generated method stub
		return repositoryPR.findByDate(date);
	}

	@Override
	public List<PurchaseReport> getAllPurchaseReportByCategory(String category) {
		// TODO Auto-generated method stub
		return repositoryPR.findByCategory(category);
	}

	

	public ShoeRepository getRepositoryShoes() {
		return repositoryShoes;
	}

	
	public PurchaseRepository getRepositoryPR() {
		return repositoryPR;
	}

	public void setRepositoryPR(PurchaseRepository repositoryPR) {
		this.repositoryPR = repositoryPR;
	}

	

	

	

}
