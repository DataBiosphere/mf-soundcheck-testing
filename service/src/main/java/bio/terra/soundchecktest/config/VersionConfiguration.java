package bio.terra.soundchecktest.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/** Read from the git.properties file auto-generated at build time */
@ConfigurationProperties("soundchecktest.version")
public record VersionConfiguration(String gitHash, String gitTag, String build, String github) {}
