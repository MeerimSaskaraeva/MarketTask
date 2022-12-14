package service;

import classes.Discount;
import enums.Goods;
import enums.Markets;

import java.util.List;
import java.util.Map;

public interface MarketService {
    Map<Goods,Integer> getCheque();
    void getAllGoods(Goods[]goods);
    void getAllMarkets(Markets[]markets);
    void createDiscount();
    void getAllDiscount();
    int getDiscount();
    String createBuyer();
    void  getAllBuyer();
}
