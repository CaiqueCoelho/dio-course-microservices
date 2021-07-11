package coursemicroservicesdioexperts.shoppingcart.controller;

import coursemicroservicesdioexperts.shoppingcart.model.Cart;
import coursemicroservicesdioexperts.shoppingcart.model.Item;
import coursemicroservicesdioexperts.shoppingcart.repository.CartRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/cart")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class CartController {

    private CartRepository cartRepository;

    @PostMapping("/{id}")
    public Cart addItem(@PathVariable Long id, @RequestBody Item item){
        Optional<Cart> savedCart = cartRepository.findById(id);
        Cart cart;
        if (savedCart.equals(Optional.empty())) {
            cart = new Cart(id);
        } else {
            cart = savedCart.get();
        }
        cart.getItems().add(item);
        return cartRepository.save(cart);
    }

    @GetMapping("/{id}")
    public Optional<Cart> findByid(@PathVariable Long id) {
        return cartRepository.findById(id);
    }

    @DeleteMapping("/{id}")
    public void clear(@PathVariable Long id){
        cartRepository.deleteById(id);
    }
}
