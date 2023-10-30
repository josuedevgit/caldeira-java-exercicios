package exercicio03;

import java.util.*;

public class Calendar {
    private String number;
    private String address;
    private String cityLocal;

    public Calendar(String number, String address, String cityLocal) {
        this.number = number;
        this.address = address;
        this.cityLocal = cityLocal;
    }

    public String getNumber() {
        return number;
    }

    public String getAddress() {
        return address;
    }

    public String getCityLocal() {
        return cityLocal;
    }
}
