//DAY 53
typealias AuthToken = String

fun main() {
    val userT = UserT("kenriortega","234FGGT-4545GFGHFHG-T665")
    println(userT.authToken)
}

data class UserT(val username:String,val authToken: AuthToken)
data class AccountT(val authToken: AuthToken)
data class OrderT(val authToken: AuthToken)