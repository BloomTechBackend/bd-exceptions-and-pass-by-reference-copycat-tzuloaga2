package throwingexceptions.models;

import java.lang.ref.WeakReference;

public class Collar {
    private String color;
    private String phoneNumber;

    public Collar(String color, String phoneNumber) {
        this.color = color;
        this.phoneNumber = phoneNumber;
    }

    public Collar(Collar other) {
        this.color = other.color;
        this.phoneNumber = other.phoneNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Collar{" +
                "color='" + color + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
