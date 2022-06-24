package com.example.unittesting_example

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import org.junit.Test
import com.google.common.truth.Truth.assertThat
import org.junit.After
import org.junit.Before


class ResourceComparerTest{
    private  lateinit var  resourceComparer: ResourceComparer
    @Before
    fun setUp(){
        resourceComparer = ResourceComparer()
    }
    @After
    fun  afterTesting(){
        // after use for close and destroy the object like sometimes we need to close the database
    }
    @Test
    fun stringResourceSameAs_GivenString_returnTrue(){
       // resourceComparer = ResourceComparer() // each test has its own instance
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceComparer.isEqual(context,R.string.testing,"Unit testing")
        assertThat(result).isTrue()

    }
    @Test
    fun stringResourceDiffAs_GivenString_returnFalse(){
      //  resourceComparer = ResourceComparer()
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceComparer.isEqual(context,R.string.app_name,"Unit testing")
        assertThat(result).isFalse()

    }
}