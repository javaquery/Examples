package com.javaquery.designpattern;

import java.util.Date;

/**
 * @author javaQuery
 * @date 2021-09-21
 * @Github: https://github.com/javaquery/Examples
 */
public class Contact {
    private final String name;
    private final String email; // can be list of emails
    private final String mobile; // can be list fo mobiles
    private final String address;
    private final Date birthday;

    public Contact(Builder builder) {
        this.name = builder.name;
        this.email = builder.email;
        this.mobile = builder.mobile;
        this.address = builder.address;
        this.birthday = builder.birthday;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getMobile() {
        return mobile;
    }

    public String getAddress() {
        return address;
    }

    public Date getBirthday() {
        return birthday;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                ", address='" + address + '\'' +
                ", birthday=" + birthday +
                '}';
    }

    public static class Builder{
        private final String name;
        private String email; // can be list of emails
        private String mobile; // can be list fo mobiles
        private String address;
        private Date birthday;

        public Builder(String name) {
            this.name = name;
        }

        public Builder email(String email){
            this.email = email;
            return this;
        }

        public Builder mobile(String mobile){
            this.mobile = mobile;
            return this;
        }

        public Builder address(String address){
            this.address = address;
            return this;
        }

        public Builder birthday(Date birthday){
            this.birthday = birthday;
            return this;
        }

        public Contact build(){
            return new Contact(this);
        }
    }
}
