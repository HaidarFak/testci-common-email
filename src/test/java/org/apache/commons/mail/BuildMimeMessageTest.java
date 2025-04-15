package org.apache.commons.mail;

import org.junit.Test;

/**
 * Test class for testing the buildMimeMessage method of the Email class.
 */
public class BuildMimeMessageTest extends EmailTest {
    
    @Test
    public void testBuildMimeMessage() throws Exception {
        email.setFrom(TEST_EMAIL);
        email.addTo(TEST_EMAIL);
        email.setSubject("Test Subject");
        email.setMsg("Test Message");
        email.buildMimeMessage();
        // If we get here without exception, the test passes
    }
} 