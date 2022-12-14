import classes.Buyer;
import classes.Discount;
import enums.Goods;
import enums.Markets;
import service.impl.MarketServiceImpl;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        MarketServiceImpl market = new MarketServiceImpl();
        Discount discount = new Discount();
        Buyer buyer = new Buyer();

        try {
            while (true) {
                System.out.println("\n1-->Get all goods" +
                        "\n2-->Get all markets" +
                        "\n3-->Get cheque" +
                        "\n4-->Create discount" +
                        "\n5-->Get all discounts" +
                        "\n6-->Get discount" +
                        "\n7-->Create buyer" +
                        "\n8-->Get all buyers");
                System.out.print("\nWrite number: ");
                int press = sc.nextInt();
                switch (press) {
                    case 1 -> market.getAllGoods(Goods.values());
                    case 2 -> market.getAllMarkets(Markets.values());
                    case 3 -> System.out.println(market.getCheque());
                    case 4 -> market.createDiscount();
                    case 5 -> market.getAllDiscount();
                    case 6 -> System.out.println(market.getDiscount());
                    case 7 -> System.out.println(market.createBuyer());
                    case 8 -> market.getAllBuyer();
                }
            }
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }
    }
}