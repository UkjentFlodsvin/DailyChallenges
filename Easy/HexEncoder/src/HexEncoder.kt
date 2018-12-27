class HexEncoder {

    fun encode(red: Int, green: Int, blue: Int): String {
        var hex = "#"
        try {
            hex += intToHexConverter(red)
            hex += intToHexConverter(green)
            hex += intToHexConverter(blue)
        }
        catch (e: NumberFormatException){
            return "ERROR! Number must be between 0 and 255"
        }
        return hex
    }

    fun decode(hex: String): IntArray{
        val red = hexToIntConverter(hex.substring(1,3))
        val green = hexToIntConverter(hex.substring(3,5))
        val blue = hexToIntConverter(hex.substring(5,7))
        return intArrayOf(red,green,blue)
    }

    private fun hexToIntConverter(hex: String): Int {
        //Radix definerer tallsystem. Hex er et 16-tallsystem
        //Default er 10, binær bruker 2.
        return hex.toInt(16)
    }

    private fun intToHexConverter(value: Int): String {
        return when (value) {
            in 0..15 -> "0" + value.toString(16).toUpperCase()
            in 16..255 -> value.toString(16).toUpperCase()
            else -> throw NumberFormatException()
        }
    }
}

fun main(args: Array<String>) {
    val hexEncoder = HexEncoder()
    println(hexEncoder.encode(255, 16, 15))
    println(hexEncoder.decode("#FF100F").joinToString())
}