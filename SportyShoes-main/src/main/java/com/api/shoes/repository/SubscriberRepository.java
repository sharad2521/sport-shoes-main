package com.api.shoes.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//import com.api.superhero.model.Shoes;
import com.api.shoes.model.Subscriber;
//import com.api.superhero.model.SuperHero;

@Repository
public interface SubscriberRepository extends JpaRepository<Subscriber, Integer> {
	
//	public List<Shoes> findByAge(int age);
//	public List<SuperHero> findByComic(String comic);
////	public List<Shoes> getAllShoes();
	public List<Subscriber> findByName(String name);
//	public List<Shoes> findByBrand(String brand);
//	public List<Shoes> findByPrice(int price);
	
	

}
