package com.interview.impetus.phone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneServiceTest {

    PhoneService phoneService = new PhoneService();

    @Test
    public void testForPhoneCategory(){

        assertEquals("[{\"phoneCategory\":\"Samsung\",\"phoneType\":\"GalaxyA10\",\"phoneRam\":\"8 GB\",\"phoneSize\":\"XL\",\"phoneColor\":\"White\"},{\"phoneCategory\":\"Samsung\",\"phoneType\":\"GalaxyS20Ultra\",\"phoneRam\":\"8 GB\",\"phoneSize\":\"X\",\"phoneColor\":\"Black\"}]",
        phoneService.searchByPhoneCategory("Samsung"));
    }
}
