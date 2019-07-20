package All;

import All.model.Course;
import All.model.Student;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ViewOwnTeacherStudent  extends JDialog implements GlobalClass {
    ViewOwnTeacherStudent.ClickTableModel model;
    List<Student> s10 = new ArrayList<Student>(100);
    List<Course> c10 = new ArrayList<Course>(100);
    public static void main(String[] args) {
        new ViewOwnTeacherCourse(   );
    }

    public ViewOwnTeacherStudent(  ) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                    ex.printStackTrace();
                }
                for (int i = 0; i< GlobalClass.c1.size(); i++){
                    if(GlobalClass.c1.get(i).getTeacherId() == GlobalClass.TeacherIdLogedin.get(0)) {
                        c10.add(GlobalClass.c1.get(i));


                        if(GlobalClass.cs1.get(i).getIdCourse()==c10.get(i).getId())

                            for (int j = 0; j< GlobalClass.s1.size(); j++) {
                                if (GlobalClass.s1.get(j).getId() == GlobalClass.cs1.get(i).getIdStudent())
                                    s10.add(GlobalClass.s1.get(j));
                            }

                    }}
                model = new ViewOwnTeacherStudent.ClickTableModel(s10);


                JTable table = new JTable(model);

                JFrame frame = new JFrame("View Your Student");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.add(new JScrollPane(table));
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }



    public static class ClickTableModel extends AbstractTableModel {

        private java.util.List<Student> clicks;

        public ClickTableModel(List<Student> clicks) {
            this.clicks = new ArrayList<>(clicks);
        }

        @Override
        public int getRowCount() {
            return clicks.size();
        }

        @Override
        public int getColumnCount() {
            return 5;
        }

        @Override
        public String getColumnName(int column) {
            String name = "??";
            switch (column) {
                case 0:
                    name = "Id Student";
                    break;
                case 1:
                    name = "First Name";
                    break;
                case 2:
                    name = "Last Name";
                    break;
                case 3:
                    name = "Term";
                    break;
                case 4:
                    name = "Major";
                    break;



            }
            return name;
        }

        @Override
        public Class<?> getColumnClass(int columnIndex) {
            Class type = String.class;
            switch (columnIndex) {
                case 0:
                case 1:
                    type = Integer.class;
                    break;
            }
            return type;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            Student click = clicks.get(rowIndex);
            Object value = null;
            switch (columnIndex) {
                case 0:
                    value = click.getId();

                    break;
                case 1:
                    value = click.getFirstName();
                    break;
                case 2:
                    value = click.getLastName();
                    break;

                case 3:
                    value = click.getTerm();
                    break;
                case 4:
                    value = click.getMajor();
                    break;
            }
            return value;
        }
    }

}
