package com.ezioshiki.koma2.presentation.navigation;

import timber.log.Timber;

/**
 * Created by EzioShiki on 15/11/7.
 */
public class Navigator {

    public static int count = 0;

    public Navigator() {
        count++;
        Timber.d(" In Navigator, Navigator create "+count + " times");
    }
}
