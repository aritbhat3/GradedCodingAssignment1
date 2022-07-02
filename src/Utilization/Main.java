package Utilization;
import Departments.Admin_Department;
import Departments.Hr_Department;
import Departments.Tech_Department;

public class Main {
    public static void main(String args[]) {

        //Code block calling for Admin Department object and all its functions.
        Admin_Department adObj = new Admin_Department();
        System.out.println("Welcome to "+adObj.departmentName());
        System.out.println(adObj.getTodaysWork());
        System.out.println(adObj.getWorkDeadline());
        System.out.println(adObj.isTodayAHoliday()+"\n");

        //Code block calling for HR Department object and all its functions.
        Hr_Department hrObj = new Hr_Department();
        System.out.println("Welcome to "+hrObj.departmentName());
        System.out.println(hrObj.doActivity());
        System.out.println(hrObj.getTodaysWork());
        System.out.println(hrObj.getWorkDeadline());
        System.out.println(hrObj.isTodayAHoliday()+"\n");

        //Code block calling for Tech Department object and all its functionalities.
        Tech_Department tcObj = new Tech_Department();
        System.out.println("Welcome to "+tcObj.departmentName());
        System.out.println(tcObj.getTodaysWork());
        System.out.println(tcObj.getWorkDeadline());
        System.out.println(tcObj.getTechStackInformation());
        System.out.println(tcObj.isTodayAHoliday());

    }
}
