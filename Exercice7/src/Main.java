import java.io.*;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez entrez votre URL :");
        String urlLink = sc.nextLine();
        try (InputStream in = new URL(urlLink).openStream()){
            File file = new File("fileImg.jpg");
            file.createNewFile();
            Files.copy(in, Paths.get("fileImg.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

/*
URL url = new URL(urlLink);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
            String img;
            FileOutputStream outputStream = new FileOutputStream("fileImg.png");
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, "UTF-8");
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
            while ((img = bufferedReader.readLine()) != null){
                bufferedWriter.write(img);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            bufferedReader.close();
 */