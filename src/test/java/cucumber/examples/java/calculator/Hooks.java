package cucumber.examples.java.calculator;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;

public class Hooks {

    @After
    public void after(Scenario scenario) throws IOException {
        scenario.embed(extractBytes("src/test/resources/logo.png"), "image/png");
    }

    public byte[] extractBytes (String imageName) throws IOException {
        return Files.readAllBytes(new File(imageName).toPath());
    }
    
    @AfterStep
    public void afterStep(Scenario scenario) {
    	
    }

}
