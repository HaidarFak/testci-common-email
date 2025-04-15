package org.apache.commons.mail;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Date;

/**
 * Test class for testing the getSentDate method of the Email class.
 */
public class GetSentDateTest extends EmailTest {
    
    @Test
    public void testGetSentDate() {
        Date sentDate = email.getSentDate();
        assertNotNull("Sent date should not be null", sentDate);
    }
} 