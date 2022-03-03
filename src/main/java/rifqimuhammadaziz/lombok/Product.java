package rifqimuhammadaziz.lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Data // setter (except final field), getter, equals & hashcode, to string. *cannot be changed
@RequiredArgsConstructor // override annotation (generate constructor with required field / final field)
@AllArgsConstructor // override annotation (generate constructor with all parameter)
@ToString(exclude = {"price"}) // override annotation (add exclude field)
public class Product {

    // final type is required field (has no setter)
    private final String id;

    private String name;

    private Long price;

}
