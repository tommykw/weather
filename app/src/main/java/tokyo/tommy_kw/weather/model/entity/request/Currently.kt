package tokyo.tommy_kw.weather.model.entity.request

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

/**
 * Created by tommy on 16/01/13.
 */
data class Currently(
    @SerializedName("time") @Expose val time: Long,
    @SerializedName("summary") @Expose val summary: String,
    @SerializedName("icon") @Expose val icon: String,
    @SerializedName("nearestStormDistance") @Expose val nearestStormDistance: Int,
    @SerializedName("nearestStormBearing") @Expose val nearestStormBearing: Int,
    @SerializedName("precipIntensity") @Expose val precipIntensity: Int,
    @SerializedName("precipProbability") @Expose val precipProbability: Int,
    @SerializedName("temperature") @Expose val temperature: Double,
    @SerializedName("apparentTemperature") @Expose val apparentTemperature: Double,
    @SerializedName("dewPoint") @Expose val dewPoint: Double,
    @SerializedName("humidity") @Expose val humidity: Double,
    @SerializedName("windSpeed") @Expose val windSpeed: Double,
    @SerializedName("windBearing") @Expose val windBearing: Int,
    @SerializedName("visibility") @Expose val visibility: Double,
    @SerializedName("cloudCover") @Expose val cloudCover: Double,
    @SerializedName("pressure") @Expose val pressure: Double,
    @SerializedName("ozone") @Expose val ozone: Double
)
