package tokyo.tommy_kw.weather.model.entity.request

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.util.*

/**
 * Created by tommy on 16/01/13.
 */
data class Flags(
    @SerializedName("sources") @Expose val sources:List<String>,
    @SerializedName("isd-stations") @Expose val isdStations:List<String>,
    @SerializedName("madis-stations") @Expose val madisStations:List<String>,
    @SerializedName("lamp-stations") @Expose val lampStations:List<String>,
    @SerializedName("darksky-stations") @Expose val darkskyStations:List<String>,
    @SerializedName("units") @Expose val units: String
)
