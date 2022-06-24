package com.example.unittesting_example

import android.content.Context

class ResourceComparer {
    fun isEqual(context: Context,resId: Int,compString: String): Boolean{
        return context.getString(resId).equals(compString)

    }
}