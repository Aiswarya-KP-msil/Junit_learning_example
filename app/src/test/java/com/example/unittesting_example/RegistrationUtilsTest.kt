package com.example.unittesting_example

import com.google.common.truth.Truth.assertThat
import org.junit.Test


class RegistrationUtilsTest{

    @Test
    fun `empty username returns false`(){
        val result = RegistrationUtils.validateRegistrationInput(
            userName = "",
            password = "123",
            confirmedPassword = "123"
        )
        assertThat(result).isFalse()
    }
    @Test
    fun `username already existing retursns false`(){
        val result = RegistrationUtils.validateRegistrationInput(
            userName = "Aishu",
            password = "123",
            confirmedPassword = "123"
        )
        assertThat(result).isFalse()
    }
    @Test
    fun `confirm password not match to password`(){
        val result = RegistrationUtils.validateRegistrationInput(
            userName = "ammu",
            password = "123",
            confirmedPassword = "1234"
        )
        assertThat(result).isFalse()
    }
    @Test
    fun `password is empty`(){
        val result = RegistrationUtils.validateRegistrationInput(
            userName = "ammu",
            password = "",
            confirmedPassword = "123"
        )
        assertThat(result).isFalse()
    }
}