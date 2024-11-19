package com.proj.bs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Table(name = "ORDER_DETAILS")
@Entity
@Getter
@Setter
public class OrderDetails extends BaseEntity{

	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@JoinColumn(name = "order_id" , nullable = false)
	private Order order;
	
	@ManyToOne
	@JoinColumn(name = "book_id" , nullable = false)
	private Book book;
	
	@Column(nullable = false)
	private int quantity;
	
	@Column(nullable = false)
	private double sellingPrice;

}
