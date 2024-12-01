package com.proj.bs.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Table(name = "ROLE")
@Entity
@Getter
@Setter
public class Role extends BaseEntity{

	private static final long serialVersionUID = 1L;
	
	private String name;
	
	@ManyToMany(mappedBy = "roles" , cascade = CascadeType.ALL)
	private Set<User> users;
	

}
