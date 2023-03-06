package Homework3;

public class Main2 {

    public static void main(String[] args) {

        FixedSalaryWorker id1235 = new FixedSalaryWorker("Богдан", 300);
        HourlyWageWorker id7149 = new HourlyWageWorker("Максим", 200, 39.35);

        id1235.salary();
        id7149.salary();
    }
}
