/**
 * 
 */
package com.cart.api;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Sasikala
 *
 */
@Entity
public class Cart {
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
	private long productId;
	private int quantity;
	private double price;
		
		
	public Cart() {
		super();
		
	}

    
	public Cart(long productId, int quantity, double price) {
		super();
		this.productId = productId;
		this.quantity = quantity;
		this.price = price;
		
	}

	public long getId() {
		return id;
	}


	public long getProductId() {
		return productId;
	}


	public void setProductId(long productId) {
		this.productId = productId;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}

		
}
