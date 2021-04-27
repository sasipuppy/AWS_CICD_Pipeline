/**
 * 
 */
package com.cart.api;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author Sasikala
 *
 */
@RestController
public class CartController {
	
	@Autowired
	 private CartService cartService;
	 
	/**
	 * Get all carts.
	 * @return list of all the carts 
	 */
	@GetMapping(path = "/cart")
   public List<Cart> findAll(){
	      return cartService.getAll();
   }
	
	/**
	 * Get a single cart based on id.
	 * @param id Id of the cart to be found
	 * @return single cart record with specific id
	 */
	@GetMapping(path= "/cart/{id}")
   public Cart getcartById(@PathVariable long id){
       Cart cart = cartService.getcartById(id);
       if (cart != null){
        return cartService.getcartById(id);
       }
       else
        return null;
    }
	
	/**
	 * Add a cart.
	 * @param cart cart object with details of the cart to be added
	 * @return message indicating cart addition.
	 */
	@PostMapping(path = "/cart",consumes = "application/json", produces = "application/json")
   public String addcart(@RequestBody Cart cart){
	     cartService.addcart(cart);
   		 return "cart added!";
    
	} 
	
	/**
	 * Update cart details based on id.
	 * @param id Id of the cart to be updated
	 * @param cart cart object with details of the cart to be updated
	 * @return message indicating cart update.
	 */
	@PutMapping(path = "/cart/{id}",consumes = "application/json", produces = "application/json")
   public String updatecart(@PathVariable long id,@RequestBody Cart cart) {
       
       Cart newcart = cartService.getcartById(id);
       if (newcart != null){
       	cartService.updatecart(id,cart);
       return "cart updated!";
       }
       return "cart does not exist!";
   }
	
	/**
	 * Delete a cart based on id.
	 * @param id Id of the cart to be deleted
	 * @return message indicating cart deletion.
	 */
	@DeleteMapping(path = "/cart/{id}")
   public String deletecart(@PathVariable long id){
       Cart cart = cartService.getcartById(id);
       if (cart != null){
           cartService.deletecart(id);
       return "cart deleted!";
       }
       return "cart does not exist!";
   }
	
}


