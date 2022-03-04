package pojos;

public class UserPojo {
    boolean sonuc;
    String _id;
    String rol;
    String kullanici_adi;
    int durum;
    String token;

    public boolean isSonuc() {
        return sonuc;
    }

    public void setSonuc(boolean sonuc) {
        this.sonuc = sonuc;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getKullanici_adi() {
        return kullanici_adi;
    }

    public void setKullanici_adi(String kullanici_adi) {
        this.kullanici_adi = kullanici_adi;
    }

    public int getDurum() {
        return durum;
    }

    public void setDurum(int durum) {
        this.durum = durum;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

}
