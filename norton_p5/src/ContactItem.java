public class ContactItem {
    String fName;
    String lName;
    String phoneNumber;
    String eMail;

    public String getFName() {
        return fName;
    }

    public String getLName() {
        return lName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEMail() {
        return eMail;
    }

    public ContactItem(String fName, String lName, String phoneNumber, String eMail) {
        this.fName = fName;
        this.lName = lName;
        this.phoneNumber = phoneNumber;
        this.eMail = eMail;
    }



}
