package com.androiddeveloper.webprog26.mvp.dagger;

import android.content.Context;

import com.androiddeveloper.webprog26.mvp.impls.NamePresenterImpl;
import com.androiddeveloper.webprog26.mvp.interfaces.presenters.NamePresenter;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by webpr on 15.06.2017.
 */
@Module
public class PresenterModule {

    @Provides
    @Singleton
    NamePresenter provideNamePresenter(Context context){
        return new NamePresenterImpl(context);
    }


}
