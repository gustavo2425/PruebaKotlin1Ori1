open class Reserva(
    val id: Int,
    val nombreCliente: String,
    val cantidadNoches: Int
) {

    open fun descripcion(): String {
        return "Reserva general"
    }
}