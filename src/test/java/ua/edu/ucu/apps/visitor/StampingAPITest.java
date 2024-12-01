// StampingAPITest.java
package ua.edu.ucu.apps.visitor;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StampingAPITest {

    @Test
    public void testVisit() {
        String groupUUID = "test-group-uuid";
        StampingAPI stampingAPI = new StampingAPI(groupUUID);
        Task<String> task = new Signature<>(s -> {});

        stampingAPI.visit(task);

        assertEquals(groupUUID, task.getHeader("groupUUID"));
    }
}