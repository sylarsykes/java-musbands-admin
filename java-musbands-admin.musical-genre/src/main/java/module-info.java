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
	// Core API Framework Module Dependencies
	requires coreapi.framework.api;
	requires coreapi.framework.database;
	requires coreapi.framework.library;
	requires transitive coreapi.framework.mail;
	requires coreapi.framework.service;
	requires coreapi.framework.web;

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
	requires org.hibernate.orm.core;
	requires spring.data.rest.core;
	requires spring.hateoas;
	requires transitive spring.web;

	uses org.sylrsykssoft.coreapi.framework.web.BaseAdminController;
	uses org.sylrsykssoft.coreapi.framework.api.model.BaseAdmin;
	uses org.sylrsykssoft.coreapi.framework.database.model.listener.BaseListener;
	uses org.sylrsykssoft.coreapi.framework.mail.domain.AdminMailTO;
	uses org.sylrsykssoft.coreapi.framework.mail.service.BaseAdminMailService;
	uses org.sylrsykssoft.coreapi.framework.database.repository.BaseAdminRepository;
	uses org.sylrsykssoft.coreapi.framework.api.resource.BaseAdminResource;
	uses org.sylrsykssoft.coreapi.framework.web.resource.assembler.BaseAdminResourceAssembler;
	uses org.sylrsykssoft.coreapi.framework.service.BaseAdminService;

	provides org.sylrsykssoft.coreapi.framework.service.IAdminService
			with org.sylrsykssoft.java.musbands.admin.musical.genre.service.MusicalGenreService;
	provides org.sylrsykssoft.coreapi.framework.library.mapper.IMapperFunction
			with org.sylrsykssoft.java.musbands.admin.musical.genre.service.MusicalGenreService;
	provides org.sylrsykssoft.coreapi.framework.mail.service.MailAdminApiService
			with org.sylrsykssoft.java.musbands.admin.musical.genre.mail.CreateMusicalGenreMailAdminService;
}