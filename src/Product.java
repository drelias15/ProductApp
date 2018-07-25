import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Product {

    private String code;
    private String description;
    private double price;
    protected static int count = 0; // a protected static variable
    NumberFormat formatter = new DecimalFormat("#0.00");

    public Product() {
        code = "";
        description = "";
        price = 0;

    }

    public String Printer() {
        return "This is Product class";
    }

    // Get and set accessors for the code, description, and price instance variables

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static void setCount(int count) {
        Product.count = count;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Code:                " + code + "\n" +

                "Description:        " + description + "\n" +
                "Price:              " + this.getFormattedPrice(price) + "\n";
    }

    private String getFormattedPrice(double price) {
        String formatted = formatter.format(price);
        return formatted;
    }

    // Create public access for the count variable
    public static int getCount() {
        count++;
        return count;
    }
}