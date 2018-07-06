/**
 * Copyright © 2017 Sven Ruppert (sven.ruppert@gmail.com)
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.rapidpm.vaadin.helloworld.server;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.Theme;
import com.vaadin.flow.theme.lumo.Lumo;
import org.rapidpm.dependencies.core.logger.HasLogger;

@Route("")
@Theme(value = Lumo.class, variant = Lumo.LIGHT)
public class HelloVaadinV10 extends Composite<Div> implements HasLogger {

  // read http://vaadin.com/testing for more infos
//  public static final String BTN_CLICK_ME   = buttonID().apply(VaadinApp.class, "btn-click-me");
//  public static final String LB_CLICK_COUNT = labelID().apply(VaadinApp.class, "lb-click-count");
  public static final String BTN_CLICK_ME   = "btn-click-me";
  public static final String LB_CLICK_COUNT = "lb-click-count";

  private final Button         btnClickMe   = new Button("click me");
  private final Span           lbClickCount = new Span("0");
  private final VerticalLayout layout       = new VerticalLayout(btnClickMe, lbClickCount);

  private int clickcount = 0;

  public HelloVaadinV10() {
    btnClickMe.setId(BTN_CLICK_ME);
    btnClickMe.addClickListener(event -> lbClickCount.setText(String.valueOf(++clickcount)));

    lbClickCount.setId(LB_CLICK_COUNT);

    logger().info("and now..  setting the main content.. ");
    getContent().add(layout);
  }
}
