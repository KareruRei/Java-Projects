public class Supplier extends Order{
        private String name;
        private String contactInfo;

        void setName(String myName) {name = myName;}
        void setContactInfo(String myContactInfo) {contactInfo = myContactInfo;}

        String getName() {return name;}
        String getContactInfo() {return contactInfo;}
}