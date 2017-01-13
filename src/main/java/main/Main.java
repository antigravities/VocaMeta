package main;

import java.io.File;
import java.io.IOException;

import classes.Items;
import parsers.NameParser;
import tools.JSONHandler;
import tools.MP3Tagger;

//Use GSON for jsons
//JAudioTagger for music

public class Main {

    public static void main(String[] args) throws IOException {
        File[] files = MP3Tagger.parseFolder("testfiles/songs/");
        for(File file : files){
            String fileName = NameParser.parseName(file.getName());
            //String json = JSONHandler.requestJSONVocaDB(fileName);
            String json = "";
            Items items = JSONHandler.parseJSONVocaDB(json);
            MP3Tagger.tagMP3(items,file);
        }
    }
}