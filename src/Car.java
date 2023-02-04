
public class Car {
    //task1
    String brand;
    String model;
    String color;
    int year;
    String country;
    double engineVolume;

    //task2
    public Car(String brand, String model, double engineVolume, String color, int year, String country) {
        this.brand = (brand == null || brand.equals("") ? "default" : brand);
        this.model = (model == null || model.equals("") ? "default" : model);
        this.engineVolume = (engineVolume <= 0 ? 1.5 : engineVolume);
        this.color = (color == null || color.equals("") ? "белый" : color);
        this.year = (year <= 0 ? 2000 : year);
        this.country = (country == null || country.equals("") ? "default" : country);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                ", engineVolume=" + engineVolume +
                '}';
    }
}



