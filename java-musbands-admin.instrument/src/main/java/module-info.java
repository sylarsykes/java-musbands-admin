/**
 * Module info
 * 
 * @author juan.gonzalez.fernandez.jgf
 */
module musbands.admin.instrument {
	exports org.sylrsykssoft.java.musbands.admin.instrument.configuration;
	exports org.sylrsykssoft.java.musbands.admin.instrument.controller;
	exports org.sylrsykssoft.java.musbands.admin.instrument.domain;
	exports org.sylrsykssoft.java.musbands.admin.instrument.exception;
	exports org.sylrsykssoft.java.musbands.admin.instrument.repository;
	exports org.sylrsykssoft.java.musbands.admin.instrument.resource;
	exports org.sylrsykssoft.java.musbands.admin.instrument.resource.assembler;
	exports org.sylrsykssoft.java.musbands.admin.instrument.service;

	requires java.desktop;
	// Core API Framework Module Dependencies
	requires coreapi.framework.api;
	requires coreapi.framework.database;
	requires coreapi.framework.library;
	requires coreapi.framework.service;
	requires coreapi.framework.web;

	requires com.fasterxml.jackson.core;
	requires com.fasterxml.jackson.databind;
	requires java.persistence;
	requires java.transaction;
	requires lombok;
	requires slf4j.api;
	requires spring.beans;
	requires spring.boot;
	requires spring.boot.autoconfigure;
	requires spring.context;
	requires spring.core;
	requires transitive spring.data.commons;
	requires spring.data.jpa;
	requires spring.data.rest.core;
	requires spring.hateoas;
	requires spring.web;
}