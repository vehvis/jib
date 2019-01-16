open // opens everything
module com.google.cloud.tools.jib {
  exports com.google.cloud.tools.jib;
  exports com.google.cloud.tools.jib.api;
  exports com.google.cloud.tools.jib.async;
  exports com.google.cloud.tools.jib.blob;
  exports com.google.cloud.tools.jib.builder;
  exports com.google.cloud.tools.jib.builder.steps;
  exports com.google.cloud.tools.jib.cache;
  exports com.google.cloud.tools.jib.configuration;
  exports com.google.cloud.tools.jib.configuration.credentials;
  exports com.google.cloud.tools.jib.docker;
  exports com.google.cloud.tools.jib.docker.json;
  exports com.google.cloud.tools.jib.event;
  exports com.google.cloud.tools.jib.event.events;
  exports com.google.cloud.tools.jib.event.progress;
  exports com.google.cloud.tools.jib.filesystem;
  exports com.google.cloud.tools.jib.frontend;
  exports com.google.cloud.tools.jib.global;
  exports com.google.cloud.tools.jib.hash;
  exports com.google.cloud.tools.jib.http;
  exports com.google.cloud.tools.jib.image;
  exports com.google.cloud.tools.jib.image.json;
  exports com.google.cloud.tools.jib.json;
  exports com.google.cloud.tools.jib.registry;
  exports com.google.cloud.tools.jib.registry.credentials;
  exports com.google.cloud.tools.jib.registry.credentials.json;
  exports com.google.cloud.tools.jib.registry.json;
  exports com.google.cloud.tools.jib.tar;

  requires java.logging;
  requires com.fasterxml.jackson.databind;
  requires com.google.api.client;
  requires com.google.common;
  requires org.apache.commons.compress;
  requires javassist;
}
