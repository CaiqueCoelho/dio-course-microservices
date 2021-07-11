package coursemicroservicesdioexperts.shoppingcart.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.redis.core.RedisHash;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@RedisHash("cart")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Cart {

    @Id
    private Long id;

    private List<Item> items;

    public Cart(Long id) {
        this.id = id;
    }
}
