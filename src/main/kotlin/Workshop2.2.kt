package org.example

// 1. กำหนด data class สำหรับเก็บข้อมูลสินค้า
data class Products(val name: String, val price: Double, val category: String)

fun main() {
    // 2. สร้างรายการสินค้าตัวอย่าง (List<Product>)
    //    val products = ?
    val products = listOf(
        Products(name = "Laptop", price = 35000.0, category = "Electronics"),
        Products(name = "Smartphone", price = 25000.0, category = "Electronics"),
        Products(name = "T-shirt", price = 450.0, category = "Apparel"),
        Products(name = "Monitor", price = 7500.0, category = "Electronics"),
        Products(name = "Keyboard", price = 499.0, category = "Electronics"),    // ราคาไม่เกิน 500
        Products(name = "Jeans", price = 1200.0, category = "Apparel"),
        Products(name = "Headphones", price = 1800.0, category = "Electronics")    // ตรงตามเงื่อนไข
    )

    println("รายการสินค้าทั้งหมด:")
    products.forEach { println(it) }
    println("--------------------------------------------------")

    val groupedByPriceRange = products.groupBy { product ->
        when {
            product.price <= 1000 -> "ไม่เกิน 1,000 บาท"
            product.price <= 10000 -> "1,001 - 10,000 บาท"
            else -> "มากกว่า 10,000 บาท"
        }
    }

    println("แบ่งกลุ่มสินค้าตามช่วงราคา:")
    groupedByPriceRange.forEach { (range, items) ->
        println("ช่วงราคา: $range")
        items.forEach { println(" - ${it.name} (${it.price} บาท)") }
        println()
    }

    println("--------------------------------------------------")

}