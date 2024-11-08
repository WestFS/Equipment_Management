package org.management.model;

import org.jetbrains.annotations.NotNull;

import java.time.LocalDateTime;
import java.util.UUID;

public record MaintenanceLog(
    @NotNull UUID id,
    @NotNull Equipment<?> equipment,
    @NotNull LocalDateTime datePerformed,
    @NotNull String description,
    @NotNull Condition condition,
    @NotNull Status status

) {
    public MaintenanceLog(Equipment<?> equipment, LocalDateTime datePerformed, String description,Condition condition, Status status) {
        this(UUID.randomUUID(), equipment, datePerformed, description, condition, status);
    }
}
