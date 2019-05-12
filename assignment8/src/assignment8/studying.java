package assignment8;

public class studying extends student {


    public int iD ;
    public int studentId;
    public String firstName;
    public String lastName;
    public int expendedUnits;

    public studying(int iD,String firstName,String lastName,int studentId,int expendedUnits){

        this.iD= iD;
        this.studentId = studentId;
        this.firstName= firstName;
        this.lastName= lastName;
        if (expendedUnits<250){
            try {
                this.expendedUnits = expendedUnits;
            }catch (Exception e){
                System.out.println("error this will be deleted");
            }
        }
    }

    @Override
    public int getStudentId() {
        return studentId;
    }

    @Override
    public String toString() {
        return iD+"\t"+firstName+"\t"+lastName+"\t"+studentId+"\t"+ expendedUnits+"\t";
    }
}