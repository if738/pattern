package com.spd.example

class GenerateExtendedXmlInvoice : GenerateDefaultInvoice(){

    override fun generateInvoice(): String {
        return "Extended Invoice"
    }

    override fun invoiceFormat(): String {
        return "XML"
    }

}