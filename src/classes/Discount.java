package classes;

import enums.Goods;
import enums.Markets;

public class Discount {
    private Markets markets;
    private Goods goods;
    private int discounts;
    public Discount(){}

    public Discount(Markets markets, Goods goods, int discounts) {
        this.markets = markets;
        this.goods = goods;
        this.discounts = discounts;
    }

    public Markets getMarkets() {
        return markets;
    }

    public void setMarkets(Markets markets) {
        this.markets = markets;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public int getDiscounts() {
        return discounts;
    }

    public void setDiscounts(int discounts) {
        this.discounts = discounts;
    }

    @Override
    public String toString() {
        return "Discount{" +
                "markets=" + markets +
                ", goods=" + goods +
                ", discounts=" + discounts +
                '}';
    }
}
