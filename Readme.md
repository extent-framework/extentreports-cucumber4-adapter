## extentreports-cucumber4-adapter

[![Maven Central](https://img.shields.io/maven-central/v/com.aventstack/extentreports-cucumber4-adapter.svg?maxAge=300)](http://search.maven.org/#search|ga|1|g:"com.aventstack")

### Docs

See [here](http://extentreports.com/docs/versions/4/java/cucumber4.html) for complete docs.

### Usage

To begin using the adapter, add the com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter plugin to the runner.

```java
@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class RunCukesTest {
	// ..
}
```

### License

extentreports-cucumber4-adapter is MIT licensed.
