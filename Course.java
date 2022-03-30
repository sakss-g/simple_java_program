public class Course{
    String courseID, courseName, courseLeader;
    int duration;
    //creating constructor that accepts parametes of different data types
    public Course(String courseID, String courseName, int duration){   
        this.courseID=courseID;
        this.courseName=courseName;
        this.duration=duration;
        this.courseLeader=""; 
    }
    public String getCourseID(){ //accessor/getter method to return the value of courseID
        return courseID;
    }
    public String getCourseName(){ //accessor method to returm the value of courseName
        return courseName;
    }
    public String getCourseLeader(){  //accessor method to return the value of courseLeader
        return courseLeader;
    }
    public int getDuration(){     //accessor method to return the value of duration
        return duration;
    }
    //setter for courseLeader to help modify the name of courseLeader
    public void setCourseLeader(String newName){
        this.courseLeader=newName;
    }
    public void display(){  //method to display the output 
        System.out.println("The course ID is: "+courseID);
        System.out.println("The course name is: "+courseName);
        System.out.println("The duration of the course is: "+duration);
            if(courseLeader!=""){
                System.out.println("The course leader is: "+courseLeader);
            }
    }
}