import java.util.Scanner;

public class Main {

    static String folder;
    static String extension;

    public static void main(String[] args) {
        // write your code here
        pathReport();
        extensionFile();
        Treatment t = new Treatment();
        t.listFile(folder, extension);
    }

    static String pathReport(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez entrez le chemin d'accès de votre dossier :");
        folder = sc.nextLine();
        return folder;
    }

    static String extensionFile(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez entrez l'extension de votre fichier :");
        extension = sc.nextLine();
        return extension;
    }

}
