package com.company.inventory.response;

import java.util.ArrayList;
import java.util.HashMap;

public class ResponseRest {
    
    private ArrayList<HashMap<String, String>> metadadata = new ArrayList<>();

    public ArrayList<HashMap<String, String>> getMetadadata() {
        return metadadata;
    }

    public void setMetadadata(String type, String code, String date) {

        HashMap<String, String> map = new HashMap<String, String>();

        map.put("type", type);
        map.put("code", code);
        map.put("date", date);

        metadadata.add(map);
    }
}
