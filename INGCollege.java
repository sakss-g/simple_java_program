import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 
import java.util.*;

public class INGCollege implements ActionListener{
    
    //creating JComponents
    private JFrame f;
    private JPanel p1, p2; // panels for academic and non academic course
    
    private JLabel jl0, jl1, jl2, jl3, jl4, jl5, jl6, jl7, jl8, jl9, jl10, jl11, jl12, jl13,
           jl14, jl15, jl16, jl17, jl18, jl19, jl20, jl21, jl22, jl23, jl24, jl25, jl26, jl27;
           
    private JTextField id_a, courseName_a, duration_a, courseLeader_a, lecturerName_a, instructorName_a, level_a, credit_a, startDate_a, completionDate_a, numberOfAssessments_a, examDate_a, prerequisites_a,
               id_n, courseName_n, duration_n, courseLeader_n, lecturerName_n, instructorName_n, level_n, credit_n, startDate_n, completionDate_n, numberOfAssessments_n, examDate_n, prerequisites_n;
               
    private JButton add_a, register_a, display_a, clear_a, add_n, register_n, clear_n, display_n, remove_n;
    
    //creating an arraylist of course
    ArrayList <Course> aList = new ArrayList <Course>(); 
    
    //creating gui in constructor
    /* In the constructor, GUI components were created and placed on a panel and then in a fram
     * 
     */
    INGCollege(){
        //add components and set size, layout and visibility
        f = new JFrame("Course Registration");
        f.setLayout(new GridLayout(1, 2));   //creating grids to add panels in frame
        f.setVisible(true);    
        f.setSize(1320, 730);  // size of frame
        
        //panel and button colors
        Color cc1 = new Color(236, 249, 236);
        Color cc2 = new Color(249, 235, 242);
        Color cc3 = new Color(255, 179, 179);
        Color cc4 = new Color(204, 255, 230);
        
        Font ff1 = new Font("Verdana", Font.PLAIN,17);        
        // panel for academic course
        p1 = new JPanel();
        p1.setLayout(null);
        p1.setBounds(0, 0, 660, 730);
        p1.setBackground(cc1);
        f.add(p1);
        
        //label for academic course heading
        jl0 = new JLabel("Academic Course");
        jl0.setFont(new Font("Georgia", Font.BOLD, 25));
        jl0.setForeground(new Color(0, 128, 64));
        p1.add(jl0);
        jl0.setBounds(225, 20, 250, 45);
        
        //label and textfield for academic course Id
        jl1 = new JLabel("Course ID:");
        id_a = new JTextField();
        p1.add(jl1);
        p1.add(id_a);
        jl1.setBounds(40, 90, 60, 30);
        id_a.setBounds(110, 90, 150, 30);
        
        //label and textfield for academic course name
        jl2 = new JLabel("Course Name:");
        courseName_a = new JTextField();
        p1.add(jl2);
        p1.add(courseName_a);
        jl2.setBounds(360, 90, 80, 30);
        courseName_a.setBounds(450, 90, 150, 30);
        
        //label and textfield for academic duration
        jl3 = new JLabel("Duration:");
        duration_a = new JTextField();
        p1.add(jl3);
        p1.add(duration_a);
        jl3.setBounds(40, 135, 60, 30);
        duration_a.setBounds(110, 135, 150, 30);
        
        //label and textfield for academic course leader
        jl4 = new JLabel("Course Leader:");
        courseLeader_a = new JTextField();
        p1.add(jl4);
        p1.add(courseLeader_a);
        jl4.setBounds(25, 210, 95, 30);
        courseLeader_a.setBounds(130, 210, 150, 30);
        
        //label and textfield for academic lecturer name
        jl5 = new JLabel("Lecturer Name:");
        lecturerName_a = new JTextField();
        p1.add(jl5);
        p1.add(lecturerName_a);
        jl5.setBounds(350, 210, 100, 30);
        lecturerName_a.setBounds(450, 210, 150, 30);
        
        //label and textfield for academic instructor name
        jl6 = new JLabel("Instructor Name:");
        instructorName_a = new JTextField();
        p1.add(jl6);
        p1.add(instructorName_a);
        jl6.setBounds(20, 255, 100, 30);
        instructorName_a.setBounds(130, 255, 150, 30);
        
        //label and textfileld for academic course starting date
        jl7 = new JLabel("Start Date:");
        startDate_a = new JTextField();
        p1.add(jl7);
        p1.add(startDate_a);
        jl7.setBounds(25, 345, 65, 30);
        startDate_a.setBounds(100, 345, 90, 30);
        
        //label and textfield for academic course completion date
        jl8 = new JLabel("Completion Date:");
        completionDate_a = new JTextField();
        p1.add(jl8);
        p1.add(completionDate_a);
        jl8.setBounds(210, 345, 100, 30);
        completionDate_a.setBounds(320, 345, 90, 30);
        
        //label and textfield for academic course exam date
        jl9 = new JLabel("Exam Date:");
        examDate_a = new JTextField();
        p1.add(jl9);
        p1.add(examDate_a);
        jl9.setBounds(440, 345, 70, 30);
        examDate_a.setBounds(520, 345, 90, 30);
        
        //label and textfield for non academic course level
        jl10 = new JLabel("Level:");
        level_a = new JTextField();
        p1.add(jl10);
        p1.add(level_a);
        jl10.setBounds(45, 390, 35, 30);
        level_a.setBounds(100, 390, 110, 30);
        
        //label and textfield for academic course credit
        jl11 = new JLabel("Credit:");
        credit_a = new JTextField();
        p1.add(jl11);
        p1.add(credit_a);
        jl11.setBounds(275, 390, 40, 30);
        credit_a.setBounds(320, 390, 110, 30);
        
        //label and textfield for academic course assessment
        jl12 = new JLabel("Number Of Assessments:");
        numberOfAssessments_a = new JTextField();
        p1.add(jl12);
        p1.add(numberOfAssessments_a);
        jl12.setBounds(30, 460, 150, 30);
        numberOfAssessments_a.setBounds(190, 460, 120, 30);
        
        //button for adding academic course
        add_a = new JButton("Add");
        add_a.setFont(ff1);
        add_a.setBackground(cc4);
        p1.add(add_a);
        add_a.setBounds(510, 460, 100, 30);
        
        //button for registering academic course
        register_a = new JButton("Register");
        register_a.setFont(ff1);
        register_a.setBackground(cc4);
        p1.add(register_a);
        register_a.setBounds(490, 510, 120, 30);
        
        //label and textfield for academic course prerequisites
        jl13 = new JLabel("Prerequisites:");
        prerequisites_a = new JTextField();
        p1.add(jl13);
        p1.add(prerequisites_a);
        jl13.setBounds(30, 510, 80, 30);
        prerequisites_a.setBounds(120, 510, 190, 30);
        
        //button to display details of academic course
        display_a = new JButton("Display");
        display_a.setFont(ff1);
        p1.add(display_a);
        display_a.setBounds(200, 610, 130, 45);
        
        //button to clear the fields of academic course
        clear_a = new JButton("Clear");
        clear_a.setFont(ff1);
        p1.add(clear_a);
        clear_a.setBounds(370, 610, 130, 45);
        
        
        //panel for non academic course
        p2 = new JPanel();
        p2.setLayout(null);
        p2.setBounds(700, 0 , 660, 730);
        p2.setBackground(cc2);
        f.add(p2);
        
        //label for non academic course heading
        jl14 = new JLabel("Non Academic Course");
        jl14.setFont(new Font("Georgia", Font.BOLD, 25));
        jl14.setForeground(new Color(128, 0, 96));
        p2.add(jl14);
        jl14.setBounds(185, 20, 330, 45);
        
        //label and textfield for non academic course ID
        jl15 = new JLabel("Course ID:");
        id_n = new JTextField();
        p2.add(jl15);
        p2.add(id_n);
        jl15.setBounds(40, 90, 60, 30);
        id_n.setBounds(110, 90, 150, 30);
        
        //label and textfield for non academic course name
        jl16 = new JLabel("Course Name:");
        courseName_n = new JTextField();
        p2.add(jl16);
        p2.add(courseName_n);
        jl16.setBounds(360, 90, 80, 30);
        courseName_n.setBounds(450, 90, 150, 30);
        
        //label and textfield for non academic duration
        jl17 = new JLabel("Duration:");
        duration_n = new JTextField();
        p2.add(jl17);
        p2.add(duration_n);
        jl17.setBounds(40, 135, 60, 30);
        duration_n.setBounds(110, 135, 150, 30);
        
        //button to remove non academic course
        remove_n = new JButton("Remove");
        remove_n.setFont(ff1);
        remove_n.setBackground(cc3);
        p2.add(remove_n);
        remove_n.setBounds(490, 135, 110, 30);
        
        //label and textfield for non academic course leader
        jl18 = new JLabel("Course Leader:");
        courseLeader_n = new JTextField();
        p2.add(jl18);
        p2.add(courseLeader_n);
        jl18.setBounds(25, 210, 95, 30);
        courseLeader_n.setBounds(130, 210, 150, 30);
        
        //label and textfield for non academic lecturer name
        jl19 = new JLabel("Lecturer Name:");
        lecturerName_n = new JTextField();
        p2.add(jl19);
        p2.add(lecturerName_n);
        jl19.setBounds(350, 210, 100, 30);
        lecturerName_n.setBounds(450, 210, 150, 30);
        
        //label and textfield for non academic instructor name
        jl20 = new JLabel("Instructor Name:");
        instructorName_n = new JTextField();
        p2.add(jl20);
        p2.add(instructorName_n);
        jl20.setBounds(25, 255, 100, 30);
        instructorName_n.setBounds(130, 255, 150, 30);
        
        //label and textfield for non academic course starting date
        jl21 = new JLabel("Start Date:");
        startDate_n = new JTextField();
        p2.add(jl21);
        p2.add(startDate_n);
        jl21.setBounds(25, 345, 65, 30);
        startDate_n.setBounds(100, 345, 90, 30);
        
        //label and textfield for non academic course completion date
        jl22 = new JLabel("Completion Date:");
        completionDate_n = new JTextField();
        p2.add(jl22);
        p2.add(completionDate_n);
        jl22.setBounds(210, 345, 100, 30);
        completionDate_n.setBounds(320, 345, 90, 30);
        
        //label and textfield for non academic course exam date
        jl23 = new JLabel("Exam Date:");
        examDate_n = new JTextField();
        p2.add(jl23);
        p2.add(examDate_n);
        jl23.setBounds(440, 345, 65, 30);
        examDate_n.setBounds(520, 345, 90, 30);
        
        //label and textfield for non academic level
        jl24 = new JLabel("Level:");
        level_n = new JTextField();
        p2.add(jl24);
        p2.add(level_n);
        jl24.setBounds(45, 390, 35, 30);
        level_n.setBounds(100, 390, 110, 30);
        
        //label and textfield for non academic credit
        jl25 = new JLabel("Credit:");
        credit_n = new JTextField();
        p2.add(jl25);
        p2.add(credit_n);
        jl25.setBounds(275, 390, 40, 30);
        credit_n.setBounds(320, 390, 110, 30);
        
        //label and textfield for non academic assessment
        jl26 = new JLabel("Number Of Assessments:");
        numberOfAssessments_n = new JTextField();
        p2.add(jl26);
        p2.add(numberOfAssessments_n);
        jl26.setBounds(30, 460, 150, 30);
        numberOfAssessments_n.setBounds(190, 460, 120, 30);
        
        //button to add non academic course
        add_n = new JButton("Add");
        add_n.setFont(ff1);
        add_n.setBackground(cc4);
        p2.add(add_n);
        add_n.setBounds(510, 460, 100, 30);
        
        //button to register non academic course
        register_n = new JButton("Register");
        register_n.setFont(ff1);
        register_n.setBackground(cc4);
        p2.add(register_n);
        register_n.setBounds(490, 510, 120, 30);
        
        //label and textfield for non academic prerequisites
        jl27 = new JLabel("Prerequisites:");
        prerequisites_n = new JTextField();
        p2.add(jl27);
        p2.add(prerequisites_n);
        jl27.setBounds(30, 510, 80, 30);
        prerequisites_n.setBounds(120, 510, 190, 30);
        
        //button to display the details of non academic course
        display_n = new JButton("Display");
        display_n.setFont(ff1);
        p2.add(display_n);
        display_n.setBounds(200, 610, 130, 45);
        
        //button to clear the text fields of non academic course
        clear_n = new JButton("Clear");
        clear_n.setFont(ff1);
        p2.add(clear_n);
        clear_n.setBounds(370, 610, 130, 45);
        
        //creating action listeners for buttons of academic course 
        add_a.addActionListener(this); 
        register_a.addActionListener(this);  
        display_a.addActionListener(this);  
        clear_a.addActionListener(this);  
        
        //creating action listeners for buttons of non academic course 
        add_n.addActionListener(this);  
        register_n.addActionListener(this);  
        display_n.addActionListener(this);  
        clear_n.addActionListener(this);  
        remove_n.addActionListener(this);  
        
        //closes the program when clicked on cross(X)
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    //event handling for different buttons
    public void actionPerformed(ActionEvent e){
        
        /* event handling for academic course class
         * storing the text fields value in a string variable
         */
        
        String aCourseId = id_a.getText();
        String aCourseName = courseName_a.getText();
        String aCourseLeader = courseLeader_a.getText();
        String aDuration = duration_a.getText();
        String aLecturerName = lecturerName_a.getText();
        
        String aLevel = level_a.getText();
        String aCredit = credit_a.getText();
        String aAssessments = numberOfAssessments_a.getText();
        String aStartDate = startDate_a.getText();
        String aCompletionDate = completionDate_a.getText();
        
        //initializing to count 
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        
        //event handling for add button of academic course 
        if(e.getSource() == add_a){
            for(Course each: aList){  //loop goes in the arrylist and checks whether the course id exists or not
                if(each.getCourseID().equals(id_a.getText())){ 
                    JOptionPane.showMessageDialog(f, "Course has been already added");
                    count1 = 1;  // if the course exists count is set to 1
                } 
            }
            // checks whether the required fields are filled or not and returns message if found empty
            if(level_a.getText().isEmpty() || credit_a.getText().isEmpty() || id_a.getText().isEmpty() || courseName_a.getText().isEmpty() || numberOfAssessments_a.getText().isEmpty() || duration_a.getText().isEmpty()){
                JOptionPane.showMessageDialog(f, "Please fill the required fields : Course ID, Course Name, Level, Credit, Number Of Assessments and Duration", "Alert", JOptionPane.WARNING_MESSAGE);    
            }
            // checks the count value and if 0 then adds the course
            if(count1 == 0){
                // try runs a block of code and checks errors with in itself
                try{
                    int credit = Integer.parseInt(credit_a.getText());
                    int assessment = Integer.parseInt(numberOfAssessments_a.getText());
                    int duration = Integer.parseInt(duration_a.getText());
                    
                    // creating object of Academic Course class
                    AcademicCourse ac = new AcademicCourse(aLevel, credit, aCourseId, aCourseName, assessment, duration);
                    aList.add(ac); // adding to the arraylist
                    JOptionPane.showMessageDialog(f, "Course added");
                }
                //handles the error found in try
                catch(Exception ex){
                    JOptionPane.showMessageDialog(f, "Please enter the duration, number of assessment and credit as a whole number"+ "    " + ex, "Error",JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        
        //event handling for register button of academic course
        if(e.getSource() == register_a){
            int counter = 0;
            // checks for empty text fields and displays an error message if empty
            if(id_a.getText().isEmpty() ||courseLeader_a.getText().isEmpty() || lecturerName_a.getText().isEmpty()){
                JOptionPane.showMessageDialog(f, "Please fill the required fields : Course ID, Course Leader and Lecturer Name", "Alert", JOptionPane.WARNING_MESSAGE);    
            }   
            else{
                //loop goes inside arraylist and checks if course id exists or not and also checks instance
                for(Course each : aList){
                    if(each.getCourseID().equals(id_a.getText()) && each instanceof AcademicCourse){ 
                        AcademicCourse register_ac = (AcademicCourse)each;    // down casting 
                        if(register_ac.getIsRegistered() == true){ // if the course id already exists, display a message to notify 
                           JOptionPane.showMessageDialog(f, "Course exists");  
                           counter = 1; 
                           break;
                        }
                        else if(register_ac.getIsRegistered() == false){ // if course id does not exist, registers the course
                            register_ac.register(aCourseLeader, aLecturerName, aStartDate, aCompletionDate); //register method from academic course class
                            JOptionPane.showMessageDialog(f, "Course registered");
                            counter = 1;
                            break;
                        }
                    }
                }
                // if the course does not exist in arraylist, displays invalid message
                if(counter == 0){
                    JOptionPane.showMessageDialog(f, "Please input valid course id or add the academic course", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }    
        
        //event handling for display button of academic course 
        if(e.getSource() == display_a){
            //loop goes inside arraylist
            for (Course each : aList){
                if(each instanceof AcademicCourse){  // checks for instance
                    AcademicCourse display_ac = (AcademicCourse)each;  //down casting
                    System.out.println("*************Displaying for Academic Course*************");
                    System.out.println();
                    display_ac.display();  //display method from academic course class
                    System.out.println();
                }
            }
        }
        
        //empties all the text fields
        if(e.getSource() == clear_a){
            id_a.setText("");
            courseName_a.setText("");
            duration_a.setText("");
            courseLeader_a.setText("");
            lecturerName_a.setText("");
            instructorName_a.setText("");
            startDate_a.setText("");
            completionDate_a.setText("");
            examDate_a.setText("");
            level_a.setText("");
            credit_a.setText("");
            numberOfAssessments_a.setText("");
            prerequisites_a.setText("");
        }
        
        /* event handling for non academic course class
         * storing the text fields value in a string variable
         */
        
        String nCourseId = id_n.getText();
        String nCourseName = courseName_n.getText();
        String nCourseLeader = courseLeader_n.getText();
        String nDuration = duration_n.getText();
        String nLecturerName = lecturerName_n.getText();
        String nInstructorName = instructorName_n.getText();
        
        String nLevel = level_n.getText();
        String nCredit = credit_n.getText();
        String nAssessments = numberOfAssessments_n.getText();
        String nStartDate = startDate_n.getText();
        String nCompletionDate = completionDate_n.getText();
        String nExamDate = examDate_n.getText();
        String nPrerequisites = prerequisites_n.getText();
        
        //event handling for add button of non academic course
        if(e.getSource() == add_n){
            for(Course each_n: aList){   //loop goes in the arrylist and checks whether the course id exists or not
                if(each_n.getCourseID().equals(id_n.getText())){
                    JOptionPane.showMessageDialog(f, "Course has been already added");
                    count2 = 1;  // if the course exists count is set to 1
                } 
            }
            // checks whether the required fields are filled or not and returns message if found empty
            if(prerequisites_n.getText().isEmpty() || id_n.getText().isEmpty() || courseName_n.getText().isEmpty() || duration_n.getText().isEmpty()){
                JOptionPane.showMessageDialog(f, "Please fill the required fields : Course ID, Course Name, Prerequisite and Duration", "Alert", JOptionPane.WARNING_MESSAGE);    
            }
            // checks the count value and if 0 then adds the course
            if(count2 == 0){
                // try runs a block of code and checks for error with in itself
                try{
                    int credit = Integer.parseInt(credit_n.getText());
                    int assessment = Integer.parseInt(numberOfAssessments_n.getText());
                    int duration = Integer.parseInt(duration_n.getText());
                    
                    // creating objcet of Non Academic Course class
                    NonAcademicCourse nac = new NonAcademicCourse(nCourseId, nCourseName, duration, nPrerequisites);
                    aList.add(nac);
                    JOptionPane.showMessageDialog(f, "Course added");
                }
                //handles the error found in try
                catch(Exception ex){
                    JOptionPane.showMessageDialog(f, "Please enter the duration, number of assessment and credit as a whole number" + "    " + ex, "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        
        //event handling for register button of non academic course
        if(e.getSource() == register_n){
            int counter = 0;
            // checks for empty text fields and displays an error message if empty
            if(id_n.getText().isEmpty() ||courseLeader_n.getText().isEmpty() || instructorName_n.getText().isEmpty() || startDate_n.getText().isEmpty() || completionDate_n.getText().isEmpty() || examDate_n.getText().isEmpty()){
                JOptionPane.showMessageDialog(f, "Please fill the required fields : Course ID, Course Leader, Instructor Name, Starting Date, Completion Date and Exam Date", "Alert", JOptionPane.WARNING_MESSAGE);    
            }   
            else{
                //loop goes inside arraylist and checks if course id exists or not and also checks instance
                for(Course each_n : aList){
                    if(each_n.getCourseID().equals(id_n.getText()) && each_n instanceof NonAcademicCourse){
                        NonAcademicCourse register_nac = (NonAcademicCourse)each_n;
                        if(register_nac.getIsRegistered() == true){  // if the course id already exists, display a message to notify
                           JOptionPane.showMessageDialog(f, "Course exists"); 
                           counter = 1;
                           break;
                        }
                        else if(register_nac.getIsRegistered() == false){  // if course id does not exist, registers the course
                            register_nac.register(nCourseLeader, nInstructorName, nStartDate, nCompletionDate, nExamDate);  //register method from non academic course class
                            JOptionPane.showMessageDialog(f, "Course registered");
                            counter = 1;
                            break;
                        }
                    }
                }
                // if the course does not exist in arraylist, displays invalid message
                if(counter == 0){
                    JOptionPane.showMessageDialog(f, "Please input valid course id or add the course", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }  
        
        //event handling for display button of non academic course 
        if(e.getSource() == display_n){
            //loop goes inside arraylist
            for (Course each_n : aList){
                if(each_n instanceof NonAcademicCourse){  // checks for instance
                    NonAcademicCourse display_nac = (NonAcademicCourse)each_n;
                    System.out.println("*************Displaying for Non Academic Course*************");
                    System.out.println();
                    display_nac.display();   //display method from non academic course class
                    System.out.println();
                }
            }    
        }
        
        //event handling for remove button of non academic course 
        if(e.getSource() == remove_n){
            //checks for empty text fields and displays an error message if empty
            if(id_n.getText().isEmpty() ||courseLeader_n.getText().isEmpty() || instructorName_n.getText().isEmpty() || startDate_n.getText().isEmpty() || completionDate_n.getText().isEmpty() || examDate_n.getText().isEmpty()){
                JOptionPane.showMessageDialog(f, "Please fill the required fields : Course ID, Course Leader, Instructor Name, Starting Date, Completion Date and Exam Date", "Alert", JOptionPane.WARNING_MESSAGE);    
            } 
            else{
                count3 += 1;
                // loop goes inside arraylist
                for(Course each_n : aList){
                    if(id_n.getText().equals(each_n.getCourseID()) && each_n instanceof NonAcademicCourse){  // checks if course exists and also checks instance
                        //down casting
                        NonAcademicCourse remove_nac = (NonAcademicCourse)each_n;     
                        aList.remove(each_n.getCourseID());
                        remove_nac.remove();  //remove method from non academic course class
                        
                        //checks if a course has been removed before
                        if(count3 == 1){
                            JOptionPane.showMessageDialog(f, "Course has been removed");  
                        }
                        else{
                            break;
                        }
                    }
                }
            }
        }
        
        //empties all the text fields
        if(e.getSource() == clear_n){
            id_n.setText("");
            courseName_n.setText("");
            duration_n.setText("");
            courseLeader_n.setText("");
            lecturerName_n.setText("");
            instructorName_n.setText("");
            startDate_n.setText("");
            completionDate_n.setText("");
            examDate_n.setText("");
            level_n.setText("");
            credit_n.setText("");
            numberOfAssessments_n.setText("");
            prerequisites_n.setText("");
        }
    }
    
    // main method to call the constructor
    public static void main(String args[]){
        INGCollege call = new INGCollege();
    }
}