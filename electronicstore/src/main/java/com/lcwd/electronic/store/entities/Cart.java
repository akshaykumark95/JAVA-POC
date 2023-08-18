package com.lcwd.electronic.store.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Cart {
	@Id
	private String cartId;
	private Date createdAt;
	@OneToOne
	private User user;
	
	//mapping cart-items
	@OneToMany(mappedBy = "cart",  cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
	private List<CartItem> items=new ArrayList<>();
	
}
