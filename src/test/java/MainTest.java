import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import service.MyLilHelper;

public class MainTest {

  private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

  @Before
  public void setUpStreams() throws FileNotFoundException {
    String filePath = "/Users/Ryujin/code/_repos/HackerRankPractice/src/test/java/MainTest.txt";
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
    Main.main(new String[]{});

    String expected = MyLilHelper.getFormattedOutputString(new String[]{"4",
                                                                        "8",
                                                                        "16"});

    Assert.assertEquals(expected,
                        outContent.toString());
  }
}
