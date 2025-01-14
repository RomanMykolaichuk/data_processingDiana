package Entities;

public class Entity {
    private String look;
    private int price;
    private String model;


    public Entity(String look, String model, int price) {
        this.look = look;
        this.model = model;
        this.price = price;
    }

    public String getLook() { return look; }

    public void setLook(String look) { this.look = look; }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "{\"image\": \""+look+"\", \"model\": \""+model+"\", \"price\": "+price+"}";
    }
}
