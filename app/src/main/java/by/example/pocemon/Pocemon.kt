package by.example.pocemon

import java.io.Serializable


data class Pocemon(
    var image: Int,
    var name: String,
    var weight: Int,
    var height: Int

) : Serializable

