package domain;

public class BlockList {
    int id ;
    String name;
    int gender;
    String locantion;
     int date;
    int phone;
    int show;

    public BlockList() {
    }

    public BlockList(int id, String name, int gender, String locantion, int date, int phone, int show) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.locantion = locantion;
        this.date = date;
        this.phone = phone;
        this.show = show;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getLocantion() {
        return locantion;
    }

    public void setLocantion(String locantion) {
        this.locantion = locantion;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getShow() {
        return show;
    }

    public void setShow(int show) {
        this.show = show;
    }
}
