import junit.framework.Assert;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void main() {
        File file = new File("C:\\a1.txt");
    }

    @Test
    public void getLine() {
        String [] actual = {"kiev", "new-York", "amsterdam", "vena", "melburn"};
        String [] expected = {"kiev",  "vena", "amsterdam", "melburn", "new-York" };

        StringBuilder stringBuilderExpected = new StringBuilder();
        stringBuilderExpected.append("kiev ").append("vena ")
                .append("amsterdam ").append("melburn ").append("new-York ");
        Assert.assertEquals(stringBuilderExpected, actual);

    }
}