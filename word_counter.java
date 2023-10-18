package projects;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class word_counter extends JFrame implements ActionListener {

    private JTextArea textArea;
    private JButton countButton;
    private JLabel countLabel;

    public word_counter() {
        super("Word Counter");

        // Create text area and count button
        textArea = new JTextArea(10, 30);
        countButton = new JButton("Count");

        // Create count label with initial value of zero
        countLabel = new JLabel("Word count: 0");
        // Add components to frame
        JPanel panel = new JPanel();
        panel.add(new JScrollPane(textArea));
        panel.add(countButton);
        panel.add(countLabel);
        add(panel);

        // Register action listener for count button
        countButton.addActionListener(this);

        // Set frame properties
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        // Get text from text area
        String text = textArea.getText();

        // Split text into words
        String[] words = text.split("\\s+");

        // Count number of words
        int count = words.length;

        // Update count label
        countLabel.setText("Word count: " + count);
    }

    public static void main(String[] args) {
        new word_counter();
    }

}
