fun rgb(r: Int, g: Int, b: Int): String {
    val n1 = if (r < 0) { 0 } else if (r > 255) { 255 } else { r }
    val n2 = if (g < 0) { 0 } else if (g > 255) { 255 } else { g }
    val n3 = if (b < 0) { 0 } else if (b > 255) { 255 } else { b }
    var stringR = Integer.toHexString(n1).uppercase(); if (stringR.length == 1) { stringR = "0$stringR" }
    var stringG = Integer.toHexString(n2).uppercase(); if (stringG.length == 1) { stringG = "0$stringG" }
    var stringB = Integer.toHexString(n3).uppercase(); if (stringB.length == 1) { stringB = "0$stringB" }
    return "$stringR$stringG$stringB" 
}
