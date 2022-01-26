package com.spd.example.sm

import com.spd.example.User

class PremiumState(private val user: User) : State {

    override fun register() {

    }

    override fun confirmEmail() {

    }

    override fun activePremium() {

    }

    override fun deactivatePremium() {
        user.changeState(RegisteredState(user))
    }

    override fun banned() {
        user.changeState(BannedState(user))
    }

    override fun unbanned() {
        user.changeState(this)
    }
}