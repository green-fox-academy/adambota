package com.greenfox.bankofsimba.controllers;

import com.greenfox.bankofsimba.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BankAccountController {

    @RequestMapping("/show")
    public String showAccount(Model model) {
        model.addAttribute("account", new BankAccount("Simba", 2000, "lion", true));
        return "accounttemplate";
    }

    @RequestMapping("/accountlist")
    public String showAccountList(Model model) {
        List<BankAccount> accountList = new ArrayList<>();
        accountList.add(new BankAccount("Simba", 2000, "Lion", true));
        accountList.add(new BankAccount("Pumba", 20, "Warthog", false));
        accountList.add(new BankAccount("Timon", 500, "Meerkat", false));
        accountList.add(new BankAccount("Zazu", 1000, "Hornbill", false));
        model.addAttribute("accountList", accountList);
        return "accountlisttemplate";
    }
}
