import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends JPanel {

    private MainFrame parent;

    private JButton addStudent;
    private JButton listStudent;
    private JButton exitButton;

    public MainMenu(final MainFrame parent) {
        this.parent = parent;

        setSize(500, 500);
        setLayout(null);

        addStudent = new JButton("ADD STUDENT");
        addStudent.setSize(300,30);
        addStudent.setLocation(100,100);
        add(addStudent);
        addStudent.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                parent.getMainMenu().setVisible(false);
                parent.getAddStudents().setVisible(true);
            }
        });

        listStudent = new JButton("LIST STUDENT");
        listStudent.setSize(300,30);
        listStudent.setLocation(100,150);
        add(listStudent);
        listStudent.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                parent.getListStudent().generateTable(parent.getAddStudents().getStudents());
                parent.getMainMenu().setVisible(false);
                parent.getListStudent().setVisible(true);

            }
        });

        exitButton = new JButton("Exit");
        exitButton.setSize(300,30);
        exitButton.setLocation(100,200);
        add(exitButton);
        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

}
