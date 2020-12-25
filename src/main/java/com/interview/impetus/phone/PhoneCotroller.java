package com.interview.impetus.phone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PhoneCotroller {

    @Autowired
    private PhoneService phoneService;


    @GetMapping("/byPhoneCategory/{phoneCategory}")
    public List<PhoneModel> getPhoneByCategory(@PathVariable String phoneCategory){
        return phoneService.searchByPhoneCategory(phoneCategory);
    }

    @GetMapping("/byPhoneRAM/{phoneRam}")
    public List<PhoneModel> getPhoneByRAM(@PathVariable String phoneRam){
        return phoneService.searchByPhoneRam(phoneRam);
    }

}
