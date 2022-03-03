package rifqimuhammadaziz.lombok;

import lombok.Value;
import lombok.With;

@Value // generate final class & private final field in class (only generate getter)
@With
public class Register {

    String username;

    String password;
}
