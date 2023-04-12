public class Contact {
    private String name;
    private String city;
    private String phone;
    private String email;

    public Contact(String name, String city, String phone, String email) {
        this.name = name;
        this.city = city;
        this.phone = phone;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phoneNumber) {
        this.phone = phoneNumber;
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
        return "Nome: " + name + "\nCidade: " + city + "\nTelefone: " + phone + "\nEmail: " + email + "\n";
    }
}
