package tokyo.tommy_kw.weather.model.net

import retrofit.http.GET
import retrofit.http.POST
import retrofit.http.Query
import rx.Observable

/**
 * Created by tommy on 15/11/18.
 */
interface ForecastService {
    @GET("/")
    operator fun get(@Query("lat") lat: Float, @Query("dat") dat: Float): Observable<String>
}