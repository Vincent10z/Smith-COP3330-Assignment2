package ex40;

public class Company {
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


    }
