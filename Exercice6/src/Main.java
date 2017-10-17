import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Veulliez sélectionner votre fichier ainsi que son chemin d'accès :");
        String selectFile = sc.nextLine();
        try {
            FileReader reader = new FileReader(selectFile);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String text;
            FileOutputStream outputStream = new FileOutputStream("fileCopy.txt");
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, "UTF-8");
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
            while ((text = bufferedReader.readLine()) != null) {
                bufferedWriter.write(text);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
