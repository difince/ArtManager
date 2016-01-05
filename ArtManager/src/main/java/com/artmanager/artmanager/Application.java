package com.artmanager.artmanager;

import com.artmanager.artmanager.model.Events;
import com.artmanager.artmanager.model.Painting;
import com.artmanager.artmanager.model.Shop;
import com.parse.Parse;
import com.parse.ParseObject;

/**
 * Created by angelr on 05-Jan-16.
 */
public class Application extends android.app.Application{

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Shop.class);
        ParseObject.registerSubclass(Events.class);
        ParseObject.registerSubclass(Painting.class);

        Parse.enableLocalDatastore(this);
        Parse.initialize(this);
    }
}
