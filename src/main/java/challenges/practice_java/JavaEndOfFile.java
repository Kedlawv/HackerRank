package challenges.practice_java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaEndOfFile {
    Scanner scan = new Scanner(System.in);



    public List<String> getLineAndEnumerate(Scanner scan){
        int lineNum = 1;
        List<String> list = new ArrayList<>();

        while(scan.hasNextLine()){
            StringBuilder sb = new StringBuilder();
            sb.append(lineNum++);
            sb.append(" ");
            sb.append(scan.nextLine());
            list.add(sb.toString());
            System.out.println(sb.toString());
        }
        return list;
    }
}
