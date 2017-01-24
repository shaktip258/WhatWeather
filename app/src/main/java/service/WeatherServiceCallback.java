package service;

import data.Channel;

/**
 * Created by SHAKTI-MAC on 12/30/16.
 */

public interface WeatherServiceCallback {
    void serviceSuccess(Channel channel);

    void serviceFailure(Exception exception);
}
