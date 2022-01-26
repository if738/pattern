package com.spd.example

import java.util.*


class History {

    private var stack: Stack<Pair> = Stack()

    private class Pair(var window: Window, var memento: Memento)

    fun push(window: Window, memento: Memento) {
        stack.push(Pair(window, memento))
    }

    fun pull(): Boolean {
        if (stack.empty()) return false
        stack.pop().memento.restore()
        return true
    }

}