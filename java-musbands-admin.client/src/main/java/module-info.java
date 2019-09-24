/**
 * Module info
 * 
 * @author juan.gonzalez.fernandez.jgf
 */
module musbands.admin.client {
	exports org.sylrsykssoft.java.musbands.admin.client;
	exports org.sylrsykssoft.java.musbands.admin.client.configuration;

	requires java.desktop;

	// Core API Framework Module Dependencies
	requires coreapi.framework.api;
	requires coreapi.framework.web;

	requires spring.beans;
	requires spring.context;
	requires spring.boot.autoconfigure;

	// Musbands Admin
	requires transitive musbands.admin.function.member;
	requires transitive musbands.admin.instrument;
	requires transitive musbands.admin.musical.genre;

	uses org.sylrsykssoft.java.musbands.admin.function.member.domain.FunctionMember;
	uses org.sylrsykssoft.java.musbands.admin.function.member.resource.FunctionMemberSimpleResource;
	uses org.sylrsykssoft.java.musbands.admin.function.member.resource.FunctionMemberResource;
	uses org.sylrsykssoft.java.musbands.admin.function.member.resource.FunctionMemberAuditResource;

	uses org.sylrsykssoft.java.musbands.admin.instrument.domain.Instrument;
	uses org.sylrsykssoft.java.musbands.admin.instrument.resource.InstrumentSimpleResource;
	uses org.sylrsykssoft.java.musbands.admin.instrument.resource.InstrumentResource;
	uses org.sylrsykssoft.java.musbands.admin.instrument.resource.InstrumentAuditResource;

	uses org.sylrsykssoft.java.musbands.admin.musical.genre.domain.MusicalGenre;
	uses org.sylrsykssoft.java.musbands.admin.musical.genre.resource.MusicalGenreSimpleResource;
	uses org.sylrsykssoft.java.musbands.admin.musical.genre.resource.MusicalGenreResource;
	uses org.sylrsykssoft.java.musbands.admin.musical.genre.resource.MusicalGenreAuditResource;

	uses org.sylrsykssoft.coreapi.framework.web.rest.BaseAdminSimpleRestTemplateController;
	uses org.sylrsykssoft.coreapi.framework.web.rest.BaseAdminRestTemplateController;
}