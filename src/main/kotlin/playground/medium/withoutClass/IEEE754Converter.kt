package playground.medium.withoutClass

import java.lang.Float
import java.lang.Double

fun main() {
    println("IEEE-754 Single-Precision and Double-Precision Converter")
    print("Enter a decimal number to convert: ")
    val inputNumber = readln().toDouble()

    //Convert to IEEE-754 single-precision (float)
    val floatValue = inputNumber.toFloat()
    val floatBits = Float.floatToIntBits(floatValue)

    //Extracting Sign bit, Exponent bits, and Mantissa bits for float
    val floatSign = (floatBits ushr 31) and 1
    val floatExponent = (floatBits ushr 23) and 0xFF
    val floatMantissa = floatBits and 0x7FFFFF

    //Convert to IEEE-754 double-precision (double)
    val doubleBits = Double.doubleToLongBits(inputNumber)

    //Extracting Sign bit, Exponent bits, and Mantissa bits for double
    val doubleSign = (doubleBits ushr 63) and 1
    val doubleExponent = (doubleBits ushr 52) and 0x7FF
    val doubleMantissa = doubleBits and 0xFFFFFFFFFFFFFL

    println("\nSingle-Precision (float) Binary Representation: ${Integer.toBinaryString(floatBits)}")
    println("Sign bit: $floatSign")
    println("Exponent bits: ${String.format("%8s", Integer.toBinaryString(floatExponent)).replace(' ', '0')}")
    println("Mantissa bits: ${String.format("%23s", Integer.toBinaryString(floatMantissa)).replace(' ', '0')}")

    println("\nDouble-Precision (double) Binary Representation: ${java.lang.Long.toBinaryString(doubleBits)}")
    println("Sign bit: $doubleSign")
    println("Exponent bits: ${String.format("%11s", java.lang.Long.toBinaryString(doubleExponent)).replace(' ', '0')}")
    println("Mantissa bits: ${String.format("%52s", java.lang.Long.toBinaryString(doubleMantissa)).replace(' ', '0')}")

    //Division and Multiplication
    println("\n32-bit Binary Representation of $inputNumber:")

    //Convert the decimal to binary
    val binaryIntegerPart = StringBuilder()
    val binaryFractionalPart = StringBuilder()

    var integerPart = inputNumber.toInt()
    var fractionalPart = inputNumber - integerPart

    //Division
    while (integerPart > 0) {
        val quotient = integerPart / 2
        val remainder = integerPart % 2
        binaryIntegerPart.insert(0, "\n$integerPart ÷ 2 = $quotient + $remainder")
        integerPart = quotient
    }

    //TODO("fix the multiplication")
    //Multiplication
    var count = 1
    while (count <= 24) {
        fractionalPart *= 2

        val integerPartFractional = fractionalPart.toInt()

        val minusOne = if (fractionalPart >= 1) {
            fractionalPart -= 1
            fractionalPart
        } else {
            fractionalPart
        }

        //Format both fractionalPart and minusOne to show only one decimal place
        val formattedFractionalPart = String.format("%.1f", fractionalPart)
        val formattedMinusOne = String.format("%.1f", minusOne)

        binaryFractionalPart.append("\n$count) ${formattedFractionalPart} × 2 = $integerPartFractional + $formattedMinusOne")
        count++
    }

    println("Integer Part:\n${binaryIntegerPart.toString().trim()}")
    println("\nFractional Part:\n${binaryFractionalPart.toString().trim()}")
}
