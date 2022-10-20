package org.example;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        ReadFromJson readFromJson = new ReadFromJson();
        System.out.println(readFromJson.readFromJson(""));
        ReadFromYAML readFromYAML = new ReadFromYAML();
        System.out.println(readFromYAML.readFromYAML("regular_users.yaml"));
    }
}
