/**
 * Module info
 * 
 * @author juan.gonzalez.fernandez.jgf
 */
module musbands.admin.musical.genre {
	exports org.sylrsykssoft.java.musbands.admin.musical.genre.configuration;
	exports org.sylrsykssoft.java.musbands.admin.musical.genre.controller;
	exports org.sylrsykssoft.java.musbands.admin.musical.genre.domain;
	exports org.sylrsykssoft.java.musbands.admin.musical.genre.exception;
	exports org.sylrsykssoft.java.musbands.admin.musical.genre.mail;
	exports org.sylrsykssoft.java.musbands.admin.musical.genre.repository;
	exports org.sylrsykssoft.java.musbands.admin.musical.genre.resource;
	exports org.sylrsykssoft.java.musbands.admin.musical.genre.resource.assembler;
	exports org.sylrsykssoft.java.musbands.admin.musical.genre.service;

	requires java.desktop;
	requires java.persistence;
	requires java.mail;

	// Core API Framework Module Dependencies
	requires coreapi.framework.library;
	requires coreapi.framework.swagger;
	requires coreapi.framework.api;
	requires coreapi.framework.database;
	requires transitive coreapi.framework.audit;
	requires transitive coreapi.framework.mail;
	requires coreapi.framework.service;
	requires coreapi.framework.web;

	requires lombok;
	requires com.fasterxml.jackson.databind;
	requires jackson.annotations;
	requires org.apache.commons.collections4;

	requires spring.beans;
	requires spring.context;
	requires transitive spring.context.support;
	requires transitive spring.boot;
	requires spring.boot.autoconfigure;
	requires transitive spring.core;
	requires transitive spring.data.commons;
	requires spring.tx;
	requires spring.data.jpa;
	requires org.hibernate.orm.core;
	requires hibernate.envers;
	requires spring.data.envers;
	requires spring.data.rest.core;
	requires spring.hateoas;
	requires transitive spring.web;

	// Swagger dependencies
	requires com.google.common;
	requires spring.plugin.core;
	requires springfox.swagger2;
	requires springfox.core;
	requires springfox.spi;
	requires transitive springfox.spring.web;

	uses org.sylrsykssoft.coreapi.framework.audit.controller.BaseAdminAuditController;
	uses org.sylrsykssoft.coreapi.framework.web.BaseAdminController;
	uses org.sylrsykssoft.coreapi.framework.web.BaseAdminSimpleController;
	uses org.sylrsykssoft.coreapi.framework.api.model.Base;
	uses org.sylrsykssoft.coreapi.framework.api.model.BaseAdmin;
	uses org.sylrsykssoft.coreapi.framework.api.model.BaseAdminSimple;
	uses org.sylrsykssoft.coreapi.framework.audit.domain.BaseAdminAudit;
	uses org.sylrsykssoft.coreapi.framework.mail.domain.AdminMailTO;
	uses org.sylrsykssoft.coreapi.framework.mail.service.BaseAdminMailService;
	uses org.sylrsykssoft.coreapi.framework.audit.repository.BaseAdminAuditRepository;
	uses org.sylrsykssoft.coreapi.framework.database.repository.BaseAdminRepository;
	uses org.sylrsykssoft.coreapi.framework.database.repository.BaseAdminSimpleRepository;
	uses org.sylrsykssoft.coreapi.framework.audit.resource.BaseAdminAuditResource;
	uses org.sylrsykssoft.coreapi.framework.api.resource.BaseAdminResource;
	uses org.sylrsykssoft.coreapi.framework.api.resource.BaseAdminSimpleResource;
	uses org.sylrsykssoft.coreapi.framework.audit.resource.assembler.BaseAdminAuditResourceAssembler;
	uses org.sylrsykssoft.coreapi.framework.web.resource.assembler.BaseAdminResourceAssembler;
	uses org.sylrsykssoft.coreapi.framework.web.resource.assembler.BaseAdminSimpleResourceAssembler;
	uses org.sylrsykssoft.coreapi.framework.audit.service.BaseAdminAuditService;
	uses org.sylrsykssoft.coreapi.framework.service.BaseAdminService;
	uses org.sylrsykssoft.coreapi.framework.service.BaseAdminSimpleService;

	provides org.sylrsykssoft.coreapi.framework.audit.service.IAdminAuditService
	with org.sylrsykssoft.java.musbands.admin.musical.genre.service.MusicalGenreAuditService;
	provides org.sylrsykssoft.coreapi.framework.service.IAdminService
	with org.sylrsykssoft.java.musbands.admin.musical.genre.service.MusicalGenreService;
	provides org.sylrsykssoft.coreapi.framework.service.IAdminSimpleService
	with org.sylrsykssoft.java.musbands.admin.musical.genre.service.MusicalGenreSimpleService;
	provides org.sylrsykssoft.coreapi.framework.library.mapper.IMapperFunction
	with org.sylrsykssoft.java.musbands.admin.musical.genre.service.MusicalGenreService,
	org.sylrsykssoft.java.musbands.admin.musical.genre.service.MusicalGenreSimpleService;
	provides org.sylrsykssoft.coreapi.framework.mail.service.MailAdminApiService
	with org.sylrsykssoft.java.musbands.admin.musical.genre.mail.CreateMusicalGenreMailAdminService;
}