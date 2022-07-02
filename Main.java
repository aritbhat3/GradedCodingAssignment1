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

// Class declaration for Super department class (Super class)
class Super_Department {

    String departmentName() {
        return "Super Department.";
    }
    String  getTodaysWork() {
        return "No Work as of now.";
    }
    String getWorkDeadline() {
        return "Nil.";
    }
    String isTodayAHoliday() {
        return "Today is not a Holiday.";
    }

}

// Class declaration for Admin department that is a child class of the Super department class
class Admin_Department extends Super_Department {

    @Override
    String departmentName() {
        return "Admin Department.";
    }
    @Override
    String  getTodaysWork() {
        return "Complete your Documents Submission.";
    }
    @Override
    String getWorkDeadline() {
        return "Complete by EOD.";
    }

}

// Class declaration for HR department that is a child class of the Super department class
class Hr_Department extends Super_Department {

    @Override
    String departmentName() {
        return "HR Department.";
    }
    @Override
    String  getTodaysWork() {
        return "Fill today's worksheet and mark your attendance.";
    }
    @Override
    String getWorkDeadline() {
        return "Complete by EOD.";
    }
    String doActivity() {
        return "Team Lunch.";
    }

}

// Class declaration for Tech department that is a child class of the Super department class
class Tech_Department extends Super_Department {

    @Override
    String departmentName() {
        return "Tech Department.";
    }
    @Override
    String  getTodaysWork() {
        return "Complete coding of Module 1.";
    }
    @Override
    String getWorkDeadline() {
        return "Complete by EOD.";
    }
    String getTechStackInformation() {
        return "Core Java.";
    }

}

