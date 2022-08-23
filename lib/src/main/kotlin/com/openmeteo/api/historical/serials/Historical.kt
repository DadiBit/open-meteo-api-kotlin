package com.openmeteo.api.historical.serials

import com.openmeteo.api.common.time.TimeZone
import kotlinx.serialization.Serializable

@Serializable
class Historical(
    val latitude: Float,
    val longitude: Float,
    val elevation: Float,
    val generationtime_ms: Double,
    val utc_offset_seconds: Int,
    val timezone: TimeZone,
    val timezone_abbreviation: String,
    val hourly: Hourly? = null,
    val hourly_units: HourlyUnits? = null,
    val daily: Daily? = null,
    val daily_units: DailyUnits? = null,
)
