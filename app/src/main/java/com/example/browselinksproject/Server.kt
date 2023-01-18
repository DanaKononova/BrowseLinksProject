package com.example.browselinksproject

object Server {
    fun getList(): List<UnionType> = listOf(
        UnionType.TitleData("Новости"),
        UnionType.SiteData("https://ru.euronews.com/news"),
        UnionType.SiteData("https://www.zerkalo.io/"),
        UnionType.SiteData("https://www.bbc.com/news"),
        UnionType.TitleData("Соц-сети"),
        UnionType.SiteData("https://web.telegram.org/"),
        UnionType.SiteData("https://www.instagram.com/"),
        UnionType.SiteData("https://twitter.com/?lang=ru"),
        UnionType.SiteData("https://www.linkedin.com/"),
        UnionType.TitleData("Фильмы"),
        UnionType.SiteData("https://www.kinopoisk.ru/lists/categories/movies/1/"),
        UnionType.SiteData("https://www.ivi.ru/movies"),
        UnionType.SiteData("https://www.netflix.com/browse/genre/34399"),
        UnionType.TitleData("Погода"),
        UnionType.SiteData("https://www.gismeteo.by/weather-minsk-4248/"),
        UnionType.SiteData("https://pogoda.by/"),
        UnionType.SiteData("https://yandex.ru/pogoda/minsk"),
        UnionType.SiteData("https://meteo.by/minsk/"),
        UnionType.TitleData("Транспорт"),
        UnionType.SiteData("https://yandex.by/maps/157/minsk/transport/"),
        UnionType.SiteData("https://www.minsktrans.by/lookout_yard"),
        UnionType.SiteData("https://transport-by.app/"),
        UnionType.SiteData("https://pass.rw.by/ru/")
    )
}