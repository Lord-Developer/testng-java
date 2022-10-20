package org.example;


import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class ReadFromJson {

    public User[] readFromJson(String pathFile) throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        InputStream is = User[].class.getResourceAsStream(pathFile);
        User[] testObjs = mapper.readValue(is, User[].class);
        return testObjs;
    }

}
