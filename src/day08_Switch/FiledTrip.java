package day08_Switch;

public class FiledTrip {

    public static void main(String[] args) {

        int grade = 8;

        String location = "Unknown",
                teacher = "Unknown";
        int numOfGroups = 0;

        if (grade >= 1 && grade <= 6){
            if (grade == 1){
                location = "Apple orchard";
                numOfGroups = 3;
                teacher = "Ms.Smith";
            } else if (grade == 2) {
                location = "Zoo";
                numOfGroups = 7;
                teacher = "Mr.Lee";
            } else if (grade == 3) {
                location = "Aquarium";
                numOfGroups = 5;
                teacher = "Mr.Wilson";
            } else if (grade == 4) {
                location = "Movie Theater";
                numOfGroups = 2;
                teacher = "Ms.Reyes";
            } else if (grade == 5) {
                location = "Museum";
                numOfGroups = 5;
                teacher = "Ms.Lela";
            }else { location = "Six Flags";
                numOfGroups = 8;
                teacher = "Mr.Watt";}
        }
        System.out.println("Local - " + location);
        System.out.println("Number Of Groups - " + numOfGroups);
        System.out.println("Teacher in charge - " + teacher);

    }
}
