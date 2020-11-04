package coop.avalonlab;

import coop.avalonlab.awesome.*;
import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoSet;
import dagger.multibindings.Multibinds;

import java.util.Set;


@Module
abstract class AwesomeModule {

    @Multibinds
    abstract Set<MyAwesomeInterface> myAwesomeInterfaces();

   /*@Binds @IntoSet
    abstract MyAwesomeInterface myAwesomeInterfacesOne(MyAwesomeImplOne implOne);

    @Binds @IntoSet
    abstract MyAwesomeInterface myAwesomeInterfacesTwo(MyAwesomeImplTwo implTwo);

    @Binds @IntoSet
    abstract MyAwesomeInterface myAwesomeInterfacesThree(MyAwesomeImplThree implThree);

    @Binds @IntoSet
    abstract MyAwesomeInterface myAwesomeInterfacesFour(MyAwesomeImplFour implFour);*/

}
