package kt_module1_2

class atm() {

    fun check(num: Int,currentbalance: Int,Holder_name: String){
        when (num) {

            1 -> {
               open_account(currentbalance, Holder_name)

            }
            2 -> {
                deposite_money(currentbalance, Holder_name)
            }
            3 -> {

               withdraw_money(currentbalance, Holder_name)
            }
            4 -> {
               show_Status(currentbalance, Holder_name)
            }

            else -> {
                println("Invalid number")
            }
        }
    }

    fun show_Status(currentbalance: Int, Holder_name: String) {

        println("Name:$Holder_name")
        println("Balance:$currentbalance")

    }

    fun withdraw_money(currentbalance: Int, Holder_name: String) {

        println("Enter Withdraw Money")
        var withdraw = Integer.valueOf(readLine())
        var amount: Int? = withdraw.toInt()


        if (currentbalance >= amount!!) {
            var currentbalance_withdraw = currentbalance - amount!!
            println("current balance after Withdraw:- $currentbalance_withdraw")
            println("Want to check some thing enter number:-")
            var num: Int? = Integer.valueOf(readLine())
           check(num!!, currentbalance_withdraw, Holder_name)
        } else {
            println(
                """ NO  BALANCE
            | CURRENT BALANCE IS :- $currentbalance """.trimMargin()
            )
        }


    }

    fun deposite_money(currentbalance: Int, Holder_name: String,) {
        println("Enter deposite Money")
        var deposite = Integer.valueOf(readLine())
        var amount: Int? = deposite.toInt()
        var currentbalance_deposite = currentbalance + amount!!
        println("current balance after deposite deposite:- $currentbalance_deposite")

        println("Want to check some thing enter number:-")
        var num: Int? = Integer.valueOf(readLine())
        check(num!!, currentbalance_deposite, Holder_name)

    }

    fun open_account(currentbalance: Int, Holder_name: String,) {

        println("Enter name")
        var name = readLine()

        println("Enter initial amount is ")
        var initial_amount: Int? = Integer.valueOf(readLine())

        println()
        var randomid=  (0..3).random()
        println("Your id is:- $randomid")



        println("Name :$name")
        println("balance :$initial_amount")
        var mainbalance = initial_amount!!


        println("currentbalance:- $mainbalance")

        println("Want to check some thing enter number:-")
        var num: Int? = Integer.valueOf(readLine())

        check(num!!, mainbalance, name.toString())

    }

}

fun main() {

    println("Select 1 :- create new account ")
    println("Select 2 :- deposite ")
    println("Select 3 :- Withdraw")
    println("Select 4 :- Account info ")


    var currentbalance = 0
    var Holder_name: String = ""

    println("press any one number")
    var choice = Integer.valueOf(readLine())


    var input = atm()
    input.check(choice,currentbalance,Holder_name)


}



