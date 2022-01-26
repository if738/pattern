package com.spd.builder.entities.classicbuilder

import com.spd.builder.components.optional.Headphones
import com.spd.builder.components.optional.KeyBoard
import com.spd.builder.components.optional.Monitor
import com.spd.builder.components.optional.Mouse
import com.spd.builder.components.required.*

// redundant
interface Builder {

    fun setHeadphones(headphones: Headphones?)
    fun setKeyboard(keyBoard: KeyBoard?)
    fun setMonitor(monitor: Monitor?)
    fun setMouse(mouse: Mouse?)
    fun setCpu(cpu: CPU?)
    fun setGpu(gpu: GPU?)
    fun setMotherBoard(motherBoard: MotherBoard?)
    fun setPsu(psu: PSU?)
    fun setRam(ram: RAM?)
    fun setStorage(storage: Storage?)

}