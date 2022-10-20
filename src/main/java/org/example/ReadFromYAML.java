package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class ReadFromYAML {

    public User[] readFromYAML(String path) throws JsonProcessingException {
        InputStream inputStream = this.getClass()
                .getClassLoader()
                .getResourceAsStream(path);
        Yaml yaml = new Yaml(new Constructor(User[].class));
        User[] users = yaml.load(inputStream);
        return users;
    }
}
