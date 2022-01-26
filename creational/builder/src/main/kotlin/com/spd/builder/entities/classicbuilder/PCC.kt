package com.spd.builder.entities.classicbuilder

import com.spd.builder.components.optional.Headphones
import com.spd.builder.components.optional.KeyBoard
import com.spd.builder.components.optional.Monitor
import com.spd.builder.components.optional.Mouse
import com.spd.builder.components.required.*

class PCC (

    private var headphones: Headphones?,
    private var keyBoard: KeyBoard?,
    private var monitor: Monitor?,
    private var mouse: Mouse?,
    private var cpu: CPU?,
    private var gpu: GPU?,
    private var motherBoard: MotherBoard?,
    private var psu: PSU?,
    private var ram: RAM?,
    private var storage: Storage?

)