package app.opass.ccip.util

import com.google.gson.FieldNamingPolicy
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import java.lang.reflect.Type

object JsonUtil {
    val GSON: Gson = GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).create()

    fun <T> fromJson(json: String, clazz: Class<T>): T {
        return GSON.fromJson(json, clazz)
    }

    fun <T> fromJson(json: String, typeOfT: Type): T {
        return GSON.fromJson(json, typeOfT)
    }

    fun toJson(obj: Any): String {
        return GSON.toJson(obj)
    }
}
