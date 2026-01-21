public class Car {
  private int id;
  private String brand;
  private String color;
  private int year;
  private String model;
  private String transmission;
  private double engineVolume;

  public Car(int id, String brand, String color, int year, String model, String transmission, double engineVolume) {
    this.id = id;
    this.brand = brand;
    this.color = color;
    this.year = year;
    this.model = model;
    this.transmission = transmission;
    this.engineVolume = engineVolume;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getTransmission() {
    return transmission;
  }

  public void setTransmission(String transmission) {
    this.transmission = transmission;
  }

  public double getEngineVolume() {
    return engineVolume;
  }

  public void setEngineVolume(double engineVolume) {
    this.engineVolume = engineVolume;
  }

  public Car() {

  }

}
