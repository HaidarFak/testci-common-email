package org.apache.commons.mail;

import static org.junit.Assert.*;
import org.junit.Test;
import javax.mail.Session;
import java.util.Properties;

/**
 * Test class for testing the getMailSession method of the Email class.
 */
public class GetMailSessionTest extends EmailTest {
    
    @Test
    public void testGetMailSession() throws Exception {
        Session session = email.getMailSession();
        assertNotNull("Session should not be null", session);
        Properties props = session.getProperties();
        assertNotNull("Properties should not be null", props);
        assertEquals("Host name should match", TEST_HOST, props.getProperty("mail.smtp.host"));
    }
} 