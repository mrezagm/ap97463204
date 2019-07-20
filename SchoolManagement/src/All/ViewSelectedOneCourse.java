package All;

import All.model.Course;
import All.model.CourseStudent;
import All.model.CourseStudentGrade;
import All.model.Student;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ViewSelectedOneCourse extends JDialog implements GlobalClass {
    ViewSelectedOneCourse.ClickTableModel model;
    List<CourseStudent> cs10 = new ArrayList<CourseStudent>(100);
    List<Student> s10 = new ArrayList<Student>(100);
    public static void main(String[] args) {
        new ViewAllStudent(   );
    }

    public ViewSelectedOneCourse(  ) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                    ex.printStackTrace();
                }
                for (int i = 0; i< GlobalClass.cs1.size(); i++){
                    if(GlobalClass.cs1.get(i).getIdCourse() == GlobalClass.selectedClass.get(0)) {

                        cs10.add(GlobalClass.cs1.get(i));

                        for (int j = 0; j< cs10.size(); j++) {
                            for (int k = 0; k< s1.size(); k++) {
                                if (cs10.get(j).getIdStudent() == GlobalClass.s1.get(k).getId())
                                    if(GlobalClass.cs1.get(j).getIdCourse()!=0 && GlobalClass.cs1.get(j).getIdStudent()!=0 && GlobalClass.cs1.get(j).getGrade()!=0) {

                                        csg1.add(new CourseStudentGrade(j, GlobalClass.cs1.get(j).getIdCourse(),
                                                GlobalClass.cs1.get(j).getIdStudent(), GlobalClass.cs1.get(j).getGrade(),
                                                GlobalClass.s1.get(k).getFirstName(), GlobalClass.s1.get(k).getLastName(),
                                                GlobalClass.s1.get(k).getNationalCode(), GlobalClass.s1.get(k).getMajor()));

                                    }
                            }
                        }

                    }
                }
                model = new ViewSelectedOneCourse.ClickTableModel(csg1);


                JTable table = new JTable(model);

                JFrame frame = new JFrame("View  All   Student  Of Selected Class");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.add(new JScrollPane(table));
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }



    public static class ClickTableModel extends AbstractTableModel {

        private java.util.List<CourseStudentGrade> clicks;

        public ClickTableModel(List<CourseStudentGrade> clicks) {
            this.clicks = new ArrayList<>(clicks);
        }

        @Override
        public int getRowCount() {
            return clicks.size();
        }

        @Override
        public int getColumnCount() {
            return 6;
        }

        @Override
        public String getColumnName(int column) {
            String name = "??";
            switch (column) {
                case 0:

                    name = "Course  Id";
                    break;
                case 1:
                    name = " Student  id";
                    break;

                case 2:
                    name = "Grade";

                    break;
                case 3:
                    name = "firstName";
                    break;
                case 4:
                    name = "Last Name";
                    break;
                case 5:
                    name = "NationalCode";
                    break;
                case 6:
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
            CourseStudentGrade click = clicks.get(rowIndex);
            Object value = null;
            switch (columnIndex) {
                case 0:

                    value = click.getIdCourse();
                    break;
                case 1:
                    value = click.getIdStudent();
                    break;

                case 2:
                    value = click.getGrade();
                    break;
                case 3:
                    value = click.getFirstName();
                    break;
                case 4:
                    value = click.getLastName();
                    break;
                case 5:
                    value = click.getNationalCode();
                    break;
                case 6:
                    value = click.getMajor();
                    break;
            }
            return value;
        }
    }

}
