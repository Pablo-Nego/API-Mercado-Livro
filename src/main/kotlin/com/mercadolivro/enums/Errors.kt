package com.mercadolivro.enums

enum class Errors(val code: String, val message: String) {
    ML000("ML-0000", "Unathorized"),
    ML001("ML-001", "Invalid Request"),
    ML101("ML-101", "Book [%S] not exists"),
    ML102("ML-102", "cannot update book with status [%S]"),
    ML201("ML-201" ,"Customer [%S] not exists"),

}