package day06_ifStatements;

public class IfAndElsePractice {

    public static void main(String[] args) {

        int number = 0;

        if (number <= 45){
            System.out.println("You failed with " + number +  ".");
        }else if (number == 100){
            System.out.println("You passed with flying colors.");
        }else{
            System.out.println("You passed with " + number + ".");
        }

    }
}
