abstract class TransportationService(protected val distance: Double) {
    abstract fun executeDelivery(): String
}