import java.util.Vector;

 class Food {

    private static Vector<Food> menu = new Vector<>();
    private String name;
    private int price;


    public Food(String name, int price) {
        this.name = name;
        this.price = price;
        menu.add(this);
    }


    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }


    public static Vector<Food> getMenu() {
        return menu;
    }


    private static void addToMenu(Food food) {
        menu.add(food);
    }

    // چاپ اطلاعات غذا
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
