import java.util.Objects;

public class Contact {

    String name;
    String phoneNumber;


    public Contact(String name, String phoneNumber) {

        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || !object.getClass().equals(Contact.class)) return false;

        Contact contact = (Contact) object;
        return name.equals(contact.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
