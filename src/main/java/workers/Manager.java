package workers;


public class Manager extends Employee {

        public static void increaseSalary( Employee[] empl, int amount) {
            for (Employee employee : empl) {
                if (!(employee instanceof Manager)) {
                    int newSalary = employee.getSalaryLevel() + amount;
                    employee.setSalaryLevel(newSalary);

            }
        }
    }
}