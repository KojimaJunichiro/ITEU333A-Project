package iteu333a.project;

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
            //str = str.replaceAll("kung", "if");
            //str = str.replaceAll("labas", "out");
            //str = str.replaceAll("iprint", "println");
            
            lineCount++;
           
            if(Pattern.matches("\\s*", str)) // WHITESPACE
              {
              }
            else if(Pattern.matches("\\s*int[\\s]+[^0-9$&+,:;=?@#|'<>.^*()%!-+\\s]*\\w+\\s*=\\s*\\d+\\s*;", str)) // INTEGER SYNTAX
              {
              }
            else if (Pattern.matches("\\s*String[\\s]+[^0-9$&+,:;=?@#|'<>.^*()%!-+]*\\s*[\\w]+\\s*[=]\\s*\\\"\\s*\\w+\\s*\\\"\\s*[;]|\\s*char[\\s]+[^0-9$&+,:;=?@#|'<>.^*()%!-+\\s]*\\w+\\s*=\\s*'\\w'\\s*;", str)) // STRING AND CHAR SYNTAX
              {
              }
            else if (Pattern.matches("\\s*double[\\s]+[^0-9$&+,:;=?@#|'<>.^*()%!-+\\s]*\\w+\\s*=\\s*\\d+.\\d+\\s*;|\\s*double[\\s]+[^0-9$&+,:;=?@#|'<>.^*()%!-+\\s]*\\w+\\s*=\\s*\\d+\\s*;", str)) // DOUBLE SYNTAX
              {
              }
            else if (Pattern.matches("\\s*float[\\s]+[^0-9$&+,:;=?@#|'<>.^*()%!-+\\s]*\\w+\\s*=\\s*\\d+.\\d+\\s*;|\\s*float[\\s]+[^0-9$&+,:;=?@#|'<>.^*()%!-+\\s]*\\w+\\s*=\\s*\\d+\\s*;", str)) // FLOAT SYNTAX
              {
              }
            
           
            else if (Pattern.matches("\\s*if\\s*[(]\\s*[^0-9$&+,:;=?@#|'<>.!()^*%-+]*\\s*[)]\\s*[{]\\s*[\\w]+;\\s*[}]", str)) // IF STATEMENT SYNTAX ( NOT POLISHED )
              {
              }
            
            else if (Pattern.matches("\\s*[/][/]\\s*.*", str)) // SINGLE COMMENT SYNTAX
              {
              }
            else if (Pattern.matches("/\\*[^*]*\\*+(?:[^/*][^*]*\\*+)*/", str)) // MULTIPLE COMMENT SYNTAX
              { 
             
              }
           
            
            
            
            //comment \s*[/][*]\s*(.|\n)*[*][/]
            // approved multi-line comment /\\*([^*]|[\\r\\n]|(\\*+([^*/]|[\\r\\n])))*\\*+/
             
            
            
            /*
            */
       
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            else
            {
                System.out.println("Error at line" + " " + lineCount);
                
            }
            
                writer.println(str);
                
            
            // string length
            String leng = "(ISukat\\(.*\\);)";
            Pattern length = Pattern.compile(leng);
            Matcher lengthmatch = length.matcher(str);
            if(lengthmatch.find()){
                String keep = lengthmatch.group(0).substring(9);
                System.out.println("embrace = " + keep);
                String lenpat = "([a-z0-9A-Z]*[+][a-z0-9A-Z]*)";
                Pattern solvelen = Pattern.compile(lenpat);
                Matcher solvematch = solvelen.matcher(keep);
                    if(solvematch.find()){
                        String[] holdarr = solvematch.group(0).split("[+]");
                        str = str.replaceAll("MakeSukat\\(.*\\);", "System.out.println(" + holdarr[0] + ".length()+" + holdarr[1] + ".length());");
                    }
            }   

                // Comment 
                String comments = "(////.*)";
            Pattern comment = Pattern.compile(comments);
            Matcher comm = comment.matcher(str);
            continue;
            
            
            
        }
        writer.close();
        List cmdAndArgs = Arrays.asList("cmd", "/c", "run.bat");
        File dir = new File(System.getProperty("user.dir"));

        ProcessBuilder pb = new ProcessBuilder(cmdAndArgs);
        pb.directory(dir);
        Process p = pb.start();
    }
}
