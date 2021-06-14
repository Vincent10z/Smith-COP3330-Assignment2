package ex39;
import java.util.Comparator;
public class Company {
    String fName;
    String lname;
    String Position;
    String sepDate;

    public Company(String FirstName, String LastName, String PositionComp, String  Separation) {
        this.fName = FirstName;
        this.lname = LastName;
        this.Position = PositionComp;
        this.sepDate = Separation;
    }
    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String position) {
        Position = position;
    }

    public String getSepDate() {
        return sepDate;
    }

    public void setSepDate(String sepDate) {
        this.sepDate = sepDate;
    }

