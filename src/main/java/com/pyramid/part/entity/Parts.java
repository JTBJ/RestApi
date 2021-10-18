package com.pyramid.part.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "parts")
public class Parts {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "part_id")
	private int id;
	
	@Column(name = "parts_name")
	private String name;
	
	@UpdateTimestamp
	@Column(name = "date_added")
	private Date date;
	
	@Column(name = "price")
	private double price;

	public Parts() {
	}

	public Parts(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Parts [id=" + id + ", name=" + name + ", date=" + date + ", price=" + price + "]";
	}
	
}
