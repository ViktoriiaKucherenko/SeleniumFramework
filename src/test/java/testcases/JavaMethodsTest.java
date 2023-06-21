package testcases;

import org.testng.annotations.Test;

public class JavaMethodsTest {

    @Test
    public void Task1(){

        int income = 1000;

        String condition1 = "Your tax will be 10%";
        String condition2 = "Your tax will be 12%";
        String condition3 = "Your tax will be 22%";
        String condition4 = "Please call your CPA";

        if (income >= 0 && income <= 10275){
            System.out.println(condition1);
        } else if (income >= 10276 && income <= 41775) {
            System.out.println(condition2);
        } else if (income >= 41776 && income <= 89075) {
            System.out.println(condition3);
        } else {
            System.out.println(condition4);
        }
    }

    @Test
    public void Task2(){

        String department = "Marketing";

        switch (department){
            case "Sales":
                System.out.println("Sales department works from 9am to 5pm.");
                break;
            case "Purchase":
                System.out.println("Purchase department works from 8am to 2pm.");
                break;
            case "Management":
                System.out.println("Managemen department works from 10am to 3pm.");
                break;
            case "HR":
                System.out.println("HR department works from 9am to 4pm.");
                break;
            case "IT":
                System.out.println("IT department works from 11am to 6pm.");
                break;
            case "Marketing":
                System.out.println("Marketing department works from 8am to 5pm.");
        }
    }

    @Test
    public void Task3(){

        for (int hours = 0; hours < 24; hours++) {
            System.out.println(hours);
            hours++;
            
        }
        
    }
}
