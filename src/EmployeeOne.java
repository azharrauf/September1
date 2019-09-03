import java.util.*;

public class EmployeeOne {
        public static void main(String[] args) {
            List<Employee> employees = new ArrayList<>();
           Map<Integer, Employee> employeemap = new HashMap<>();
//            employees.add(new Employee(1001, "azhar", 40000.0));
//        employees.add(new Employee(1002, "shams", 50000.0));
//        employees.add(new Employee(1003, "ali", 60000.0));
//        employees.add(new Employee(1004, "hadi", 70000.0));
//        employees.add(new Employee(1005, "basit", 80000.0));

             employeemap.put(1001,new Employee(1001,"shah",45000.00));
            employeemap.put(1002,new Employee(1001,"sh",45000.00));
            employeemap.put(1003,new Employee(1001,"sah",45000.00));
            employeemap.put(1004,new Employee(1001,"hah",45000.00));
            employeemap.put(1005,new Employee(1001,"s",45000.00));

            Scanner scanner = new Scanner(System.in);
            int exit = 0;
            while (exit == 0) {
                System.out.println("Please enter Employee Id");
                int empId = Integer.parseInt(scanner.nextLine());
                if(empId==0){
                    exit=1;


//                    for (Employee emp : employees){
//                        if(emp.getEmployeeId()==empId){
//                            System.out.println(emp);
//                        }
                    }else {
                System.out.println(employeemap.get(empId));
                }

            }
        }


         static class Employee {
            private int employeeId;
            private String name;
            private double salary;

            public Employee(int employeeId, String name, double salary) {
                this.employeeId = employeeId;
                this.name = name;
                this.salary = salary;
            }

            public int getEmployeeId() {
                return employeeId;
            }

            public String getName() {
                return name;
            }

            public double getSalary() {
                return salary;
            }

            @Override
            public String toString() {
                return "Employee{" +
                        "employeeId=" + employeeId +
                        ", name='" + name + '\'' +
                        ", salary=" + salary +
                        '}';
            }
        }
    }



