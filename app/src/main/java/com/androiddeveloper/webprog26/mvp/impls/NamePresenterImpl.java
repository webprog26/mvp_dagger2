package com.androiddeveloper.webprog26.mvp.impls;

import android.content.Context;
import android.util.Log;

import com.androiddeveloper.webprog26.mvp.R;
import com.androiddeveloper.webprog26.mvp.app.MvpApplication;
import com.androiddeveloper.webprog26.mvp.interfaces.controllers.NameView;
import com.androiddeveloper.webprog26.mvp.interfaces.presenters.NamePresenter;
import com.androiddeveloper.webprog26.mvp.models.Girl;
import com.androiddeveloper.webprog26.mvp.network.NetworkClient;

import javax.inject.Inject;

/**
 * Created by webpr on 15.06.2017.
 */

public class NamePresenterImpl implements NamePresenter {

    private static final String NAME = "Ira";

    private NameView mNameView;

    @Inject
    NetworkClient networkClient;

    public NamePresenterImpl(Context context) {
        ((MvpApplication)context).getAppComponent().inject(this);
        Log.i("NamePresenterImpl", context.getResources().getString(R.string.app_name));
    }

    @Override
    public void setNameView(NameView nameView) {
        this.mNameView = nameView;
    }

    @Override
    public void getName() {
        getNameView().showName(new Girl(networkClient.getGirl()));
    }

    private NameView getNameView() {
        return mNameView;
    }
}
