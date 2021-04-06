package br.com.z5.jhiapp.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Properties specific to Z 5 JH Iapp.
 * <p>
 * Properties are configured in the {@code application.yml} file.
 * See {@link tech.jhipster.config.JHipsterProperties} for a good example.
 */
@ConfigurationProperties(prefix = "application", ignoreUnknownFields = false)
public class ApplicationProperties {}
