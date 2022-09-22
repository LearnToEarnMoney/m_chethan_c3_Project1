public class Item {
    private String name;
    private int price;

    private boolean check;
    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    @Override
    public String toString(){
        return  name + ":"
                + price
                + "\n"
                ;
    }

    public Integer getPrice() {return price;}

    public boolean isCheck() {
    return check;
    }
}
