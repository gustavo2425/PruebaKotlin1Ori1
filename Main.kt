fun main() {

    fun consultarDisponibilidad() {
        println("Consultando disponibilidad...")
        Thread.sleep(1000)
        println("Disponibilidad cargada")
    }

    fun main() {

        consultarDisponibilidad()

        val mantenedor = MantenedorReservas()


    }

    consultarDisponibilidad()

    val mantenedor = MantenedorReservas()

    val r1 = ReservaAlojamiento(
        45000.0,
        2,
        TipoAlojamiento.HABITACION,
        1,
        "Ana Perez",
        3
    )

    val r2 = ReservaAlojamiento(
        60000.0,
        4,
        TipoAlojamiento.CABANA,
        2,
        "Juan Soto",
        2
    )

    val r3 = ReservaAlojamiento(
        70000.0,
        3,
        TipoAlojamiento.DEPARTAMENTO,
        3,
        "Maria Lopez",
        4
    )

    val r4 = ReservaAlojamiento(
        50000.0,
        2,
        TipoAlojamiento.HABITACION,
        1,
        "",
        2
    )

    println(mantenedor.registrarReserva(r1))
    println(mantenedor.registrarReserva(r2))
    println(mantenedor.registrarReserva(r3))
    println(mantenedor.registrarReserva(r4))

    println("LISTA DE RESERVAS")

    for (reserva in mantenedor.obtenerReservas()) {

        println("ID: ${reserva.id}")
        println("Cliente: ${reserva.nombreCliente}")
        println("Noches: ${reserva.cantidadNoches}")
        println("Tipo: ${reserva.tipoAlojamiento.descripcion}")
        println("Total: ${reserva.calcularTotal()}")
        println(reserva.descripcion())
        println("--------------------")
    }

    val totalGeneral = mantenedor.obtenerReservas().sumOf {
        it.calcularTotal()
    }

    println("Total general: $totalGeneral")

    val reservasCaras = mantenedor.obtenerReservas().filter {
        it.calcularTotal() > 100000
    }

    println("Reservas sobre 100000")

    for (reserva in reservasCaras) {
        println(reserva.nombreCliente)
    }

    try {
        val numero = 10 / 0
        println(numero)
    } catch (e: Exception) {
        println("Error capturao")
    }

    val reservaGeneral: Reserva = r1


    println(reservaGeneral.descripcion())
}