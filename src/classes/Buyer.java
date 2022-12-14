package classes;

import enums.Goods;
import enums.Markets;

import java.util.List;

public class Buyer {
    private String personName;
    private Integer money;
    private List<Markets> name;
    private List<Goods> list;
    public Buyer(){}


    public Buyer(String personName, Integer money) {
        this.personName = personName;
        this.money = money;


    }

    public Buyer(String personName, Integer money, List<Markets> name, List<Goods> list) {
        this.personName = personName;
        this.money = money;
        this.name = name;
        this.list = list;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public List<Markets> getName() {
        return name;
    }

    public void setName(List<Markets> name) {
        this.name = name;
    }

    public List<Goods> getList() {
        return list;
    }

    public void setList(List<Goods> list) {
        this.list = list;
    }

    public Integer getMoney() {
        return money;
    }

    public Integer setMoney(Integer money) {
        this.money = money;
        return money;
    }


    @Override
    public String toString() {
        return "Buyer{" +
                "personName='" + personName + '\'' +
                ", money=" + money +
                ", name=" + name +
                ", list=" + list +
                '}';
    }
}
