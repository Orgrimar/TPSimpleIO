import java.io.File;
import java.nio.file.Files;
import java.io.IOException;

public class Treatment {
    public void listFile(String pathFolder){
        try {
            Files.list(new File(pathFolder).toPath()).forEach(path -> System.out.println(path));
        } catch (IOException e) {
            System.out.println(pathFolder + " : le chemin est incorrect.");
        }
    }
}
