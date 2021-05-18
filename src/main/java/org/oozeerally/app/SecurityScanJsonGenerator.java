package org.oozeerally.app;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


import java.io.FileReader;
import java.io.IOException;

public class SecurityScanJsonGenerator {


    public static void main(String[] args) throws IOException, ParseException {

        //Update below file location to reflect your files path
        JSONArray jsonArray = (JSONArray) new JSONParser().parse(new FileReader("/Users/778425/Projects/security-scan-app/src/main/resources/test.json"));

        System.out.println(jsonArray.size());

        for (Object o : jsonArray) {

            JSONObject jsonObject = (JSONObject) o;
            String key = jsonObject.get("fingerprint").toString();
            System.out.println("\"" + key + "\" : " + "\"ignore\",");


        }


    }
}
