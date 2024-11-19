package com.proj.bs.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;

@Table(name = "ORDERS")
@Entity
@Getter
@Setter
public class Order extends BaseEntity {

	private static final long serialVersionUID = 1L;

	@Column(name = "total_price")
	private double totalPrice;

	@Column(name = "order_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date orderDate;
	
	@ManyToOne
	@JoinColumn(name = "user_id" , nullable = false)
	private User user;
	
	@Column(nullable = false)
	private String status;
	
	@OneToMany(mappedBy = "order" , cascade = CascadeType.ALL)
	private List<OrderDetails> orderDetails;

}
