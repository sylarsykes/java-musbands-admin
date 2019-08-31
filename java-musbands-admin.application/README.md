# Musbands Admin Application

Musbands Admin Application it is an API Rest with the administration of the master entities for [Musbands API Rest](https://github.com/sylarsykes/java-musbands). It is composed of the modules [Function Member](https://github.com/sylarsykes/java-musbands-admin/tree/master/java-musbands-admin.function-member), [Instrument](https://github.com/sylarsykes/java-musbands-admin/tree/master/java-musbands-admin.instrument), [Musical Genre](https://github.com/sylarsykes/java-musbands-admin/tree/master/java-musbands-admin.musical-genre), [Application](https://github.com/sylarsykes/java-musbands-admin/tree/master/java-musbands-admin.application), [Client](https://github.com/sylarsykes/java-musbands-admin/tree/master/java-musbands-admin.client).


## Features

*  [Application](https://github.com/sylarsykes/java-musbands-admin/tree/master/java-musbands-admin.application) Spring Boot Application
*  [Function Member](https://github.com/sylarsykes/java-musbands-admin/tree/master/java-musbands-admin.function-member) Function Member API. Describe the function of a band member.
*  [Instrument](https://github.com/sylarsykes/java-musbands-admin/tree/master/java-musbands-admin.instrument) Instrument API. Describe the function of a band member.
*  [Musical Genre](https://github.com/sylarsykes/java-musbands-admin/tree/master/java-musbands-admin.musical-genre) Musical Genre API. Describe the musical genre of the bands.
*  [Client](https://github.com/sylarsykes/java-musbands-admin/tree/master/java-musbands-admin.client) Rest Template Client for connect to Function Member, Instrument, Musical Genre APIs.


## How to run?

clone the codebase

```
git clone git@github.com:sylarsykes/java-musbands-admin.git
```

compile, test, package

```
mvn clean package
```

run

```
mvn spring-boot:run
```


## Built with

*  [Maven](https://mvnrepository.com/) Dependency manager
*  [Core API Framework](https://github.com/sylarsykes/coreapi-framework)
*  [Spring Framework](https://github.com/spring-projects/spring-framework)
*  [Apache Commons](https://github.com/apache/commons-lang)
*  [Apache Commons Collections](https://github.com/apache/commons-collections/)
*  [Lombok](https://projectlombok.org/)
*  [Modelmapper](http://modelmapper.org/getting-started/)


## Version

0.0.1-SNAPSHOT. We use [SemVer](https://semver.org/) for versioning. For all available versions, see the [tags](https://github.com/sylarsykes/coreapi-framework/tags) in this repository.


## Authors

*  Juan González Fernández [juan.gonzalez.fernandez.jgf](https://github.com/sylarsykes)

## Related projects

- [Musbands](https://github.com/sylarsykes/java-musbands)


## License

The Core API Framework is released under version 2.0 of the [Apache License](https://www.apache.org/licenses/LICENSE-2.0).
