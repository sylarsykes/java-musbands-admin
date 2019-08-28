# Musbands Admin Applicarion

Musbands Admin Application it is an API Rest with the administration of the master entities for [Musbands API Rest](https://github.com/sylarsykes/java-musbands). It is composed of the modules [Function Member](https://github.com/sylarsykes/java-musbands-admin/tree/master/java-musbands-admin.function-member), [Instument](https://github.com/sylarsykes/java-musbands-admin/tree/master/java-musbands-admin.instrument), [Musical Genre](https://github.com/sylarsykes/java-musbands-admin/tree/master/java-musbands-admin.musical-genre), [Application](https://github.com/sylarsykes/java-musbands-admin/tree/master/java-musbands-admin.application), [Client](https://github.com/sylarsykes/java-musbands-admin/tree/master/java-musbands-admin.client).


### Features
* [Function Member](https://github.com/sylarsykes/java-musbands-admin/tree/master/java-musbands-admin.function-member) Function Member API. Describe the function of a band member.
* [Instrument](https://github.com/sylarsykes/java-musbands-admin/tree/master/java-musbands-admin.instrument) Instrument API. Describe the function of a band member.
* [Musical Genre](https://github.com/sylarsykes/java-musbands-admin/tree/master/java-musbands-admin.musical-genre) Musical Genre API. Describe the musical genre of the bands.
* [Application](https://github.com/sylarsykes/java-musbands-admin/tree/master/java-musbands-admin.application) Spring Boot Application
* [Client](https://github.com/sylarsykes/java-musbands-admin/tree/master/java-musbands-admin.client) Rest Template Client for connect to Function Member, Instrument, Musical Genre APIs.


### Installation

- Application, run project

```
mvn spring-boot:run
```

- Function member, import dependency

```
<dependency>
	<groupId>org.sylrsykssoft</groupId>
	<artifactId>java-musbands.admin.function-member</artifactId>
	<version>${java-musbands.admin.function-member.version}</version>
</dependency>
```
- Instrument, import dependency

```
<dependency>	
	<groupId>org.sylrsykssoft</groupId>
	<artifactId>coreapi-framework.api</artifactId>
	<version>${coreapi-framework.api.version</version>
</dependency>
```
- Musical Genre, import dependency

```
<dependency>
	<groupId>org.sylrsykssoft</groupId>
	<artifactId>java-musbands.admin.musical-genre</artifactId>
	<version>${java-musbands.admin.musical-genre.version}</version>
</dependency>
```
- Client, import dependency

```
<dependency>
	<groupId>org.sylrsykssoft</groupId>
	<artifactId>java-musbands.admin.client</artifactId>
	<version>${java-musbands.admin.client.version}</version>
</dependency>
```

### Built with

- [Maven](https://mvnrepository.com/) Dependency manager
- [Core API Framework](https://github.com/sylarsykes/coreapi-framework)
- [Spring Framework](https://github.com/spring-projects/spring-framework)
- [Apache Commons](https://github.com/apache/commons-lang)
- [Apache Commons Collections](https://github.com/apache/commons-collections/)
- [Lombok](https://projectlombok.org/)
- [Modelmapper](http://modelmapper.org/getting-started/)


### Version

0.0.1-SNAPSHOT. We use [SemVer](https://semver.org/) for versioning. For all available versions, see the [tags](https://github.com/sylarsykes/coreapi-framework/tags) in this repository.


### Authors

- Juan González Fernández [juan.gonzalez.fernandez.jgf](https://github.com/sylarsykes)

### Related projects

- [Musbands](https://github.com/sylarsykes/java-musbands)


### License

The Core API Framework is released under version 2.0 of the [Apache License](https://www.apache.org/licenses/LICENSE-2.0).
