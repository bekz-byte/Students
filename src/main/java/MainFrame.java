import javax.swing.*;
import java.util.Arrays;

public class MainFrame extends JFrame {

    private MainMenu mainMenu;
    private AddStudents addStudents;
    private ListStudent listStudent;

    Students st = new Students();

    private Students [] students = {
            new Students(st.getId(), st.getName(), st.getSurname(), st.getFaculty(),st.getGroup())
    };

    public MainFrame() {

        setDefaultCloseOperation(3);
        setTitle("STUDENT APPLICATION");
        setSize(500,500);
        setLayout(null);

        mainMenu = new MainMenu(this);
        mainMenu.setVisible(true);
        add(mainMenu);

        addStudents = new AddStudents(this);
        addStudents.setVisible(false);
        add(addStudents);

        listStudent = new ListStudent(this);
        listStudent.setVisible(false);
        add(listStudent);
    }

    public MainMenu getMainMenu() {
        return mainMenu;
    }

    public AddStudents getAddStudents() {
        return addStudents;
    }

    public ListStudent getListStudent() {
        return listStudent;
    }

    public Students[] getStudents() {
        return students;
    }

    public void setStudents(Students[] students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "MainFrame{" +
                "mainMenu=" + mainMenu +
                ", addStudents=" + addStudents +
                ", listStudent=" + listStudent +
                ", st=" + st +
                ", students=" + Arrays.toString(students) +
                '}';
    }

}
