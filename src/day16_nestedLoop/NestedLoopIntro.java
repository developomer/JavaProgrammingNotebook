package day16_nestedLoop;

public class NestedLoopIntro {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");
        }
        System.out.println("-----------------------------");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                for (int h = 0; h < 5; h++) {
                    System.out.println("Wooden Spoon");
                }
            }
        }


    }

}
