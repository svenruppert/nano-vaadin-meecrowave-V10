/**
 * Copyright © 2017 Sven Ruppert (sven.ruppert@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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
