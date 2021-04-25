package poc.wordtopdf.poi;

import java.util.ArrayList;
import java.util.List;

public class SampleData {
    private String id;
    private String itemName;
    private int quantity;
    private double price;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public SampleData(String id, String itemName, int quantity, double price) {
        this.id = id;
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
    }

    public static List<SampleData> generateSampleData() {
        List<SampleData> result=new ArrayList<>();
        result.add(new SampleData("1","Test Item 1", 3, 33D));
        result.add(new SampleData("2","Test Item 2", 2, 33D));
        result.add(new SampleData("3","Test Item 3", 1, 33D));
        return result;
    }
}
