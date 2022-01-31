import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationTest {


    //testing for input from text file
    @Test
    void getInfo1Test() throws IOException {
        Application app = new Application();
        //creating expected result
        ArrayList<String> answer = new ArrayList<>();
        answer.add("five");
        answer.add("three");
        answer.add("seven");
        answer.add("four");
        answer.add("one");
        answer.add("six");
        answer.add("two");
        answer.add("eight");

        assertEquals(answer, app.getInfo1());
    }

    //testing if arraylist is sorted correctly
    @Test
    void sortListTest() throws IOException {
        Application app = new Application();
        //creating expected result
        ArrayList<String> ans = new ArrayList<String>(Arrays.asList("one", "two", "three", "four", "five", "six", "seven", "eight"));
        assertEquals(ans, app.sortList(app.getInfo1()), "numbers should be sorted" );
    }




        }

