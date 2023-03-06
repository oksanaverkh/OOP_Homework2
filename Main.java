/**
 * Tasks from lesson 3 (Java)
 * 1. Дан массив записей: наименование товара, цена, сорт.
 * Найти наибольшую цену товаров 1го или 2го сорта среди товаров, название
 * которых содержит «высший».
 * 2. Сведения о товаре состоят из наименования, страны-производителя, веса,
 * цены, сорта.
 * Получить наименования товаров заданного сорта с наименьшей ценой.
 **/

public class Main {

    public static void main(String[] args) {

        /**
         * Task1
         */
        Product1 p1 = new Product1(null, null, null);
        System.out.println(p1.getProductsList());
        p1.filterGoods();
        System.out.println("------------------------------------------------------");

        /**
         * Task2
         */
        Product2 p2 = new Product2(null, null, null, null, null);
        System.out.println(p2.getProductsList());
        p2.filterGoods();
    }
}