package com.dt.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class AccountsController 
{
@RequestMapping("/")
public String hello() 
{
return "Hello javaTpoint";
}
}
