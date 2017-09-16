package challenge;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import service.MyLilHelper;

public class JavaLoopsITest {

  private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

  @Before
  public void setUpStreams() throws FileNotFoundException {
    String filePath = "/Users/Ryujin/code/_repos/HackerRankPractice/src/test/java/challenge/JavaLoopsITest.txt";
    System.setIn(new FileInputStream(filePath));
    System.setOut(new PrintStream(outContent));
  }

  @After
  public void cleanUpStreams() {
    System.setIn(null);
    System.setOut(null);
  }

  @Test
  public void mainTest() {
    JavaLoopsI.main(new String[]{});

    String expected = MyLilHelper.getFormattedOutputString(
        new String[]{"2 x 1 = 2",
                     "2 x 2 = 4",
                     "2 x 3 = 6",
                     "2 x 4 = 8",
                     "2 x 5 = 10",
                     "2 x 6 = 12",
                     "2 x 7 = 14",
                     "2 x 8 = 16",
                     "2 x 9 = 18",
                     "2 x 10 = 20"});

    Assert.assertEquals(expected, outContent.toString());
  }
}
