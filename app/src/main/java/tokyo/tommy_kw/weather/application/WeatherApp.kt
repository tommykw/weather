package tokyo.tommy_kw.weather.application

import android.app.Application
import com.jakewharton.threetenabp.AndroidThreeTen

/**
 * Created by tommy on 15/11/13.
 */
class WeatherApp : Application() {
    override fun onCreate() {
        super.onCreate()
        AndroidThreeTen.init(this)

    }
}