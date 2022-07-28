package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        if(salary <= 0)
            System.out.println("wrong input!");
        else if(salary < 10000)
            System.out.println(salary * 0.85f);
        else if (salary < 20000)
            System.out.println(salary * 0.82f);
        else
            System.out.println(salary * 0.8f);
    }
}
