package tokyo.tommy_kw.weather.model.entity.request

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.util.*

/**
 * Created by tommy on 15/11/18.
 */
class Weather {
    @SerializedName("latitude")
    @Expose
    var latitude: Double = 0.0
    @SerializedName("longitude")
    @Expose
    var longitude: Double = 0.0
    @SerializedName("timezone")
    @Expose
    var timezone: String = ""
    @SerializedName("offset")
    @Expose
    var offset: Int = 0
    @SerializedName("currently")
    @Expose
    var currently: Currently = Currently()
    @SerializedName("minutely")
    @Expose
    var minutely: Minutely = Minutely()
    @SerializedName("hourly")
    @Expose
    var hourly: Hourly = Hourly()
    @SerializedName("daily")
    @Expose
    var daily: Daily = Daily()
    @SerializedName("flags")
    @Expose
    var flags: Flags = Flags()
    class Hourly {
        @SerializedName("summary")
        @Expose
        var summary: String = ""
        @SerializedName("icon")
        @Expose
        var icon: String = ""
        @SerializedName("data")
        @Expose
        var data:List<Datum> = ArrayList<Datum>()
    }

    class Minutely {
        @SerializedName("summary")
        @Expose
        var summary: String = ""
        @SerializedName("icon")
        @Expose
        var icon: String = ""
        @SerializedName("data")
        @Expose
        var data:List<Datum> = ArrayList<Datum>()
    }

    class Flags {
        @SerializedName("sources")
        @Expose
        var sources:List<String> = ArrayList<String>()
        @SerializedName("isd-stations")
        @Expose
        var isdStations:List<String> = ArrayList<String>()
        @SerializedName("madis-stations")
        @Expose
        var madisStations:List<String> = ArrayList<String>()
        @SerializedName("lamp-stations")
        @Expose
        var lampStations:List<String> = ArrayList<String>()
        @SerializedName("darksky-stations")
        @Expose
        var darkskyStations:List<String> = ArrayList<String>()
        @SerializedName("units")
        @Expose
        var units: String = ""
    }

    class Currently {
        @SerializedName("time")
        @Expose
        var time: Int = 0
        @SerializedName("summary")
        @Expose
        var summary: String = ""
        @SerializedName("icon")
        @Expose
        var icon: String = ""
        @SerializedName("nearestStormDistance")
        @Expose
        var nearestStormDistance: Int = 0
        @SerializedName("nearestStormBearing")
        @Expose
        var nearestStormBearing: Int = 0
        @SerializedName("precipIntensity")
        @Expose
        var precipIntensity: Int = 0
        @SerializedName("precipProbability")
        @Expose
        var precipProbability: Int = 0
        @SerializedName("temperature")
        @Expose
        var temperature: Double = 0.0
        @SerializedName("apparentTemperature")
        @Expose
        var apparentTemperature: Double = 0.0
        @SerializedName("dewPoint")
        @Expose
        var dewPoint: Double = 0.0
        @SerializedName("humidity")
        @Expose
        var humidity: Double = 0.0
        @SerializedName("windSpeed")
        @Expose
        var windSpeed: Double = 0.0
        @SerializedName("windBearing")
        @Expose
        var windBearing: Int = 0
        @SerializedName("visibility")
        @Expose
        var visibility: Double = 0.0
        @SerializedName("cloudCover")
        @Expose
        var cloudCover: Double = 0.0
        @SerializedName("pressure")
        @Expose
        var pressure: Double = 0.0
        @SerializedName("ozone")
        @Expose
        var ozone: Double = 0.0
    }

    class Daily {
        @SerializedName("summary")
        @Expose
        var summary: String = ""
        @SerializedName("icon")
        @Expose
        var icon: String = ""
        @SerializedName("data")
        @Expose
        var data:List<Datum> = ArrayList<Datum>()
    }

    class Datum {
        @SerializedName("time")
        @Expose
        var time: Int = 0
        @SerializedName("precipIntensity")
        @Expose
        var precipIntensity: Int = 0
        @SerializedName("precipProbability")
        @Expose
        var precipProbability: Int = 0
        @SerializedName("summary")
        @Expose
        var summary: String = ""
        @SerializedName("icon")
        @Expose
        var icon: String = ""
        @SerializedName("sunriseTime")
        @Expose
        var sunriseTime: Int = 0
        @SerializedName("sunsetTime")
        @Expose
        var sunsetTime: Int = 0
        @SerializedName("moonPhase")
        @Expose
        var moonPhase: Double = 0.0
        @SerializedName("precipIntensityMax")
        @Expose
        var precipIntensityMax: Double = 0.0
        @SerializedName("temperatureMin")
        @Expose
        var temperatureMin: Double = 0.0
        @SerializedName("temperatureMinTime")
        @Expose
        var temperatureMinTime: Int = 0
        @SerializedName("temperatureMax")
        @Expose
        var temperatureMax: Int = 0
        @SerializedName("temperatureMaxTime")
        @Expose
        var temperatureMaxTime: Int = 0
        @SerializedName("apparentTemperatureMin")
        @Expose
        var apparentTemperatureMin: Double = 0.0
        @SerializedName("apparentTemperatureMinTime")
        @Expose
        var apparentTemperatureMinTime: Int = 0
        @SerializedName("apparentTemperatureMax")
        @Expose
        var apparentTemperatureMax: Double = 0.0
        @SerializedName("apparentTemperatureMaxTime")
        @Expose
        var apparentTemperatureMaxTime: Int = 0
        @SerializedName("dewPoint")
        @Expose
        var dewPoint: Double = 0.0
        @SerializedName("humidity")
        @Expose
        var humidity: Double = 0.0
        @SerializedName("windSpeed")
        @Expose
        var windSpeed: Double = 0.0
        @SerializedName("windBearing")
        @Expose
        var windBearing: Int = 0
        @SerializedName("visibility")
        @Expose
        var visibility: Int = 0
        @SerializedName("cloudCover")
        @Expose
        var cloudCover: Double = 0.0
        @SerializedName("pressure")
        @Expose
        var pressure: Double = 0.0
        @SerializedName("ozone")
        @Expose
        var ozone: Double = 0.0
        @SerializedName("precipIntensityMaxTime")
        @Expose
        var precipIntensityMaxTime: Int = 0
        @SerializedName("precipType")
        @Expose
        var precipType: String = ""
    }
}