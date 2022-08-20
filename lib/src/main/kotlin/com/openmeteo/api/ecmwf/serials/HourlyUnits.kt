package com.openmeteo.api.ecmwf.serials

import com.openmeteo.api.common.params.TemperatureUnit
import com.openmeteo.api.common.params.TimeFormat
import kotlinx.serialization.Serializable

@Serializable
class HourlyUnits(
    val time: TimeFormat,
    val pressure_msl: String? = null,
    val surface_air_pressure: String? = null,
    val skin_temperature: TemperatureUnit? = null,
    val soil_temperature_0_7cm: TemperatureUnit? = null,
    val total_column_integrated_water_vapour: String? = null,
    val temperature_2m: TemperatureUnit? = null,
    val temperature_1000hPa: TemperatureUnit? = null,
    val temperature_925hPa: TemperatureUnit? = null,
    val temperature_850hPa: TemperatureUnit? = null,
    val temperature_700hPa: TemperatureUnit? = null,
    val temperature_500hPa: TemperatureUnit? = null,
    val temperature_300hPa: TemperatureUnit? = null,
    val temperature_250hPa: TemperatureUnit? = null,
    val temperature_200hPa: TemperatureUnit? = null,
    val temperature_50hPa: TemperatureUnit? = null,
    val geopotential_height_1000hPa: String? = null,
    val geopotential_height_925hPa: String? = null,
    val geopotential_height_850hPa: String? = null,
    val geopotential_height_700hPa: String? = null,
    val geopotential_height_500hPa: String? = null,
    val geopotential_height_300hPa: String? = null,
    val geopotential_height_250hPa: String? = null,
    val geopotential_height_200hPa: String? = null,
    val geopotential_height_50hPa: String? = null,
    val windspeed_10m: String? = null,
    val windspeed_1000hPa: String? = null,
    val windspeed_925hPa: String? = null,
    val windspeed_850hPa: String? = null,
    val windspeed_700hPa: String? = null,
    val windspeed_500hPa: String? = null,
    val windspeed_300hPa: String? = null,
    val windspeed_250hPa: String? = null,
    val windspeed_200hPa: String? = null,
    val windspeed_50hPa: String? = null,
    val winddirection_10m: String? = null,
    val winddirection_1000hPa: String? = null,
    val winddirection_925hPa: String? = null,
    val winddirection_850hPa: String? = null,
    val winddirection_700hPa: String? = null,
    val winddirection_500hPa: String? = null,
    val winddirection_300hPa: String? = null,
    val winddirection_250hPa: String? = null,
    val winddirection_200hPa: String? = null,
    val winddirection_50hPa: String? = null,
    val relative_humidity_1000hPa: String? = null,
    val relative_humidity_925hPa: String? = null,
    val relative_humidity_850hPa: String? = null,
    val relative_humidity_700hPa: String? = null,
    val relative_humidity_500hPa: String? = null,
    val relative_humidity_300hPa: String? = null,
    val relative_humidity_250hPa: String? = null,
    val relative_humidity_200hPa: String? = null,
    val relative_humidity_50hPa: String? = null,
    val specific_humidity_1000hPa: String? = null,
    val specific_humidity_925hPa: String? = null,
    val specific_humidity_850hPa: String? = null,
    val specific_humidity_700hPa: String? = null,
    val specific_humidity_500hPa: String? = null,
    val specific_humidity_300hPa: String? = null,
    val specific_humidity_250hPa: String? = null,
    val specific_humidity_200hPa: String? = null,
    val specific_humidity_50hPa: String? = null,
    val atmosphere_relative_vorticity_1000hPa: String? = null,
    val atmosphere_relative_vorticity_925hPa: String? = null,
    val atmosphere_relative_vorticity_850hPa: String? = null,
    val atmosphere_relative_vorticity_700hPa: String? = null,
    val atmosphere_relative_vorticity_500hPa: String? = null,
    val atmosphere_relative_vorticity_300hPa: String? = null,
    val atmosphere_relative_vorticity_250hPa: String? = null,
    val atmosphere_relative_vorticity_200hPa: String? = null,
    val atmosphere_relative_vorticity_50hPa: String? = null,
    val divergence_of_wind_1000hPa: String? = null,
    val divergence_of_wind_925hPa: String? = null,
    val divergence_of_wind_850hPa: String? = null,
    val divergence_of_wind_700hPa: String? = null,
    val divergence_of_wind_500hPa: String? = null,
    val divergence_of_wind_300hPa: String? = null,
    val divergence_of_wind_250hPa: String? = null,
    val divergence_of_wind_200hPa: String? = null,
    val divergence_of_wind_50hPa: String? = null,
)
