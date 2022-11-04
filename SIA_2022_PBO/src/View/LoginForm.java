package View;

import javax.swing.*;

public class LoginForm extends BaseForm
{
    public JPasswordField passwordBox = new JPasswordField();
    public JTextField userNameBox = new JTextField();

    public LoginForm()
    {
        super();
        this.setTitle("Login Form");
        this.addItem("Username", userNameBox);
        this.addItem("Password", passwordBox);
        this.createForm();
        this.addButtonActions();
    }

    public boolean login()
    {
        System.out.println("Logging in...");
        return true;
    }

    @Override
    public void addButtonActions()
    {
        this.okButton.addActionListener(e -> { this.login(); });
        this.cancelButton.addActionListener(e -> this.dispose());
    }
}
