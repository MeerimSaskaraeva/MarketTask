package service.impl;

import classes.Buyer;
import classes.Discount;
import enums.Goods;
import enums.Markets;
import service.MarketService;

import java.math.BigDecimal;
import java.util.*;

public class MarketServiceImpl  implements MarketService {
    Scanner sc = new Scanner(System.in);
    List<Buyer> buyerList = new ArrayList<>();
    List<Discount> discountList = new ArrayList<>();




    @Override
    public Map<Goods, Integer> getCheque() {
        Map<Goods, Integer> goodsIntegerMap = new HashMap<>();

        try {
            List<Integer> price = new ArrayList<>();
            List<Goods>list=new ArrayList<>();
            Integer sum;
            Integer disc = 0;
            System.out.print("Write buyer name: ");
            String name = sc.next().toUpperCase();
            for (Buyer buyer : buyerList) {
            if (name.equals(buyer.getPersonName())){
            System.out.print("Choose market: ");
            Markets markets = Markets.valueOf(sc.next().toUpperCase());
            Markets[] m = Markets.values();
            for (Markets markets1 : m) {
                if (markets1.equals(markets)) {
                    System.out.print("Choose products: ");
                    Goods g1 = Goods.valueOf(sc.next().toUpperCase());
                    Integer p1 = g1.getPrice();


                    System.out.println("Price product:"+p1); //-> 1 price goods
                    Integer buy=buyer.getMoney();
                    Integer marketMoney=markets1.getMoney();
                    System.out.println("Buyer money: "+buy);//-> 2 buyer money
                    if ((buy-(p1))>0){

                        Integer buyerMoney= (buy-(p1));
                        Integer mMoney=marketMoney+p1;
                        buyer.setMoney(buyerMoney);
                        markets1.setMoney(mMoney);

                        System.out.println("Remainder money: "+buyerMoney);//-> 4 setMoney buyer
                        Integer d1=g1.getSum();
                        price.add(p1);
                        disc=(d1);
                        sum = p1;
                        goodsIntegerMap.put(g1, p1);
                        if (name.equals(buyer.getPersonName())){
                            //List<Goods>list=new ArrayList<>();
                            list.add(g1);
                            buyer.setList(list);
                            List<Markets>marketsList=new ArrayList<>();
                            marketsList.add(markets);
                            buyer.setName(marketsList);
                        }
                        while (true) {
                            System.out.print("Want to select a product (yes  / no) ");
                            String x = sc.next();
                            if (x.equals("yes")) {
                                System.out.print("Choose goods: ");
                                Goods g2 = Goods.valueOf(sc.next().toUpperCase());
                                Integer p2 = g2.getPrice();
                                Integer d2=g2.getSum();
                                System.out.println("Price product:"+p2); //->  price goods //1
                                Integer z= buyer.getMoney();
                                for (int i = 0; i < 1; i++) {
                                    if (z-(p2)>0){
                                        z=(z-p2);
                                        disc+=d2;
                                        price.add(p2);
                                        sum += p2;
                                        mMoney=(mMoney+p2);
                                        z=z+disc;
                                        buyer.setMoney(z);
                                        markets1.setMoney(mMoney-disc);
                                        System.out.println("market money:"+mMoney);
                                        System.out.println("Remainder money: "+z);//2

                                        goodsIntegerMap.put(g2, p2);
                                        if (name.equals(buyer.getPersonName())){

                                            list.add(g2);
                                            buyer.setList(list);}
                                        }
                                    else {
                                        System.out.println("Not enough money");
                                    }
                                }
                            }else if (x.equals("no"))
                            break;
                         }
                         System.out.println("" +
                            "\n ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ Check ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" +
                            "\n                Buyer: " + name +
                            "\n                Market: " + markets +
                            "\n                List: " + goodsIntegerMap +
                            "\n                Total cost of goods: " + price + " = " + sum +
                            "\n                Discount: " + disc +
                            "\n                Total cost after discount: " + (sum-disc) +
                            "\n                " +
                            "\n~~~~~~~~~~~~~~~~~~~~~~~ Thank you for your purchase!!! ~~~~~~~~~~~~~~~~~~~");}
                    else {
                         System.out.println("Not enough money");}
                }
            }
            }else {
                System.out.println("Not founded buyer ");}
            }

        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return goodsIntegerMap;
    }

    @Override
    public void getAllGoods(Goods[] goods) {
        System.out.println("================= All Goods =================");
        for (Goods good : goods) {
            System.out.println(good.name());
        }

    }

    @Override
    public void getAllMarkets(Markets[] markets) {
        System.out.println("================= All Markets ==================");
        for (Markets market : markets) {
            System.out.println(market.name());

        }

    }

    @Override
    public void createDiscount() {
        try {
            System.out.print("Write market: ");
            Markets m = Markets.valueOf(sc.next().toUpperCase());
            System.out.print("Write products: ");
            Goods g = Goods.valueOf(sc.next().toUpperCase());
            System.out.print("Write discount: ");
            int d = sc.nextInt();
            Discount discount = new Discount(m, g, d);
            List<Discount> dis = new ArrayList<>();
            dis.add(discount);
            this.discountList.addAll(dis);
            System.out.println(dis);
            System.out.println("Discount create successfully!!!");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void getAllDiscount() {
        System.out.println("================== All Discounts =================");
        for (Discount discount : discountList) {
            System.out.println(discount);
        }
    }

    @Override
    public int getDiscount() {
        int d = 0;
        for (Discount discount : discountList) {
            System.out.println(discount.getDiscounts());
            if (getCheque().containsValue(d)){
            return d;}
        }
        return 0;
    }

    @Override
    public String createBuyer() {
        System.out.print("Your name: ");
        String name= sc.next().toUpperCase();
        System.out.print("Money:");
        Integer money=sc.nextInt();
        Buyer buyer=new Buyer(name,money);
        buyerList.add(buyer);
        System.out.println(buyer);
        return "Buyer created successfully!!!";
    }

    @Override
    public void getAllBuyer() {
        System.out.println("======================= All BUYERS ======================");
        for (Buyer buyer : buyerList) {
            System.out.println(buyer);
        }

    }

}
