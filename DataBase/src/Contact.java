public class Contact {
    private    int contact_id;
    private   String adress ;
    private String type_Of_Work;
    private   String meters;
    private   String saler;

    public Contact(){

    }

    public Contact( int contact_id, String adress, String type_Of_Work, String meters, String saler) {
        this.contact_id = contact_id;
        this.adress = adress;
        this.type_Of_Work = type_Of_Work;
        this.meters = meters;
        this.saler = saler;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getType_Of_Work() {
        return type_Of_Work;
    }

    public void setType_Of_Work(String type_Of_Work) {
        this.type_Of_Work = type_Of_Work;
    }

    public int getContact_id() {
        return contact_id;
    }

    public void setContact_id(int contact_id) {
        this.contact_id = contact_id;
    }


    public String getMeters() {
        return meters;
    }

    public void setMeters(String meters) {
        this.meters = meters;
    }

    public String getSaler() {
        return saler;
    }

    public void setSaler(String saler) {
        this.saler = saler;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "id=" + contact_id +
               ", adress='" + adress + '\'' +
                ", typeOfWork='" + type_Of_Work + '\'' +
                ", meters='" + meters + '\'' +
                ", saler='" + saler + '\'' +
                '}';
    }
}
