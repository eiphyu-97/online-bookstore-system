package com.proj.bs.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Table(name = "USERS")
@Entity
@Getter
@Setter
public class User extends BaseEntity{

	private static final long serialVersionUID = 1L;
	
	@Column(nullable = false)
	private String username;
	
	@Column(nullable = false)
	private String password;
	
	@Column(nullable = false)
	private String role;
	
	@OneToMany(mappedBy = "user" , cascade = CascadeType.ALL)
	private List<Order> orders;

}
