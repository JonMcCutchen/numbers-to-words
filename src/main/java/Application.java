import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Application {



    //Pulling text from file one and turning into arrayList
    public ArrayList<String> getInfo1() throws IOException{
        String data = "";
        File file = new File("src/main/resources/string-numbers-input1.txt");
        Scanner scan = new Scanner(file);

        ArrayList<String> answer = new ArrayList<>();

        while(scan.hasNext()){
        data = scan.nextLine();
        answer.add(data);
         }

    String[] info =data.split(" ");



        return answer;
    }

    public static void columnList(ArrayList<String> colList) {
        int index = 0;
        for (String w : colList) {
            System.out.printf("%10s ", w);
            index++;
            if (index % 2 == 0) {
                System.out.println();
            }
        }
    }

    //method to sort given list
    public ArrayList<String> sortList(ArrayList<String> list) throws IOException {
        //list = getInfo1();
        ArrayList<String> answer = new ArrayList<>();

        System.out.println(list.stream().filter(a -> a.contains("on")).collect(Collectors.toList()));
//        for(var i : list) {
//            if(i.contains("one")) {
//              answer.add(i);
//            }
//        }

        return answer;
    }

    
}