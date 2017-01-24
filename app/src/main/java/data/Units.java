package data;

import org.json.JSONObject;

/**
 * Created by SHAKTI-MAC on 12/30/16.
 */

public class Units implements JSONPopulator {
    private String temperature;

    public String getTemperature() {
        return temperature;
    }

    @Override
    public void populate(JSONObject data) {
        temperature = data.optString("temperature");
    }
}
