import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class UserRegistration extends JFrame {
    
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JTextField emailField;
    private JButton registerButton;
    
    public UserRegistration() {
        // Set the title and layout of the JFrame
        setTitle("User Registration");
        setLayout(new FlowLayout());
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Create UI components
        JLabel usernameLabel = new JLabel("Username: ");
        usernameField = new JTextField(20);
        
        JLabel passwordLabel = new JLabel("Password: ");
        passwordField = new JPasswordField(20);
        
        JLabel emailLabel = new JLabel("Email: ");
        emailField = new JTextField(20);
        
        registerButton = new JButton("Register");

        // Add the components to the frame
        add(usernameLabel);
        add(usernameField);
        add(passwordLabel);
        add(passwordField);
        add(emailLabel);
        add(emailField);
        add(registerButton);

        // Action Listener for the Register button
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());
                String email = emailField.getText();
                
                // Validate the inputs
                if(username.isEmpty() || password.isEmpty() || email.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "All fields are required!");
                } else {
                    // Call the method to store user details in the database
                    registerUser(username, password, email);
                }
            }
        });
    }

    // Method to register user by storing details in the database
    private void registerUser(String username, String password, String email) {
        

		Connection conn = null;
        PreparedStatement stmt = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
			// Establish the database connection
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/user_registration", "root", "7253");

            // SQL query to insert user data
            String sql = "INSERT INTO users (username, password, email) VALUES (?, ?, ?)";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, username);
            stmt.setString(2, password);
            stmt.setString(3, email);
            
            // Execute the query
            int rowsInserted = stmt.executeUpdate();
            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(null, "User registered successfully!");
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        } catch (ClassNotFoundException e){
			JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
		}
		finally {
            // Close resources
            try {
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        // Run the registration form
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                UserRegistration frame = new UserRegistration();
                frame.setVisible(true);
            }
        });
    }
}