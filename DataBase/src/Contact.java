public class Contact {
    private    Long id ;
    private   String adress ;
    private String typeOfWork;
    private   String meters;
    private   String saler;

    public Contact(){

    }

    public Contact(Long id, String adress, String typeOfWork, String meters, String saler) {
        this.id = id;
        this.adress = adress;
        this.typeOfWork = typeOfWork;
        this.meters = meters;
        this.saler = saler;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getTypeOfWork() {
        return typeOfWork;
    }

    public void setTypeOfWork(String typeOfWork) {
        this.typeOfWork = typeOfWork;
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
                ", typeOfWork='" + typeOfWork + '\'' +
                ", meters='" + meters + '\'' +
                ", saler='" + saler + '\'' +
                '}';
    }
}
