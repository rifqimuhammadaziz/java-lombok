package rifqimuhammadaziz.lombok;

import org.junit.jupiter.api.Test;

public class FileHelperTest {

    @Test
    void testLoadFilePom() throws Exception {
        String text = FileHelper.loadFile("pom.xml");
        System.out.println(text);
    }
}
