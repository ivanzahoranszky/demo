package iz.demo.model

import com.google.gson.Gson

val gson = Gson()

fun Message.toJsonString(): String = gson.toJson(this)