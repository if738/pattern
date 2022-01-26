package com.spd.example

class TextEditorMemento(private val textWindow: TextEditor) : Memento {

    override fun restore() {
        textWindow.undo()
    }

}