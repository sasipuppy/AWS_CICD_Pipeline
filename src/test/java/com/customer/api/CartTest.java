package com.customer.api;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.cart.api.Cart;



class CartTest {

	/**
	 * Creating instance of Product class.
	 */
	private Cart cart;
	
	/**
	 * Variable declaration and initialisation.
	 * Declaring the variables as static final means they can never change from their initial value.
	 */
	private static final long PRODUCTID=5646;
	private static final int QUANTITY= 6;
	private static final double PRICE= 6798.87;
	
	
	/**
	 * Setting up price,quantity, product id before tests.
	 */
	@BeforeEach
	public void SetUp() {
		cart= new Cart(PRODUCTID,QUANTITY,PRICE);
	}
	
	/**
	 * Verification of name field.
	 */
	@Test
	public void testProductId(){
		long Expected =5646;
		assertEquals(Expected,cart.getProductId());
	}
	
	/**
	 * Verification of price field.
	 */
	@Test
	public void testQuantity(){
		int Expected =6;
		assertEquals(Expected,cart.getQuantity());
	}
	
	/**
	 * Verification of category field.
	 */
	@Test
	public void testPrice(){
		double Expected =6798.87;
		assertEquals(Expected,cart.getPrice());
	}

}
