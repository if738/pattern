package com.spd.example

class TextEditor(private val window: TextWindow, private val history: History) {

    fun add(text: String) {
        history.push(window, window.saveState())
        window.setText(text)
    }

    fun get() {
        history.push(window, window.saveState())
        window.currentText
    }

    fun undo():Boolean {
        return history.pull()
    }

}