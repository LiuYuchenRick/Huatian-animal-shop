package ex2;

import java.time.LocalDate;

public class Customer {
    protected String name;
    private int storeVisits;
    private LocalDate lastVisitTime;

    public Customer(String name, int storeVisits, LocalDate lastVisitTime) {
        this.name = name;
        this.storeVisits = storeVisits;
        this.lastVisitTime = lastVisitTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStoreVisits() {
        return storeVisits;
    }

    public void setStoreVisits(int storeVisits) {
        this.storeVisits = storeVisits;
    }

    public LocalDate getLastVisitTime() {
        return lastVisitTime;
    }

    public void setLastVisitTime(LocalDate lastVisitTime) {
        this.lastVisitTime = lastVisitTime;
    }

    @Override
    public String toString() {
        return "用户姓名："+name+" 进店次数："+storeVisits+" 上次光临日期："+lastVisitTime;
    }
}
