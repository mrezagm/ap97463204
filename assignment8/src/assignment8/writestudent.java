package assignment8;

import java.util.ArrayList;
import java.util.Scanner;

public class writestudent {

    public Scanner sc = new Scanner(System.in);





    public writestudent() {

    }

    public ArrayList<student> generate(){

        ArrayList<student> students = new ArrayList<>();

        System.out.println("Set n numbers");
        int n = sc.nextInt();
        String command;
        System.out.println("If You Want To Sign A Graduated Student Enter 1" +
                "\n If You Want To Sign A Studying Student Enter 2" +
                "\n If You Want To Exit Type Exit");

        for (int i = 0; i < n ; i++) {


            command = sc.next();
            switch (command){
                case "1": {
                    System.out.print("name: \t");

                    String fname = sc.next();

                    System.out.print("last name: \t");

                    String lname = sc.next();

                    System.out.print("Student Id: \t");

                    int stId = sc.nextInt();

                    System.out.print("graduationYear: \t");

                    int graduationYear = sc.nextInt();

                    student student = new graduated(1,fname,lname,stId,graduationYear);

                    students.add(student);

                    System.out.println("Done!");
                    break;
                }
                case "2": {
                    System.out.print("name: \t");

                    String fname = sc.next();

                    System.out.print("last name: \t");

                    String lname = sc.next();

                    System.out.print("Student Id: \t");

                    int stId = sc.nextInt();

                    System.out.print("Expended Units: \t");

                    int expendedUnits = sc.nextInt();

                    student student = new studying(2,fname,lname,stId,expendedUnits);

                    students.add(student);

                    System.out.println("Done!");
                    break;
                }
                case "exit":{
                    return students;
                }
                default:{
                    System.out.println("invalid Command");

                    i= i-1;
                    break;
                }



            }



        }


        return students;
    }

}
