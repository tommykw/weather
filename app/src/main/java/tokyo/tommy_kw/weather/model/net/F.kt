package tokyo.tommy_kw.weather.model.net

import retrofit.http.GET
import retrofit.http.Query

/**
 * Created by tommy on 15/11/18.
 */
interface F {
    @GET("/")
    operator fun get(@Query("lat") lat: Float, @Query("dat") dat: Float)
}
