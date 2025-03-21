package com.service.Transactions.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionsController {
    
    private static final Logger log = LoggerFactory.getLogger(TransactionsController.class);

    @PostMapping("transaction/newTransaction")
    public String newTransaction(@RequestBody JSONObject body) {
        log.info("REQUEST_BODY: " + body.toString());
        return "Transaction Added";
    }

}
