package restaurant

abstract class Person(val name: String, val id: Int, var status: String){
}

class order (val items: String, var price: Int){

    fun delivery(){

    }

    fun prepare(){

    }

}

class employee(name: String,id: Int,status: String):Person(name,id,status){
    fun invitevisitor(){

    }

    fun acceptorder(){

    }

    fun bringorder(){

    }
}

class visitor (name: String, id: Int): Person(name,id){

    fun takeorder(){

    }

    fun declineorder(){

    }

}

class menu(vararg item: ArrayList<String>, var price: String){

    fun pricelist(){

    }
}


class kitchen(){
    fun startwork(){

    }

    fun endwork(){

    }
}

fun main() {

}