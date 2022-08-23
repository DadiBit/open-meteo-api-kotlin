package com.openmeteo.api.marine.serials

import com.openmeteo.api.common.time.TimeFormat
import kotlinx.serialization.Serializable

@Serializable
class DailyUnits(
    val time: TimeFormat,
    val wave_height_max: String? = null,
    val wind_wave_height_max: String? = null,
    val swell_wave_height_max: String? = null,
    val wave_direction_max: String? = null,
    val wind_wave_direction_max: String? = null,
    val swell_wave_direction_max: String? = null,
    val wave_period_max: String? = null,
    val wind_wave_period_max: String? = null,
    val swell_wave_period_max: String? = null,
    val wind_wave_peak_period_max: String? = null,
    val swell_wave_peak_period_max: String? = null,
)
