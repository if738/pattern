package com.spd.prototype.wrapper.extended

import com.spd.prototype.wrapper.Template
import com.spd.prototype.wrapper.TemplateDecorator


class EncodedTemplate(template: Template) : TemplateDecorator(template) {

    override fun save(data: String) {
        super.save("$data encoded")
    }


}
