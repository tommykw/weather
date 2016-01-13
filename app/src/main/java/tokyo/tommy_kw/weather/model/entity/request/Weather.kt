package tokyo.tommy_kw.weather.model.entity.request

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.util.*

/**
 * Created by tommy on 15/11/18.
 */
data class Weather(
    @SerializedName("latitude") @Expose val latitude: Double,
    @SerializedName("longitude") @Expose val longitude: Double,
    @SerializedName("timezone") @Expose val timezone: String,
    @SerializedName("offset") @Expose val offset: Int,
    @SerializedName("currently") @Expose val currently: Currently,
    @SerializedName("minutely") @Expose val minutely: Minutely,
    @SerializedName("hourly") @Expose val hourly: Hourly,
    @SerializedName("daily") @Expose val daily: Daily,
    @SerializedName("flags") @Expose val flags: Flags
)