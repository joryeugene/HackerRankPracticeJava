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

public class TwoDArraysTest01 {

  private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

  @Before
  public void setUpStreams() throws FileNotFoundException {
    String filePath = "/Users/Ryujin/code/_repos/HackerRankPractice/src/test/java/challenge/TwoDArraysTest01.txt";
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
    TwoDArrays.main(new String[]{});

    String expected = MyLilHelper.getFormattedOutputString(new String[]{"19"});

    Assert.assertEquals(expected, outContent.toString());
  }
}
