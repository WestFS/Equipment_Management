package org.management.model;


import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.time.LocalDate;

public class Devices extends Equipment<Devices> {
    private User user;
    private ScheduleMaintenance maintenance;
    private String operatingSystem;
    private String memorySize;
    private String diskSize;
    private String processor;
    private @Nullable Location location;


    protected Devices(DevicesBuilder builder) {
        super(builder);
        this.user = builder.user;
        this.maintenance = builder.maintenance;
        this.operatingSystem = builder.operatingSystem;
        this.memorySize = builder.memorySize;
        this.diskSize = builder.diskSize;
        this.processor = builder.processor;
        this.location = builder.location;

    }

    public static class DevicesBuilder extends Equipment.Builder<Devices,DevicesBuilder> {
        private User user;
        private ScheduleMaintenance maintenance;
        private String operatingSystem;
        private String memorySize;
        private String diskSize;
        private String processor;
        private @Nullable Location location;

        public DevicesBuilder(@NotNull Long id, @NotNull String serialNumber, @NotNull String plateID, @NotNull TypeEquipment typeEquipment, @NotNull String model, @NotNull String manufacturer, @NotNull LocalDate purchaseDate, @Nullable Condition condition) {
            super(id, serialNumber, plateID, typeEquipment, model, manufacturer, purchaseDate, condition);
        }

        @Override
        public Devices build() {
            return new Devices(this);
        }

        @Override
        public DevicesBuilder self() {
            return this;
        }

        public DevicesBuilder user(User user) {
            this.user = user;
            return self();
        }

        public DevicesBuilder maintenance(ScheduleMaintenance maintenance) {
            this.maintenance = maintenance;
            return self();
        }
        public DevicesBuilder operatingSystem(String operatingSystem) {
            this.operatingSystem = operatingSystem;
            return self();
        }
        public DevicesBuilder memorySize(String memorySize) {
            this.memorySize = memorySize;
            return self();
        }
        public DevicesBuilder diskSize(String diskSize) {
            this.diskSize = diskSize;
            return self();
        }
        public DevicesBuilder processor(String processor) {
            this.processor = processor;
            return self();
        }
        public DevicesBuilder location(Location location) {
            this.location = location;
            return self();
        }
    }

    @Override
    public String toString() {
        return "Devices{" +
                "user=" + user +
                ", maintenance=" + maintenance +
                ", operatingSystem='" + operatingSystem + '\'' +
                ", memorySize='" + memorySize + '\'' +
                ", diskSize='" + diskSize + '\'' +
                ", processor='" + processor + '\'' +
                ", location=" + location +
                "} " + super.toString();
    }

    public User getUser() {
        return user;
    }

    public ScheduleMaintenance getMaintenance() {
        return maintenance;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public String getMemorySize() {
        return memorySize;
    }

    public String getDiskSize() {
        return diskSize;
    }

    public String getProcessor() {
        return processor;
    }

    public @Nullable Location getLocation() {
        return location;
    }
}
