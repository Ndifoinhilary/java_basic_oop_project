package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        var peter = new Students(1, "PeterDO", 2);
        var john = new Students(2, "JohnDo", 3);
        var mary = new Students(3, "MaryDo", 4);

        peter.updateFeesPaid(10_000);
        john.updateFeesPaid(10_000);
        mary.updateFeesPaid(10_000);
        List<Students> studentsList = new ArrayList<>();
        studentsList.add(peter);
        studentsList.add(john);
        studentsList.add(mary);

        var petet = new Teachers(1, "PeterT", 20_000);
        var johnT = new Teachers(2, "JohnT", 10_000);
        var maryT = new Teachers(3, "MaryT", 10_coo000);

        List<Teachers> teachersList = new ArrayList<>();
        teachersList.add(petet);
        teachersList.add(johnT);
        teachersList.add(maryT);


        var gbhs = new Shool(teachersList, studentsList);

        System.out.println(" Money earn by the school so far is : " +gbhs.getTotalMoneyEard());
        System.out.println(" Money spend by the school so far is :" + gbhs.getTotalMoneySpent());
        System.out.printf(" Money owe by the school so far is : %d" , gbhs.updatetotalMoneySchoolOws());


    }
}
