public class Contact {
    private String name;
    private String city;
    private String phoneNumber;
    private String email;

    public Contact(String name, String city, String phoneNumber, String email) {
        this.name = name;
        this.city = city;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    // Getters and setters for all the fields

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // toString method to return a string representation of the Contact object

    @Override
    public String toString() {
        return "Nome: " + name + "\nCidade: " + city + "\nTelefone: " + phoneNumber + "\nEmail: " + email + "\n";
    }
}
