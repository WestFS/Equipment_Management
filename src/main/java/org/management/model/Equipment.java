package org.management.model;


import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;

import java.time.LocalDate;
import java.util.Date;

public abstract class Equipment<T> {
    private final @NotNull Long id;
    private final @NotNull String serialNumber;
    private final @NotNull String plateID;
    private final @NotNull TypeEquipment typeEquipment;
    private final @NotNull String model;
    private final @NotNull String manufacturer;
    private final @NotNull LocalDate purchaseDate;
    private final @Nullable Condition condition;

    protected Equipment(Builder<?, ?> builder) {
        this.id = builder.id;
        this.serialNumber = builder.serialNumber;
        this.plateID = builder.plateID;
        this.typeEquipment = builder.typeEquipment;
        this.model = builder.model;
        this.manufacturer = builder.manufacturer;
        this.purchaseDate = builder.purchaseDate;
        this.condition = builder.condition;

    }

    public static abstract class Builder<T extends Equipment<T>, B extends Builder<T, B>> {
        private @NotNull Long id;
        private @NotNull String serialNumber;
        private @NotNull String plateID;
        private @NotNull TypeEquipment typeEquipment;
        private @NotNull String model;
        private @NotNull String manufacturer;
        private @NotNull LocalDate purchaseDate;
        private @Nullable Condition condition;

        public Builder(@NotNull Long id, @NotNull String serialNumber, @NotNull String plateID,
                       @NotNull TypeEquipment typeEquipment, @NotNull String model, @NotNull String manufacturer,
                       @NotNull LocalDate purchaseDate, @Nullable Condition condition) {
            this.id = id;
            this.serialNumber = serialNumber;
            this.plateID = plateID;
            this.typeEquipment = typeEquipment;
            this.model = model;
            this.manufacturer = manufacturer;
            this.purchaseDate = purchaseDate;
            this.condition = condition;
        }

        protected abstract B self();
        public abstract T build();

        @Override
        public boolean equals(Object obj) {
            if(obj == null) return false;
            if(!(obj instanceof Builder<?,?>)) return false;
            if(this == obj) return true;
            if(this.getClass() != obj.getClass()) return false;
            Builder<?,?> other = (Builder<?,?>) obj;
            return serialNumber.equals(other.serialNumber) && plateID.equals(other.plateID) && id.equals(other.id);
        }

        public B id(Long id) {
            this.id = id;
            return self();
        }

        public B serialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return self();
        }

        public B plateID(String plateID) {
            this.plateID = plateID;
            return self();
        }
        public B typeEquipment(TypeEquipment typeEquipment) {
            this.typeEquipment = typeEquipment;
            return self();
        }
        public B model(String model) {
            this.model = model;
            return self();
        }
        public B manufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
            return self();
        }
        public B purchaseDate(LocalDate purchaseDate) {
            this.purchaseDate = purchaseDate;
            return self();
        }
        public B condition(Condition condition) {
            this.condition = condition;
            return self();
        }
    }
}