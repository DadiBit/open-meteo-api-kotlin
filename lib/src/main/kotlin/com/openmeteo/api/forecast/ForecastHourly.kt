package com.openmeteo.api.forecast

import com.openmeteo.api.common.query.QueryHourly.Options
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
enum class ForecastHourly : Options {
    @SerialName("time")
    Time,
    @SerialName("temperature_2m")
    Temperature2m,
    @SerialName("relativehumidity_2m")
    Relativehumidity2m,
    @SerialName("dewpoint_2m")
    Dewpoint2m,
    @SerialName("apparent_temperature")
    ApparentTemperature,
    @SerialName("precipitation")
    Precipitation,
    @SerialName("rain")
    Rain,
    @SerialName("showers")
    Showers,
    @SerialName("snowfall")
    Snowfall,
    @SerialName("snow_depth")
    SnowDepth,
    @SerialName("freezinglevel_height")
    FreezinglevelHeight,
    @SerialName("weathercode")
    Weathercode,
    @SerialName("pressure_msl")
    PressureMsl,
    @SerialName("surface_pressure")
    SurfacePressure,
    @SerialName("cloudcover")
    Cloudcover,
    @SerialName("cloudcover_low")
    CloudcoverLow,
    @SerialName("cloudcover_mid")
    CloudcoverMid,
    @SerialName("cloudcover_high")
    CloudcoverHigh,
    @SerialName("evapotranspiration")
    Evapotranspiration,
    @SerialName("et0_fao_evapotranspiration")
    Et0FaoEvapotranspiration,
    @SerialName("vapor_pressure_deficit")
    VaporPressureDeficit,
    @SerialName("latent_heatflux")
    LatentHeatflux,
    @SerialName("sensible_heatflux")
    SensibleHeatflux,
    @SerialName("windspeed_10m")
    Windspeed10m,
    @SerialName("windspeed_80m")
    Windspeed80m,
    @SerialName("windspeed_120m")
    Windspeed120m,
    @SerialName("windspeed_180m")
    Windspeed180m,
    @SerialName("winddirection_10m")
    Winddirection10m,
    @SerialName("winddirection_80m")
    Winddirection80m,
    @SerialName("winddirection_120m")
    Winddirection120m,
    @SerialName("winddirection_180m")
    Winddirection180m,
    @SerialName("windgusts_10m")
    Windgusts10m,
    @SerialName("temperature_80m")
    Temperature80m,
    @SerialName("temperature_120m")
    Temperature120m,
    @SerialName("temperature_180m")
    Temperature180m,
    @SerialName("soil_temperature_0cm")
    SoilTemperature0cm,
    @SerialName("soil_temperature_6cm")
    SoilTemperature6cm,
    @SerialName("soil_temperature_18cm")
    SoilTemperature18cm,
    @SerialName("soil_temperature_54cm")
    SoilTemperature54cm,
    @SerialName("soil_moisture_0_1cm")
    SoilMoisture01cm,
    @SerialName("soil_moisture_1_3cm")
    SoilMoisture13cm,
    @SerialName("soil_moisture_3_9cm")
    SoilMoisture39cm,
    @SerialName("soil_moisture_9_27cm")
    SoilMoisture927cm,
    @SerialName("soil_moisture_27_81cm")
    SoilMoisture2781cm,
    @SerialName("shortwave_radiation")
    ShortwaveRadiation,
    @SerialName("direct_radiation")
    DirectRadiation,
    @SerialName("diffuse_radiation")
    DiffuseRadiation,
    @SerialName("direct_normal_irradiance")
    DirectNormalIrradiance,
    @SerialName("terrestrial_radiation")
    TerrestrialRadiation,
    @SerialName("shortwave_radiation_instant")
    ShortwaveRadiationInstant,
    @SerialName("direct_radiation_instant")
    DirectRadiationInstant,
    @SerialName("diffuse_radiation_instant")
    DiffuseRadiationInstant,
    @SerialName("direct_normal_irradiance_instant")
    DirectNormalIrradianceInstant,
    @SerialName("terrestrial_radiation_instant")
    TerrestrialRadiationInstant,
    @SerialName("temperature_1000hPa")
    Temperature1000hPa,
    @SerialName("temperature_975hPa")
    Temperature975hPa,
    @SerialName("temperature_950hPa")
    Temperature950hPa,
    @SerialName("temperature_925hPa")
    Temperature925hPa,
    @SerialName("temperature_900hPa")
    Temperature900hPa,
    @SerialName("temperature_850hPa")
    Temperature850hPa,
    @SerialName("temperature_800hPa")
    Temperature800hPa,
    @SerialName("temperature_700hPa")
    Temperature700hPa,
    @SerialName("temperature_600hPa")
    Temperature600hPa,
    @SerialName("temperature_500hPa")
    Temperature500hPa,
    @SerialName("temperature_400hPa")
    Temperature400hPa,
    @SerialName("temperature_300hPa")
    Temperature300hPa,
    @SerialName("temperature_250hPa")
    Temperature250hPa,
    @SerialName("temperature_200hPa")
    Temperature200hPa,
    @SerialName("temperature_150hPa")
    Temperature150hPa,
    @SerialName("temperature_100hPa")
    Temperature100hPa,
    @SerialName("temperature_70hPa")
    Temperature70hPa,
    @SerialName("temperature_50hPa")
    Temperature50hPa,
    @SerialName("temperature_30hPa")
    Temperature30hPa,
    @SerialName("dewpoint_1000hPa")
    Dewpoint1000hPa,
    @SerialName("dewpoint_975hPa")
    Dewpoint975hPa,
    @SerialName("dewpoint_950hPa")
    Dewpoint950hPa,
    @SerialName("dewpoint_925hPa")
    Dewpoint925hPa,
    @SerialName("dewpoint_900hPa")
    Dewpoint900hPa,
    @SerialName("dewpoint_850hPa")
    Dewpoint850hPa,
    @SerialName("dewpoint_800hPa")
    Dewpoint800hPa,
    @SerialName("dewpoint_700hPa")
    Dewpoint700hPa,
    @SerialName("dewpoint_600hPa")
    Dewpoint600hPa,
    @SerialName("dewpoint_500hPa")
    Dewpoint500hPa,
    @SerialName("dewpoint_400hPa")
    Dewpoint400hPa,
    @SerialName("dewpoint_300hPa")
    Dewpoint300hPa,
    @SerialName("dewpoint_250hPa")
    Dewpoint250hPa,
    @SerialName("dewpoint_200hPa")
    Dewpoint200hPa,
    @SerialName("dewpoint_150hPa")
    Dewpoint150hPa,
    @SerialName("dewpoint_100hPa")
    Dewpoint100hPa,
    @SerialName("dewpoint_70hPa")
    Dewpoint70hPa,
    @SerialName("dewpoint_50hPa")
    Dewpoint50hPa,
    @SerialName("dewpoint_30hPa")
    Dewpoint30hPa,
    @SerialName("relativehumidity_1000hPa")
    Relativehumidity1000hPa,
    @SerialName("relativehumidity_975hPa")
    Relativehumidity975hPa,
    @SerialName("relativehumidity_950hPa")
    Relativehumidity950hPa,
    @SerialName("relativehumidity_925hPa")
    Relativehumidity925hPa,
    @SerialName("relativehumidity_900hPa")
    Relativehumidity900hPa,
    @SerialName("relativehumidity_850hPa")
    Relativehumidity850hPa,
    @SerialName("relativehumidity_800hPa")
    Relativehumidity800hPa,
    @SerialName("relativehumidity_700hPa")
    Relativehumidity700hPa,
    @SerialName("relativehumidity_600hPa")
    Relativehumidity600hPa,
    @SerialName("relativehumidity_500hPa")
    Relativehumidity500hPa,
    @SerialName("relativehumidity_400hPa")
    Relativehumidity400hPa,
    @SerialName("relativehumidity_300hPa")
    Relativehumidity300hPa,
    @SerialName("relativehumidity_250hPa")
    Relativehumidity250hPa,
    @SerialName("relativehumidity_200hPa")
    Relativehumidity200hPa,
    @SerialName("relativehumidity_150hPa")
    Relativehumidity150hPa,
    @SerialName("relativehumidity_100hPa")
    Relativehumidity100hPa,
    @SerialName("relativehumidity_70hPa")
    Relativehumidity70hPa,
    @SerialName("relativehumidity_50hPa")
    Relativehumidity50hPa,
    @SerialName("relativehumidity_30hPa")
    Relativehumidity30hPa,
    @SerialName("cloudcover_1000hPa")
    Cloudcover1000hPa,
    @SerialName("cloudcover_975hPa")
    Cloudcover975hPa,
    @SerialName("cloudcover_950hPa")
    Cloudcover950hPa,
    @SerialName("cloudcover_925hPa")
    Cloudcover925hPa,
    @SerialName("cloudcover_900hPa")
    Cloudcover900hPa,
    @SerialName("cloudcover_850hPa")
    Cloudcover850hPa,
    @SerialName("cloudcover_800hPa")
    Cloudcover800hPa,
    @SerialName("cloudcover_700hPa")
    Cloudcover700hPa,
    @SerialName("cloudcover_600hPa")
    Cloudcover600hPa,
    @SerialName("cloudcover_500hPa")
    Cloudcover500hPa,
    @SerialName("cloudcover_400hPa")
    Cloudcover400hPa,
    @SerialName("cloudcover_300hPa")
    Cloudcover300hPa,
    @SerialName("cloudcover_250hPa")
    Cloudcover250hPa,
    @SerialName("cloudcover_200hPa")
    Cloudcover200hPa,
    @SerialName("cloudcover_150hPa")
    Cloudcover150hPa,
    @SerialName("cloudcover_100hPa")
    Cloudcover100hPa,
    @SerialName("cloudcover_70hPa")
    Cloudcover70hPa,
    @SerialName("cloudcover_50hPa")
    Cloudcover50hPa,
    @SerialName("cloudcover_30hPa")
    Cloudcover30hPa,
    @SerialName("windspeed_1000hPa")
    Windspeed1000hPa,
    @SerialName("windspeed_975hPa")
    Windspeed975hPa,
    @SerialName("windspeed_950hPa")
    Windspeed950hPa,
    @SerialName("windspeed_925hPa")
    Windspeed925hPa,
    @SerialName("windspeed_900hPa")
    Windspeed900hPa,
    @SerialName("windspeed_850hPa")
    Windspeed850hPa,
    @SerialName("windspeed_800hPa")
    Windspeed800hPa,
    @SerialName("windspeed_700hPa")
    Windspeed700hPa,
    @SerialName("windspeed_600hPa")
    Windspeed600hPa,
    @SerialName("windspeed_500hPa")
    Windspeed500hPa,
    @SerialName("windspeed_400hPa")
    Windspeed400hPa,
    @SerialName("windspeed_300hPa")
    Windspeed300hPa,
    @SerialName("windspeed_250hPa")
    Windspeed250hPa,
    @SerialName("windspeed_200hPa")
    Windspeed200hPa,
    @SerialName("windspeed_150hPa")
    Windspeed150hPa,
    @SerialName("windspeed_100hPa")
    Windspeed100hPa,
    @SerialName("windspeed_70hPa")
    Windspeed70hPa,
    @SerialName("windspeed_50hPa")
    Windspeed50hPa,
    @SerialName("windspeed_30hPa")
    Windspeed30hPa,
    @SerialName("winddirection_1000hPa")
    Winddirection1000hPa,
    @SerialName("winddirection_975hPa")
    Winddirection975hPa,
    @SerialName("winddirection_950hPa")
    Winddirection950hPa,
    @SerialName("winddirection_925hPa")
    Winddirection925hPa,
    @SerialName("winddirection_900hPa")
    Winddirection900hPa,
    @SerialName("winddirection_850hPa")
    Winddirection850hPa,
    @SerialName("winddirection_800hPa")
    Winddirection800hPa,
    @SerialName("winddirection_700hPa")
    Winddirection700hPa,
    @SerialName("winddirection_600hPa")
    Winddirection600hPa,
    @SerialName("winddirection_500hPa")
    Winddirection500hPa,
    @SerialName("winddirection_400hPa")
    Winddirection400hPa,
    @SerialName("winddirection_300hPa")
    Winddirection300hPa,
    @SerialName("winddirection_250hPa")
    Winddirection250hPa,
    @SerialName("winddirection_200hPa")
    Winddirection200hPa,
    @SerialName("winddirection_150hPa")
    Winddirection150hPa,
    @SerialName("winddirection_100hPa")
    Winddirection100hPa,
    @SerialName("winddirection_70hPa")
    Winddirection70hPa,
    @SerialName("winddirection_50hPa")
    Winddirection50hPa,
    @SerialName("winddirection_30hPa")
    Winddirection30hPa,
    @SerialName("geopotential_height_1000hPa")
    GeopotentialHeight1000hPa,
    @SerialName("geopotential_height_975hPa")
    GeopotentialHeight975hPa,
    @SerialName("geopotential_height_950hPa")
    GeopotentialHeight950hPa,
    @SerialName("geopotential_height_925hPa")
    GeopotentialHeight925hPa,
    @SerialName("geopotential_height_900hPa")
    GeopotentialHeight900hPa,
    @SerialName("geopotential_height_850hPa")
    GeopotentialHeight850hPa,
    @SerialName("geopotential_height_800hPa")
    GeopotentialHeight800hPa,
    @SerialName("geopotential_height_700hPa")
    GeopotentialHeight700hPa,
    @SerialName("geopotential_height_600hPa")
    GeopotentialHeight600hPa,
    @SerialName("geopotential_height_500hPa")
    GeopotentialHeight500hPa,
    @SerialName("geopotential_height_400hPa")
    GeopotentialHeight400hPa,
    @SerialName("geopotential_height_300hPa")
    GeopotentialHeight300hPa,
    @SerialName("geopotential_height_250hPa")
    GeopotentialHeight250hPa,
    @SerialName("geopotential_height_200hPa")
    GeopotentialHeight200hPa,
    @SerialName("geopotential_height_150hPa")
    GeopotentialHeight150hPa,
    @SerialName("geopotential_height_100hPa")
    GeopotentialHeight100hPa,
    @SerialName("geopotential_height_70hPa")
    GeopotentialHeight70hPa,
    @SerialName("geopotential_height_50hPa")
    GeopotentialHeight50hPa,
    @SerialName("geopotential_height_30hPa")
    GeopotentialHeight30hPa,
}
