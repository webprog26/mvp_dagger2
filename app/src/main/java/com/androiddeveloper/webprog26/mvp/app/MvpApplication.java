package com.androiddeveloper.webprog26.mvp.app;

import android.app.Application;

import com.androiddeveloper.webprog26.mvp.dagger.AppComponent;
import com.androiddeveloper.webprog26.mvp.dagger.AppModule;
import com.androiddeveloper.webprog26.mvp.dagger.DaggerAppComponent;

/**
 * Created by webpr on 15.06.2017.
 */

public class MvpApplication extends Application {

    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = initDagger(this);
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }

    protected AppComponent initDagger(MvpApplication mvpApplication){
        return DaggerAppComponent.builder()
                .appModule(new AppModule(mvpApplication))
                .build();
    }
}
