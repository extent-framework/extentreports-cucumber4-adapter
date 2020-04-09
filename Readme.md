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

### Attaching Screenshots

Screenshots can be saved to a specified in `extent.properties` using:

```
screenshot.dir=test-output/
```

Starting `1.0.11`, the below setting can be used to specify the relative path from the saved HTML file to link screenshots:

```
screenshot.rel.path=../
```

To learn more about this, refer to [#20](https://github.com/extent-framework/extentreports-cucumber4-adapter/issues/20#issuecomment-601591963).

### License

MIT licensed
