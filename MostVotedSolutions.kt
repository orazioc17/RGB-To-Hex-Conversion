fun rgb(r: Int, g: Int, b: Int) = String.format("%02X%02X%02X", r.coerceIn(0..255), g.coerceIn(0..255), b.coerceIn(0..255))



fun rgb(r: Int, g: Int, b: Int) = listOf(r, g, b).joinToString("") {
    it.coerceIn(0..255).toString(16).padStart(2, '0').toUpperCase()
}
