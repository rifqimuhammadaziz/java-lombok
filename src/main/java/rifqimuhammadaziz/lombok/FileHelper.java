package rifqimuhammadaziz.lombok;

import lombok.Cleanup;
import lombok.SneakyThrows;

import java.io.FileReader;
import java.util.Scanner;

public class FileHelper {

    // auto generate exception (convert throwable to RuntimeException, but not changed initial exception), no need to try catch
    @SneakyThrows
    public static String loadFile(String file) {
        @Cleanup FileReader fileReader = new FileReader(file); // auto close resource
        @Cleanup Scanner scanner = new Scanner(fileReader); // auto close resource

        StringBuilder builder = new StringBuilder();
        while (scanner.hasNextLine()) {
            builder.append(scanner.nextLine()).append("\n");
        }

        return builder.toString();
    }
}
