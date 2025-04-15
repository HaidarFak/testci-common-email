package org.apache.commons.mail;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Test class for testing the getHostName method of the Email class.
 */
public class GetHostNameTest extends EmailTest {
    
    @Test
    public void testGetHostName() {
        assertEquals("Host name should match", TEST_HOST, email.getHostName());
    }
} 