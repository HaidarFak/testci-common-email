package org.apache.commons.mail;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Test class for testing the getSocketConnectionTimeout method of the Email class.
 */
public class GetSocketConnectionTimeoutTest extends EmailTest {
    
    @Test
    public void testGetSocketConnectionTimeout() {
        int timeout = email.getSocketConnectionTimeout();
        assertTrue("Timeout should be non-negative", timeout >= 0);
    }
} 