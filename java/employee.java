import java.util.*;

class employee {
    String name;
    int age;
    float salary;
    String department;
    public employee(String name,int age,float salary,String department){
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }
    }
    public static void main(String[] args) {
        System.out.println("");

        employee emp = new employee("Aman",22,45000f,"HR");
        System.out.println(emp.name);
        System.out.println(emp.age);
        System.out.println(emp.salary);
        System.out.println(emp.department);
        
    }

