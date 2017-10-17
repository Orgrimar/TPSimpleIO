import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.io.FileOutputStream;
import static java.lang.System.getProperty;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            FileOutputStream file = new FileOutputStream("myFile.txt");
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(file, "UTF-8");
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

            System.out.println("Veuillez entrez votre texte :");
            String keyBoardUser = sc.nextLine();

            while (!keyBoardUser.toLowerCase().equals("quit")){
                bufferedWriter.write(keyBoardUser+getProperty("line.separator"));
                keyBoardUser = sc.nextLine();
            }

            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
