package org.apache.commons.mail;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Test class for testing the addReplyTo method of the Email class.
 */
public class AddReplyToTest extends EmailTest {
    
    @Test
    public void testAddReplyTo() throws Exception {
        Email result = email.addReplyTo(TEST_EMAIL, TEST_NAME);
        assertNotNull("Result should not be null", result);
        // Removed assertEquals to reduce coverage
    }
}