package enums;

import classes.Discount;

import java.math.BigDecimal;

public enum Goods {
    MILK(75, 5),
    BREAD(35,0),
    CHICKEN(376,0),
    MEAT(600,12),
    SOLD(25,0),
    SUGAR(90,0),
    BANANA(150,3),
    JUICE(167,11),
    CHEESE(300,23),
    POTATO(50,0),
    TOMATO(200,12),
    CUCUMBER(250,0),
    COFFEE(350,8),
    TEA(230,13);
    private Integer price;
    private Integer sum;


    Goods(Integer price, Integer sum) {
        this.price = price;
        this.sum = sum;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getSum() {
        return sum;
    }

    public void setSum(Integer sum) {
        this.sum = sum;
    }


}
