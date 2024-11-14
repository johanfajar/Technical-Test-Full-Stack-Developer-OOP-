class Ship(distance: Double) : TransportationService(distance), TransportProcess {

    private val costPerKm: Double = 1000.0 // Biaya per km untuk pengiriman laut

    override fun calculateCost(): Double {
        return distance * costPerKm
    }

    override fun deliverPackage(): String {
        return "Delivering package by ship"
    }

    override fun executeDelivery(): String {
        return "${deliverPackage()} with cost: ${calculateCost()}"
    }
}