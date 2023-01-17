package com.example.browselinksproject

sealed class UnionType {
    data class TitleData(val siteType: String) : UnionType()
    data class SiteData(val site: String) : UnionType()
}
