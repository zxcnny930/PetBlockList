package domain;

public class Comit
{
    int id ;
    int pet;
    String name;
    String gender;
    String location;
    String date;
    int phone;
    String prove;
    String checkBox1;

    public Comit() {
    }

    public Comit(int id, int pet, String name, String gender, String location, String date, int phone, String prove, String checkBox1) {
        this.id = id;
        this.pet = pet;
        this.name = name;
        this.gender = gender;
        this.location = location;
        this.date = date;
        this.phone = phone;
        this.prove = prove;
        this.checkBox1 = checkBox1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPet() {
        return pet;
    }

    public void setPet(int pet) {
        this.pet = pet;
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
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
        return prove;
    }

    public void setProve(String prove) {
        this.prove = prove;
    }

    public String getCheckBox1() {
        return checkBox1;
    }

    public void setCheckBox1(String checkBox1) {
        this.checkBox1 = checkBox1;
    }
}
