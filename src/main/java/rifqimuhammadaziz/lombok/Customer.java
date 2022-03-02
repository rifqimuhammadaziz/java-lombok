package rifqimuhammadaziz.lombok;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter // create getter all field
@Setter // create setter all field
@NoArgsConstructor // create empty constructor (without parameter)
@AllArgsConstructor // create constructor with field setter (parameter) by order of initiate field
public class Customer {

    private String id;

    private String name;
}
