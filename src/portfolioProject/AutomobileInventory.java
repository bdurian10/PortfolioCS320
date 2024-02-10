package portfolioProject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AutomobileInventory {
    public static void main(String[] args) {
        try {
            // Create an instance of the Automobile class with a parameterized constructor
            Automobile myCar = new Automobile("Toyota", "Camry", "Blue", 2016, 5000, 20000, "456BS528BD549HF56");

            // Call the method to list the values
            String[] vehicleInfo = myCar.listVehicleInformation();
            for (String info : vehicleInfo) {
                System.out.println(info);
            }

            // Call the remove vehicle method to clear the variables
            String removeResult = myCar.removeVehicle();
            System.out.println(removeResult);
            String[] removeVehicleInfo = myCar.listVehicleInformation();
            for(String info : removeVehicleInfo) {
            	System.out.println(info);
            }

            // Add a new vehicle
            String addResult = myCar.addNewVehicle("Honda", "Accord", "Red", 2022, 8000, 25000, "45BDS15BF654987B3");
            System.out.println(addResult);

            // Call the list method and print the new vehicle information to the screen
            String[] newVehicleInfo = myCar.listVehicleInformation();
            for (String info : newVehicleInfo) {
                System.out.println(info);
            }

            // Update the vehicle
            String updateResult = myCar.updateVehicleAttributes("Honda", "Accord", "Green", 2023, 9000, 30000, "84A759203CL93N423");
            System.out.println(updateResult);

            // Call the listing method and print the information to the screen
            String[] updatedVehicleInfo = myCar.listVehicleInformation();
            for (String info : updatedVehicleInfo) {
                System.out.println(info);
            }

            // Display a message asking if the user wants to print the information to a file (Y or N)
            System.out.println("Do you want to print the information to a file? (Y/N)");
            Scanner scnr = new Scanner(System.in);
            String response = scnr.nextLine().trim();

            if (response.equalsIgnoreCase("Y")) {
                // Print the file to a predefined location (e.g., C:\Temp\Autos.txt)
                printToFile(updatedVehicleInfo);
                scnr.close();
            } else {
                // Indicate that a file will not be printed
                System.out.println("File will not be printed.");
                scnr.close();
            } 

        } 
        catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
        

    }

    // Method to print information to a file
    private static void printToFile(String[] vehicleInfo) {
        try (FileWriter writer = new FileWriter("C:\\Temp\\Autos.txt")) {
            for (String info : vehicleInfo) {
                writer.write(info + "\n");
            }
            System.out.println("File printed successfully.");
            writer.close();
        } 
        catch (IOException e) {
            System.out.println("Failed to print file: " + e.getMessage());
        }

    }

    
    

}