import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListStudent extends JPanel {

    private MainFrame parent;

    private JLabel label;
    private JButton back;

    private String header[] = {"ID", "NAME", "SURNAME", "FACULTY", "GROUP"};
    private JTable table;
    private JScrollPane scrollPane;

    public JTable getTable() {
        return table;
    }

    public void setTable(JTable table) {
        this.table = table;
    }

    public JScrollPane getScrollPane() {
        return scrollPane;
    }

    public void setScrollPane(JScrollPane scrollPane) {
        this.scrollPane = scrollPane;
    }



    public ListStudent(){
    }

    public ListStudent(final MainFrame parent) {

        this.parent = parent;

        setSize(500,500);
        setLayout(null);

        label = new JLabel("LIST STUDENT");
        label.setSize(300,30);
        label.setLocation(100,100);
        add(label);

        back = new JButton("BACK");
        back.setSize(300,30);
        back.setLocation(100,150);
        add(back);
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                parent.getMainMenu().setVisible(true);
                parent.getListStudent().setVisible(false);
            }
        });

        table = new JTable();
        table.setFont(new Font("Cali", Font.PLAIN, 12));
        table.setRowHeight(30);

        scrollPane = new JScrollPane(table);
        scrollPane.setSize(350,300);
        scrollPane.setLocation(100  ,200);
        add(scrollPane);

    }

    public void generateTable(Students[] students) {

        Object data[][] = new Object[students.length][5];

        for (int i = 0; i < students.length; i++) {

            data[i][0] = students[i].getId();
            data[i][1] = students[i].getName();
            data[i][2] = students[i].getSurname();
            data[i][3] = students[i].getFaculty();
            data[i][4] = students[i].getGroup();

        }

        DefaultTableModel model = new DefaultTableModel(data, header);
        table.setModel(model);

    }

}
