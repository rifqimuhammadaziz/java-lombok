package rifqimuhammadaziz.lombok;

import lombok.Cleanup;

import java.io.FileReader;
import java.util.Scanner;

public class FileHelper {

    public static String loadFile(String file) throws Exception{
        @Cleanup FileReader fileReader = new FileReader(file); // auto close resource
        @Cleanup Scanner scanner = new Scanner(fileReader); // auto close resource

        StringBuilder builder = new StringBuilder();
        while (scanner.hasNextLine()) {
            builder.append(scanner.nextLine()).append("\n");
        }

        return builder.toString();
    }
}
