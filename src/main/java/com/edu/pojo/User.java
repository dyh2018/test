package com.edu.pojo;

import javax.persistence.Id;

public class User {
    @Id
    private Integer uid;

    private String upass;

    private String usertype;

    /**
     * @return uid
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * @param uid
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * @return upass
     */
    public String getUpass() {
        return upass;
    }

    /**
     * @param upass
     */
    public void setUpass(String upass) {
        this.upass = upass;
    }

    /**
     * @return usertype
     */
    public String getUsertype() {
        return usertype;
    }

    /**
     * @param usertype
     */
    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }
}