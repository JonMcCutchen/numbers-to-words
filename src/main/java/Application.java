import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Application {
public ArrayList<String> getInfo1() throws IOException{
    String data = "";
    File file = new File("string-numbers-input1.txt");
    Scanner scan = new Scanner(file);
    ArrayList<String> answer = new ArrayList<>();

    while(scan.hasNext()){
    data = scan.nextLine();
    answer.add(data);
    System.out.println(data);

    }
    String[] info =data.split(" ");

    System.out.println(answer);
    System.out.println(Arrays.toString(info));


    return answer;
}

}
