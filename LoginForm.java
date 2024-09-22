import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.*;
public class LoginForm extends JFrame {
    final private Font mainFont = new Font("Segoe print", Font.BOLD, 18);
    JTextField tfEmail;
    JPasswordField pfPassword;
    private Component btnCancel;


    public void initialize(){


        //input boxes and label
JLabel lbLoginForm = new JLabel("Login Form", SwingConstants.CENTER);
lbLoginForm.setFont(mainFont);

JLabel lbEmail = new JLabel("Email");
lbEmail.setFont(mainFont);

tfEmail = new JTextField();
tfEmail.setFont(mainFont);

JLabel lbPassword = new JLabel("Password"); //label
lbPassword.setFont(mainFont);

pfPassword = new JPasswordField();  //input field
pfPassword.setFont(mainFont);


JPanel formPanel = new JPanel();
formPanel.setLayout(new GridLayout(0, 1, 10, 0xa));
formPanel.setBorder(BorderFactory.createEmptyBorder(30,50,30,50));
formPanel.add(lbLoginForm);
formPanel.add(lbEmail);
formPanel.add(tfEmail);
formPanel.add(lbPassword);
formPanel.add(pfPassword);


//adding buttons
JButton btnLogin = new JButton("Login");
btnLogin.setFont(mainFont);
btnLogin.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent e) {
    String email = tfEmail.getText();
    String password = String.valueOf(pfPassword.getPassword());

    User user = getAuthenticatedUser(email,password);

    if (user!=null){
        MainFrame mainFrame = new MainFrame();
        mainFrame.initialize(user);
       dispose();
    }
    else{
         JOptionPane.showMessageDialog(LoginForm.this,
        "Invalid email or password", 
        "Try again",
         JOptionPane.ERROR_MESSAGE);
    }
    }
}
);

JPanel buttonsPanel = new JPanel();
buttonsPanel.setLayout(new GridLayout(1,2,10,0));
buttonsPanel.setBorder(BorderFactory.createEmptyBorder(30,50,30,50));
buttonsPanel.add(btnLogin);
buttonsPanel.add(btnCancel);
    

//layout
add(formPanel, BorderLayout.NORTH);
add(buttonsPanel, BorderLayout.SOUTH);
//form
                setTitle("Login Form");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setSize(400, 500);
        setMinimumSize(new Dimension(350,450));
        setLocationRelativeTo(null); // to bring frame in center of the screen
        setVisible(true);  // to make frame visible
    }





    private User getAuthenticatedUser(String email, String password){
        User user = null;
        //get user from database
        final String DB_URL = "jdbc:mysql://localhost/MyStore?ServerTimezone=UTC";
        final String USERNAME = "root";
        final String PASSWORD = "";

        //try catch

        try {
            Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            String sql = "SELECT * FROM users WHERE email=? AND password=?";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, email);
            preparedStatement.setString(2, password);

            ResultSet resultSet = preparedStatement.executeQuery();

            if(resultSet.next()){
                user = new User();
                user.name = resultSet.getString("name");
                user.email = resultSet.getString("email");
                user.phone = resultSet.getString("address");
                user.password = resultSet.getString("password");
            }

            preparedStatement.close();
            conn.close();
        }
        catch(Exception e){
            System.out.println("Database connection failed!");
        }
        return user;

        }

        public static void main(String[] args) {
            LoginForm loginForm = new LoginForm();
            loginForm.initialize();
        }
    }

