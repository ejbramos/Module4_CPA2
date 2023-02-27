import java.util.LinkedList;

public class Student {
    public void student(String name, String number, String yearLevel, String degree, String contactNumber, String email){
        setName(name);
        setNumber(number);
        setYearLevel(yearLevel);
        setDegree(degree);
        setContactNumber(contactNumber);
        setEmail(email);
    }
    String name;
    String number;
    String yearLevel;
    String Degree;
    String contactNumber;
    String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getYearLevel() {
        return yearLevel;
    }

    public void setYearLevel(String yearLevel) {
        this.yearLevel = yearLevel;
    }

    public String getDegree() {
        return Degree;
    }

    public void setDegree(String degree) {
        Degree = degree;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
