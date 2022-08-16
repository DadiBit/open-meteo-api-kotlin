package com.openmeteo.api.common.params

import java.text.SimpleDateFormat
import java.util.Date

/**
 * A [Date] which is ISO-8601 formatted when converted to string
 *
 * Eases `start_date` and `end_date` params
 */
class IsoDate(date: Long) : Date(date) {
    companion object {
        val format: SimpleDateFormat = SimpleDateFormat("yyyy-MM-dd")
    }
    override fun toString(): String =
        format.format(this)
    constructor(date: Date) : this(
        date.time
    )
    constructor(date: String) : this(
        format.parse(date)
    )
}