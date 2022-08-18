package com.openmeteo.api.geocoding

import com.openmeteo.api.common.params.ContentFormat
import com.openmeteo.api.geocoding.serials.GeocodingGet
import kotlinx.serialization.ExperimentalSerializationApi
import kotlin.test.*

class GeocodingSearchEndpointTest {
    companion object {
        val geocodingSearchEndpoint = GeocodingSearchEndpoint()
    }

    @ExperimentalSerializationApi
    fun `Berlin (any)`(response: GeocodingGet) =
        with(response) {
            assertEquals(id, 2950159)
            assertEquals(name, "Berlin")
            assertEquals(latitude, 52.52437f)
            assertEquals(longitude, 13.41053f)
            assertEquals(ranking, 1.4000001f)
            assertEquals(elevation, 74f)
            assertEquals(feature_code, "PPLC")
            assertEquals(country_id, 2921044)
            assertEquals(country, "Germany")
            assertEquals(country_code, "DE")
            assertEquals(admin1_id, 2950157)
            assertEquals(admin1, "Land Berlin")
            assertNull(admin2_id)
            assertNull(admin2)
            assertEquals(admin3_id, 6547383)
            assertEquals(admin3, "Berlin, Stadt")
            assertEquals(admin4_id, 6547539)
            assertEquals(admin4, "Berlin")
            assertEquals(timezone.id, "Europe/Berlin")
            // assertNotNull(response.population)
            assertEquals(postcodes[0], "10967")
            assertEquals(postcodes[1], "13347")
        }

    @Test
    @ExperimentalSerializationApi
    fun `Berlin (json)`() {
        val response = geocodingSearchEndpoint(
            "Berlin",
            1,
        ).getOrThrow().results[0]
        `Berlin (any)`(response)
    }

    @Test
    @ExperimentalSerializationApi
    fun `Berlin (protobuf)`() {
        val response = geocodingSearchEndpoint(
            "Berlin",
            1,
            format = ContentFormat.protobuf,
        ).getOrThrow().results[0]
        `Berlin (any)`(response)
    }
}
