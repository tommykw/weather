package tokyo.tommy_kw.weather.model.net

import retrofit.http.GET
import retrofit.http.POST
import rx.Observable

/**
 * Created by tommy on 15/11/18.
 */
interface ForecastService {
    @GET("/today")
    fun getToday(): Observable<String>

    @POST("/today2")
    fun sendToday(): Observable<String>
}