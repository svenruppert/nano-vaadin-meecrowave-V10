package junit.org.rapidpm.vaadin.helloworld.server;

import org.apache.meecrowave.Meecrowave;
import org.apache.meecrowave.junit5.MonoMeecrowaveConfig;
import org.apache.meecrowave.testing.ConfigurationInject;
import org.junit.jupiter.api.Test;

//@MeecrowaveConfig
@MonoMeecrowaveConfig
public class MainTest {

  @ConfigurationInject
  private Meecrowave.Builder config;

  @Test
  public void run01() {
    System.out.println("(01) http://localhost:" + config.getHttpPort());
    // asserts
  }

  @Test
  public void run02() {
    System.out.println("(02) http://localhost:" + config.getHttpPort());
    // asserts
  }


}
