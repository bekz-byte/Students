import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddStudents extends JPanel {

    private MainFrame parent;

    private JLabel label;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;

    private JButton addS;
    private JButton back;

    private JTextField textField;
    private JTextField textField1;
    private JTextField textField2;

    int idst = 0;

    static Students st = new Students();

    private String facult[] = {"Information", "Technologies", "Economics", "Mathematics"};

    private Students[] students = { new Students(st.getId(), st.getName(), st.getSurname(), st.getFaculty(),st.getGroup())};

    public AddStudents(){

    }


    public AddStudents(final MainFrame parent) {
        this.parent = parent;

        setSize(500,500);
        setLayout(null);

        label = new JLabel("NAME: ");
        label.setSize(300,30);
        label.setLocation(50,100);
        add(label);

        label1 = new JLabel("SURNAME: ");
        label1.setSize(300,30);
        label1.setLocation(50,130);
        add(label1);

        label2 = new JLabel("FACULTY: ");
        label2.setSize(300,30);
        label2.setLocation(50,160);
        add(label2);

        label3 = new JLabel("GROUP: ");
        label3.setSize(300,30);
        label3.setLocation(50,190);
        add(label3);

        final JComboBox agesBox = new JComboBox(facult);
        agesBox.setSize(300, 30);
        agesBox.setLocation(120,160);
        add(agesBox);

        textField = new JTextField("");
        textField.setSize(300,30);
        textField.setLocation(120,100);
        add(textField);

        textField1 = new JTextField("");
        textField1.setSize(300,30);
        textField1.setLocation(120,130);
        add(textField1);

        textField2 = new JTextField("");
        textField2.setSize(300,30);
        textField2.setLocation(120,190);
        add(textField2);

        back = new JButton("BACK");
        back.setSize(100,30);
        back.setLocation(100,350);
        add(back);
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                parent.getAddStudents().setVisible(false);
                parent.getMainMenu().setVisible(true);
            }
        });

        addS = new JButton("ADD");
        addS.setSize(100,30);
        addS.setLocation(250,350);

        addS.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String text = textField.getText();
                String text1 = textField1.getText();
                String facul = (String) agesBox.getSelectedItem();
                String text2 = textField2.getText();

                idst++;

                if (!text.equals("") || !text1.equals("") || !text2.equals("")) {

                    for (int i = 0; i < students.length; i++) {
                        students[i].setId(idst);
                        students[i].setName(text);
                        students[i].setSurname(text1);
                        students[i].setFaculty(facul);
                        students[i].setGroup(text2);
                    }
                    agesBox.setSelectedIndex(0);
                }
            }
        });
        add(addS);
    }

    public Students[] getStudents() {
        return students;
    }
}
