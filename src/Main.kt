//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    // Membuat berbagai jenis pengiriman
    val landDelivery = Ship(100.0) // 100 km
    val seaDelivery = Plane(200.0)   // 200 km

    // Menggunakan DeliveryManager untuk mengelola pengiriman
    val deliveryManager = TransportManager()
    deliveryManager.addDelivery(landDelivery)
    deliveryManager.addDelivery(seaDelivery)

    // Memproses semua pengiriman
    deliveryManager.processAllDeliveries()
}