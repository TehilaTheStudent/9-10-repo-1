package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    
    @Test
    public void testGetMessage() {
        App app = new App();
        assertEquals("Hello World!", app.getMessage());
    }
    
    @Test
    public void testAppNotNull() {
        App app = new App();
        assertNotNull(app);
    }
}
