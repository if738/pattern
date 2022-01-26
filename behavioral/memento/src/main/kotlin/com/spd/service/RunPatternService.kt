package com.spd.service

import com.spd.example.History
import com.spd.example.TextEditor
import com.spd.example.TextWindow
import org.springframework.stereotype.Component
import javax.annotation.PostConstruct

@Component
class RunPatternService {

    @PostConstruct
    fun runIt() {

        val history = History()
        val textWindow = TextWindow("init hello")
        val textEditor = TextEditor(textWindow, history)
        textEditor.add("hello")
        println(textWindow.currentText)
        textEditor.add("hello2")
        println(textWindow.currentText)
        textEditor.add("hello3")
        println(textWindow.currentText)

        textEditor.undo()
        println(textWindow.currentText)

        textEditor.undo()
        println(textWindow.currentText)

        textEditor.undo()
        println(textWindow.currentText)

        textEditor.undo()
        println(textWindow.currentText)

    }

}
