package com.androiddeveloper.webprog26.mvp.dagger;

import com.androiddeveloper.webprog26.mvp.MainActivity;
import com.androiddeveloper.webprog26.mvp.impls.NamePresenterImpl;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by webpr on 15.06.2017.
 */

@Singleton
@Component (modules = {AppModule.class, PresenterModule.class, NetworkModule.class})
public interface AppComponent {

    void inject(MainActivity target);
    void inject(NamePresenterImpl target);
}
