class Plane(distance: Double) : TransportationService(distance), TransportProcess {

    private val costPerKm: Double = 2000.0 // Biaya per km untuk pengiriman udara

    override fun calculateCost(): Double {
        return distance * costPerKm
    }

    override fun deliverPackage(): String {
        return "Delivering package by plane"
    }

    override fun executeDelivery(): String {
        return "${deliverPackage()} with cost: ${calculateCost()}"
    }
}