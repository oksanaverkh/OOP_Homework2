import java.util.*;

public class Product2 extends Goods {

    String country;
    Double weight;

    public Product2(String name, String country, Double weight, Integer price, Integer grade) {
        this.name = name;
        this.country = country;
        this.weight = weight;
        this.price = price;
        this.grade = grade;

    }

    String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "\n" + "Product{" +
                "name = " + name +
                ", country = " + country +
                ", weight = " + weight +
                ", price = " + price +
                ", grade = " + grade +
                '}';
    }

    public List<Product2> getProductsList() {
        Product2 item1 = new Product2("Red wine", "Italy", 1.0, 750, 1);
        Product2 item2 = new Product2("White wine", "France", 0.75, 900, 1);
        Product2 item3 = new Product2("Dark beer", "Germany", 0.5, 200, 2);
        Product2 item4 = new Product2("Light beer", "Netherlands", 0.5, 200, 2);
        Product2 item5 = new Product2("Non-filtered beer", "Belgium", 0.33, 300, 2);
        Product2 item6 = new Product2("Apple cider", "Belgium", 0.5, 200, 2);
        Product2 item7 = new Product2("White rum", "Cuba", 1.0, 1750, 3);
        Product2 item8 = new Product2("Black rum", "Cuba", 1.0, 1550, 3);

        List<Product2> prod2list = new ArrayList<>();
        prod2list.add(item1);
        prod2list.add(item2);
        prod2list.add(item3);
        prod2list.add(item4);
        prod2list.add(item5);
        prod2list.add(item6);
        prod2list.add(item7);
        prod2list.add(item8);

        return prod2list;
    }

    @Override
    public void filterGoods() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter goods grade: ");
        int grade = scanner.nextInt();
        List<Product2> goodslist = getProductsList();

        Integer minPrice = Integer.MAX_VALUE;
        List<String> minPriceGoods = new ArrayList<>();

        for (int i = 0; i < goodslist.size(); i++) {
            if (goodslist.get(i).getGrade().equals(grade)) {
                if (goodslist.get(i).getPrice() <= minPrice) {
                    minPrice = goodslist.get(i).getPrice();
                }
            }
        }

        for (int i = 0; i < goodslist.size(); i++) {
            if (goodslist.get(i).getPrice().equals(minPrice) && goodslist.get(i).getGrade().equals(grade)) {
                minPriceGoods.add(goodslist.get(i).getName());
            }
        }

        System.out.println("\n"+"Min price of goods of " + grade + " grade = " + minPrice);
        System.out.println("Goods with min price in " + grade + " grade: " + minPriceGoods.toString());

    }
}
