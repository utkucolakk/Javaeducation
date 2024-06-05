package function_samples;

import java.util.function.Function;

public class FunctionSample03 {
    public static void main(String[] args) {
        Function<Employee, String> employeeStringName = Employee::getName;
        Employee employee = new Employee("utkucolakk", 24);
        System.out.println(employeeStringName.apply(employee));
    }


    

}
