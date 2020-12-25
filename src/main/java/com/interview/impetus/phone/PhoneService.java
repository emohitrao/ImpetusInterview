package com.interview.impetus.phone;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PhoneService {

    private List<PhoneModel> phoneModels = Arrays.asList(
            new PhoneModel("Apple","Iphone 11 pro","4 GB","X","White"),
            new PhoneModel("Apple","Iphone X","16 GB","X","Blue"),
            new PhoneModel("Samsung","GalaxyA10","8 GB","XL", "White"),
            new PhoneModel("Samsung","GalaxyS20Ultra","8 GB","X", "Black"),
            new PhoneModel("Huawei","P30","4 GB","X", "White"),
            new PhoneModel("Motorola","Edge 5G","4 GB","XL", "White")
    );

    public List<PhoneModel> searchByPhoneCategory(String category){
        return phoneModels.stream().filter(p -> p.getPhoneCategory().equals(category)).collect(Collectors.toList());
    }

    public List<PhoneModel> searchByPhoneRam(String ramSize){
        return phoneModels.stream().filter(r -> r.getPhoneRam().equals(ramSize)).collect(Collectors.toList());
    }

}
