import java.util.Scanner;

public class Main {

    static String folder;

    public static void main(String[] args) {
	// write your code here
        pathReport();
        Treatment t = new Treatment();
        t.listFile(folder);
    }

     static String pathReport(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez entrez le chemin d'accès de votre dossier :");
        folder = sc.nextLine();
        return folder;
    }

}
