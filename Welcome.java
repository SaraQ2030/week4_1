package org.example.welcome;

import jdk.jshell.Snippet;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@RestController
public class Welcome {
@GetMapping(path ="/name" )
    public String Name(){
        return "My name is Sara Alqahtani";
    }

    @GetMapping(path ="/age")
    public String Age(){
        return "My age is 27";
    }

    @GetMapping(path = "/health")
    public String Health(){
        return "Server health is up and running ";
    }
    @GetMapping(path = "/list")
    public ArrayList Names(){
        ArrayList<String> name=new ArrayList<>();
        name.add("Sara");
        name.add("Maha");
        name.add("Fajer");
        for (String n:name){
             System.out.println(n);
        System.out.println("_______________");
       }
        return name;
    }
    @GetMapping(path = "/check")
    public String Check(){
    return "Everything is OK";

      }
}
