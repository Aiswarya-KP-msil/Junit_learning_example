package com.example.unittesting_example

object RegistrationUtils
{
    private val  existingUsers = listOf<String>("Aishu","jithu")

    /**
     * the input is not valid if...
     * ...the username/password is empty
     * ...the username is already taken
     * ...the confirmed password is not the same as the real password
     * ...the password contains less than 2 digits
     */

    fun validateRegistrationInput(
        userName: String,
        password: String,
        confirmedPassword: String
    ):Boolean{
        if(userName.isEmpty()){
            return false
        }
        if (userName in existingUsers){
            return false
        }
        if (password != confirmedPassword){
            return false
        }
         return true
    }
}