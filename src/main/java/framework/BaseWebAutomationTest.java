package framework;

import framework.utils.WebDriverUtils;
import org.junit.After;

public abstract class BaseWebAutomationTest {
   @After
   public void tearDown() {
        WebDriverUtils.shutDown();
    }
}
