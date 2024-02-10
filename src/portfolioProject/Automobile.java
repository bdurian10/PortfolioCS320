package portfolioProject;

class Automobile {
	//private static int DEALERSHIP_CAPACITY = 200; //Example capacity of dealership's inventory
	//private static String[] inventory = new String[DEALERSHIP_CAPACITY]; //Array to store inventory
    private String make;
    private String model;
    private String color;
    private int year;
    private int mileage;
    private int estimatedValue;
    private String vin;

    // Default constructor
    public Automobile() {
        // Initialize default values, use 0 for int variables and null for strings
    	make = null;
    	model = null;
    	color = null;
    	year = 0;
    	mileage = 0;
    	vin = null;
    	estimatedValue = 0;
    }

    // Parameterized constructor
    public Automobile(String make, String model, String color, int year, int mileage, int estimatedValue, String vin) {
    	try {
    		//Check year and mileage for validity
    		//The first modern car, according to Mercedes-Benz, was created in 1885. 
    		//Any earlier year will be considered invaled
    		if(year < 1885) {
    			throw new Exception("Invalid year.");
    		}
    		
    		//If mileage is negative, the input is invalid
    		if(mileage < 0) {
    			throw new Exception("Invalid mileage");
    		}
    		//Set private variables to parameters in constructor
	        this.make = make;
	        this.model = model;
	        this.color = color;
	        this.year = year;
	        this.mileage = mileage;
	        this.estimatedValue = estimatedValue;
	        this.vin = vin;
    	}
    	catch(Exception e) {
    		System.out.println("Could Not Create Automobile: " + e.getMessage());
    	}
    }

    // Add a new vehicle method allows the user to 
    public String addNewVehicle(String make, String model, String color, int year, int mileage, int estimatedValue, String vin) {
        try {
            //Check that there is not a vehicle currently stored in private variables
        	if(this.make != null || this.model != null || this.color != null || this.year != 0 
        			|| this.mileage != 0 || this.estimatedValue != 0 || this.vin != null) {
        		throw new Exception("Remove Current Vehicle Before Attempting To Add A New Vehicle.");
        	}
        	//Validate Year
        	if(year < 1885) {
        		throw new Exception("Invalid Year.");
        	}
        	//Validate Mileage
        	if(mileage < 0) {
        		throw new Exception("Invalid Mileage.");
        	}
        	//Add new vehicle
        	this.make = make;
        	this.model = model;
        	this.color = color;
        	this.year = year;
        	this.mileage = mileage;
        	this.estimatedValue = estimatedValue;
        	this.vin = vin;
        	
            return "Vehicle Added Successfully.";
        } 
        catch (Exception e) {
            return "Failed To Add Vehicle: " + e.getMessage();
        }
    }

    // List vehicle information method
    public String[] listVehicleInformation() {
        try {
            // Return vehicle information as a string array
            return new String[]{"Make: " + make, "Model: " + model, "Color: " + color, "Year: " + year, 
            		"Mileage: " + mileage, "Estimated Value: " + estimatedValue, "VIN: " + vin};
        } 
        catch (Exception e) {
            return new String[]{"Failed To Retrieve Vehicle Information: " + e.getMessage()};
        }
    }

    // Remove a vehicle method
    public String removeVehicle() {
        try {
            // Reset private variables to default values
        	this.make = null;
        	this.model = null;
        	this.color = null;
        	this.year = 0;
        	this.mileage = 0;
        	this.estimatedValue = 0;
        	this.vin = null;
        	
            return "Vehicle Removed Successfully.";
        } 
        catch (Exception e) {
            return "Failed To Remove Vehicle: " + e.getMessage();
        }
    }

    // Update vehicle attributes method
    public String updateVehicleAttributes(String make, String model, String color, int year, int mileage, int estimatedValue, String vin) {
        try {
        	//Validate Year
        	if(year < 1885) {
        		throw new Exception("Invalid Year.");
        	}
        	//Validate Mileage
        	if(mileage < 0) {
        		throw new Exception("Invalid Mileage.");
        	}
        
        	// Update private variables with parameter values
        	this.make = make;
        	this.model = model;
        	this.color = color;
        	this.year = year;
        	this.mileage = mileage;
        	this.estimatedValue = estimatedValue;
        	this.vin = vin;
        	
            return "Vehicle Attributes Updated Successfully.";
        } 
        catch (Exception e) {
            return "Failed To Update Vehicle Attributes: " + e.getMessage();
        }
    }
}


