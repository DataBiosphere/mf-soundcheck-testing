package bio.terra.soundchecktest.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "soundchecktest.sam")
public record SamConfiguration(String basePath) {}
