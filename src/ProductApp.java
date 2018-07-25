public class ProductApp {

    public static void main(String[] args) {

        Product a = new Product();
        print(a.Printer());

        Book b = new Book();
        print(b.Printer());

        Software c = new Software();
        print(c.Printer());


    }

    private static void print(String s) {
        System.out.println(s);
    }
}
