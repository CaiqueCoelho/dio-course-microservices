package coursemicroservicesdioexperts.shoppingcart.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.redis.core.RedisHash;

@RedisHash("item")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Item {

    private Long productId;

    private Integer amount;
}
