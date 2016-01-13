package tokyo.tommy_kw.weather.application

import android.content.Context
import android.content.Context.LOCATION_SERVICE
import android.location.LocationManager
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by tommy on 15/11/19.
 */
@Module
class AppModule(private val context: Context) {
    @Provides
    @Singleton
    fun provideLocationManager(): LocationManager {
        return context.getSystemService(LOCATION_SERVICE) as LocationManager
    }
}