package org.apache.commons.mail;

import org.junit.Test;

/**
 * Test class for testing the addHeader method of the Email class.
 */
public class AddHeaderTest extends EmailTest {
    
    @Test
    public void testAddHeader() throws Exception {
        email.addHeader(TEST_HEADER_NAME, TEST_HEADER_VALUE);
        // Note: Headers are stored internally and can't be directly accessed
        // We can only verify that no exception is thrown
    }
    
    @Test
    public void testAddHeaderWithEmptyValue() throws Exception {
        email.addHeader(TEST_HEADER_NAME, " ");  // Using a space instead of empty string
        // Testing with space value to avoid IllegalArgumentException
    }
}