/**
 * Module info
 * 
 * @author juan.gonzalez.fernandez.jgf
 */
module musbands.admin.musical.genre {
	exports org.sylrsykssoft.java.musbands.admin.musical.genre.configuration;
	exports org.sylrsykssoft.java.musbands.admin.musical.genre.controller;
	exports org.sylrsykssoft.java.musbands.admin.musical.genre.resource;
	exports org.sylrsykssoft.java.musbands.admin.musical.genre.exception;
	exports org.sylrsykssoft.java.musbands.admin.musical.genre.resource.assembler;
	exports org.sylrsykssoft.java.musbands.admin.musical.genre.service;
	exports org.sylrsykssoft.java.musbands.admin.musical.genre.repository;
	exports org.sylrsykssoft.java.musbands.admin.musical.genre.domain;

	requires com.fasterxml.jackson.core;
	requires com.fasterxml.jackson.databind;
	requires java.desktop;
	requires java.persistence;
	requires java.transaction;
	requires lombok;
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
	requires coreapi.framework.library;
	requires coreapi.framework.api;
	requires coreapi.framework.database;
	requires coreapi.framework.service;
	requires coreapi.framework.web;
}