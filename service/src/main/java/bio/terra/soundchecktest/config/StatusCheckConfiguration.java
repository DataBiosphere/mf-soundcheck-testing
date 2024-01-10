package bio.terra.soundchecktest.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "soundchecktest.status-check")
public record StatusCheckConfiguration(
    boolean enabled,
    int pollingIntervalSeconds,
    int startupWaitSeconds,
    int stalenessThresholdSeconds) {}
