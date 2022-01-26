package com.spd.example

class GenerateMySQLInvoice : GenerateDefaultInvoice() {

    override fun getData(): String {
        return "From MySQL"
    }

}