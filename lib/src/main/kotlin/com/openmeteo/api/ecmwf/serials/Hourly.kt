package com.openmeteo.api.ecmwf.serials

import com.openmeteo.api.common.time.Time
import kotlinx.serialization.Serializable

@Serializable
class Hourly(
    val time: Array<Time>,
    val pressure_msl: Array<Float?>? = null,
    val surface_air_pressure: Array<Float?>? = null,
    val skin_temperature: Array<Float?>? = null,
    val soil_temperature_0_7cm: Array<Float?>? = null,
    val total_column_integrated_water_vapour: Array<Float?>? = null,
    val temperature_2m: Array<Float?>? = null,
    val temperature_1000hPa: Array<Float?>? = null,
    val temperature_925hPa: Array<Float?>? = null,
    val temperature_850hPa: Array<Float?>? = null,
    val temperature_700hPa: Array<Float?>? = null,
    val temperature_500hPa: Array<Float?>? = null,
    val temperature_300hPa: Array<Float?>? = null,
    val temperature_250hPa: Array<Float?>? = null,
    val temperature_200hPa: Array<Float?>? = null,
    val temperature_50hPa: Array<Float?>? = null,
    val geopotential_height_1000hPa: Array<Float?>? = null,
    val geopotential_height_925hPa: Array<Float?>? = null,
    val geopotential_height_850hPa: Array<Float?>? = null,
    val geopotential_height_700hPa: Array<Float?>? = null,
    val geopotential_height_500hPa: Array<Float?>? = null,
    val geopotential_height_300hPa: Array<Float?>? = null,
    val geopotential_height_250hPa: Array<Float?>? = null,
    val geopotential_height_200hPa: Array<Float?>? = null,
    val geopotential_height_50hPa: Array<Float?>? = null,
    val windspeed_10m: Array<Float?>? = null,
    val windspeed_1000hPa: Array<Float?>? = null,
    val windspeed_925hPa: Array<Float?>? = null,
    val windspeed_850hPa: Array<Float?>? = null,
    val windspeed_700hPa: Array<Float?>? = null,
    val windspeed_500hPa: Array<Float?>? = null,
    val windspeed_300hPa: Array<Float?>? = null,
    val windspeed_250hPa: Array<Float?>? = null,
    val windspeed_200hPa: Array<Float?>? = null,
    val windspeed_50hPa: Array<Float?>? = null,
    val winddirection_10m: Array<Float?>? = null,
    val winddirection_1000hPa: Array<Float?>? = null,
    val winddirection_925hPa: Array<Float?>? = null,
    val winddirection_850hPa: Array<Float?>? = null,
    val winddirection_700hPa: Array<Float?>? = null,
    val winddirection_500hPa: Array<Float?>? = null,
    val winddirection_300hPa: Array<Float?>? = null,
    val winddirection_250hPa: Array<Float?>? = null,
    val winddirection_200hPa: Array<Float?>? = null,
    val winddirection_50hPa: Array<Float?>? = null,
    val relative_humidity_1000hPa: Array<Float?>? = null,
    val relative_humidity_925hPa: Array<Float?>? = null,
    val relative_humidity_850hPa: Array<Float?>? = null,
    val relative_humidity_700hPa: Array<Float?>? = null,
    val relative_humidity_500hPa: Array<Float?>? = null,
    val relative_humidity_300hPa: Array<Float?>? = null,
    val relative_humidity_250hPa: Array<Float?>? = null,
    val relative_humidity_200hPa: Array<Float?>? = null,
    val relative_humidity_50hPa: Array<Float?>? = null,
    val specific_humidity_1000hPa: Array<Float?>? = null,
    val specific_humidity_925hPa: Array<Float?>? = null,
    val specific_humidity_850hPa: Array<Float?>? = null,
    val specific_humidity_700hPa: Array<Float?>? = null,
    val specific_humidity_500hPa: Array<Float?>? = null,
    val specific_humidity_300hPa: Array<Float?>? = null,
    val specific_humidity_250hPa: Array<Float?>? = null,
    val specific_humidity_200hPa: Array<Float?>? = null,
    val specific_humidity_50hPa: Array<Float?>? = null,
    val atmosphere_relative_vorticity_1000hPa: Array<Float?>? = null,
    val atmosphere_relative_vorticity_925hPa: Array<Float?>? = null,
    val atmosphere_relative_vorticity_850hPa: Array<Float?>? = null,
    val atmosphere_relative_vorticity_700hPa: Array<Float?>? = null,
    val atmosphere_relative_vorticity_500hPa: Array<Float?>? = null,
    val atmosphere_relative_vorticity_300hPa: Array<Float?>? = null,
    val atmosphere_relative_vorticity_250hPa: Array<Float?>? = null,
    val atmosphere_relative_vorticity_200hPa: Array<Float?>? = null,
    val atmosphere_relative_vorticity_50hPa: Array<Float?>? = null,
    val divergence_of_wind_1000hPa: Array<Float?>? = null,
    val divergence_of_wind_925hPa: Array<Float?>? = null,
    val divergence_of_wind_850hPa: Array<Float?>? = null,
    val divergence_of_wind_700hPa: Array<Float?>? = null,
    val divergence_of_wind_500hPa: Array<Float?>? = null,
    val divergence_of_wind_300hPa: Array<Float?>? = null,
    val divergence_of_wind_250hPa: Array<Float?>? = null,
    val divergence_of_wind_200hPa: Array<Float?>? = null,
    val divergence_of_wind_50hPa: Array<Float?>? = null,
)
