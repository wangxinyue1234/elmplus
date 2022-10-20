package kry.han.pojo;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class Business {
    private Integer id;
    private String password;
    private String businessName;
    private String businessAddress;
    private String businessExplain;
    private Double starPrice;
    private Double daliverPrice;
    private Integer aid;
    private Info info;
    private Timestamp uptime;
    //private List<Food> foodList=new ArrayList<>();

    public Business(String password, String businessName) {
        this.password = password;
        this.businessName = businessName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getBusinessAddress() {
        return businessAddress;
    }

    public void setBusinessAddress(String businessAddress) {
        this.businessAddress = businessAddress;
    }

    public String getBusinessExplain() {
        return businessExplain;
    }

    public void setBusinessExplain(String businessExplain) {
        this.businessExplain = businessExplain;
    }

    public Double getStarPrice() {
        return starPrice;
    }

    public void setStarPrice(Double starPrice) {
        this.starPrice = starPrice;
    }

    public Double getDaliverPrice() {
        return daliverPrice;
    }

    public void setDaliverPrice(Double daliverPrice) {
        this.daliverPrice = daliverPrice;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    public Timestamp getUptime() {
        return uptime;
    }

    public void setUptime(Timestamp uptime) {
        this.uptime = uptime;
    }

    @Override
    public String toString() {
        return "Business{" +
                "id=" + id +
                ", password='" + password + '\'' +
                ", businessName='" + businessName + '\'' +
                ", businessAddress='" + businessAddress + '\'' +
                ", businessExplain='" + businessExplain + '\'' +
                ", starPrice=" + starPrice +
                ", daliverPrice=" + daliverPrice +
                ", aid=" + aid +
                ", info=" + info +
                ", uptime=" + uptime +
                '}';
    }
}
