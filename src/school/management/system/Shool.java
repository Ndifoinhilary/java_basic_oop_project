package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Shool {
    private List<Teachers> teachersList = new ArrayList<>();
    private List<Students> studentsList = new ArrayList<>();
    private int totalMoneyEard;
    private int totalMoneySpent;

    private int totalMoneySchoolOws;
    public Shool(List<Teachers> teachersList, List<Students> studentsList) {
        this.teachersList = teachersList;
        this.studentsList = studentsList;
        this.totalMoneyEard = 0;
        this.totalMoneySpent = 0;
        this.totalMoneySchoolOws = 0;
    }

    public List<Teachers> getTeachersList() {
        return teachersList;
    }

    public void addTeachersList(Teachers teachers) {
       teachersList.add(teachers);
    }

    public List<Students> getStudentsList() {
        return studentsList;
    }

    public void addStudentsList(Students student) {
        this.studentsList.add(student);
    }

    public int getTotalMoneyEard() {
        for (Students student : studentsList){
            this.totalMoneyEard += student.getFeesPaid();
        }
        return totalMoneyEard;
    }

    /**
     * my own function to calculate total money earn
     */
    public void updateTotalMoneyEard() {
        for (Students student : studentsList){
            this.totalMoneyEard += student.getFeesPaid();
        }
    }

    /**
     *
     * @param totalMoneyEard my the tutor
     */
    public void  updateTottalMoney(int totalMoneyEard){
        this.totalMoneyEard += totalMoneyEard;
    }

    public int getTotalMoneySpent() {
        for (Teachers teachers : teachersList) {
            this.totalMoneySpent += teachers.getSalary();
        }
        if (totalMoneySpent > getTotalMoneyEard())
            return -1;
        return totalMoneySpent;
    }

    /**
     *
     * @param totalMoneySpent for the tutor
     */
    public void updateTotalMoneySpent(int totalMoneySpent) {
        this.totalMoneySpent -= totalMoneySpent;
    }

    /**
     *
     * @param totalMoneySchoolOws the money the school ows teachers
     */
    public  int updatetotalMoneySchoolOws() {
       this.totalMoneySchoolOws = getTotalMoneyEard() - getTotalMoneySpent();
       if (totalMoneySchoolOws < 0)
           return Math.abs(totalMoneySchoolOws);
       return totalMoneySchoolOws;
    }
}
