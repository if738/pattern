package com.spd.builder.entities.classicbuilder.bulder

import com.spd.builder.components.optional.Headphones
import com.spd.builder.components.optional.KeyBoard
import com.spd.builder.components.optional.Monitor
import com.spd.builder.components.optional.Mouse
import com.spd.builder.components.required.*
import com.spd.builder.entities.classicbuilder.Builder
import com.spd.builder.entities.classicbuilder.PCC

class PcBuilder(
    private var headphones: Headphones? = null,
    private var keyBoard: KeyBoard? = null,
    private var monitor: Monitor? = null,
    private var mouse: Mouse? = null,
    private var cpu: CPU? = null,
    private var gpu: GPU? = null,
    private var motherBoard: MotherBoard? = null,
    private var psu: PSU? = null,
    private var ram: RAM? = null,
    private var storage: Storage? = null
): Builder {

    fun build(): PCC {
        return PCC(headphones, keyBoard, monitor, mouse, cpu, gpu, motherBoard, psu, ram, storage)
    }

    override fun setHeadphones(headphones: Headphones?) {
        this.headphones = headphones
    }

    override fun setKeyboard(keyBoard: KeyBoard?) {
        this.keyBoard = keyBoard
    }

    override fun setMonitor(monitor: Monitor?) {
        this.monitor = monitor
    }

    override fun setMouse(mouse: Mouse?) {
        this.mouse = mouse
    }

    override fun setCpu(cpu: CPU?) {
        this.cpu = cpu
    }

    override fun setGpu(gpu: GPU?) {
        this.gpu = gpu
    }

    override fun setMotherBoard(motherBoard: MotherBoard?) {
        this.motherBoard = motherBoard
    }

    override fun setPsu(psu: PSU?) {
        this.psu = psu
    }

    override fun setRam(ram: RAM?) {
        this.ram = ram
    }

    override fun setStorage(storage: Storage?) {
        this.storage = storage
    }

}