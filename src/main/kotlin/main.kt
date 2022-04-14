fun main(){
    var money=CurrentAccount(23,"KCB",3500)
    money.balance
    money.detail()

takeInProduct("Mango")
    takeInProduct("Clean")
    composeString("Banana")
}
class CurrentAccount(var  number:Int,var name:String,var balance:Int){
fun deposit(amount:Double){
    balance +=1
  println(balance)

}
    fun withdraw(amount: Double){
     balance -= 1
        println(balance)

    }
    fun detail(){
        println("Account number $number with the balance $balance is operated by $name ")
    }
}
class SavingsAccount(){
    fun withdraw(withdrawals:Int){
        if (withdrawals is <4){

        }



    }
}
fun takeInProduct(category:String){
    when(category){
    if(category.equals("Groceries")){
    println("The fruit is Mango")
    }
    else if (category.equals("Hygiene")){
      println("She is always Clean")
    }
}
    }
data class Category(var name:String,var weight:Int,var price:String,var cate:String)
fun composeString(name:String):String{
    var compose=0
    name.forEachIndexed{ index, c ->
        if (index %2 ==0){
         println (c)
        }
        return name
    }
}

