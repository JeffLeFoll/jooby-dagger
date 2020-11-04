package coop.avalonlab;

import dagger.Component;

@Component(modules = AwesomeModule.class)
interface AwesomeComponent {
   AwesomeController awesomeController();
}
