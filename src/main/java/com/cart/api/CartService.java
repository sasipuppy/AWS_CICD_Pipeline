/**
 * 
 */
package com.cart.api;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;


/**
 * @author Sasikala
 *
 */
@Service
public class CartService {
	
private final CartRepository cartRepository;
    
    CartService(CartRepository cartRepository) {
        super();
        this.cartRepository = cartRepository;
    }
	
	/**
	 * Get all carts.
	 * @return cart
	 */
	public List<Cart> getAll(){
        List<Cart> cart = new ArrayList<>();
        cartRepository.findAll().forEach(cart::add);
        return cart;
    }
	
	/**
	 * Get a cart by id.
	 * @param id Id of the cart to be found
	 * @return cart
	 */
	public Cart getcartById(long id) {
        if(cartRepository.existsById(id)){
    	return cartRepository.findById(id).get();
        }
          return null;
    }
	
	/**
	 * Add a cart
	 * @param cart cart object with details of the cart to be added
	 */
	public void addcart(Cart cart) {
		cartRepository.save(cart);
    }
	
	/**
	 * Update a cart by id.
	 * @param id Id of the cart to be updated
	 * @param cart cart object with details of the cart to be updated
	 */
	public void updatecart(long id,Cart cart) {
		if (cartRepository.existsById(id)){
            Cart tempcart = cartRepository.findById(id).get();
        	tempcart.setProductId(cart.getProductId());
        	tempcart.setQuantity(cart.getQuantity());
        	cartRepository.save(tempcart);
		 }
        }
	
	/**
	 * Delete a cart by id.
	 * @param id Id of the cart to be deleted
	 */
	public void deletecart(long id){
        if (cartRepository.existsById(id)){
        	cartRepository.deleteById(id);
        }
	}
}





