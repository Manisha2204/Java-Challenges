import java.util.Scanner;

class Student{

    //variables define
    private String name;
    private int[] marks;
    private int total;
    private double average;
    private char grade;

    //constructor
    Student(String name,int[] marks){
        this.name = name;
        this.marks = marks;
        calculatetotal();
        calculateaverage();
        calculategrade();
    }

    //total method
    public void calculatetotal(){
        total =0;
        for(int m:marks){
            total += m;
        }
    }

    //average method
    public void calculateaverage(){
        average = (double)total/marks.length;
    }

    //grade method
    public void calculategrade(){
        if(average>=90){
            grade = 'A';
        }else if (average>=75){
           grade ='B';}
        else if (average>=60){
            grade ='C';
        }else if (average>=40){
            grade ='D';
        }else{
            grade = 'F';
        }
    }


    //display details
    public void displaydetails(){
        System.out.println("Student name: "+name);
        System.out.println("Total Marks: "+total);
        System.out.println("Average Marks: "+average);
        System.out.println("Grade : "+grade);
    }


    //main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //total number of students
        System.out.print("Total number of students are: ");
        int studentcount  = sc.nextInt();
        sc.nextLine();

        //create an array to take multiple student list
        Student[] students = new Student[studentcount];

        //run loop to take student details one by one
        for (int i=0; i<studentcount; i++){

            //enter the student name
            System.out.println("Enter the details for student "+(i+1)+" : ");

            System.out.print("Enter the Student Name: ");
            String name = sc.nextLine();

            System.out.print("Enter the number of subjects: ");
            int n = sc.nextInt();

            //create a marks array to store multiple subject marks
            int[] marks = new int[n];

            //run for loop
            for(int j=0; j<n; j++){
                System.out.print("Enter marks for subject "+(j+1)+" : ");
                marks[j] = sc.nextInt();
            }
            sc.nextLine();
            students[i] = new Student(name,marks);
        }

        //display the student report
        System.out.println("=======Students Report=======");
        for (Student s:students){
            s.displaydetails();
        }

        sc.close();
    }
}