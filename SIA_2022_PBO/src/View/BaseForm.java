package View;

import javax.swing.*;
import java.awt.*;

public abstract class BaseForm extends JDialog
{
    public int itemCount = 0;
    public JPanel mainPanel = new JPanel();
    public JButton okButton = new JButton("Ok");
    public JButton cancelButton = new JButton("Cancel");

    public BaseForm()
    {
        super();
        this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        this.setContentPane(this.mainPanel);
        this.mainPanel.setLayout(new SpringLayout());
    }

    public void addButtonActions()
    {
        this.cancelButton.addActionListener(e -> dispose());
    }

    public void addItem(Component a, Component b)
    {
        this.mainPanel.add(a);
        this.mainPanel.add(b);
        this.itemCount++;
    }

    public void addItem(String t, Component c)
    {
        JLabel label = new JLabel(t, JLabel.TRAILING);
        label.setLabelFor(c);
        this.addItem(label, c);
    }

    public void addItem(String a, String b)
    {
        JLabel label_1 = new JLabel(a, JLabel.TRAILING);
        JLabel label_2 = new JLabel(b, JLabel.TRAILING);
        label_1.setLabelFor(label_2);
        this.addItem(label_1, label_2);
    }

    public void addComponentPair(Component c)
    {
        this.addItem("", c);
    }

    public void createForm()
    {
        this.addItem(this.okButton, this.cancelButton);
        SpringUtilities.makeCompactGrid(this.mainPanel, this.itemCount, 2, 6, 6, 6, 6);
        this.pack();
    }

    public void createForm(Component relative)
    {
        this.createForm();
        this.setLocationRelativeTo(relative);
    }
}
