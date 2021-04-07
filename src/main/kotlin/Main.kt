import java.util.*
import kotlin.math.atan2

fun main(parametro: Array<String>) {
    do{
        println("  Menu Prueba  ")
        println("===============")
        println("[ 1 ] Desafio 1   -> Bancos")
        println("[ 2 ] Desafio 2   -> Coordenadas")
        println("[ 3 ] Desafio 3   -> Varias Funciones")
        println("[ 4 ] Desafio 4   -> Triangulos")
        println("[ 5 ] Desafio 5.1 -> Cuadrado de X")
        println("[ 6 ] Desafio 5.2 -> Producto de X * Y ")
        println("[ 7 ] Desafio 6   -> Menor de 3 valores")
        println("[ 0 ] SALIR")
        println("====================")
        println("Escoja su opción: ")

        var opcion: Int = readLine()!!.toInt()

        when {
            opcion == 1 -> {
                banco()
            }
            opcion == 2 -> {
                coordenadas()
            }
            opcion == 3 -> {
                varios()
            }
            opcion == 4 -> {
                triangulos()
            }
            opcion == 5 -> {
                cuadrado()
            }
            opcion == 6 -> {
                producto()
            }
            opcion == 7 -> {
                menor("Primera llamada")
                menor("Segunda llamada")
            }
            opcion == 0 -> {
                println("Gracias por usar sistemas del grupo Darth Vader...")
            }
            else -> println("No se reconoce la opcion elegida...")
        }
    } while (opcion != 0)
}

fun banco() {
    var totalAcreedor:Int = 0
    println(":::: Sistema de cuentas vistas ::::")
    println("===================================")
    println("")
    do {
        println("Datos cliente:")
        println("Ingrese numero de cuenta [0 Cerrar Modulo] :")
        val nCuenta: Int = readLine()!!.toInt()
        if (nCuenta > 0) {
            println("Ingrese saldo de apertura :")
            val vSaldo: Int = readLine()!!.toInt()
            if (vSaldo > 0) {
                println("Su saldo es de ECREEDOR!!")
                totalAcreedor = totalAcreedor + vSaldo
            } else if (vSaldo < 0) {
                println("Su saldo es de DEUDOR!!")
            } else {
                println("Saldo neteado a CERO!!")
            }
        }
    } while (nCuenta != 0)
    println("El saldo total de los acreedoreses de: $ $totalAcreedor")
    println("")
}

fun coordenadas(){
    var primerCuadrante:Int = 0
    var segundoCuadrante:Int = 0
    var tercerCuadrante:Int = 0
    var cuartoCuadrante:Int = 0
    println(":::: Sistema de coordenadas ::::")
    println("================================")
    println("")
    println("Ingrese numero de coordenadas a procesar:")
    var nCoordenadas:Int = readLine()!!.toInt()
    println("")
    for (i in 1..nCoordenadas) {
        println("Ingrese [$i] coordenada X:")
        var cX: Int = readLine()!!.toInt()
        println("Ingrese [$i] coordenada Y:")
        var cY: Int = readLine()!!.toInt()
        if (cX > 0 && cY > 0) {
            primerCuadrante++
        } else if (cX < 0 && cY > 0) {
            segundoCuadrante++;
        } else if (cX < 0 && cY < 0) {
            tercerCuadrante++
        } else if (cX > 0 && cY < 0) {
            cuartoCuadrante++
        }
    }
    println("Cantidad de coordenadas correspondites al Primer Cuadrante: $primerCuadrante")
    println("Cantidad de coordenadas correspondites al Segundo Cuadrante: $segundoCuadrante")
    println("Cantidad de coordenadas correspondites al Tercer Cuadrante: $tercerCuadrante")
    println("Cantidad de coordenadas correspondites al Cuarto Cuadrante: $cuartoCuadrante")
    println("")
}

fun varios(){
    var nNegativo:Int = 0
    var nPostitivo:Int = 0
    var nMultiplos:Int = 0
    var nPares:Int = 0

    println(":::: Sistema de Varias Funciones ::::")
    println("=====================================")
    println("")
    for (i in 1..10){
        println("Ingrese numero [$i]: ")
        var numero:Int = readLine()!!.toInt()
        if (numero > 0){
            nPostitivo++
        }
        if (numero < 0){
            nNegativo++
        }
        if ((numero % 15) == 0){
            nMultiplos++
        }
        if ((numero % 2) == 0){
            nPares = nPares + numero
        }
    }
    println("Cantidad de numeros Positivos       : $nPostitivo")
    println("Cantidad de numeros Negativos       : $nNegativo")
    println("Cantidad de numeros Multiplos de 15 : $nMultiplos")
    println("Suma de numeros pares               : $nPares")
    println("")
}

fun triangulos() {
    var tEquilatero:Int = 0
    var tIsoceles:Int = 0
    var tEscaleno:Int = 0
    println(":::: Sistema de Triangulos ::::")
    println("===============================")
    println("")
    print("Ingrese la cantidad de triángulos a procesar:")
    val canTriangulos = readLine()!!.toInt()
    for(i in 1..canTriangulos) {
        print("Ingrese lado 1:")
        val lado1 = readLine()!!.toInt()
        print("Ingrese lado 2:")
        val lado2 = readLine()!!.toInt()
        print("Ingrese lado 3:")
        val lado3 = readLine()!!.toInt()
        if (lado1 == lado2 && lado1 == lado3) {
            println("Es un triángulo EQUILATERO.")
            tEquilatero++
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
            println("Es un triángulo ISOCELES.")
            tIsoceles++
        } else {
            println("Es un triángulo ESCALENO.")
            tEscaleno++
        }
    }
    println("Cantidad de triángulos EQUILATEROS: $tEquilatero")
    println("Cantidad de triángulos ISOCELES: $tIsoceles")
    println("Cantidad de triángulos ESCALENO: $tEscaleno")
    println("")
}

fun cuadrado(){
    println(":::: Sistema de Cuadrado de X ::::")
    println("==================================")
    println("")
    println("Ingrese valor:")
    var numero: Int = 0
    do {
        numero = readLine()!!.toInt()
    } while (numero <= 0)
    var cuadro = numero * numero
    println("El CUADRADO de $numero es: $cuadro ")
    println("")
}

fun producto(){
    println(":::: Sistema para mostrar el Producto de X * Y ::::")
    println("===================================================")
    println("")
    println("Ingrese primer valor:")
    var numero1: Int = readLine()!!.toInt()
    println("Ingrese segundo valor:")
    var numero2: Int = readLine()!!.toInt()
    var produ = numero1 * numero2
    println("El PRODUCTO de $numero1 multiplicado por $numero2 es: $produ ")
    println("")
}

fun menor(cuales:String){
    println(":::: Sistema de para mostrar el Menor valor ::::")
    println("================================================")
    println("Llamada de funcion : $cuales")
    println("")
    var numero:Int = 0
    var vMenor:Int = 0
    for (i in 1..3){
        println("Ingrese valor [$i]: ")
        numero = readLine()!!.toInt()
        if (vMenor > numero || i == 1){
            vMenor = numero
        }
    }
    println("El valor menor es: $vMenor")
    println("")
}