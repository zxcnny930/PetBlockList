package domain;

public class BlockList {
    int id ;
    String name;
    String gender;
    String locantion;
    String date;
    int phone;
    String Prove;

    public BlockList() {
    }

    public BlockList(int id, String name, String gender, String locantion, String date, int phone, String prove) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.locantion = locantion;
        this.date = date;
        this.phone = phone;
        Prove = prove;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getLocantion() {
        return locantion;
    }

    public void setLocantion(String locantion) {
        this.locantion = locantion;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getProve() {
        return Prove;
    }

    public void setProve(String prove) {
        Prove = prove;
    }
}
