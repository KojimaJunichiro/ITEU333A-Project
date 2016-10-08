package javaapplication1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class JavaApplication1 {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, IOException {
        Scanner sc = new Scanner(new FileReader("input.txt"));

        //reads the file "input.txt"
        PrintWriter writer = new PrintWriter("Test.java", "UTF-8");

        while (sc.hasNext()) {
            String str = sc.nextLine();
            //replaces kung with if
            str = str.replaceAll("kung", "if");
            str = str.replaceAll("labas", "out");
            str = str.replaceAll("iprint", "println");

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