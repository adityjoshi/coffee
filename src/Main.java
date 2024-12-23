import javax.swing.*;
import java.awt.*;

public class Main {
    private JTextField firstNameField, lastNameField, emailField, phoneField, nationalityField, ageField, addressField;
    private JButton submitButton, clearButton;
    private JLabel messageLabel;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Registration Form");
            Main app = new Main();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setContentPane(app.createUI());
            frame.setSize(400, 500);
            frame.setVisible(true);
        });
    }

    private JPanel createUI() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(9, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // First Name
        panel.add(new JLabel("First Name:"));
        firstNameField = new JTextField(20);
        panel.add(firstNameField);

        // Last Name
        panel.add(new JLabel("Last Name:"));
        lastNameField = new JTextField(20);
        panel.add(lastNameField);

        // Email
        panel.add(new JLabel("Email:"));
        emailField = new JTextField(20);
        panel.add(emailField);

        // Phone
        panel.add(new JLabel("Phone:"));
        phoneField = new JTextField(15);
        panel.add(phoneField);

        // Nationality
        panel.add(new JLabel("Nationality:"));
        nationalityField = new JTextField(20);
        panel.add(nationalityField);

        // Age
        panel.add(new JLabel("Age:"));
        ageField = new JTextField(5);
        panel.add(ageField);

        // Address
        panel.add(new JLabel("Address:"));
        addressField = new JTextField(100);
        panel.add(addressField);

        // Buttons
        submitButton = new JButton("Submit");
        clearButton = new JButton("Clear");
        panel.add(submitButton);
        panel.add(clearButton);

        // Message Label
        messageLabel = new JLabel("", JLabel.CENTER);
        panel.add(new JLabel());
        panel.add(messageLabel);

        // Add action listeners
        submitButton.addActionListener(e -> handleSubmit());
        clearButton.addActionListener(e -> clearFields());

        return panel;
    }

    private void handleSubmit() {
        String firstName = firstNameField.getText().trim();
        String lastName = lastNameField.getText().trim();
        String email = emailField.getText().trim();
        String phone = phoneField.getText().trim();
        String nationality = nationalityField.getText().trim();
        String age = ageField.getText().trim();
        String address = addressField.getText().trim();

        // Validate inputs
        if (firstName.isEmpty() || lastName.isEmpty() || email.isEmpty() || phone.isEmpty() ||
                nationality.isEmpty() || age.isEmpty() || address.isEmpty()) {
            messageLabel.setText("All fields are required!");
            messageLabel.setForeground(Color.RED);
            return;
        }

        // Display the input data in a dialog
        StringBuilder userData = new StringBuilder();
        userData.append("First Name: ").append(firstName).append("\n")
                .append("Last Name: ").append(lastName).append("\n")
                .append("Email: ").append(email).append("\n")
                .append("Phone: ").append(phone).append("\n")
                .append("Nationality: ").append(nationality).append("\n")
                .append("Age: ").append(age).append("\n")
                .append("Address: ").append(address);

        JOptionPane.showMessageDialog(null, userData.toString(), "Submitted Data", JOptionPane.INFORMATION_MESSAGE);

        // Reset the form after submission
        messageLabel.setText("Data submitted successfully!");
        messageLabel.setForeground(Color.GREEN);
        clearFields();
    }

    private void clearFields() {
        firstNameField.setText("");
        lastNameField.setText("");
        emailField.setText("");
        phoneField.setText("");
        nationalityField.setText("");
        ageField.setText("");
        addressField.setText("");
        messageLabel.setText("");
    }
}
