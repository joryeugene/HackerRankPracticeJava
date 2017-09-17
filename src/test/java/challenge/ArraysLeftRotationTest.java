package challenge;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ArraysLeftRotationTest {

  private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

  @Before
  public void setUpStreams() throws FileNotFoundException {
    String filePath = "/Users/Ryujin/code/_repos/HackerRankPractice/src/test/java/challenge/ArraysLeftRotationTest.txt";
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
    ArraysLeftRotation.main(new String[]{});

    Assert.assertEquals("5 1 2 3 4".trim(),
                        outContent.toString()
                                  .trim());
  }
}
