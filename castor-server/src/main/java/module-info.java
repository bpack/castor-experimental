module com.ioglyph.castor.server{
    requires com.ioglyph.castor.api;
    requires com.ioglyph.castor.core;
    requires com.ioglyph.castor.feature;
    requires com.ioglyph.castor.persistence;
    requires com.ioglyph.castor.rest;
    requires com.ioglyph.castor.security;

    requires java.instrument;
    requires java.sql;
//    requires java.xml;

    requires spring.beans;
    requires spring.boot;
    requires spring.boot.actuator;
    requires spring.boot.actuator.autoconfigure;
    requires spring.boot.autoconfigure;
    requires spring.context;
    requires spring.core;

    exports com.ioglyph.castor.server.application;

    opens com.ioglyph.castor.server.application to spring.core;
}
