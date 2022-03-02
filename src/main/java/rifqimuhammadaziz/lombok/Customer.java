package rifqimuhammadaziz.lombok;

import lombok.*;

@Getter // create getter all field
@Setter // create setter all field
@NoArgsConstructor // create empty constructor (without parameter)
@AllArgsConstructor // create constructor with field setter (parameter) by order of initiate field
@EqualsAndHashCode(exclude = {
        "name"
})
public class Customer {

    private String id;

    private String name;
}
