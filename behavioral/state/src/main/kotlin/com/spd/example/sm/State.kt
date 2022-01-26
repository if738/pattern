package com.spd.example.sm

interface State {

    fun register()
    fun confirmEmail()
    fun activePremium()
    fun deactivatePremium()
    fun banned()
    fun unbanned()

}