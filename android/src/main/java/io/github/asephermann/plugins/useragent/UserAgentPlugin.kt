package io.github.asephermann.plugins.useragent

import android.util.Log
import android.webkit.WebSettings
import android.webkit.WebView
import com.getcapacitor.JSObject
import com.getcapacitor.Plugin
import com.getcapacitor.PluginCall
import com.getcapacitor.PluginMethod
import com.getcapacitor.annotation.CapacitorPlugin


@CapacitorPlugin(name = "UserAgent")
class UserAgentPlugin : Plugin() {
    var settings: WebSettings? = null

    override fun load() {
        super.load()
        settings = WebView(context).settings
    }

    @PluginMethod
    fun get(call: PluginCall) {
        val ret = JSObject()
        ret.put("value", settings?.userAgentString)
        call.resolve(ret)
    }

    @PluginMethod
    fun set(call: PluginCall) {
        val value = call.getString("value")
        val userAgent = String.format(
            "%s %s",
            settings?.userAgentString,
            value
        )
        settings?.userAgentString = userAgent
        val ret = JSObject()
        ret.put("value", settings?.userAgentString)
        call.resolve(ret)
    }

    @PluginMethod
    fun reset(call: PluginCall) {
        settings?.userAgentString = null
        val ret = JSObject()
        ret.put("value", settings?.userAgentString)
        call.resolve(ret)
    }
}