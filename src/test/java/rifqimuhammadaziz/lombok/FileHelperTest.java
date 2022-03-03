package rifqimuhammadaziz.lombok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

public class FileHelperTest {

    @Test
    void testLoadFilePom() throws Exception {
        String text = FileHelper.loadFile("pom.xml");
        System.out.println(text);
    }

    @Test
    void testFileNotFound() {
        Assertions.assertThrows(FileNotFoundException.class, () -> {
            FileHelper.loadFile("nofile.txt");
        });
    }
}
