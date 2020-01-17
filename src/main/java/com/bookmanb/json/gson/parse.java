package com.bookmanb.json.gson;

import com.bookmanb.json.model.Data;

import com.google.gson.Gson;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class parse {
    public static void main(String[] args) {
        Data data = new Data();

        try {
            String file_location = "/Users/bookmanb/Dev/json_parser/testJSON/parse_me.json";
            Gson gson.fromJson(new FileReader(file_location), Object.class);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

