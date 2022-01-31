import java.io.File;
import java.io.IOException;

import java.io.PrintWriter;

import java.util.*;


public class Application {


    //Pulling text from file one and turning into arrayList
    public ArrayList<String> getInfo1() throws IOException {
        String data = "";
        File file = new File("src/main/resources/string-numbers-input1.txt");
        Scanner scan = new Scanner(file);

        ArrayList<String> answer = new ArrayList<>();


        while(scan.hasNext()){
        data = scan.nextLine();
        answer.add(data);
         }

        return answer;
    }
    public ArrayList<String> getInfo2() throws IOException{
        String data = "";
        File file = new File("src/main/resources/string-numbers-input2.txt");
        Scanner scan = new Scanner(file);

        ArrayList<String> answer = new ArrayList<>();

        //looping through text file
        //while there is text on the lines
        //adding to arraylist every loop
        while (scan.hasNext()) {
            data = scan.nextLine();
            answer.add(data);
        }


        while(scan.hasNext()){
            data = scan.nextLine();
            answer.add(data);
        }

        return answer;
    }








    //Turning arrayList into columns
    public static void columnList(ArrayList<String> colList) {
        int index = 0;
        //iterating through arraylist
        for (String w : colList) {
            //formatting into columns
            System.out.printf("%10s ", w);
            index++;
            if (index % 2 == 0) {
                System.out.println();
            }
        }
    }


    //method to sort given list
    public ArrayList<String> sortList(ArrayList<String> list) throws IOException {
        ArrayList<String> sorted = new ArrayList<>();

        //creating hashtable and calling it dictionary
        Hashtable<Integer, String> dictionary = new Hashtable<>();
        dictionary.put(1, "one");
        dictionary.put(2,"two");
        dictionary.put(3,"three");
        dictionary.put(4,"four");
        dictionary.put(5,"five");
        dictionary.put(6,"six");
        dictionary.put(7,"seven");
        dictionary.put(8,"eight");
        dictionary.put(9,"nine");
        dictionary.put(10,"ten");
        dictionary.put(11,"eleven");
        dictionary.put(12,"twelve");
        dictionary.put(13,"thirteen");
        dictionary.put(14,"fourteen");
        dictionary.put(15,"fifteen");
        dictionary.put(16,"sixteen");
        dictionary.put(17,"seventeen");
        dictionary.put(18,"eighteen");
        dictionary.put(19,"nineteen");
        dictionary.put(20,"twenty");
        dictionary.put(21,"twenty one");
        dictionary.put(22,"twenty two");
        dictionary.put(23,"twenty three");
        dictionary.put(24,"twenty four");
        dictionary.put(25,"twenty five");
        dictionary.put(26,"twenty six");
        dictionary.put(27,"twenty seven");
        dictionary.put(28,"twenty eight");
        dictionary.put(29,"twenty nine");
        dictionary.put(30,"thirty");


        //using dictionary to add to final arraylist
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(dictionary.get(1))) {
                sorted.add(list.get(i));
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(dictionary.get(2))) {
                sorted.add(list.get(i));
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(dictionary.get(3))) {
                sorted.add(list.get(i));
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(dictionary.get(4))) {
                sorted.add(list.get(i));
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(dictionary.get(5))) {
                sorted.add(list.get(i));
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(dictionary.get(6))) {
                sorted.add(list.get(i));
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(dictionary.get(7))) {
                sorted.add(list.get(i));
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(dictionary.get(8))) {
                sorted.add(list.get(i));
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(dictionary.get(9))) {
                sorted.add(list.get(i));
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(dictionary.get(10))) {
                sorted.add(list.get(i));
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(dictionary.get(11))) {
                sorted.add(list.get(i));
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(dictionary.get(12))) {
                sorted.add(list.get(i));
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(dictionary.get(13))) {
                sorted.add(list.get(i));
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(dictionary.get(14))) {
                sorted.add(list.get(i));
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(dictionary.get(15))) {
                sorted.add(list.get(i));
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(dictionary.get(16))) {
                sorted.add(list.get(i));
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(dictionary.get(17))) {
                sorted.add(list.get(i));
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(dictionary.get(18))) {
                sorted.add(list.get(i));
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(dictionary.get(19))) {
                sorted.add(list.get(i));
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(dictionary.get(20))) {
                sorted.add(list.get(i));
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(dictionary.get(21))) {
                sorted.add(list.get(i));
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(dictionary.get(22))) {
                sorted.add(list.get(i));
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(dictionary.get(23))) {
                sorted.add(list.get(i));
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(dictionary.get(24))) {
                sorted.add(list.get(i));
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(dictionary.get(25))) {
                sorted.add(list.get(i));
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(dictionary.get(26))) {
                sorted.add(list.get(i));
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(dictionary.get(27))) {
                sorted.add(list.get(i));
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(dictionary.get(28))) {
                sorted.add(list.get(i));
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(dictionary.get(29))) {
                sorted.add(list.get(i));
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(dictionary.get(30))) {
                sorted.add(list.get(i));
            }
        }




        //System.out.println(sorted);
        

        return sorted;
    }
}
