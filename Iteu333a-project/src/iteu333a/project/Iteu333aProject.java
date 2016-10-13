package Iteu333a.project;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Iteu333aProject {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, IOException {
        Scanner sc = new Scanner(new FileReader("input.txt"));

        
        int lineCount = 0;
        //reads the file "input.txt"
        PrintWriter writer = new PrintWriter("Test.java", "UTF-8");

        while (sc.hasNext()) 
        {
            String str = sc.nextLine();
            //replaces kung with if
            str = str.replaceAll("kung", "if");
            str = str.replaceAll("labas", "out");
            str = str.replaceAll("iprint", "println");
            lineCount++;
            
            
            
              if (str.trim().endsWith(";")||str.trim().endsWith("{")||str.trim().endsWith("}")||str.trim().isEmpty())
                {

                }
                else
                {
                    System.out.println("Error at line" + " " + lineCount);                   
                }
                writer.println(str);
            
            
        }
        writer.close();
        List cmdAndArgs = Arrays.asList("cmd", "/c", "run.bat");
        File dir = new File(System.getProperty("user.dir"));

        ProcessBuilder pb = new ProcessBuilder(cmdAndArgs);
        pb.directory(dir);
        Process p = pb.start();
    }
}
