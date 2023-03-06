
import java.util.*;;

public class Product1 extends Goods {

    public Product1(String name, Integer price, Integer grade) {
        this.name = name;
        this.price = price;
        this.grade = grade;

    }

    String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Integer getPrice() {
        return price;
    }

    public void setPrice() {
        this.price = price;
    }

    Integer getGrade() {
        return grade;
    }

    public void setGrade() {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "\n" + "Product{" +
                "name = " + name + 
                ", price = " + price + 
                ", grade = " +grade +
                '}';
    }

    public void filterGoods() {
        String searchName = "vysshiy";
        Integer maxPrice = 0;
        List<Product1> goodslist = getProductsList();
        for (int i = 0; i < goodslist.size(); i++) {
            if (goodslist.get(i).getName().contains(searchName)) {
                if (goodslist.get(i).getGrade().equals(1) || goodslist.get(i).getGrade().equals(2)) {
                    if (goodslist.get(i).getPrice() >= maxPrice) {
                        maxPrice = goodslist.get(i).getPrice();
                    }
                }
            }
        }
        System.out.println("\n"+"Max price of goods of 1 or 2 grade with 'vysshiy' in name = " + maxPrice+"\n");
        System.out.println("Goods with max price: ");

        for (int i = 0; i < goodslist.size(); i++) {
            if ((goodslist.get(i).getGrade().equals(1) || goodslist.get(i).getGrade().equals(2))
                    && goodslist.get(i).getPrice().equals(maxPrice)) {
                System.out.println(goodslist.get(i).getName());
            }
        }
    }

    public List<Product1> getProductsList() {
        Product1 item1 = new Product1("Black tea vysshiy", 100, 1);
        Product1 item2 = new Product1("White wine vysshiy", 1000, 2);
        Product1 item3 = new Product1("Sugar", 70, 5);
        Product1 item4 = new Product1("Flour vysshiy", 80, 2);
        Product1 item5 = new Product1("Green tea vysshiy", 100, 2);
        Product1 item6 = new Product1("Black pepper vysshiy", 90, 3);
        Product1 item7 = new Product1("Non-filtered beer", 3000, 4);

        List<Product1> prod1list = new ArrayList<>();
        prod1list.add(item1);
        prod1list.add(item2);
        prod1list.add(item3);
        prod1list.add(item4);
        prod1list.add(item5);
        prod1list.add(item6);
        prod1list.add(item7);

        return prod1list;
    }

    
}
