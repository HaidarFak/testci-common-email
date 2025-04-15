package org.apache.commons.mail;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Test class for testing the setFrom method of the Email class.
 */
public class SetFromTest extends EmailTest {
    
    @Test
    public void testSetFrom() throws Exception {
        Email result = email.setFrom(TEST_EMAIL);
        assertNotNull("Result should not be null", result);
    }
} 