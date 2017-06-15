package com.androiddeveloper.webprog26.mvp.dagger;

import com.androiddeveloper.webprog26.mvp.constants.Constants;
import com.androiddeveloper.webprog26.mvp.interfaces.NameIndicator;
import com.androiddeveloper.webprog26.mvp.network.NetworkClient;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by webpr on 15.06.2017.
 */

@Module
public class NetworkModule {

    private static final String GIRL_KIND = "busty";

    @Provides
    @Named(GIRL_KIND)
    String getGirlKind(){
        return Constants.BUSTY_GIRL_NAME;
    }

    @Provides
    @Singleton
    NameIndicator provideNameIndicator(){
        return new NameIndicator();
    }

    @Provides
    @Singleton
    NetworkClient provideNetworkClient(NameIndicator nameIndicator, @Named(GIRL_KIND) String girlKind){
        return new NetworkClient(girlKind, nameIndicator);
    }
}
