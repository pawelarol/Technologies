public class Contact {
    private    Long id ;
    private   String adress ;
    private String type_Of_Work;
    private   String meters;
    private   String saler;

    public Contact(){

    }

    public Contact(Long id, String adress, String type_Of_Work, String meters, String saler) {
        this.id = id;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
                "id=" + id +
               ", adress='" + adress + '\'' +
                ", typeOfWork='" + type_Of_Work + '\'' +
                ", meters='" + meters + '\'' +
                ", saler='" + saler + '\'' +
                '}';
    }
}
