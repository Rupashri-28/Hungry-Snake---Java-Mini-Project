import javax.swing.JFrame;

public class SnakeGame extends JFrame {

    public SnakeGame() {
        // Add the game board to the JFrame
        add(new GameBoard());

        // Set properties of the JFrame (Window)
        setTitle("Snake Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        pack();
        setLocationRelativeTo(null); // Center the window on the screen
        setVisible(true);  // Make the JFrame visible
    }

    public static void main(String[] args) {
        // Create a new instance of SnakeGame, which initializes and displays the game window
        new SnakeGame();
    }
}