package org.apache.commons.mail;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * Test suite that runs all Email test classes.
 */
@RunWith(Suite.class)
@SuiteClasses({
    AddBccTest.class,
    AddCcTest.class,
    AddHeaderTest.class,
    AddReplyToTest.class,
    BuildMimeMessageTest.class,
    GetHostNameTest.class,
    GetMailSessionTest.class,
    GetSentDateTest.class,
    GetSocketConnectionTimeoutTest.class,
    SetFromTest.class
})
public class EmailTestSuite {
    // This class remains empty, it's just used as a holder for the above annotations
} 