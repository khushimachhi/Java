
import java.awt.*;
import javax.swing.*;


public class MainFrame extends JFrame{
    public void initialize(User user){
        JPanel infoPanel = new JPanel();
        infoPanel.setLayout(new GridLayout(0,2,5,5));
        infoPanel.setBorder(BorderFactory.createEmptyBorder(30,50,30,50));
        infoPanel.add(new JLabel("Name"));
        infoPanel.add(new JLabel(user.name));
        infoPanel.add(new JLabel("Email"));
        infoPanel.add(new JLabel(user.email));
        infoPanel.add(new JLabel("Phone"));
        infoPanel.add(new JLabel(user.phone));
        infoPanel.add(new JLabel("Address"));
        infoPanel.add(new JLabel(user.address));


        add(infoPanel, BorderLayout.NORTH);


        setTitle("Dashboard");
        setSize(1100, 600);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
