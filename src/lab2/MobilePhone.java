package lab2;

public class MobilePhone {
    private String brand;
    private String model;
    private Integer memory;
    private Double price;
    private Boolean isNew;
    private Colour colour;

    public MobilePhone() {
    }

    public MobilePhone(String model, String brand, Integer memory, Double price, Boolean isNew, Colour colour) {
        this.model = model;
        this.brand = brand;
        this.memory = memory;
        this.price = price;
        this.isNew = isNew;
        this.colour = colour;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getMemory() {
        return memory;
    }

    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Boolean getNew() {
        return isNew;
    }

    public void setNew(Boolean aNew) {
        isNew = aNew;
    }

    public Colour getColour() {
        return colour;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "MobilePhone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", memory=" + memory +
                ", price=" + price +
                ", isNew=" + isNew +
                ", colour=" + colour +
                '}';
    }
}
