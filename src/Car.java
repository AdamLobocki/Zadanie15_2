public class Car {
    private String  type;
    private String make;
    private String model;
    private int year;
    private int mileage;
    private int vin;

    public Car() {
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", mileage=" + mileage +
                ", vin=" + vin +
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getVin() {
        return vin;
    }

    public void setVin(int vin) {
        this.vin = vin;
    }

    public Car(String type, String make, String model, int year, int mileage, int vin) {
        this.type = type;
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        this.vin = vin;
    }
}
