package school.management.system;

public class School {

    private int id;
    private String name;
    private int grade;
    private  int feesPaid;
    private  int feesTotal;
    /**
     * @param id the id of the student
     *    the student class
     */
    public School(int id, String name, int grade) {
        this.feesPaid = 0;
        this.feesTotal = 20_0000;
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     * set field
     *
     * @param feesPaid update the fees paid when a student paid fees
     */
   public void updateFeesPaid(int feesPaid) {
       this.feesPaid += feesPaid;
   }
}
