package tokyo.tommy_kw.weather.model.entity.request

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

/**
 * Created by tommy on 16/01/13.
 */
data class Datum(
    @SerializedName("time") @Expose val time: Long,
    @SerializedName("precipIntensity") @Expose val precipIntensity: Int,
    @SerializedName("precipProbability") @Expose val precipProbability: Int,
    @SerializedName("summary") @Expose val summary: String,
    @SerializedName("icon") @Expose val icon: String,
    @SerializedName("sunriseTime") @Expose val sunriseTime: Int,
    @SerializedName("sunsetTime") @Expose val sunsetTime: Int,
    @SerializedName("moonPhase") @Expose val moonPhase: Double,
    @SerializedName("precipIntensityMax") @Expose val precipIntensityMax: Double,
    @SerializedName("temperatureMin") @Expose val temperatureMin: Double,
    @SerializedName("temperatureMinTime") @Expose val temperatureMinTime: Int,
    @SerializedName("temperatureMax") @Expose val temperatureMax: Int,
    @SerializedName("temperatureMaxTime") @Expose val temperatureMaxTime: Int,
    @SerializedName("apparentTemperatureMin") @Expose val apparentTemperatureMin: Double,
    @SerializedName("apparentTemperatureMinTime") @Expose val apparentTemperatureMinTime: Int,
    @SerializedName("apparentTemperatureMax") @Expose val apparentTemperatureMax: Double,
    @SerializedName("apparentTemperatureMaxTime") @Expose val apparentTemperatureMaxTime: Int,
    @SerializedName("dewPoint") @Expose val dewPoint: Double,
    @SerializedName("humidity") @Expose val humidity: Double,
    @SerializedName("windSpeed") @Expose val windSpeed: Double,
    @SerializedName("windBearing") @Expose val windBearing: Int,
    @SerializedName("visibility") @Expose val visibility: Int,
    @SerializedName("cloudCover") @Expose val cloudCover: Double,
    @SerializedName("pressure") @Expose val pressure: Double,
    @SerializedName("ozone") @Expose val ozone: Double,
    @SerializedName("precipIntensityMaxTime") @Expose val precipIntensityMaxTime: Int,
    @SerializedName("precipType") @Expose val precipType: String
)