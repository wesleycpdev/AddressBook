import org.junit.jupiter.api.Assertions;

class ContactTest {

    @org.junit.jupiter.api.Test
    void getName() {
        Contact contact = new Contact("Test Name","Test City","Test Phone", "Test Email");
        String contactName = contact.getName();
        Assertions.assertEquals("Test Name",contactName);
    }

    @org.junit.jupiter.api.Test
    void setName() {
        Contact contact = new Contact("Test Name","Test City","Test Phone", "Test Email");
        contact.setName("New Test Name");
        String contactName = contact.getName();
        Assertions.assertEquals("New Test Name",contactName);
    }

    @org.junit.jupiter.api.Test
    void getCity() {
        Contact contact = new Contact("Test Name","Test City","Test Phone", "Test Email");
        String contactCity = contact.getCity();
        Assertions.assertEquals("Test City",contactCity);
    }

    @org.junit.jupiter.api.Test
    void setCity() {
        Contact contact = new Contact("Test Name","Test City","Test Phone", "Test Email");
        contact.setCity("New Test City");
        String contactCity = contact.getCity();
        Assertions.assertEquals("New Test City",contactCity);
    }

    @org.junit.jupiter.api.Test
    void getPhoneNumber() {
        Contact contact = new Contact("Test Name","Test City","Test Phone", "Test Email");
        String contactPhone = contact.getPhone();
        Assertions.assertEquals("Test Phone",contactPhone);
    }

    @org.junit.jupiter.api.Test
    void setPhoneNumber() {
        Contact contact = new Contact("Test Name","Test City","Test Phone", "Test Email");
        contact.setPhone("New Test Phone");
        String contactPhone = contact.getPhone();
        Assertions.assertEquals("New Test Phone",contactPhone);
    }

    @org.junit.jupiter.api.Test
    void getEmail() {
        Contact contact = new Contact("Test Name","Test City","Test Phone", "Test Email");
        String contactEmail = contact.getEmail();
        Assertions.assertEquals("Test Email",contactEmail);
    }

    @org.junit.jupiter.api.Test
    void setEmail() {
        Contact contact = new Contact("Test Name","Test City","Test Phone", "Test Email");
        contact.setEmail("New Test Email");
        String contactEmail = contact.getEmail();
        Assertions.assertEquals("New Test Email",contactEmail);
    }
}