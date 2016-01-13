package tokyo.tommy_kw.weather.application

import android.app.Application
import com.jakewharton.threetenabp.AndroidThreeTen

/**
 * Created by tommy on 15/11/13.
 */
class WeatherApp : Application() {
    lateinit var component: AppComponent
    override fun onCreate() {
        super.onCreate()
        val component = initDaggerComponent()
        //component.inject(this)
        AndroidThreeTen.init(this)

    }

    protected fun initDaggerComponent(): AppComponent {
        return DaggerApplicationComponent.builder().androidModule(AppModule(this)).build()
    }
}