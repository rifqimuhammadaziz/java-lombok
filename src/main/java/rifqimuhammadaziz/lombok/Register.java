package rifqimuhammadaziz.lombok;

import lombok.Value;

@Value // generate final class & private final field in class (only generate getter)
public class Register {

    String username;

    String password;
}
