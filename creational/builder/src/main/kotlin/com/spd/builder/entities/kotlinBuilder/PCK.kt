package com.spd.builder.entities.kotlinBuilder

import com.spd.builder.components.optional.Headphones
import com.spd.builder.components.optional.KeyBoard
import com.spd.builder.components.optional.Monitor
import com.spd.builder.components.optional.Mouse
import com.spd.builder.components.required.*

class PCK private constructor(val headphones: Headphones?,
                              val keyBoard: KeyBoard?,
                              val monitor: Monitor?,
                              val mouse: Mouse?,
                              val cpu: CPU?,
                              val gpu: GPU?,
                              val motherBoard: MotherBoard?,
                              val psu: PSU?,
                              val ram: RAM?) {

    class Builder {
        var headphones: Headphones? = null
            private set
        var keyBoard: KeyBoard? = null
            private set
        var monitor: Monitor? = null
            private set
        var mouse: Mouse? = null
            private set
        var cpu: CPU? = null
            private set
        var gpu: GPU? = null
            private set
        var motherBoard: MotherBoard? = null
            private set
        var psu: PSU? = null
            private set
        var ram: RAM? = null
            private set
        var storage: Storage? = null
            private set

        fun headphones(headphones: Headphones) = apply { this.headphones = headphones }
        fun keyBoard(keyBoard: KeyBoard) = apply { this.keyBoard = keyBoard }
        fun monitor(monitor: Monitor) = apply { this.monitor = monitor }
        fun mouse(mouse: Mouse) = apply { this.mouse = mouse }
        fun cpu(cpu: CPU) = apply { this.cpu = cpu }
        fun gpu(gpu: GPU) = apply { this.gpu = gpu }
        fun motherBoard(motherBoard: MotherBoard) = apply { this.motherBoard = motherBoard }
        fun psu(psu: PSU) = apply { this.psu = psu }
        fun ram(ram: RAM) = apply { this.ram = ram }
        fun build() = PCK(headphones, keyBoard, monitor, mouse, cpu, gpu, motherBoard, psu, ram)

    }


}