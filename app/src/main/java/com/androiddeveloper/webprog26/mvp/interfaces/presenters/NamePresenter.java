package com.androiddeveloper.webprog26.mvp.interfaces.presenters;

import com.androiddeveloper.webprog26.mvp.interfaces.controllers.NameView;

/**
 * Created by webpr on 15.06.2017.
 */

public interface NamePresenter {

    void setNameView(NameView nameView);
    void getName();
}
