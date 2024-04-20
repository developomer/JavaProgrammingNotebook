package day33_abstraction;

import day32_finalKeyword.personTask.Person;

import java.time.LocalDate;

public final class CydeoDevStudent extends Person {

    private final String ID;
    private String batchName;
    private int batchNumber;

    public static final String programmingLanguage;


    public CydeoDevStudent(String name, char gender, LocalDate dateOfBirth, String ID, String batchName, int batchNumber) {
        super(name, gender, dateOfBirth);
        if (getAge() < 18){
           System.err.println("Cydeo Developer student must be at least 18 years old");
            System.exit(1);
        }
        this.ID = ID;
        setBatchName(batchName);
        setBatchNumber(batchNumber);
    }

    static {
        programmingLanguage = "Java";
    }


    public String getID() {
        return ID;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {

        if ( batchName.equalsIgnoreCase("zero to hero") || batchName.equalsIgnoreCase("Alumni Dev") ){
            this.batchName = batchName;
        }else {
            System.err.println("Invalid batch name: " + batchName + " \nNo such a batch at Cydeo");
            System.exit(1);
        }


    }

    public int getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(int batchNumber) {
        if (batchNumber <= 0) {
            System.err.println("Invalid batch number: " + batchNumber + "\nBatch number can not be negative or zero");
            System.exit(1);
        }

        this.batchNumber = batchNumber;
    }

    public void eat(){
System.out.println(getName() + " is eating " + programmingLanguage);
    }

    public void drink(){
  System.out.println(getName() + " is drinking " + programmingLanguage);
    }

    public void sleep(){
           System.out.println(getName()+" does not need to sleep");
    }

    public String toString() {
        return "CydeoDevStudent{" +
                "name='" + getName() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", dateOfBirth=" + getDateOfBirth() +
                ", ID='" + ID + '\'' +
                ", batchName='" + batchName + '\'' +
                ", batchNumber=" + batchNumber +
                '}';
    }
}

/*
1. Create a sub class of Person (from day32 package) named CydeoDevStudent (final)
			Extra Variables:
				id (final), batchName, batchNumber, programmingLanguage(static & final)

			Extra conditions:
					1. Age has to be at least 18 years old
					2. batchName can ONLY be set to "Zero to Hero" or "Alumni Dev"
					3. batchNumber can not be set to zero or negative

			Override the eat() & drink() methods and include the programmingLanguage variable in methods body

			Override the toString Method and include the id, batchName, batchNumber variables
 */