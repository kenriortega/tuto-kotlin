@file:JvmName("StringExtensions") // if you want to change default name use this
package interoperability

fun String.initials():String{
    val values = this.split(' ')
    val firstInitial = values[0].substring(0,1)
    val lastInitial = values[1].substring(0,1)

    return "$firstInitial$lastInitial"
}