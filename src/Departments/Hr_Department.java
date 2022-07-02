package Departments;

// Class declaration for HR department that is a child class of the Super department class

public class Hr_Department extends Super_Department {

    @Override
    public String departmentName() { return "HR Department.";  }

    @Override
    public String  getTodaysWork() { return "Fill today's worksheet and mark your attendance.";  }

    @Override
    public String getWorkDeadline() { return "Complete by EOD.";  }

    public String doActivity() { return "Team Lunch.";  }

}