package pojos;

public class LoginPojo {
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    String email, sifre;

    public LoginPojo(String email, String sifre) {
        this.email = email;
        this.sifre = sifre;
    }
}
