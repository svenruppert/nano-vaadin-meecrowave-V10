package org.rapidpm.vaadin.helloworld.server;

import org.apache.meecrowave.Meecrowave;

public class Main {

  private Main() {
  }


  public static void main(String[] args) {
    Meecrowave meecrowave = new Meecrowave(new Meecrowave.Builder() {
      {
        randomHttpPort();
        setTomcatScanning(true);
        setTomcatAutoSetup(false);
        setHttp2(true);
      }
    })
        .bake();
    int activePort = meecrowave.getConfiguration().getActivePort();
    System.out.println("activePort = " + activePort);

    meecrowave.await();

  }

}
