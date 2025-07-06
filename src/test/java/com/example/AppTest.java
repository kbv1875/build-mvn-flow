import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void testMainMethod() {
        String expected = "Hello, Maven!";
        String actual = App.getGreeting();
        assertEquals(expected, actual);
    }
}
