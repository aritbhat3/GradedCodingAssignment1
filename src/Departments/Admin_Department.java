package Departments;

// Class declaration for Admin department that is a child class of the Super department class.

public class Admin_Department extends Super_Department {

    @Override
    public String departmentName() { return "Admin Department.";  }

    @Override
    public String getTodaysWork() { return "Complete your Documents Submission.";  }

    @Override
    public String getWorkDeadline() { return "Complete by EOD.";  }
}
