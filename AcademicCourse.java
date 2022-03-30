public class AcademicCourse extends Course{
    String lecturerName, level, startingDate,completionDate;
    int numberOfAssessments,credit;
    boolean isRegistered;
    // creation of constructor that accepts parameters for different data types
    public AcademicCourse(String level, int credit, String courseID, String courseName, int numberOfAssessments, int duration){
        super(courseID, courseName, duration); // calling parameters from parent class
        this.level=level;
        this.credit=credit;
        this.numberOfAssessments=numberOfAssessments;
        lecturerName="";
        startingDate="";
        completionDate="";
        isRegistered= false;
    }
    //accessor/getter method
    public String getLecturerName(){    //accessor method to return lecturerName
        return lecturerName;    
    }
    public String getLevel(){       // accessor method to return level
        return level;
    }
    public int getCredit(){     // accessor method to return credit
        return credit;
    }
    public String getStartingDate(){     // accessor method to return startingDate
        return startingDate;
    }
    public String getCompletionDate(){    // accessor method to return completionDate
        return completionDate;
    }
    public int getNumberOfAssessments(){   // accessor method to return numberOfAssessments
        return numberOfAssessments;
    }
    public boolean getIsRegistered(){     // accessor method to return isRegistered
        return isRegistered;
    }
    //mutator/setter method for lecturerName to help modify lecturerName
    public void setLecturerName(String lecturerName){
        this.lecturerName=lecturerName;    
    }
    //mutator method for numberOfAssessments to help modify numberOfAssessments
    public void setNumberOfAssessments(int numberOfAssessments){
        this.numberOfAssessments=numberOfAssessments;
    }
    // method to register a course 
    public void register(String courseLeader, String lecturerName, String startingDate, String completionDate){
        if (isRegistered==true){  //if value is true the prints courseLeader, startingDate, completionDate
            System.out.println("The course has been already registered");
            System.out.println("The course leader is: "+courseLeader);
            System.out.println("The starting date of the coure in months is: "+startingDate);
            System.out.println("The completion date of the course is: "+completionDate);
        }else{   // if value is false then it sets values for academic course
            super.setCourseLeader(courseLeader);
            this.lecturerName=lecturerName;
            this.startingDate=startingDate;
            this.completionDate=completionDate;
            this.isRegistered=true;
        }
    }
    public void display(){ //method to display the output
        super.display(); // calls display method from parent class
            if (isRegistered==true){ // checks the truth value and prints the output
                System.out.println("The lecturer's name is: "+lecturerName);
                System.out.println("The level is: "+level);
                System.out.println("The credit is: "+credit);
                System.out.println("The starting date of the course is: "+startingDate);
                System.out.println("The completion date of the course is: "+completionDate);
                System.out.println("The number of assessment is: "+numberOfAssessments);
            }
    }
}