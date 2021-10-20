import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUILanding {

    private JButton setUpProg;
    private JButton manageProgrammeOfStudyButton;
    private JPanel mainPanel;

    public static void main(String[] args) {
        JFrame frame = new JFrame("GUILanding");
        frame.setContentPane(new GUILanding().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    public GUILanding() {
        setUpProg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Set up programme button clicked");
                //starting gui page for setting up progam
                setUpProg startProg = new setUpProg();
                startProg.startGui();
            }
        });
    }

}
