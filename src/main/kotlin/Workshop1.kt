package org.example

// Workshop #1: Simple Console Application - Unit Converter

fun main() {
    while (true) {
        println("===== Unit Converter =====")
        println("โปรดเลือกหน่วยที่ต้องการแปลง:")
        println("1. Celsius to Fahrenheit")
        println("2. Kilometers to Miles")
        println("พิมพ์ 'exit' เพื่อออกจากโปรแกรม")
        print("เลือกเมนู (1, 2, or exit): ")

        val choice = readln()

        when (choice) {
            "1" -> convertCelsiusToFahrenheit()
            "2" -> convertKilometersToMiles()
            "exit" -> break
            else -> println("You have not selected the unit to convert.")
        }

        println()
    }
}

// 4. สร้างฟังก์ชันแยกสำหรับการแปลงหน่วย Celsius to Fahrenheit: celsiusToFahrenheit
// สูตร celsius * 9.0 / 5.0 + 32
fun celsiusToFahrenheit(celsius: Double): Double {
    return celsius * 9.0 / 5.0 + 32
}
// 🚨


// 4. สร้างฟังก์ชันแยกสำหรับการแปลงหน่วย Kilometers to Miles: kilometersToMiles
 fun kilometersToMiles(kilometers: Double): Double {     /// (ชื่อตัวแปร : ชนิดตัวแปร): ค่าที่รีเทิร์นออกไป
     return kilometers * 0.621371
 }
// สูตร kilometers * 0.621371
// 🚨


// ฟังก์ชันสำหรับจัดการกระบวนการแปลง Celsius to Fahrenheit ทั้งหมด
fun convertCelsiusToFahrenheit() {
    print("ป้อนค่าองศาเซลเซียส (Celsius): ")
    val celsius = readln()
    val celsiusDouble  = celsius.toDoubleOrNull() ?: run {                                  //!! Run !!
        println("Enter number !!")
        return
    }

    // 5. จัดการ Null Safety ด้วย toDoubleOrNull() และ Elvis operator (?:)
    // ออกจากฟังก์ชัน convertCelsiusToFahrenheit() หากข้อมูลผิดพลาด: return
    // celsius
    // 🚨


    val fahrenheitResult = celsiusToFahrenheit(celsiusDouble)

    // 6. แสดงผลลัพธ์
    // ใช้ String format เพื่อแสดงทศนิยม 2 ตำแหน่ง
    println("ผลลัพธ์: $celsius °C เท่ากับ ${"%.2f".format(fahrenheitResult)} °F")
}

// ฟังก์ชันสำหรับจัดการกระบวนการแปลง Kilometers to Miles ทั้งหมด
fun convertKilometersToMiles() {
    print("ป้อนค่ากิโลเมตร (Kilometers): ")
    val read = readln()
    val kilometers = read.toDoubleOrNull() ?: return
    // 5. จัดการ Null Safety ด้วย toDoubleOrNull() และ Elvis operator (?:)
    // ออกจากฟังก์ชัน convertKilometersToMiles() หากข้อมูลผิดพลาด: return
    // kilometers
    // 🚨

    // สูตร kilometers * 0.621371
   val milesResult = kilometersToMiles(kilometers)

    // 6. แสดงผลลัพธ์
    println("ผลลัพธ์: $kilometers km เท่ากับ ${"%.2f".format(milesResult)} miles")
}