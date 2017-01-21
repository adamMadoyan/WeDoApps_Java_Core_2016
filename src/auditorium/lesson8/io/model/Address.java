package auditorium.lesson8.io.model;

import java.io.Serializable;

/**
 * Class description.
 *
 * @author Adam Madoyan
 */
public class Address implements Serializable {

    private String country;

    private String city;

    private String street;

    private String addressDetail;

    public Address(String country, String city, String street, String addressDetail) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.addressDetail = addressDetail;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getAddressDetail() {
        return addressDetail;
    }

    public void setAddressDetail(String addressDetail) {
        this.addressDetail = addressDetail;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Address{");
        sb.append("country='").append(country).append('\'');
        sb.append(", city='").append(city).append('\'');
        sb.append(", street='").append(street).append('\'');
        sb.append(", addressDetail='").append(addressDetail).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
