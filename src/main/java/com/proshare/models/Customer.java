package com.proshare.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Customer {
    @Id
    public ObjectId _id;

    public String firstName;
    public String lastName;

    public Customer() {}

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getId(){
        return _id.toHexString();
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%s, firstName='%s', lastName='%s']",
                _id, firstName, lastName);
    }


}
