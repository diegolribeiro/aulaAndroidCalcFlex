package br.com.diegolandiribeiro.calculadoraflex.model

data class User(
    //= "" é para setar o valor default caso não venha do firebase
    val name: String = "",
    val email: String = "",
    val phone: String = ""
)