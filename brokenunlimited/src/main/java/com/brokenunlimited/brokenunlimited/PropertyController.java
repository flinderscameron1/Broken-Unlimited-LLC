package com.brokenunlimited.brokenunlimited;

import java.util.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PropertyController {

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/properties")
    public String properties(Model model) {
        List<Property> properties = getProperties();
        model.addAttribute("properties", properties);
        return "properties";
    }

    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }

    @PostMapping("/submitContact")
    public String submitContact(@RequestParam String name, @RequestParam String email, @RequestParam String message, Model model) 
    {
        String response = "Thank you, " + name + ". We have received your message: \"" + message + "\". We will contact you at " + email + ".";
        model.addAttribute("response", response);
        return "contact";
    }

    private List<Property> getProperties() {
        List<Property> properties = new ArrayList<>();
        properties.add(new Property("916 N Rodney St.", false, true, List.of("1-916 n rodney st-13.jpg", "2-916 n rodney st-14.jpg")));
        return properties;
    }
}
