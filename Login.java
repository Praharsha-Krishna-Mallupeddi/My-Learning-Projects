import java.awt.*;
import java.awt.event.*;

class Login extends Frame implements ActionListener {
    TextField usernameField, passwordField;
    Label usernameLabel, passwordLabel;
    Button loginButton;
    Frame resultFrame;

    public Login() {
        setTitle("Login Form");
        setSize(300, 200);
        setLayout(new FlowLayout());

        usernameLabel = new Label("Username:");
        usernameField = new TextField(20);

        passwordLabel = new Label("Password:");
        passwordField = new TextField(20);
        passwordField.setEchoChar('*'); // Set password field to show *

        loginButton = new Button("Login");
        loginButton.addActionListener(this);

        add(usernameLabel);
        add(usernameField);
        add(passwordLabel);
        add(passwordField);
        add(loginButton);

        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent ae) {
        String username = usernameField.getText();
        String password = passwordField.getText();

        // Perform simple validation (you can customize as needed)
        if (username.equals("admin") && password.equals("admin123")) {
            displayResult("Login Successful!");
        } else {
            displayResult("Login Failed. Please check your credentials.");
        }
    }

    private void displayResult(String message) {
        resultFrame = new Frame("Result");
        resultFrame.setSize(250, 100);
        resultFrame.setLayout(new FlowLayout());

        Label resultLabel = new Label(message);
        Button closeButton = new Button("Close");
        closeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                resultFrame.dispose();
            }
        });

        resultFrame.add(resultLabel);
        resultFrame.add(closeButton);

        resultFrame.setVisible(true);
    }

    public static void main(String[] args) {
        new Login();
    }
}

