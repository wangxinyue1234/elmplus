package kry.han.pojo;

import java.io.Serializable;
import java.sql.Timestamp;

public class Info implements Serializable {
    private Integer id;
    private Integer aid;
    private Admin admin;
    private String avatar;
    private String phone;
    private String gender;
    private Timestamp timestamp;

    public Info(Integer aid) {
        this.aid = aid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Info{" +
                "id=" + id +
                ", aid=" + aid +
                ", admin=" + admin +
                ", avatar='" + avatar + '\'' +
                ", phone='" + phone + '\'' +
                ", gender='" + gender + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}
