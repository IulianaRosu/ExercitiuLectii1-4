package ro.java.ctrln;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Profile {

    private String email;
    private String username;
    private String parola;
    private ArrayList<Adress> adresses = new ArrayList<>();

    public Profile(){}

    public Profile(String email, String username, String parola, ArrayList<Adress> adresses) {
        this.email = email;
        this.username = username;
        this.parola = parola;
        this.adresses = adresses;

    }

    public Profile(String email, String username, String parola) {
        this.email = email;
        this.username = username;
        this.parola = parola;
    }


    public String getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Profile profile = (Profile) o;
        return email.equals(profile.email) && username.equals(profile.username) && parola.equals(profile.parola) && adresses.equals(profile.adresses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, username, parola, adresses);
    }

    @Override
    public String toString() {
        return "Profile{" +
                "email='" + email + '\'' +
                ", username='" + username + '\'' +
                ", parola='" + parola + '\'' +
                ", adresses=" + adresses +
                '}';
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public ArrayList<Adress> getAdresses() {
        return adresses;
    }

    public void setAdresses(ArrayList<Adress> adresses) {
        this.adresses = adresses;
    }


}
