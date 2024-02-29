public class Bike implements Vehicle{
    private String brand;
    private int hours;
    private final double hourlyRate = 10.0;
    Bike(){

    }

    public Bike(String brand, int hours) {
        this.brand = brand;
        this.hours = hours;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    @Override
    public double calculateRentalCost() {
        return hours * hourlyRate;
    }

    @Override
    public void displayDetails() {
        System.out.println("Bike Brand: " + brand);
        System.out.println("Hourly Rental Rate: $" + hourlyRate);
        System.out.println("Rental Cost: $" + calculateRentalCost());
    }
}
