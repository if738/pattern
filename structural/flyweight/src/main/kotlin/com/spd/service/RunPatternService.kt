package com.spd.service


import com.spd.example.apple.Apple
import com.spd.example.apple.AppleType
import com.spd.example.apple.image.RedApple
import com.spd.example.apple.image.YellowApple
import org.springframework.stereotype.Component
import java.util.*
import javax.annotation.PostConstruct

@Component
class RunPatternService {

    @PostConstruct
    fun runIt() {

        var applesGarden: MutableList<Apple>? = ArrayList()

        val aidairedType = AppleType(RedApple().data, "aidaired")
        val victoryType = AppleType(YellowApple().data, "victory")

        for (i in 1..10_000_000) {
            applesGarden?.add(Apple(aidairedType, Random().nextInt(50000)))
            applesGarden?.add(Apple(victoryType, Random().nextInt(50000)))
        }


        val runtime = Runtime.getRuntime()

        println("WITH Flyweight WITH Flyweight WITH Flyweight")
        println("Free MB " + runtime.freeMemory() / 1000000)
        println("Total MB " + runtime.totalMemory() / 1000000)
        println("Difference " + (runtime.totalMemory() - runtime.freeMemory()) / 1000000)

        println("Apples count " + applesGarden?.size)

        println()

        applesGarden = null
        System.gc()

        applesGarden = ArrayList()

        println("after clearing an GC")
        println("Free MB " + runtime.freeMemory() / 1000000)
        println("Total MB " + runtime.totalMemory() / 1000000)
        println("Difference " + (runtime.totalMemory() - runtime.freeMemory()) / 1000000)

        println("Apples count " + applesGarden.size)

        println()
        for (i in 1..10_000) {
            applesGarden.add(Apple(AppleType(RedApple().data, "aidaired"), Random().nextInt(50000)))
            applesGarden.add(Apple(AppleType(YellowApple().data, "victory"), Random().nextInt(50000)))
        }

        println()

        println("NO Flyweight NO Flyweight NO Flyweight NO Flyweight")
        println("Free MB " + runtime.freeMemory() / 1000000)
        println("Total MB " + runtime.totalMemory() / 1000000)
        println("Difference " + (runtime.totalMemory() - runtime.freeMemory()) / 1000000)

        println("Apples count " + applesGarden.size)
    }

}