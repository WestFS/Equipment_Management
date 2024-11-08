package org.management.test;

import org.management.model.*;

import java.time.LocalDate;

public class DeviceTest {
    public static void main(String[] args) {
        Devices device = new Devices.DevicesBuilder(1L, "SN1234", "PLT5678", TypeEquipment.LAPTOP, "ModelX", "ManufacturerY", LocalDate.now(), Condition.NEW)
                .operatingSystem("Windows 10")
                .memorySize("16GB")
                .diskSize("512GB SSD")
                .processor("Intel i7")
                .build();

        System.out.println(device.toString());
    }
}
