package com.androiddeveloper.webprog26.mvp.network;

import android.util.Log;

import com.androiddeveloper.webprog26.mvp.interfaces.NameIndicator;

/**
 * Created by webpr on 15.06.2017.
 */

public class NetworkClient implements NetworkApi {

    private String string;
    private NameIndicator nameIndicator;

    public NetworkClient(String string, NameIndicator nameIndicator) {
        this.string = string;
        this.nameIndicator = nameIndicator;
    }

    @Override
    public String getGirl() {
        return string;
    }

    public NameIndicator getNameIndicator() {
        return nameIndicator;
    }
}
