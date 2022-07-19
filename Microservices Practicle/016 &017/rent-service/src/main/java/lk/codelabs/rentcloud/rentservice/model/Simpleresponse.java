package lk.codelabs.rentcloud.rentservice.model;

import lk.codelabs.rentcloud.model.rent.Rent;

public class Simpleresponse implements Response {
    Rent rent;

    public Simpleresponse(Rent rent){
        this.rent = rent;
    }

    public Rent getRent() {

        return rent;
    }

    public void setRent(Rent rent) {

        this.rent = rent;
    }
}
