/*

        Fantastic tool for generating models from JSON: http://www.jsonschema2pojo.org/

 */


package com.bookmanb.json.gson;

import com.bookmanb.json.model.Alternative;
import com.bookmanb.json.model.Data;

import com.bookmanb.json.model.Result;
import com.google.gson.Gson;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.io.FileWriter;
import org.apache.commons.lang3.StringUtils;

public class parse {
    public static void main(String[] args) {
        String path = new String();
        if (args.length > 0){
            try {
                 path = args[0];

            } catch (Exception e) {
                System.out.println("Please provide a path to the JSON file you wish to parse");
                System.out.println(e);
            }

            System.out.println(path);
        }

        Data data;
        StringBuilder transcript = new StringBuilder();

        try {
            Gson gson = new Gson();

            data = gson.fromJson(new FileReader(path), Data.class);

            List<Result> results = data.getResponse().getResults();
            for (Result result: results) {
                List<Alternative> alternatives = result.getAlternatives();
                for (Alternative alternative: alternatives ) {
                    transcript.append(alternative.getTranscript());
                    transcript.append(" ");
                }

            }

        } catch (FileNotFoundException e) {
            System.out.println("Command line requirements: valid path to JSON file");
            e.printStackTrace();
        }

        String result_file = StringUtils.remove(path, ".json");
        result_file += ".txt";
        try {
            FileWriter writer = new FileWriter(result_file);
            System.out.println(transcript);
            writer.write( transcript.toString());
        } catch (java.io.IOException e) {
            System.out.println("Error writing transcription results to " + result_file );
            System.out.println(e);
        }
        System.out.println("Wrote transcript to " +result_file );

    }
}

