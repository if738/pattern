package com.spd.example

class TextWindow : Window {

    var currentText: String = ""

    constructor(currentText: String) {
        this.currentText = currentText
    }

    fun setText(text: String) {
        currentText = text
    }

    override fun saveState(): Memento {
        return TextWindowsMemento(this, currentText)
    }

    fun setState(state: String) {
        currentText = state
    }

//    inner class Memento(private val window: TextWindow) {
//        fun getState(): TextWindow {
//            return window
//        }
//    }

}
