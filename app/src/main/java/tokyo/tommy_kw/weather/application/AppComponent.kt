package tokyo.tommy_kw.weather.application

import dagger.Component
import tokyo.tommy_kw.weather.view.activity.ScrollingActivity
import javax.inject.Singleton

/**
 * Created by tommy on 15/11/18.
 */
@Singleton
@Component(modules = arrayOf(AppModule::class))
public interface AppComponent {
    //public fun inject(sActivity: ScrollingActivity)
}


