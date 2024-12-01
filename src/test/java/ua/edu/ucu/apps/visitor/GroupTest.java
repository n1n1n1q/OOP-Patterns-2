package ua.edu.ucu.apps.visitor;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GroupTest {

    @Test
    public void testGroupApply() {
        Group<String> group = new Group<>();
        Signature<String> task1 = new Signature<>(s -> {});
        Signature<String> task2 = new Signature<>(s -> {});
        group.addTask(task1).addTask(task2);

        group.apply("TestArg");

        assertNotNull(group.getId());
        assertNotNull(task1.getId());
        assertNotNull(task2.getId());
        assertEquals(group.getHeader("groupUUID"), task1.getHeader("groupUUID"));
        assertEquals(group.getHeader("groupUUID"), task2.getHeader("groupUUID"));
    }
}