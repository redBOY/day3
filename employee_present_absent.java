package main.main.day3;

public class employee_present_absent {


    public static void main(String[] args) {
        int is_full_time = 1;
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (is_full_time == empCheck) {
            System.out.println("Employee is Present=");
        } else {
            System.out.println("Employee is Absent");
        }
    }
}

