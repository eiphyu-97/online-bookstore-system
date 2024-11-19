package com.proj.bs.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "BOOKS")
@Getter
@Setter
public class Book extends BaseEntity {

	private static final long serialVersionUID = 1L;
	
	@Column(nullable = false)
	private String title;
	
	@Column(nullable = false)
	private String author;
	
	@Column(nullable = false)
	private Double price;
	
	@Column(nullable = false)
	private String category;
	
	@Column(nullable = false)
	private Integer stock;
	
	@Column(length = 1000)
	private String description;
	
	@OneToMany(mappedBy = "book" , cascade = CascadeType.ALL)
	private List<OrderDetails> orderDetails;

}
