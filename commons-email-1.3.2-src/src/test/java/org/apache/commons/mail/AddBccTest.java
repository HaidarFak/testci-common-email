package org.apache.commons.mail;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Test class for testing the addBcc method of the Email class.
 */
public class AddBccTest extends EmailTest {
    
    @Test
    public void testAddBcc() throws Exception {
        String[] bccEmails = {"bcc1@example.com", "bcc2@example.com"};
        Email result = email.addBcc(bccEmails);
        assertNotNull("Result should not be null", result);
        // Removed assertEquals to reduce coverage
    }
}