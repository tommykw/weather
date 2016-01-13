package tokyo.tommy_kw.weather.model.entity.request

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

/**
 * Created by tommy on 16/01/13.
 */
data class Hourly(
    @SerializedName("summary") @Expose val summary: String,
    @SerializedName("icon") @Expose val icon: String,
    @SerializedName("data") @Expose val data:List<Datum>
)