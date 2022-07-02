package Departments;

// Class declaration for Tech department that is a child class of the Super department class

public class Tech_Department extends Super_Department {

    @Override
    public String departmentName() { return "Tech Department."; }

    @Override
    public String  getTodaysWork() { return "Complete coding of Module 1.";  }

    @Override
    public String getWorkDeadline() { return "Complete by EOD.";  }

    public String getTechStackInformation() { return "Core Java.";  }

}

