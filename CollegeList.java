import java.util.InputMismatchException;
import java.util.Scanner;

class Person {
    private String name;
    private String contactNum;

    public Person(){
        this.name = "No name";
        this.contactNum = "No contact number";
    }

    public Person(String name, String contactNum){
        this.name = name;
        this.contactNum = contactNum;
    }

    public void setName(String n){
        this.name = n;
    }

    public String getName(){
        return this.name;
    }

    public void setContactNum(String c){
        this.contactNum = c;
    }

    public String getContactNum(){
        return this.contactNum;

    }
}

class Student extends Person{
    private String program;
    private int yearLevel;

    public Student(String name, String contactNum, String program, int yearLevel){
        super(name, contactNum);
        this.program = program;
        this.yearLevel = yearLevel;
    }

    public void setProgram(String p){
        this.program = p;
    }

    public String getProgram(){
        return this.program;
    }

    public void setYearLevel(int y){
        this.yearLevel = y;
    }

    public int getYearLevel(){
        return this.yearLevel;
    }
}

class Employee extends Person{
    private double salary;
    private String department;

    public Employee(){
        super();
        this.salary = 0.0;
        this.department = "No department";
    }
    
    public Employee(String name, String contactNum, double salary, String department){
        super(name, contactNum);
        this.salary = salary;
        this.department = department;
    }

    public void setSalary(double s){
        this.salary = s;
    }

    public double getSalary(){
        return this.salary;
    }

    public void setDepartment(String d){
        this.department = d;
    }

    public String getDepartment(){
        return this.department;
    }
}

class Faculty extends Employee{
    private boolean status;

    public Faculty(){
        super();
        this.status = false;
    }
    
    public Faculty(String name, String contactNum, double salary, String department, boolean status){
        super(name, contactNum, salary, department);
        this.status = status;
    }

    public boolean isRegular(){
        return this.status;
    }
}




public class CollegeList{
    public static void main(String[] args) {

        System.out.println("\n== COLLEGE LIST PROGRAM 2 == Programmed by Xai Delos Reyes BSIT - 307\n");

        try {
            Scanner s = new Scanner(System.in);
        
        Person p = new Person();


        System.out.print("Press E for Employee, F for Faculty, or S for Student : ");
        String choice = s.nextLine();

        switch (choice.toUpperCase()) {
            case "E":

                System.out.println("\n  =================== Employee Form ======================= \n");

                System.out.print("Type employee's name, contact number, salary, and department : ");
                System.out.println("Press Enter after every input");


                
                Employee e = new Employee();
                
                String nameInput = s.nextLine();
                p.setName(nameInput);
                String contactNumInput = s.nextLine();
                p.setContactNum(contactNumInput);

                double salaryInput = s.nextDouble();
                
                s.nextLine(); // consume the newline character
                String departmentInput = s.nextLine();

                
                new Person(nameInput, contactNumInput);

                p.setName(nameInput);
                p.setContactNum(contactNumInput);
                e.setSalary(salaryInput);
                e.setDepartment(departmentInput);

                

                //new Employee(nameInput, contactNumInput, salaryInput, departmentInput);  
                

                System.out.println("\n =================== Employee Details ======================= \n");
                // Output to confirm inputdw
                System.out.println("Name: " + p.getName());
                System.out.println("Contact Number : " + p.getContactNum());
                System.out.println("Salary : " + e.getSalary());
                System.out.println("Department : " + e.getDepartment());
                break;

            case "S":

                System.out.println("\n  =================== Student Form ======================= \n");

                System.out.print("Type Student's name, contact number, program (Ex. BSIT, BSTM), and year level (integers 1 to 4) : ");
                System.out.println("\nPress Enter after every input");

                
                
                String studentNameInput = s.nextLine();
                p.setName(studentNameInput);

                String studentContactNumInput = s.nextLine();
                p.setContactNum(studentContactNumInput);

                String programInput = s.nextLine();
                int yearLevelInput = s.nextInt();
            
                p.setName(studentNameInput);
                p.setContactNum(studentContactNumInput);
                
                Student student = new Student(studentContactNumInput, studentContactNumInput, programInput, yearLevelInput);
                
                student.setProgram(programInput);
                student.setYearLevel(yearLevelInput);

                //new Employee(nameInput, contactNumInput, salaryInput, departmentInput);  
                

                System.out.println("\n =================== Student Details ======================= \n");
                // Output to confirm inputdw
                System.out.println("Name : " + p.getName());
                System.out.println("Contact Number : " + p.getContactNum());
                System.out.println("Program : " + student.getProgram());
                System.out.println("Year Level : " + student.getYearLevel());
                break;
            
            case "F":

                System.out.println("\n  =================== Faculty Form ======================= \n");

                System.out.print("Are you a regular/tenured faculty member or not (Y/N) : ");
                String yesOrNo = s.nextLine();

                switch (yesOrNo.toUpperCase()) {
                    case "Y":
                            System.out.print("Type employee's name, contact number, salary, and department : ");
                            System.out.println("Press Enter after every input");
            
                            Faculty f = new Faculty();
                            boolean isTrue = f.isRegular();
                            isTrue = true;
                            
                            String facultyNameInput = s.nextLine();
                            p.setName(facultyNameInput);
                            String facultyContactNumInput = s.nextLine();
                            p.setContactNum(facultyContactNumInput);
            
                            double facultySalaryInput = s.nextDouble();
                            
                            s.nextLine(); // consume the newline character
                            String facultyDepartmentInput = s.nextLine();
            
                            
                            new Person(facultyNameInput, facultyContactNumInput);
            
                            p.setName(facultyNameInput);
                            p.setContactNum(facultyContactNumInput);
                            f.setSalary(facultySalaryInput);
                            f.setDepartment(facultyDepartmentInput);

                            
            
                            System.out.println("\n =================== Faculty Details ======================= \n");
                            // Output to confirm inputdw
                            System.out.println("Name : " + p.getName());
                            System.out.println("Contact Number : " + p.getContactNum());
                            System.out.println("Salary : " + f.getSalary());
                            System.out.println("Department : " + f.getDepartment());
                            System.out.println("Regular Faculty : " + isTrue);
                            break;

                        case "N" :

                                System.out.print("Type employee's name, contact number, salary, and department : ");
                                System.out.println("Press Enter after every input");

                                Faculty f2 = new Faculty();
                                
                                
                                String facultyNameInput2 = s.nextLine();
                                p.setName(facultyNameInput2);
                                String facultyContactNumInput2 = s.nextLine();
                                p.setContactNum(facultyContactNumInput2);
                
                                double facultySalaryInput2 = s.nextDouble();
                                
                                s.nextLine(); // consume the newline character
                                String facultyDepartmentInput2 = s.nextLine();
                                
                                new Person(facultyNameInput2, facultyContactNumInput2);
                
                                p.setName(facultyNameInput2);
                                p.setContactNum(facultyContactNumInput2);
                                f2.setSalary(facultySalaryInput2);
                                f2.setDepartment(facultyDepartmentInput2);

                                
                
                                System.out.println("\n =================== Faculty Details ======================= \n");
                                // Output to confirm inputdw
                                System.out.println("Name : " + p.getName());
                                System.out.println("Contact Number : " + p.getContactNum());
                                System.out.println("Salary : " + f2.getSalary());
                                System.out.println("Department : " + f2.getDepartment());
                                System.out.println("Regular Faculty : " + f2.isRegular());
                            break;
                    default:
                        break;
                }
                
                

                
            default:
                break;
        }
        s.close();
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input. Program Restarted");
            main(args);
        }
        
    }
          }
