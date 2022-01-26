package com.spd.example

open class GenerateDefaultInvoice {

    open fun getData(): String {
        return "From Postgres"
    }

    open fun generateInvoice(): String {
        return "Default Invoice"
    }

    open fun invoiceFormat(): String {
        return "PDF"
    }

}