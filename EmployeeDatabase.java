import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Employee class
class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }

    // Setters for updates
    public void setName(String name) { this.name = name; }
    public void setDepartment(String department) { this.department = department; }
    public void setSalary(double salary) { this.salary = salary; }

    @Override
    public String toString() {
        return "ID: " + id +
                ", Name: " + name +
                ", Department: " + department +
                ", Salary: " + String.format("%.2f", salary);
    }
}

// Main class
public class EmployeeDatabase {
    public static void main(String[] args) {
        Map<Integer, Employee> database = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Employee Database ===");
            System.out.println("1. Add Employee");
            System.out.println("2. Search Employee by ID");
            System.out.println("3. Remove Employee");
            System.out.println("4. Display All Employees");
            System.out.println("5. Exit");
            System.out.println("6. Update Employee (Multi-field)");
            System.out.print("Enter choice: ");

            int choice = -1;
            try {
                choice = Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Enter a number 1-6.");
                continue;
            }

            switch (choice) {
                case 1: // Add
                    try {
                        System.out.print("Enter ID (integer): ");
                        int id = Integer.parseInt(sc.nextLine().trim());
                        if (database.containsKey(id)) {
                            System.out.println("Employee ID already exists!");
                            break;
                        }

                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter Department: ");
                        String dept = sc.nextLine();

                        System.out.print("Enter Salary (number): ");
                        double salary = Double.parseDouble(sc.nextLine().trim());

                        Employee emp = new Employee(id, name, dept, salary);
                        database.put(id, emp);
                        System.out.println("Employee added successfully!");
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid number format. Employee not added.");
                    }
                    break;

                case 2: // Search
                    try {
                        System.out.print("Enter Employee ID: ");
                        int searchId = Integer.parseInt(sc.nextLine().trim());
                        Employee found = database.get(searchId);
                        System.out.println(found != null ? "Employee Found: " + found : "Employee not found!");
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid ID.");
                    }
                    break;

                case 3: // Remove
                    try {
                        System.out.print("Enter Employee ID to remove: ");
                        int removeId = Integer.parseInt(sc.nextLine().trim());
                        System.out.println(database.remove(removeId) != null
                                ? "Employee removed successfully!"
                                : "Employee not found!");
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid ID.");
                    }
                    break;

                case 4: // Display All
                    if (database.isEmpty()) {
                        System.out.println("No employees in database.");
                    } else {
                        System.out.println("\nAll Employees:");
                        for (Employee e : database.values()) {
                            System.out.println(e);
                        }
                    }
                    break;

                case 5: // Exit
                    System.out.println("Exiting... Goodbye!");
                    sc.close();
                    return;

                case 6: // Update (multi-field)
                    try {
                        System.out.print("Enter Employee ID to update: ");
                        int updateId = Integer.parseInt(sc.nextLine().trim());
                        Employee u = database.get(updateId);

                        if (u == null) {
                            System.out.println("Employee not found!");
                            break;
                        }

                        System.out.println("Leave a field blank to keep it unchanged.");

                        System.out.print("New Name (current: " + u.getName() + "): ");
                        String newName = sc.nextLine();
                        if (!newName.trim().isEmpty()) u.setName(newName.trim());

                        System.out.print("New Department (current: " + u.getDepartment() + "): ");
                        String newDept = sc.nextLine();
                        if (!newDept.trim().isEmpty()) u.setDepartment(newDept.trim());

                        System.out.print("New Salary (current: " + String.format("%.2f", u.getSalary()) +
                                ") — leave blank to keep: ");
                        String salaryInput = sc.nextLine().trim();
                        if (!salaryInput.isEmpty()) {
                            try {
                                double newSalary = Double.parseDouble(salaryInput);
                                u.setSalary(newSalary);
                            } catch (NumberFormatException e) {
                                System.out.println("Invalid salary. Keeping previous salary.");
                            }
                        }

                        System.out.println("Employee updated: " + u);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid ID.");
                    }
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
