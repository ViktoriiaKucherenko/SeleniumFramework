package org.example;

public class Main {
    public static void main(String[] args) {


        String userName = "Jack Sparrow";
        int age = 25;
        String location = "Kyiv";
        String productName = "Mickey Mouse T-shirt";
        double price = 0.99;

        /*System.out.println("Welcome "+userName+"! Congratulations on your "+age+"th birthday!\n" +
                "As a gift, you can get a "+productName+" for only $"+price+" in any store in "+location+"!");*/

        int firstValue = 100;
        int secondValue = 50;
        int addition = firstValue+secondValue;
        int subtraction = firstValue-secondValue;
        int multiplication = firstValue*secondValue;
        int division = firstValue/secondValue;

        System.out.println("Addition: "+addition+"; \nSubtraction: "+subtraction+"; \nMultiplication: "+multiplication+"; \nDivision: "+division);

        /*System.out.println(firstValue+secondValue);
        System.out.println(firstValue-secondValue);
        System.out.println(firstValue*secondValue);
        System.out.println(firstValue/secondValue);*/

    }
}