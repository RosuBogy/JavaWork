
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;

public class temaJava2 {
	
	public static void main(String[] args) throws IOException {

        File file = null;
         search(new File("."));
         System.out.println(countfiles(new File(".")) + " files");
         System.out.println(countfolders(new File("C:\\Users\\BOGDAN\\git\\JavaWork")));
        countlines(new File("C:\\Users\\BOGDAN\\git\\JavaWork"));
    }

    public static void countlines(File file) throws IOException {
        File[] files = file.listFiles();
        int lineNumber = 0;
        for (File text : files) {

            if (text.isFile()) {
                BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(text)));
                
                if (br.readLine() != null) {
                    lineNumber++;
                    br.close();
                }
            }
        }
        System.out.println(lineNumber);
    }

    private static int countfiles(File file) {
        int fileCounter = 0;
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (int i = 0; files != null && i < files.length; i++) {
                fileCounter += countfiles(files[i]);
            }
        } else
            fileCounter++;
        return fileCounter;
    }

    private static void search(java.io.File folder) {
        File[] files = folder.listFiles();
        for (File file : files) {
            System.out.println(file.getAbsolutePath() + " isDirectory= " + file.isDirectory());
            if (file.isDirectory()) {
                search(file);
            }
        }
    }

    public static int countfolders(File file) {
        int folderCounter = 0;
        File[] folders = file.listFiles();
        for (File folder : folders) {

            if (folder.isDirectory()) {
                folderCounter += countfolders(folder);
                System.out.println(folder.getAbsolutePath() + " isDirectory= " + file.isDirectory());
                folderCounter++;
            }
        }
        return folderCounter;
    }
}


