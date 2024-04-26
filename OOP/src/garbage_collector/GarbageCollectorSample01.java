package garbage_collector;

public class GarbageCollectorSample01 {
    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.name = "bilgeadam";

        System.out.println("name : " + employee.name);

        employee = null;

       // System.out.println("name : " + employee.name); Null Pointer
       // employee.name = "bilgeadam2"; Null Pointer

        employee = new Employee();
        employee.name = "bilgeadam";
        System.out.println("name: " + employee.name);
    }
}
