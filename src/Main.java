import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Registration Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);


        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 2, 10, 10));


        JLabel nameLabel = new JLabel("Name:");
        JLabel mobileLabel = new JLabel("Contact Number:");
        JLabel genderLabel = new JLabel("Gender:");
        JLabel emailLabel = new JLabel("Email:");


        JTextField nameField = new JTextField(10);
        JTextField mobileField = new JTextField(10);
        JTextField emailField = new JTextField(10);


        JRadioButton maleRadio = new JRadioButton("Male");
        JRadioButton femaleRadio = new JRadioButton("Female");


        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadio);
        genderGroup.add(femaleRadio);


        JButton submitButton = new JButton("Submit");


        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String mobile = mobileField.getText();
                String gender = maleRadio.isSelected() ? "Male" : (femaleRadio.isSelected() ? "Female" : "Not Selected");
                String email = emailField.getText();


                JOptionPane.showMessageDialog(frame, "Registration Details:\n" +
                        "Name: " + name + "\n" +
                        "Mobile: " + mobile + "\n" +
                        "Gender: " + gender + "\n" +
                        "Email: " + email);
            }
        });


        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(mobileLabel);
        panel.add(mobileField);
        panel.add(genderLabel);
        JPanel genderPanel = new JPanel();
        genderPanel.add(maleRadio);
        genderPanel.add(femaleRadio);
        panel.add(genderPanel);
        panel.add(emailLabel);
        panel.add(emailField);
        panel.add(new JLabel(""));
        panel.add(submitButton);


        frame.add(panel);


        frame.setVisible(true);
    }
}
