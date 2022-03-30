public class NonAcademicCourse extends Course{
    String instructorName, startingDate, completionDate, examDate, prerequisite, newInstructor;
    boolean isRegistered, isRemoved;
    // creation of constructor that accepts parameters for different data types
    public NonAcademicCourse(String courseID, String courseName, int duration, String prerequisite){
        super(courseID, courseName, duration);   // calling parameters from parent class
        this.prerequisite=prerequisite;
        startingDate="";
        completionDate="";
        examDate="";
        isRegistered=false;
        isRemoved=false;
    }
    public String getInstructorName(){   //accessor method to return instructorName
        return instructorName;
    }
    public String getStartingDate(){   //accessor method to return startingDate
        return startingDate;
    }
    public String getCompletionDate(){   //accessor method to return completionDate
        return completionDate;
    }
    public String getExamDate(){   //accessor method to return examDate
        return examDate;
    }
    public String getPrerequisite(){   //accessor method to return prerequisite
        return prerequisite;
    }
    public boolean getIsRegistered(){   //accessor method to return isRegistered
        return isRegistered;
    }
    boolean getIsRemoved(){  //accessor method to return isRemoved
        return isRemoved;
    }
    //setter method for instructor name to help modify the instructorName
    public void setInstructorName(String newInstructor){
        if(isRegistered==false){ // if truth value is false assigns instructorNAme as newInstructor
            instructorName=newInstructor;
        }    
        else{  // if truth value is true prints a suitable text
            System.out.println(" It is not possible to change the instructor name");
        }
    }
    // method to register a course 
    public void register(String courseLeader, String instructorName, String startingDate, String completionDate, String examDate){
        if(isRegistered==false){  // if the truth value is false it sets the value for non academic course
            this.setInstructorName(instructorName);
            this.isRegistered=true;
            this.courseLeader=courseLeader;
            this.startingDate=startingDate;
            this.completionDate=completionDate;
            this.examDate=examDate;
        }else{  // if truth value is true it displays a suitable text
            System.out.println("The course has been already registered");    
        }
    } 
    // method to remove course leader
    public void remove(){
        if(isRemoved==true){ // if the truth value is removed it displays a suitable text
            System.out.println("The course has been already removed");
        }else{ // if truth value is false it assigns value as empty and changes isRegistered and isRemoved status
            super.setCourseLeader("");
            this.instructorName="";
            this.startingDate="";
            this.completionDate="";
            this.examDate="";
            this.isRegistered=false;
            this.isRemoved=true;
        }
    }
    public void display(){  //method to display output
        super.display();   // calls display method from parent class
        if(isRegistered == true){  // if truth value is true then it prints instructorName, startingDate, completionDate, examDate
            System.out.println("The instructor's name is: " +instructorName);
            System.out.println("The starting date of the course is: "+startingDate);
            System.out.println("The completion date of the course is: "+completionDate);
            System.out.println("The exam date is: "+examDate);
        }
    }
}