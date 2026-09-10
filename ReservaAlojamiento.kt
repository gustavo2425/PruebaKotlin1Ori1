data class ReservaAlojamiento(
    val valorPorNoche: Double,
    val cantidadPersonas: Int,
    val tipoAlojamiento: TipoAlojamiento,

    val identificador: Int,
    val cliente: String,
    val noches: Int

) : Reserva(
    identificador,
    cliente,
    noches
) {

    fun calcularTotal(): Double {
        return valorPorNoche * cantidadNoches
    }

    override fun descripcion(): String {
        return "Reserva de ${tipoAlojamiento.descripcion} para $cantidadPersonas personas"
    }
}