package com.api.shoes.model;

import java.sql.Date;

//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
//import javax.persistence.Lob;
//import javax.persistence.OneToOne;
import javax.persistence.Table;
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table
@Setter
@Getter
@NoArgsConstructor
@ToString
public class PurchaseReport {

	@Id
	@GeneratedValue
	private int id;
	private String subscriberName;
//	private Shoes shoe;
	private Date date ;
//	private Subscriber sub;
	private String category;
	
//	@Column(name = "superHeroContact",length = 10,unique = true)
//	private long contact;
//	
//	@Temporal(TemporalType.DATE)
//	private Date dob;
//	
//	@OneToOne
//	private Comic comic:
}
