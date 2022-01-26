package com.spd.example.sm

import com.spd.example.User

class RegisteredState(private val user: User) : State {

    override fun register() {

    }

    override fun confirmEmail() {

    }

    override fun activePremium() {
        user.changeState(PremiumState(user))
    }

    override fun deactivatePremium() {
        user.changeState(RegisteredState(user))
    }

    override fun banned() {
        user.changeState(BannedState(user))
    }

    override fun unbanned() {

    }

}