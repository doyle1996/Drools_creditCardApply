package com.zjb.drools.controller;

import com.zjb.drools.entity.CreditCardApplyInfo;
import com.zjb.drools.service.RuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rule")
public class RuleController {
    @Autowired
    private RuleService ruleService;
    @RequestMapping("/creditCardApply")
    public CreditCardApplyInfo creditCardApplyInfo(
            @RequestBody CreditCardApplyInfo creditCardApplyInfo){
        creditCardApplyInfo=ruleService.creditCardApply(creditCardApplyInfo);
        return creditCardApplyInfo;

    }

}
