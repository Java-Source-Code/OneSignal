package com.onesignal.model;

/**
 * Created by hiemseyha on 6/13/18.
 */


import javax.persistence.*;


@Entity
@Table(name = "onesignal")
public class OneSignalPushNotification {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String userName;

    @Column
    private String idOneSignal;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getIdOneSignal() {
        return idOneSignal;
    }

    public void setIdOneSignal(String idOneSignal) {
        this.idOneSignal = idOneSignal;
    }
}
