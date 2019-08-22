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
	exports org.sylrsykssoft.java.musbands.admin.instrument.mail;
	exports org.sylrsykssoft.java.musbands.admin.instrument.repository;
	exports org.sylrsykssoft.java.musbands.admin.instrument.resource;
	exports org.sylrsykssoft.java.musbands.admin.instrument.resource.assembler;
	exports org.sylrsykssoft.java.musbands.admin.instrument.service;

	requires java.desktop;
	// Core API Framework Module Dependencies
	requires coreapi.framework.api;
	requires coreapi.framework.database;
	requires coreapi.framework.library;
	requires coreapi.framework.mail;
	requires coreapi.framework.service;
	requires coreapi.framework.web;

	requires com.fasterxml.jackson.core;
	requires com.fasterxml.jackson.databind;
	requires java.persistence;
	requires java.transaction;
	requires java.mail;
	requires lombok;
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

	uses org.sylrsykssoft.coreapi.framework.web.BaseAdminController;
	uses org.sylrsykssoft.coreapi.framework.api.model.BaseAdmin;
	uses org.sylrsykssoft.coreapi.framework.database.model.listener.BaseListener;
	uses org.sylrsykssoft.coreapi.framework.mail.domain.AdminMailTO;
	uses org.sylrsykssoft.coreapi.framework.database.repository.BaseAdminRepository;
	uses org.sylrsykssoft.coreapi.framework.api.resource.BaseAdminResource;
	uses org.sylrsykssoft.coreapi.framework.web.resource.assembler.BaseAdminResourceAssembler;
	uses org.sylrsykssoft.coreapi.framework.service.BaseAdminService;

	provides org.sylrsykssoft.coreapi.framework.service.IAdminService
			with org.sylrsykssoft.java.musbands.admin.instrument.service.InstrumentService;
	provides org.sylrsykssoft.coreapi.framework.library.mapper.IMapperFunction
			with org.sylrsykssoft.java.musbands.admin.instrument.service.InstrumentService;
}