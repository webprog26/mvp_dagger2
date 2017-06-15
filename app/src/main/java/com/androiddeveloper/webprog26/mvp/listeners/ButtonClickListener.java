package com.androiddeveloper.webprog26.mvp.listeners;

import android.view.View;

import com.androiddeveloper.webprog26.mvp.interfaces.presenters.NamePresenter;

/**
 * Created by webpr on 15.06.2017.
 */

public class ButtonClickListener implements View.OnClickListener {

    private final NamePresenter mNamePresenter;

    public ButtonClickListener(NamePresenter namePresenter) {
        this.mNamePresenter = namePresenter;
    }

    @Override
    public void onClick(View v) {
        getNamePresenter().getName();
    }

    public NamePresenter getNamePresenter() {
        return mNamePresenter;
    }
}
