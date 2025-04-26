public class Employee {
     String name;
     String position;
     static String companyName = "vivas" ;
     static int employeeCount = 0;

     public Employee(String name, String position) {
         this.name = name;
         this.position = position;
         employeeCount++;
     }

     public void displayInfo() {
         System.out.println("Name: " + name + " Position: " + position + " Company Name: " + companyName);
         System.out.println("Employee Count: " + employeeCount);
         }
}
