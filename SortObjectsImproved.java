import java.util.*;

//students class
class Students{
    //attributes -> name,marks
    String name;
    int marks;

    //create a constructor
    Students(String name, int marks){
        this.name = name;
        this.marks = marks;
    }

    //create a tostring method
    @Override
    public String toString(){
        return name+"-"+marks;
    }
}
//employees class
class Employees{
    //attributes -> name,salary
    String name;
    double salary;

    //create a constructor
    Employees(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    //create a tostring method
    @Override
    public String toString(){
        return name+"-"+salary;
    }
}



public class SortObjectsImproved {


    //take student input

    public static List<Students> inputStudent(Scanner sc){
        System.out.print("Enter the number of Students: ");
        int n = sc.nextInt();
        sc.nextLine();

        List<Students> students = new ArrayList<>();

        for (int i=0; i<n; i++){
            System.out.print("Enter the Student name: ");
            String name = sc.nextLine();
            System.out.print("Enter the Student marks: ");
            int marks = sc.nextInt();
            sc.nextLine();
            students.add(new Students(name,marks));//create a new object every time whenever we are creating a new student
        }
        return students;
    }
    //take employee input
    public static List<Employees> inputEmployee(Scanner sc){
        System.out.print("Enter the number of Employees: ");
        int ne = sc.nextInt();
        sc.nextLine();

        List<Employees> employees = new ArrayList<>();

        for (int i=0; i<ne; i++){
            System.out.print("Enter the Employee name: ");
            String name = sc.nextLine();
            System.out.print("Enter the Employee salary: ");
            double salary = sc.nextDouble();
            sc.nextLine();
            employees.add(new Employees(name,salary));//create a new object every time whenever we are creating a new student
        }
        return employees;
    }


    //student operation
    public static void performStudent(Scanner sc, List<Students> students){
        System.out.println("Choose the operation: ");
        System.out.println("1. Sort the marks in the ascending order.");
        System.out.println("2. Sort the marks in the descending order. ");
        System.out.print("Choice: ");
        int ch = sc.nextInt();

        if(ch==1){
            //sort on ascending order
            // here, we use comparator
            students.sort(Comparator.comparingInt(s->s.marks));
            //in above, we are comparing integer-> comparingInt
            // s-> object name use to show which variable we are comparing
            System.out.println("\n Sorted students(Low->High): ");
        }else if (ch==2){
            //sort in descending order
            students.sort((s1,s2)->Integer.compare(s2.marks,s1.marks));
            System.out.println("\n Sorted studetns(High->Low): ");
        }else{
            System.out.println("Invalid choice");
            return;
        }
        for (Students s: students){
            System.out.println(s);
        }
    }
    //employee operation
    public static void performEmployee(Scanner sc, List<Employees> employees){
        System.out.println("Choose the operation: ");
        System.out.println("1. Sort the salary in the ascending order.");
        System.out.println("2. Sort the salary in the descending order. ");
        System.out.print("Choice: ");
        int ch = sc.nextInt();

        if(ch==1){
            //sort on ascending order
            // here, we use comparator
            employees.sort(Comparator.comparingDouble(e->e.salary));
            //in above, we are comparing integer-> comparingInt
            // s-> object name use to show which variable we are comparing
            System.out.println("\n Sorted employees(Low->High): ");
        }else if (ch==2){
            //sort in descending order
            employees.sort((e1,e2)->Double.compare(e2.salary,e1.salary));
            System.out.println("\n Sorted employees(High->Low): ");
        }else{
            System.out.println("Invalid choice");
            return;
        }
        for (Employees e: employees){
            System.out.println(e);
        }
    }



    //main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the dataset: ");
        System.out.println("1. Students");
        System.out.println("2. Employees");
        System.out.print("Enter your choice: ");
        int ch = sc.nextInt();
        sc.nextLine();
        if (ch==1){
            List<Students> students = inputStudent(sc);
            performStudent(sc,students);
        }else if (ch==2){
            List<Employees> employees = inputEmployee(sc);
            performEmployee(sc,employees);
        }else{
            System.out.println("Invalid Choice!");
            return;
        }
    }
}