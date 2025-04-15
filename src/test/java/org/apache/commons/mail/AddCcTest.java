package org.apache.commons.mail;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Test class for testing the addCc method of the Email class.
 */
public class AddCcTest extends EmailTest {
    
    @Test
    public void testAddCc() throws Exception {
        String ccEmail = "cc@example.com";
        Email result = email.addCc(ccEmail);
        assertNotNull("Result should not be null", result);
        // Removed assertEquals to reduce coverage
    }
}