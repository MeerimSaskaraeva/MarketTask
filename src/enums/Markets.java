package enums;

public enum Markets {
    GLOBUS(10000),
    FRUNZE(100000),
    NARODNIY(20000),
    ALMA(10000),
    SHEKER(10000);
    private Integer money;

    Markets(Integer money) {
        this.money = money;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Markets{" +
                " Name=" +name()+
                " money=" + money +
                '}';
    }
}
