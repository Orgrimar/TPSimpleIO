import java.io.File;

public class Treatment {
    public void listFile(String pathFolder, String fileExtension){
        File folder = new File(pathFolder);
        for(File f : folder.listFiles()){
            String fileName = f.getName();
            String fileExt = fileName.substring(fileName.indexOf(".") + 1, f.getName().length());
            fileExt = fileExt.toLowerCase();
            if(fileExt.equals(fileExtension)){
                System.out.println(f.getName());
            }
        }
    }
}
