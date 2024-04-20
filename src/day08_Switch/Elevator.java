package day08_Switch;

public class Elevator {

    public static void main(String[] args) {

        int floorNumber = 2;

      /*  String result = "";
if (floorNumber >= 1 && floorNumber <= 3) {
    if (floorNumber == 0) result = "Welcome";
    else if (floorNumber == 1) result = "Floor 1 selected.\nCompanies:\n*Lobby\n*Verizon\n*Starbucks";
    else if (floorNumber == 2) result = "Floor 2 selected.\nCompanies:\n*Cydeo\n*Nasa\n*Intelsat";
    else result = "Floor 3 selected.\nCompanies:\n*Lyft\n*BofA\n*Stake House";
}else {result = "Invalid floor " + floorNumber;}
        System.out.println(result);*/

        String  result = "Invalid floor";

        if(floorNumber >= 1 && floorNumber <= 3) {

            result = "Floor " + floorNumber + " is selected. Companies: ";

            if (floorNumber == 1) {
                result += "Lobby, Verizon, Starbucks";
            } else if (floorNumber == 2) {
                result += "Cydeo, NASA, Intelsat";
            } else {
                result += "Lyft, BofA, Stake house";
            }
        }
        System.out.println(result);
    }
}
