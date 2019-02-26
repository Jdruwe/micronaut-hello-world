package hello.world;

import io.micronaut.test.annotation.MicronautTest;
import io.reactivex.Single;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import static org.junit.jupiter.api.Assertions.assertEquals;

@MicronautTest
public class HelloControllerTest {

    @Inject
    HelloClient helloClient;

    @Test
    void testHello() {
        Single<String> hello = helloClient.hello();
        assertEquals(
                "Hello World",
                hello.blockingGet()
        );
    }

}
