package com.framgia.library.calendardayview.data;

import java.util.Calendar;

/**
 * Created by FRAMGIA\pham.van.khac on 11/07/2016.
 */
public interface IEvent {

    Calendar getStartTime();

    Calendar getEndTime();

    String getName();

    int getColor();

    IPopupEvent getPopup();
}
