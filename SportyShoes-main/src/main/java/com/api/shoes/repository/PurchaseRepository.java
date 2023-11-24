package com.api.shoes.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.shoes.model.PurchaseReport;
//import com.api.superhero.model.Shoes;
//import com.api.superhero.model.Subscriber;
//import com.api.superhero.model.SuperHero;

@Repository
public interface PurchaseRepository extends JpaRepository<PurchaseReport, Integer> {
	
//	public List<Shoes> findByAge(int age);
//	public List<SuperHero> findByComic(String comic);
////	public List<Shoes> getAllShoes();
	public List<PurchaseReport> findByDate(Date date);
	public List<PurchaseReport> findByCategory(String category);
//	public List<Shoes> findByBrand(String brand);
//	public List<Shoes> findByPrice(int price);
	
	

}
