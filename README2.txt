Name: Haidar Fakhruldin

* Email Test 

This project has JUnit test cases.

** Running the Tests

*** Using Eclipse

1. Import the project into Eclipse
2. Right-click on the project
3. Select "Run As" -> "JUnit Test"

** Test Coverage

The test covers the following methods of the `Email` class:

1. `addBcc(String... emails)`
2. `addCc(String email)`
3. `addHeader(String name, String value)`
4. `addReplyTo(String email, String name)`
5. `buildMimeMessage()`
6. `getHostName()`
7. `getMailSession()`
8. `getSentDate()`
9. `getSocketConnectionTimeout()`
10. `setFrom(String email)`

** Dependencies

The project uses the following main dependencies:
- JUnit 4.11
- Apache Commons Email 1.3.2
- JavaMail API 1.4.5

All dependencies are managed through Maven and will be automatically downloaded when building the project. 