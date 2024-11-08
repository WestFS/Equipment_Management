package org.management.model;


import org.jetbrains.annotations.NotNull;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 *  TODO -> Create collection LIST<> for link MaintenanceLog and ScheduleMaintenance
 */

public record ScheduleMaintenance(
        @NotNull UUID id,
        @NotNull Equipment<?> equipment,
        @NotNull LocalDateTime startSchedule,
        @NotNull LocalDateTime scheduledDate,
        @NotNull Condition reason,
        @NotNull String description,
        @NotNull Status status
      //  List<MaintenanceLog> logs
) {
    public ScheduleMaintenance(
            @NotNull Equipment<?> equipment,
            @NotNull LocalDateTime scheduledDate,
            @NotNull Condition reason,
            @NotNull String description,
            @NotNull Status status

    ) {
        this(UUID.randomUUID(), equipment, LocalDateTime.now(), scheduledDate, reason, description, status);

        if (scheduledDate.isBefore(LocalDateTime.now())) {
            throw new IllegalArgumentException("A data agendada não pode estar no passado.");
        }
    }

    public void addLog(MaintenanceLog log) {
       // logs.add(log);
    }

}


