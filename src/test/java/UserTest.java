import com.fasterxml.jackson.core.JsonProcessingException;
import org.example.ReadFromJson;
import org.example.ReadFromYAML;
import org.example.User;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Arrays;

import static org.testng.Assert.*;

public class UserTest {


    @Test
    public void checkUserFromJson() throws IOException {
        ReadFromJson readFromJson = new ReadFromJson();
        for (User user : readFromJson.readFromJson("/regular_users.json")) {
            Assert.assertTrue(user.getId() != 0);
            Assert.assertNotNull(user.getName());
        }
    }

    @Test
    public void checkUserFromYAML() throws IOException {
        ReadFromYAML readFromYAML = new ReadFromYAML();
        for (User user : readFromYAML.readFromYAML("regular_users.yaml")) {
            Assert.assertTrue(user.getId() != 0);
            Assert.assertNotNull(user.getName());
        }
    }

    @Test
    public void checkJsonAndYamlAllIncluded() throws IOException {
        ReadFromJson readFromJson = new ReadFromJson();
        ReadFromYAML readFromYAML = new ReadFromYAML();
        User[] usersFromJson = readFromJson.readFromJson("/admin_users.json");
        User[] usersFromYaml = readFromYAML.readFromYAML("admin_users.yaml");
        assertFalse(Arrays.equals(usersFromYaml,usersFromJson));
    }
}
