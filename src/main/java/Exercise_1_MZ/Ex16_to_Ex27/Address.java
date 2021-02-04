package Exercise_1_MZ.Ex16_to_Ex27;


public class Address {
    private String street;
    private String city;
    private String country;
    private String flatNo;
    private String homeNo;


    public Address(String street, String city, String country, String flatNo, String homeNo){
        this.street = street;
        this.city = city;
        this.country = country;
        this.flatNo = flatNo;
        this.homeNo = homeNo;
    }

    //Nadpisanie toStringa
    @Override
    public String toString() {
        return "\nUnder address :" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", flatNo='" + flatNo + '\'' +
                ", homeNo='" + homeNo + '\'';
    }

    public void setStreet (String street){
        this.street = street;
    }

    public String getStreet (){
        return this.street;
    }
    public void setCity(String city){
        this.city = city;
    }

    public String getCity (){
        return this.city;
    }
    public void setCountry (String country){
        this.country = country;
    }

    public String getCountry (){
        return this.country;
    }

    public void setFlatNo (String flatNo){
        this.flatNo = flatNo;
    }

    public String getFlatNo (){
        return this.flatNo;
    }

    public void setHomeNo (String homeNo){
        this.homeNo = homeNo;
    }

    public String getName (){
        return this.homeNo;
    }



}
