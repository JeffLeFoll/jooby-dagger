package coop.avalonlab;

import io.jooby.Jooby;

public class App extends Jooby {

  {
    mvc(new Controller());

    AwesomeComponent dagger = DaggerAwesomeComponent.builder().build();
    mvc(dagger.awesomeController());
  }

  public static void main(final String[] args) {
    runApp(args, App::new);
  }

}
