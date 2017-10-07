package se.humanus.hospital;

public class Patient extends Person {

    private String adress;
    private String postNr;
    private String postOrt;
    private String telNr;
    private String email;

    // Getter and Setter
	private String personalNr;

    public String getPersonalNr() {
        return personalNr;
    }

    public void setPersonalNr(String personalNr) {
        this.personalNr = personalNr;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPostNr() {
        return postNr;
    }

    public void setPostNr(String postNr) {
        this.postNr = postNr;
    }

    public String getPostOrt() {
        return postOrt;
    }

    public void setPostOrt(String postOrt) {
        this.postOrt = postOrt;
    }

    public String getTelNr() {
        return telNr;
    }

    public void setTelNr(String telNr) {
        this.telNr = telNr;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
class  PatientJournal{

}

