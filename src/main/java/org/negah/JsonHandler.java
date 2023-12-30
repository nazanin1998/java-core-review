package org.negah;

import org.json.JSONObject;

public class JsonHandler {
    /**
     * <dependency>
     * <groupId>org.json</groupId>
     * <artifactId>json</artifactId>
     * <version>20230227</version>
     * </dependency>
     *
     * @param jsonStr
     * @return JSONObject
     */
    public JSONObject stringToObject(String jsonStr) {
        return new JSONObject(jsonStr);
    }

}
