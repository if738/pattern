package com.spd.prototype.wrapper

open class TemplateDecorator(template: Template) : Template {

    private var husk: Template = template

    override fun save(data: String) {
        husk.save(data)
    }

    override fun read(): String = husk.read()


}