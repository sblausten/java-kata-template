import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

public class MainTest {

  @Test
  void main() {
    ByteArrayOutputStream bytesOutput = new ByteArrayOutputStream();
    PrintStream console = System.out;
    try {
      System.setOut(new PrintStream(bytesOutput));
      Main.main(new String[]{ "test", "1" });
    } finally {
      System.setOut(console);
    }

//    App mockApp = mock(App.class);
//    when(guidanceSet.something()).thenReturn(Lists.newArrayList());
//    verify(mockApp).start();

    assertThat(bytesOutput.toString(), equalTo("test1"));
  }

}
