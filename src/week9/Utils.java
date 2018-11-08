package week9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Utils {
    public static String readContentFromFile(String path) throws IOException{
        File inFile = new File(path);
        String str = "";
        try (FileReader fileReader = new FileReader(inFile)) {
            BufferedReader reader = new BufferedReader(fileReader);
            String line;
            
            while( (line = reader.readLine())  != null ){
                str += line + "\n";
            }
            
        } catch (IOException ex) {
            System.out.println("ex");
        }
        return str;
    }
    
    public static void writeContentToFile(String path) throws IOException{
    
        Scanner scan = new Scanner(System.in);
        try {
            String str = "";
            str = scan.nextLine();
            
//            fw = new FileWriter(path); // cau b
            FileWriter fw = new FileWriter(path, true); // cau c
            BufferedWriter bw = new BufferedWriter(fw);
            bw.newLine();
            bw.write(str);
            
        } catch (IOException e) {
        }
    }
    
    public static File findFileByName(String folderPath, String fileName){
        
        File f = new File(folderPath);
        String[] listfile = f.list();
        
        for (String listfile1 : listfile) {
            if (listfile1.equals(fileName)) {
                String path = folderPath + "\\" + fileName;
                File file = new File(path);
                return file;
            }
        }
        
        return new File("");
    }
    
}
