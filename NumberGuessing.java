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

    // ================= COLORS =================

    private final Color BACKGROUND = new Color(5, 12, 40);
    private final Color PANEL = new Color(12, 20, 55);
    private final Color PANEL2 = new Color(18, 25, 65);

    private final Color BLUE = new Color(20, 105, 220);
    private final Color PURPLE = new Color(130, 45, 220);
    private final Color PINK = new Color(225, 25, 120);

    private final Color WHITE = Color.WHITE;
    private final Color YELLOW = new Color(255, 210, 40);
    private final Color GREEN = new Color(40, 240, 160);

    // ================= CONSTRUCTOR =================

    public NumberGuessing() {

        setTitle("Number Guessing Game");
        setSize(900, 750);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        startNewGame();

        // ================= MAIN PANEL =================

        JPanel mainPanel = new JPanel();

        mainPanel.setBackground(BACKGROUND);

        mainPanel.setLayout(
                new BorderLayout(20, 20)
        );

        mainPanel.setBorder(
                BorderFactory.createEmptyBorder(
                        30, 45, 30, 45
                )
        );

        // ================= HEADER =================

        JPanel headerPanel = new JPanel();

        headerPanel.setOpaque(false);

        headerPanel.setLayout(
                new BoxLayout(
                        headerPanel,
                        BoxLayout.Y_AXIS
                )
        );

        JLabel titleLabel =
                new JLabel("NUMBER GUESSING GAME");

        titleLabel.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        38
                )
        );

        titleLabel.setForeground(WHITE);

        titleLabel.setAlignmentX(
                Component.CENTER_ALIGNMENT
        );

        JLabel subtitleLabel =
                new JLabel(
                        "Guess a number between 1 and 100"
                );

        subtitleLabel.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        20
                )
        );

        subtitleLabel.setForeground(YELLOW);

        subtitleLabel.setAlignmentX(
                Component.CENTER_ALIGNMENT
        );

        headerPanel.add(titleLabel);

        headerPanel.add(
                Box.createVerticalStrut(12)
        );

        headerPanel.add(subtitleLabel);

        mainPanel.add(
                headerPanel,
                BorderLayout.NORTH
        );

        // ================= CENTER CONTAINER =================

        JPanel centerContainer = new JPanel();

        centerContainer.setOpaque(false);

        centerContainer.setLayout(
                new BoxLayout(
                        centerContainer,
                        BoxLayout.Y_AXIS
                )
        );

        // ================= GUESS PANEL =================

        RoundedPanel guessPanel =
                new RoundedPanel(
                        PANEL2,
                        PURPLE
                );

        guessPanel.setLayout(
                new BoxLayout(
                        guessPanel,
                        BoxLayout.Y_AXIS
                )
        );

        guessPanel.setBorder(
                BorderFactory.createEmptyBorder(
                        30, 50, 30, 50
                )
        );

        // Enter label

        JLabel enterLabel =
                new JLabel("ENTER YOUR GUESS");

        enterLabel.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        22
                )
        );

        enterLabel.setForeground(WHITE);

        enterLabel.setAlignmentX(
                Component.CENTER_ALIGNMENT
        );

        guessPanel.add(enterLabel);

        guessPanel.add(
                Box.createVerticalStrut(20)
        );

        // ================= INPUT FIELD =================

        guessField = new JTextField();

        guessField.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        26
                )
        );

        guessField.setHorizontalAlignment(
                JTextField.CENTER
        );

        guessField.setForeground(WHITE);

        guessField.setBackground(
                new Color(5, 15, 45)
        );

        guessField.setCaretColor(WHITE);

        guessField.setMaximumSize(
                new Dimension(450, 55)
        );

        // Center input field
        guessField.setAlignmentX(
                Component.CENTER_ALIGNMENT
        );

        guessField.setBorder(
                BorderFactory.createLineBorder(
                        BLUE,
                        2
                )
        );

        guessPanel.add(guessField);

        guessPanel.add(
                Box.createVerticalStrut(20)
        );

        // ================= GUESS BUTTON =================

        JButton guessButton =
                createButton(
                        "GUESS",
                        PINK,
                        220
                );

        // IMPORTANT:
        // Center the Guess button
        guessButton.setAlignmentX(
                Component.CENTER_ALIGNMENT
        );

        guessPanel.add(guessButton);

        guessPanel.add(
                Box.createVerticalStrut(25)
        );

        // ================= MESSAGE PANEL =================

        JPanel messagePanel =
                new JPanel();

        messagePanel.setBackground(
                new Color(5, 20, 40)
        );

        messagePanel.setBorder(
                BorderFactory.createLineBorder(
                        new Color(0, 120, 100),
                        1
                )
        );

        messagePanel.setMaximumSize(
                new Dimension(650, 60)
        );

        messagePanel.setAlignmentX(
                Component.CENTER_ALIGNMENT
        );

        messageLabel =
                new JLabel(
                        "Good Luck! Make your first guess."
                );

        messageLabel.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        18
                )
        );

        messageLabel.setForeground(GREEN);

        messagePanel.add(messageLabel);

        guessPanel.add(messagePanel);

        guessPanel.add(
                Box.createVerticalStrut(20)
        );

        // ================= ATTEMPTS =================

        attemptsLabel =
                new JLabel(
                        "Attempts: 0 / " + maxAttempts
                );

        attemptsLabel.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        18
                )
        );

        attemptsLabel.setForeground(
                new Color(80, 190, 255)
        );

        attemptsLabel.setAlignmentX(
                Component.CENTER_ALIGNMENT
        );

        guessPanel.add(attemptsLabel);

        centerContainer.add(guessPanel);

        centerContainer.add(
                Box.createVerticalStrut(20)
        );

        // ================= HOW TO PLAY =================

        RoundedPanel howPanel =
                new RoundedPanel(
                        PANEL,
                        BLUE
                );

        howPanel.setLayout(
                new BorderLayout()
        );

        howPanel.setBorder(
                BorderFactory.createEmptyBorder(
                        15, 25, 15, 25
                )
        );

        JLabel howTitle =
                new JLabel("HOW TO PLAY");

        howTitle.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        20
                )
        );

        howTitle.setForeground(WHITE);

        howTitle.setHorizontalAlignment(
                SwingConstants.CENTER
        );

        howPanel.add(
                howTitle,
                BorderLayout.NORTH
        );

        // Steps

        JPanel stepsPanel =
                new JPanel(
                        new GridLayout(
                                1,
                                3,
                                20,
                                0
                        )
                );

        stepsPanel.setOpaque(false);

        stepsPanel.add(
                createStep(
                        "1",
                        "Enter a number",
                        "between 1 and 100.",
                        BLUE
                )
        );

        stepsPanel.add(
                createStep(
                        "2",
                        "You have limited",
                        "attempts to guess.",
                        PINK
                )
        );

        stepsPanel.add(
                createStep(
                        "3",
                        "Guess the correct",
                        "number to win!",
                        PURPLE
                )
        );

        howPanel.add(
                stepsPanel,
                BorderLayout.CENTER
        );

        centerContainer.add(howPanel);

        mainPanel.add(
                centerContainer,
                BorderLayout.CENTER
        );

        // ================= BOTTOM BUTTONS =================

        JPanel bottomPanel =
                new JPanel(
                        new GridLayout(
                                1,
                                3,
                                25,
                                0
                        )
                );

        bottomPanel.setOpaque(false);

        JButton newGameButton =
                createButton(
                        "NEW GAME",
                        BLUE,
                        200
                );

        JButton hintButton =
                createButton(
                        "HINT",
                        PURPLE,
                        200
                );

        JButton exitButton =
                createButton(
                        "EXIT",
                        PINK,
                        200
                );

        bottomPanel.add(newGameButton);
        bottomPanel.add(hintButton);
        bottomPanel.add(exitButton);

        mainPanel.add(
                bottomPanel,
                BorderLayout.SOUTH
        );

        add(mainPanel);

        // ================= GUESS BUTTON ACTION =================

        guessButton.addActionListener(
                e -> checkGuess()
        );

        // Enter key
        guessField.addActionListener(
                e -> checkGuess()
        );

        // ================= NEW GAME =================

        newGameButton.addActionListener(e -> {

            startNewGame();

            guessField.setText("");

            guessField.setEnabled(true);

            guessButton.setEnabled(true);

            messageLabel.setText(
                    "New game started! Good Luck."
            );

            messageLabel.setForeground(GREEN);

            attemptsLabel.setText(
                    "Attempts: 0 / " +
                    maxAttempts
            );

            guessField.requestFocus();
        });

        // ================= HINT =================

        hintButton.addActionListener(e -> {

            if (number % 2 == 0) {

                messageLabel.setText(
                        "Hint: The number is EVEN."
                );

            } else {

                messageLabel.setText(
                        "Hint: The number is ODD."
                );
            }

            messageLabel.setForeground(YELLOW);
        });

        // ================= EXIT =================

        exitButton.addActionListener(e -> {

            int result =
                    JOptionPane.showConfirmDialog(
                            this,
                            "Are you sure you want to exit?",
                            "Exit Game",
                            JOptionPane.YES_NO_OPTION
                    );

            if (
                    result ==
                    JOptionPane.YES_OPTION
            ) {

                System.exit(0);
            }
        });

        setVisible(true);

        guessField.requestFocus();
    }

    // =========================================================
    // START NEW GAME
    // =========================================================

    private void startNewGame() {

        Random random = new Random();

        number =
                random.nextInt(100) + 1;

        attempts = 0;
    }

    // =========================================================
    // CHECK GUESS
    // =========================================================

    private void checkGuess() {

        String input =
                guessField.getText().trim();

        // Empty input
        if (input.isEmpty()) {

            messageLabel.setText(
                    "Please enter a number."
            );

            messageLabel.setForeground(
                    Color.RED
            );

            return;
        }

        int guess;

        // Convert input
        try {

            guess =
                    Integer.parseInt(input);

        } catch (NumberFormatException e) {

            messageLabel.setText(
                    "Please enter numbers only."
            );

            messageLabel.setForeground(
                    Color.RED
            );

            return;
        }

        // Range check
        if (
                guess < 1 ||
                guess > 100
        ) {

            messageLabel.setText(
                    "Enter a number between 1 and 100."
            );

            messageLabel.setForeground(
                    YELLOW
            );

            return;
        }

        // Increase attempts
        attempts++;

        // ================= CORRECT =================

        if (guess == number) {

            messageLabel.setText(
                    "Congratulations! You guessed correctly."
            );

            messageLabel.setForeground(
                    GREEN
            );

            attemptsLabel.setText(
                    "Attempts: " +
                    attempts +
                    " / " +
                    maxAttempts
            );

            JOptionPane.showMessageDialog(
                    this,
                    "Congratulations!\n\n" +
                    "Correct Number: " +
                    number +
                    "\nAttempts Used: " +
                    attempts,
                    "You Won",
                    JOptionPane.INFORMATION_MESSAGE
            );

            guessField.setEnabled(false);
        }

        // ================= TOO HIGH =================

        else if (guess > number) {

            messageLabel.setText(
                    "Too High! Try a smaller number."
            );

            messageLabel.setForeground(
                    new Color(
                            255,
                            170,
                            50
                    )
            );
        }

        // ================= TOO LOW =================

        else {

            messageLabel.setText(
                    "Too Low! Try a larger number."
            );

            messageLabel.setForeground(
                    new Color(
                            80,
                            190,
                            255
                    )
            );
        }

        // Update attempts
        attemptsLabel.setText(
                "Attempts: " +
                attempts +
                " / " +
                maxAttempts
        );

        // ================= GAME OVER =================

        if (
                attempts >= maxAttempts &&
                guess != number
        ) {

            messageLabel.setText(
                    "Game Over! You used all attempts."
            );

            messageLabel.setForeground(
                    Color.RED
            );

            JOptionPane.showMessageDialog(
                    this,
                    "Game Over!\n\n" +
                    "You used all " +
                    maxAttempts +
                    " attempts.\n\n" +
                    "Correct Number: " +
                    number,
                    "Game Over",
                    JOptionPane.ERROR_MESSAGE
            );

            guessField.setEnabled(false);
        }

        guessField.setText("");
    }

    // =========================================================
    // CREATE BUTTON
    // =========================================================

    private JButton createButton(
            String text,
            Color color,
            int width
    ) {

        JButton button =
                new JButton(text);

        button.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        16
                )
        );

        button.setForeground(WHITE);

        button.setBackground(color);

        button.setFocusPainted(false);

        button.setBorderPainted(false);

        button.setPreferredSize(
                new Dimension(
                        width,
                        50
                )
        );

        button.setMinimumSize(
                new Dimension(
                        width,
                        50
                )
        );

        button.setMaximumSize(
                new Dimension(
                        width,
                        50
                )
        );

        // Hover effect
        button.addMouseListener(
                new MouseAdapter() {

                    @Override
                    public void mouseEntered(
                            MouseEvent e
                    ) {

                        button.setBackground(
                                color.brighter()
                        );
                    }

                    @Override
                    public void mouseExited(
                            MouseEvent e
                    ) {

                        button.setBackground(
                                color
                        );
                    }
                }
        );

        return button;
    }

    // =========================================================
    // CREATE HOW TO PLAY STEP
    // =========================================================

    private JPanel createStep(
            String number,
            String line1,
            String line2,
            Color color
    ) {

        JPanel panel =
                new JPanel(
                        new BorderLayout(
                                10,
                                0
                        )
                );

        panel.setOpaque(false);

        JLabel numberLabel =
                new JLabel(number);

        numberLabel.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        20
                )
        );

        numberLabel.setForeground(WHITE);

        numberLabel.setHorizontalAlignment(
                SwingConstants.CENTER
        );

        numberLabel.setVerticalAlignment(
                SwingConstants.CENTER
        );

        numberLabel.setOpaque(true);

        numberLabel.setBackground(color);

        numberLabel.setPreferredSize(
                new Dimension(
                        45,
                        45
                )
        );

        JLabel textLabel =
                new JLabel(
                        "<html>" +
                        line1 +
                        "<br>" +
                        line2 +
                        "</html>"
                );

        textLabel.setFont(
                new Font(
                        "Arial",
                        Font.PLAIN,
                        14
                )
        );

        textLabel.setForeground(WHITE);

        panel.add(
                numberLabel,
                BorderLayout.WEST
        );

        panel.add(
                textLabel,
                BorderLayout.CENTER
        );

        return panel;
    }

    // =========================================================
    // ROUNDED PANEL
    // =========================================================

    static class RoundedPanel
            extends JPanel {

        private final Color backgroundColor;
        private final Color borderColor;

        public RoundedPanel(
                Color backgroundColor,
                Color borderColor
        ) {

            this.backgroundColor =
                    backgroundColor;

            this.borderColor =
                    borderColor;

            setOpaque(false);
        }

        @Override
        protected void paintComponent(
                Graphics g
        ) {

            Graphics2D g2 =
                    (Graphics2D)
                    g.create();

            g2.setRenderingHint(
                    RenderingHints
                            .KEY_ANTIALIASING,
                    RenderingHints
                            .VALUE_ANTIALIAS_ON
            );

            // Background
            g2.setColor(
                    backgroundColor
            );

            g2.fillRoundRect(
                    0,
                    0,
                    getWidth() - 1,
                    getHeight() - 1,
                    25,
                    25
            );

            // Border
            g2.setColor(
                    borderColor
            );

            g2.setStroke(
                    new BasicStroke(2)
            );

            g2.drawRoundRect(
                    1,
                    1,
                    getWidth() - 3,
                    getHeight() - 3,
                    25,
                    25
            );

            g2.dispose();

            super.paintComponent(g);
        }
    }

    // =========================================================
    // MAIN METHOD
    // =========================================================

    public static void main(String[] args) {

        SwingUtilities.invokeLater(
                () -> new NumberGuessing()
        );
    }
}