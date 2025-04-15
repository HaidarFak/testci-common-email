package org.apache.commons.mail;

import org.junit.Before;

/**
 * Base test class for Email tests containing common setup code.
 */
public abstract class EmailTest {
    protected Email email;
    protected static final String TEST_EMAIL = "test@example.com";
    protected static final String TEST_NAME = "Test User";
    protected static final String TEST_HOST = "smtp.example.com";
    protected static final String TEST_HEADER_NAME = "X-Test-Header";
    protected static final String TEST_HEADER_VALUE = "Test Value";

    @Before
    public void setUp() {
        email = new SimpleEmail();
        email.setHostName(TEST_HOST);
    }
} 