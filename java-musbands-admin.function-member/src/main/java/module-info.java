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

	requires com.fasterxml.jackson.core;
	requires com.fasterxml.jackson.databind;
	requires coreapi.framework.api;
	requires coreapi.framework.database;
	requires coreapi.framework.library;
	requires coreapi.framework.service;
	requires coreapi.framework.web;
	requires java.desktop;
	requires java.persistence;
	requires java.transaction;
	requires lombok;
	requires slf4j.api;
	requires spring.beans;
	requires spring.boot;
	requires spring.boot.autoconfigure;
	requires spring.context;
	requires spring.core;
	requires spring.data.commons;
	requires transitive spring.data.jpa;
	requires spring.data.rest.core;
	requires spring.hateoas;
	requires spring.web;
}