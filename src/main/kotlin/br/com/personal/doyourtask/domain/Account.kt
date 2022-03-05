package br.com.personal.doyourtask.domain

import br.com.personal.doyourtask.dto.AccountDto

class Account(  var id: Long?,
                var name: String?,
                var email: String?
                ){

    constructor():this(null, null, null)        // No parameter's constructor

    var nickname: String? = null
        set(value){             // override the default set function
            field = value       // field = email
            println("The new nickname is $value")
        }
        get(){                  // override the default get function
            println("The returned nickname value is $field")
            return field
        }

    fun toAccount(accountDto: AccountDto):Account{
        val account = Account()
        return account.apply {
            name = accountDto.name
            email = accountDto.email
            nickname = accountDto.nickname
        }
    }

    fun printAccount(){
        val nicknameToPrint = nickname ?: "no nickname"
        println("$name ($nicknameToPrint) with email $email")
    }

}