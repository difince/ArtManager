package com.artmanager.artmanager.model;

import com.parse.ParseClassName;
import com.parse.ParseObject;
import com.parse.ParseQuery;

/**
 * Created by angelr on 05-Jan-16.
 */
@ParseClassName("Events")
public class Events extends ParseObject {
    public Events(){}

    public String getEventType() {
        return getString("EventType");
    }

    public void setEventType(String eventType) {
        put("EventType", eventType);
    }

    public int getRevenue() {
        return getInt("Revenue");
    }

    public void setRevenue(int revenue) {
        put("Revenue", revenue);
    }

    public static ParseQuery<Events> getQuery() {
        return ParseQuery.getQuery(Events.class);
    }
}
