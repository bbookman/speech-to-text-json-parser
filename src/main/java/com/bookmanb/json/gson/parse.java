package com.bookmanb.json.gson;

import com.bookmanb.json.model.Alternative;
import com.bookmanb.json.model.Data;

import com.bookmanb.json.model.Result;
import com.google.gson.Gson;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class parse {
    public static void main(String[] args) {
        Data data;
        StringBuilder transcript = new StringBuilder();

        try {

            String file_location = "/Users/bookmanb/Dev/json_parser/testJSON/video.json";
            Gson gson = new Gson();

            data = gson.fromJson(new FileReader(file_location), Data.class);

            List<Result> results = data.getResponse().getResults();
            for (Result result: results) {
                List<Alternative> alternatives = result.getAlternatives();
                for (Alternative alternative: alternatives ) {
                    transcript.append(alternative.getTranscript());
                    transcript.append(" ");
                }

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(transcript);
    }
}

