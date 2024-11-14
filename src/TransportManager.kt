class TransportManager {

    private val deliveries: MutableList<TransportationService> = mutableListOf()

    fun addDelivery(delivery: TransportationService) {
        deliveries.add(delivery)
    }

    fun processAllDeliveries() {
        for (delivery in deliveries) {
            println(delivery.executeDelivery())
        }
    }
}