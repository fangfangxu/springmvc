package com.iot.learnssm.firstssm.po;

import java.util.List;

public class UserAccVO {
    private String username;
    private UserAcc userAcc;
    private List<UserAcc> userAccList;

    public List<UserAcc> getUserAccList() {
        return userAccList;
    }

    public void setUserAccList(List<UserAcc> userAccList) {
        this.userAccList = userAccList;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public UserAcc getUserAcc() {
        return userAcc;
    }

    public void setUserAcc(UserAcc userAcc) {
        this.userAcc = userAcc;
    }
}
