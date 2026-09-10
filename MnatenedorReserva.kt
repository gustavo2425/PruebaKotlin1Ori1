class MantenedorReservas {

    private val reservas = mutableListOf<ReservaAlojamiento>()

    fun registrarReserva(reserva: ReservaAlojamiento): String {

        if (reserva.id <= 0) {
            return "Error: ID inválido"
        }

        if (reserva.nombreCliente.isBlank()) {
            return "Error: Nombre vacío"
        }

        if (reserva.cantidadNoches <= 0) {
            return "Error: Cantidad de noches inválida"
        }

        if (reserva.valorPorNoche <= 0) {
            return "Error: Valor por noche inválido"
        }

        if (reserva.cantidadPersonas <= 0) {
            return "Error: Cantidad de personas inválida"
        }

        if (reservas.any { it.id == reserva.id }) {
            return "Error: Ya existe una reserva con ese ID"
        }

        reservas.add(reserva)

        return "Reserva registrada correctamente"
    }

    fun obtenerReservas(): List<ReservaAlojamiento> {
        return reservas
    }
}