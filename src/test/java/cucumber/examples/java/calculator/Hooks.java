package cucumber.examples.java.calculator;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Hooks {

    @After
    public void afterStep(Scenario scenario) throws IOException {
        scenario.embed(extractBytes("src/test/resources/logo.png"), "image/png");
    }

    public byte[] extractBytes (String imageName) throws IOException {
        return Files.readAllBytes(new File(imageName).toPath());
    }

}
