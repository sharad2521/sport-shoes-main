package com.api.shoes.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.api.shoes.model.PurchaseReport;
import com.api.shoes.model.Shoes;
import com.api.shoes.model.Subscriber;
//import com.api.superhero.model.SuperHero;
import com.api.shoes.service.ShoesService;

@RestController
public class ShoesSearchController {
	@Autowired
	private ShoesService service;

	
	//Shoes
	@GetMapping("/shoe")
	public List<Shoes> getAllShoes() {
		
		return service.getAllShoes();
	}

	@GetMapping("/shoe/category/{category}")
	public List<Shoes> getAllShoesByCategory(@PathVariable String category) {
		
		return service.getAllShoesByCategory(category);
	}
	
	@GetMapping("/shoe/brand/{brand}")
	public List<Shoes> getAllShoesByBrand(@PathVariable String brand) {
		
		return service.getAllShoesByBrand(brand);
	}
	
	@GetMapping("/shoe/price/{price}")
	public List<Shoes> getAllShoesByPrice(@PathVariable int price) {
		
		return service.getAllShoesByPrice(price);
	}
	
	
	//Subscriber
	@GetMapping("/subscriber")
	public List<Subscriber> getAllSubs() {
		
		return service.getAllSubs();
	}

	@GetMapping("/subscriber/name/{name}")
	public List<Subscriber> getAllSubscriberByName(@PathVariable String name) {
		
		return service.getAllSubscriberByName(name);
	}
	
	
	//Purchase Reports
		@GetMapping("/PR")
		public List<PurchaseReport> getAllPurchaseReportss() {
			
			return service.getAllPurchaseReports();
		}

		@GetMapping("/PR/category/{category}")
		public List<PurchaseReport> getAllPurchaseReportByCategory(@PathVariable String category) {
			
			return service.getAllPurchaseReportByCategory(category);
		}
		
		@GetMapping("/PR/date/{date}")
		public List<PurchaseReport> getAllPurchaseReportByName(@PathVariable Date date) {
			
			return service.getAllPurchaseReportByDate(date);
		}
	
}
