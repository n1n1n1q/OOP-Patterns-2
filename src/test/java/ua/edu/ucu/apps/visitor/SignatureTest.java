// SignatureTest.java
package ua.edu.ucu.apps.visitor;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SignatureTest {

    @Test
    public void testSignatureApply() {
        Signature<String> signature = new Signature<>(s -> {});
        signature.apply("TestArg");

        assertNotNull(signature.getId());
    }
}