package hello;

import org.junit.Test;

import static org.hamcrest.core.StringContains.containsString;
import static org.junit.Assert.*;

public class GreeterTest {
    private Greeter greeter = new Greeter();

    @Test
    public void greeterSayHello() {
        assertThat(greeter.sayHello(), containsString("Hello"));
    }
}
