/**
 * Module info
 * 
 * @author juan.gonzalez.fernandez.jgf
 */
module musbands.admin.function.member {
	exports org.sylrsykssoft.java.musbands.admin.function.member.configuration;
	exports org.sylrsykssoft.java.musbands.admin.function.member.controller;
	exports org.sylrsykssoft.java.musbands.admin.function.member.domain;
	exports org.sylrsykssoft.java.musbands.admin.function.member.exception;
	exports org.sylrsykssoft.java.musbands.admin.function.member.repository;
	exports org.sylrsykssoft.java.musbands.admin.function.member.resource;
	exports org.sylrsykssoft.java.musbands.admin.function.member.resource.assembler;
	exports org.sylrsykssoft.java.musbands.admin.function.member.service;

	requires java.desktop;
	// Core API Framework Module Dependencies
	requires coreapi.framework.api;
	requires coreapi.framework.database;
	requires coreapi.framework.library;
	requires coreapi.framework.service;
	requires coreapi.framework.web;
	requires coreapi.framework.mail;

	requires com.fasterxml.jackson.core;
	requires com.fasterxml.jackson.databind;
	requires java.persistence;
	requires java.transaction;
	requires java.mail;
	requires static lombok;
	requires spring.beans;
	requires spring.context;
	requires transitive spring.context.support;
	requires transitive spring.boot;
	requires spring.boot.autoconfigure;
	requires transitive spring.core;
	requires transitive spring.data.commons;
	requires spring.data.jpa;
	requires spring.data.rest.core;
	requires spring.hateoas;
	requires transitive spring.web;
}