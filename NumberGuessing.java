import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class NumberGuessing extends JFrame {

    private int number;
    private int attempts = 0;
    private final int maxAttempts = 5;

    private JTextField guessField;
    private JLabel messageLabel;
    private JLabel attemptsLabel;

    public NumberGuessing() {

        // Generate random number
        Random random = new Random();
        number = random.nextInt(100) + 1;

        // Window title
        setTitle("Number Guessing Game");

        // Window size
        setSize(400, 300);

        // Close program
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Center window
        setLocationRelativeTo(null);

        // Layout
        setLayout(new FlowLayout());

        // Heading
        JLabel titleLabel = new JLabel("NUMBER GUESSING GAME");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));

        // Instructions
        JLabel instructionLabel =
                new JLabel("Guess a number between 1 and 100");

        // Text field
        guessField = new JTextField(10);

        // Button
        JButton guessButton = new JButton("Guess");

        // Message
        messageLabel = new JLabel("Enter your guess");

        // Attempts
        attemptsLabel = new JLabel("Attempts: 0 / " + maxAttempts);

        // Add components
        add(titleLabel);
        add(instructionLabel);
        add(guessField);
        add(guessButton);
        add(messageLabel);
        add(attemptsLabel);

        // Button action
        guessButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                try {

                    int guess = Integer.parseInt(guessField.getText());

                    attempts++;

                    if (guess > number) {
                        messageLabel.setText("Too High!");
                    }
                    else if (guess < number) {
                        messageLabel.setText("Too Low!");
                    }
                    else {
                        messageLabel.setText("Congratulations! Correct!");

                        JOptionPane.showMessageDialog(
                                null,
                                "You won in " + attempts + " attempts!"
                        );

                        guessButton.setEnabled(false);
                    }

                    attemptsLabel.setText(
                            "Attempts: " + attempts + " / " + maxAttempts
                    );

                    // Maximum attempts
                    if (attempts >= maxAttempts && guess != number) {

                        messageLabel.setText("Game Over!");

                        JOptionPane.showMessageDialog(
                                null,
                                "You lost!\nCorrect number was: " + number
                        );

                        guessButton.setEnabled(false);
                    }

                    guessField.setText("");

                }
                catch (NumberFormatException ex) {

                    JOptionPane.showMessageDialog(
                            null,
                            "Please enter a valid number!"
                    );
                }
            }
        });

        // Display window
        setVisible(true);
    }

    public static void main(String[] args) {
        new NumberGuessing();
    }
}