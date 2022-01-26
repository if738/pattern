package com.spd.example

class TextWindowsMemento(private val textWindow: TextWindow, private val state: String) : Memento {

    override fun restore() {
        textWindow.setState(state)
    }

}