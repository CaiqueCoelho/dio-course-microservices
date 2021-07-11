package coursemicroservicesdioexperts.shoppingcart.repository;

import coursemicroservicesdioexperts.shoppingcart.model.Cart;
import org.springframework.data.repository.CrudRepository;

public interface CartRepository extends CrudRepository<Cart, Long> {
}
