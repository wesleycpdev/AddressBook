import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

    private final ArrayList<Contact> contacts;
    private final Scanner scanner;

    public AddressBook() {
        contacts = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void addContact () {
        System.out.print("Nome: ");
        String name = scanner.nextLine();
        System.out.print("Cidade: ");
        String city = scanner.nextLine();
        System.out.print("Telefone: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        Contact contact = new Contact(name, city, phoneNumber, email);
        contacts.add(contact);
        System.out.println("Contato criado com sucesso!");
    }

    public void editContact () {
        System.out.print("Informe o nome do contato para editar: ");
        String name = scanner.nextLine();
        for (Contact contact : contacts) {
            if (contact.getName().equals(name)) {
                System.out.print("Nome: ");
                String newName = scanner.nextLine();
                System.out.print("Cidade: ");
                String newAddress = scanner.nextLine();
                System.out.print("Telefone: ");
                String newPhoneNumber = scanner.nextLine();
                System.out.print("Email: ");
                String newEmail = scanner.nextLine();
                contact.setName(newName);
                contact.setCity(newAddress);
                contact.setPhoneNumber(newPhoneNumber);
                contact.setEmail(newEmail);
                System.out.println("Contato editado com sucesso!");
                return;
            }
        }
        System.out.println("Contato não encontrado!");
    }

    public void deleteContact () {
        System.out.print("Informe o nome do contato para deletar: ");
        String name = scanner.nextLine();
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getName().equals(name)) {
                contacts.remove(i);
                System.out.println("Contact deleted successfully!");
                return;
            }
        }
        System.out.println("Contato não encontrado!");
    }

    public void listContacts () {
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }

    public void start () {
        while (true) {
            System.out.println("Lista de contatos");
            System.out.println("============");
            System.out.println("1. Adicionar");
            System.out.println("2. Editar");
            System.out.println("3. Deletar");
            System.out.println("4. Listar");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1 -> addContact();
                case 2 -> editContact();
                case 3 -> deleteContact();
                case 4 -> listContacts();
                case 5 -> {
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Opção invalida!");
            }
        }
    }

}
