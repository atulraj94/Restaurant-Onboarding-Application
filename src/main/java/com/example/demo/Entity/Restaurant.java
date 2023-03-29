package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "restaurant")
@Getter
@Setter
@NoArgsConstructor
public class Restaurant {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;
	    
	    @Column(name = "name")
	    private String name;
	    
	    @Column(name = "contact_name")
	    private String contactName;
	    
	    @Column(name = "pincode")
	    private String pincode;
	    
	    @Column(name = "location")
	    private String location;
	    
	    @Column(name = "website")
	    private String website;
	    
	    @Column(name = "phone_number")
	    private String phoneNumber;
	    
	    @Column(name = "average_daily_transactions")
	    private Integer averageDailyTransactions;

}
