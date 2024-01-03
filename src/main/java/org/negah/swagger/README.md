# SWAGGER

1.  add this dependency to pom.xml file:
```
<dependency>
    <groupId>org.springdoc</groupId>
    <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
    <version>2.0.2</version>
</dependency>
```
2. add this annotation to application file 
```
@OpenAPIDefinition(info = @Info(title = "BranchMarketing API", version = "2.0", description = "APIs for marketing system"))
```
3. add this configs to properties file
```
springdoc.api-docs.enabled=true
springdoc.api-docs.path=/public/api-docs
springdoc.swagger-ui.path=/public/swagger-ui.html
springdoc.swagger-ui.disable-swagger-default-url=true
```