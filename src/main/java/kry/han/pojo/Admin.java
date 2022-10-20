package kry.han.pojo;

import java.io.Serializable;
import java.sql.Timestamp;

public class Admin implements Serializable {
    private Integer id;
    private String adminName;
    private String password;
    private Info info;
    private Timestamp uptime;

    public Admin(String adminName, String password) {
        this.adminName = adminName;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
        return "Admin{" +
                "id=" + id +
                ", adminName='" + adminName + '\'' +
                ", password='" + password + '\'' +
                ", info=" + info +
                ", uptime=" + uptime +
                '}';
    }
}
