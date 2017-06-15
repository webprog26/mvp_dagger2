package com.androiddeveloper.webprog26.mvp.interfaces.controllers;

import com.androiddeveloper.webprog26.mvp.models.Girl;

/**
 * Created by webpr on 15.06.2017.
 */

public interface NameView {

    void showName(final Girl girl);
    void showErrorMessage();
}
