package br.com.personal.doyourtask.controller

import br.com.personal.doyourtask.domain.Account
import br.com.personal.doyourtask.dto.AccountDto
import org.modelmapper.ModelMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import kotlin.reflect.full.primaryConstructor


@RestController
@RequestMapping("/task")
class TaskController {

    @PostMapping("/account")
    fun createAccount(@RequestBody account: AccountDto): Account {

        val ac = Account().toAccount(account)
        ac.printAccount()
        return ac
    }

    @GetMapping("/tasks")
    fun availableTasks(): Account = TODO("Not implemented yet")
}