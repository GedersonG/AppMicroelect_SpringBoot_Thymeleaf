# AppGestionMicroelectronica_SpringBoot
Aplicación Web para la Gestión de Productos de Microelectrónica implementando Spring Boot, Spring Data JPA, Maven, Lombok, Thymeleaf, Bootstrap y Oracle




</br>

### Tecnologías Implementadas

| **Tecnologías** | **Versión** | **Finalidad** |               
| ------------- | ------------- | ------------- |
| Java |   12.0.2 | JDK |
| Spring Tool Suite 4 | 4.9.0  | IDE |
| Spring Boot |   2.6.4  | Framework |
| Spring Boot Data JPA  | 2.6.3 | Mapeo de objetos y persistencia en la db |
| Lombok | 1.18.22 | Automatización de Código | 
| Thymeleaf | 2.6.4 | Plantillas para el Front | 
| Maven |  4.0.0 | Gestor de Proyectos |
| JPA-Hibernate | 5.4.27 | Framework para el mapeo de objetos y persistenciua en la db |
| PostMan | 9.4.1 | Test de Apis |
| Oracle XE 21c | 21.4.1 | Sistema de Gestión de Bases de Datos |
| SQL Developer | 21.4.1  | Editor de Base de Datos |
| CMD | 10 | Símbolo del Sistema para linea de comandos | 
| GNU bash / Terminal | 4.4.23  | Bash / Terminal para el manejo e implementación de Git integrado al Spring Tool Suite |
| Git | 2.29.1  | Control de Versiones |



</br>

### Descarga y Documentacion de las Tecnologías Implementadas

| **Tecnología**  | **Descarga** | **Documentación** |               
| ------------- | ------------- | ------------- |
| Java-JDK 12 | https://www.oracle.com/java/technologies/javase/jdk12-archive-downloads.html |  https://docs.oracle.com/en/ |
| Spring Tool Suite 4 |https://spring.io/tools | https://spring.io/guides |
| Lombok | https://projectlombok.org/download | https://projectlombok.org/download |
| Maven Repository | https://mvnrepository.com/ | https://mvnrepository.com/ | 
| PostMan | https://www.postman.com/downloads/ | https://www.postman.com/product/what-is-postman/ |
| Oracle | https://www.oracle.com/database/technologies/oracle21c-windows-downloads.html | https://www.oracle.com/database/technologies/oracle21c-windows-downloads.html|
| SQL Developer | https://www.oracle.com/tools/downloads/sqldev-downloads.html | https://www.oracle.com/tools/downloads/sqldev-downloads.html |
| Git  | https://git-scm.com/downloads |  https://git-scm.com/docs |

</br>

### Patrones de Diseño Implementados

| **Patrón de Diseño** | **Finalidad** |               
| ------------- | ------------- |
| DAO | Uso de interfaces entre la aplicación y el almacenamiento de datos. |
| MVC | Separación y Representación de los Datos, Manejo de errores, Escalabilidad, etc  |

</br>

### Dependencias Implementadas

| **Dependencia Maven**  | **Versión** | **Finalidad** |             
| ------------- | ------------- | ------------- |
| oracle-driver | 8.0.21 |  Conexión al SGDB Mysql |
| spring-boot-starter-data-jpa | 2.6.4 | Api de JpaRepository para el manejo de métodos | 
| spring-boot-starter-web | 2.6.4 | Se agrega toda la configuración web automáticamente de Maven a Spring | 
| spring-boot-starter-thymeleaf | 2.6.4 | Plantillas para el Front |
| spring-boot-devtools | 2.6.4 | Herramientas para el Manejo de Spring Boot | 
| ojdbc8 | 21.3.0.0 | Driver para el SGDB Oracle | 
| lombok | 1.18.22 |  Dependencia para la automatización de Código |




<hr>

## ` Documentación y Guía del Proyecto `
#### (Esta Documentación que Desarrollé es para la Creación y Configuración del Proyecto, Manejo y Dependencias de Maven, Spring Tool Suite, Spring Booot, Hibernate-JPA, Oracle, Thymeleaf,  Servidor de Despliegue y otros usos. Recomiendo Leerla y Realizar todo paso a paso como se indica en la misma).

</br>

## Indice

#### Sección 1) Creación y Configuraciones del Proyecto 
   
   - [Paso 1) Creación y Configuraciones de un Proyecto Spring Boot con Maven en Spring Tool Suite 4.](#paso-1-creación-de-un-proyecto-spring-boot-con-maven-en-spring-tool-suite-4-y-configuraciones-iniciales)
  
   - [Paso 2) Otras Configuraciones del Proyecto.](#paso-2-otras-configuraciones-del-proyecto)


#### Sección 2) Dependencias del Proyecto, Descarga de Lombok y Archivo de Propiedades
   
   - [Paso 3) Listado de Dependencias.](#paso-3-listado-de-dependencias)

   - [Paso 4) Descarga de Lombok.](#paso-4-descarga-de-lombok)
   
   - [Paso 5) Archivo de Propiedades(application.properties).](#paso-5-configuraciones-del-application.properties) 
   


#### Sección 3) Creación y Configuración de las Clases Entities/Models
  
   - [Paso 6) Creación y Configuración de la Clase ComponenteEntity](#paso-6-creación-y-configuración-de-la-clase-componente-entity)
   
   - [Paso 7) Creación y Configuración de la Clase ComponenteDetalleEntity](#paso-7-creación-y-configuración-de-la-clase-componente-detalle-entity)
  
  

  
  
#### Sección 4) Creación y Configuración de las Interfaces Repositories  

   - [Paso x) Creación y Configuración de la Interfaz Repository I_ComponenteRepository](#paso-x-creación-y-configuración-de-la-interfaz-repository-i-componenterepository)


   - [Paso y) Creación y Configuración de la Interfaz Repository I_ComponenteDetalleRepository](#paso-x-creación-y-configuración-de-la-interfaz-repository-i-componentedetallerepository)




#### Sección 5) Creación y Configuración de los Services y Controladores

   - [Paso 10) Creación y Configuración de la Clase Service](#paso-10-creación-y-configuración-de-la-clase-service)
   
   - [Paso 11) Creación y Configuración de la Clase Controler](#paso-11-creación-y-configuración-de-la-clase-controler) 




#### Sección 6) Creación y Configuración de SpringSecurity y Json Web Tokens

   - [Paso 12) Creación y Configuración de la Clase Usuario](#paso-12-creación-y-configuración-de-la-clase-usuario)

   - [Paso 13) Creación y Configuración de la Interfaz I_UsuarioRepository](#paso-13-creación-y-configuración-de-la-interfaz-i_usuarioRepository)

   - [Paso 14) Creación y Configuración del Servicio UsuarioService](#paso-14-creación-y-configuración-del-servicio-usuarioservice)

   - [Paso 15) Creación y Configuración de la Clase de Configuración UsuarioConfiguration](#paso-15-creación-y-configuración-de-la-clase-de-configuracion-usuarioconfiguration)

   - [Paso 16) Creación y Configuración de la Clase de Configuración JwtUtilConfiguration](#paso-16-creación-y-configuración-de-la-clase-de-configuracion-jwtutilconfiguration)

   
   - [Paso 17) Creación y Configuración de la Clase de Configuración JwtFilterConfiguration](#paso-17-creación-y-configuración-de-la-clase-de-configuracion-jwtfilterconfiguration)


   
   - [Paso 18) Creación y Configuración de la Clase de Configuración LoginFilterConfiguration](#paso-17-creación-y-configuración-de-la-clase-de-configuracion-loginfilterconfiguration)





   - [Paso 19) Creación y Configuración de la Clase de Configuración WebSecurity](#paso-18-creación-y-configuración-de-la-clase-de-configuracion-websecurity)






#### Sección 8) Apéndice

- [ Anotaciones Usadas para JPA](#anotaciones-usadas-para-jpa)
 
- [ Anotaciones Usadas para Spring](#anotaciones-usadas-para-spring)




</br>

## Sección 1) Creación y Configuraciones del Proyecto 

</br>


### Paso 1) Creación de un Proyecto Spring Boot con Maven en Spring Tool Suite 4 y Configuraciones Iniciales.
#### (Primeramente deberás configurar tu espacio de trabajo, en donde se alojará la aplicación. Cada vez que muevas el Proyecto de Directorio, recomiendo crear o setear nuevamente el Espacio de Trabajo).


* Una vez abierto Spring Tool Suite 4
  	* --> Seleccionas la Pestaña `File` 
   	* --> New 
   	* --> Spring Starter Proyect (Si no aparece buscar en Other).

* Se abrirá una Interfaz Gráfica, por defecto dejar marcado lo siguiente con los siguientes valores por defecto
   	 * --> Service Url : https://start.spring.io
   	 * --> Use default location por defecto (es la ruta absoluta de tu workspace)
   	 * --> Type : Maven
	 * --> Java Version : 8
	 * --> Packaging : Jar
	 * --> Language : Java
	 * --> Artifact : Por Defecto como está (cambia automáticamente cuando escribimos el Name del Proyect)
	  * --> Version  : Por Defecto como está
	  * --> Working Sets Desmarcado.

* Configuramos lo restante
   * --> Name : GestionMicroelectronica (Nombre del proyecto, en mi caso este). Debe cambiarse aut. el Artifact
   * --> Group : com.gestion.microelectronica (Nombre del grupo, en mi caso este).
   * --> Description: Creación de una Aplicación Web para la Gestión de Productos de Microelectrónica  (en mi caso).
   * --> Package : com.gestion.microelectronica (Nombre del grupo, este en mi caso).
   * --> Next

* En la Nueva Interfaz Gráfica elegimos la versión y dependencia
   * --> Spring Boot Versión : 2.6.4 o una que no sea la última
   * --> Vamos a seleccionar las dependencias necesarias
   * --> Dependencias : Spring Web, Spring Data JPA, Spring Boot DevTools, Lombok, Thymeleaf y Oracle Driver
   * --> Next, Next y Seguidamente Finish.

* Esperar a que finalice Spring la creación del Proyecto


</br>



### Paso 2) Otras Configuraciones del Proyecto.
#### (Para este paso se anexan configuraciones que para el Proyecto son relevantes, capaz creando el Proyecto desde otro IDE se autoconfiguran dichas configuraciones).

</br>

#### 2.1) Actualización de Java-1.7 a 1.8 (Si seleccionaste una versión Moderna de Spring no es Necesario esto)

* Vamos al `pom.xml` (el archivo al final de todo)

* Dentro de el tag `properties` donde dice java.versión cambiar la version del compiler a 1.8, ctrl+s para guardar

* Click Derecho sobre el Proyecto
	* --> Maven
	* --> Update Proyect
	* --> Fijate que el Proyecto este seleccionado y Boton ok

* Si cambio JavaSE-1.7 a JavaSE-1.8 se efectuo el cambio

</br>

#### 2.2) Paquetes Maven `(Java Resources)`. (Si seleccionaste una versión Moderna de Spring no es Necesario esto)

* Por Defecto Viene deshabilitada la opción de paquetes Maven, en donde vamos a guardar nuestros paquetes y clases
	* --> Para habilitar las mismas, click Der sobre el Proyecto.
	* --> Properties.
	* --> Buscamos la sección `Java Build Path`
	* --> Seleccionamos la casilla `Maven Dependencies`.
	* --> Apply and Close.
	* --> F5 y deberían aparecer `src/main/java` y `src/test/java`







</br>

## Sección 2) Dependencias del Proyecto, Descarga de Lombok y Uso del SGDB Oracle

</br>





### Paso 3) Listado de Dependencias
#### (Las siguientes dependencias del Proyecto deberán estar en el pom.xml para el correcto funcionamiento del Proyecto).


```xml
<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-jpa</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-thymeleaf</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-devtools</artifactId>
			<scope>runtime</scope>
			<optional>true</optional>
		</dependency>
		<dependency>
			<groupId>com.oracle.database.jdbc</groupId>
			<artifactId>ojdbc8</artifactId>
			<scope>runtime</scope>
		</dependency>
		<dependency>
			<groupId>org.projectlombok</groupId>
			<artifactId>lombok</artifactId>
			<optional>true</optional>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>

```

</br>

* ...
* Ctrl + s Guardas 
* Click Der sobre el proyecto
* Maven y update Maven o Alt + F5
* Fijarse dentro de Maven Dependencies si Maven descargo las mismas
 

</br>

### Paso 4) Descarga de `Lombok`
* Seguidamente de tener el jars a través de la dependencia en nuestro proyecto, vamos a instalar lombok para poder utilizarlo, no basta con la descarga, hay que realizar la configuración y descarga del mismo en nuestro ordenador.
* Buscamos el jar en Maven Dependencies `lombok-1.18....` Click derecho y properties
* Pestaña Java Source Attachment y buscamos el Path donde se descargo el jar de lombok.
* Nos dirigimos a dicha carpeta, en mi caso `C:\Users\andre\.m2\repository\org\projectlombok\lombok\1.18.22` y ejecutamos el jar de lombok `lombok-1.18.22.jar`
* VAMOS A REALIZAR LA INSTALACIÓN EN LA CARPETA DE CONFIGURACIÓN DE NUESTRO IDE SELECCIONANDO SELECCIONANDO SPECIFY LOCATION, EN MI CASO SPRING TOOL SUITE `C:\Program Files (x86)\sts-4.13.1.RELEASE`
* Instalamos, siguiente siguiente...
* Cerramos y Abrimos el IDE para que los cambios se ejecuten correctamente


</br>






### Paso 5) Configuraciones del `application.properties`
#### (Vamos a utilizar el esquema de conexión de nuestra db ya creado en otro repositorio acerca de productos de microelectronica, las dudas referentes a la misma se encuentra en su respectivo repositorio....https://github.com/andresWeitzel/db_microelectronica_Oracle)

</br>

* Como se mencionó, todos los pasos para trabajar con este esquema/db se encuentra en el respectivo repositorio, la información relevante será el nombre y contraseña de usuario o rol levantado en el respectivo esquema creado (db_microelectronica) de oracle..
```xml
username: admin_microelectronica

password: admin_microelectronica
```
* Las Configuraciones para el sgdb oracle serían..
* La URL es un estandar de uso, a comparación de otros sgdb que hay que pasarle que tipo de db se deberá utilizar en oracle no es necesario, sino el tipo de Oracle a implementarm, si es XE(Express Edition), o lo que fuese

```xml
spring.datasource.driver-class-name=oracle.jdbc.OracleDriver
spring.datasource.url=jdbc:oracle:thin:@localhost:1521/XE?serverTimezone=UTC
spring.datasource.username=admin_microelectronica
spring.datasource.password=admin_microelectronica
spring.jpa.database=oracle
```
* Además del dialect
```xml
spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.Oracle12cDialect

```

</br>

* Realizamos las configuraciones pertinentes para trabajar con el sgdb oracle 
 ```xml


server.port = 8092
server.error.whitelabel.enabled=true

spring.datasource.driver-class-name=oracle.jdbc.OracleDriver
spring.datasource.url=jdbc:oracle:thin:@localhost:1521/XE?serverTimezone=UTC
spring.datasource.username=admin_microelectronica
spring.datasource.password=admin_microelectronica
spring.jpa.database=oracle


spring.jpa.show-sql = true
spring.jpa.hibernate.ddl-auto = update
spring.jpa.hibernate.naming.strategy = org.hibernate.cfg.ImprovedNamingStrategy
spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.Oracle12cDialect



spring.data.rest.page-param-name=page
spring.data.rest.sort-param-name=sort
spring.data.rest.limit-param-name=limit
spring.data.rest.default-page-size = 1
spring.data.rest.max-page-size = 10


```


 </br>
 


</br>

## Sección 3) Creación y Configuración de las Clases Entities/Models

</br>

### Paso 6) Creación y Configuración de la Clase Entidad/Modelo ` ComponenteEntity`
#### (Voy a implementar un modelo que aplicará a todas las entidades, para no replicar código en el readme, ciertos campos van a variar dependiendo de cada Tabla a implementar, consultar esquema de tablas y campos en el repo de la base de datos....https://github.com/andresWeitzel/db_microelectronica_Oracle)

</br>

#### 6.1) Creación de la Clase `ComponenteEntity`

* Creamos un paquete llamado mypackages.entities dentro de com.gestion.microelectronica (src/main/java/com.gestion.microelectronica). Es importante que este dentro del mismo ya que sino Spring no desplegará la app de forma correcta.
	* --> Click Der sobre la ruta mencionada  
	* --> New --> Package
	* --> En Name seguido de com.gestion.microelectronica colocamos mypackages.entities (com.api.productos.mypackages.entities)
	* --> Finish

* Creamos la Entity
 	* --> Click Der sobre el paquete creado
 	* --> New --> Class
 	* --> Siempre asegurarse la ruta de creación a través del Source Folder y Package
 	* --> En Name colocamos ComponenteEntity
 	* --> Finish

```java

package com.gestion.microelectronica.mypackages.entities;

public class ComponenteEntity {

}

```


</br>

#### 6.2) Configuración de la Clase `ComponenteEntity`
* Creamos los atributos o campos de la Clase, usaremos las anotations correspondientes de JPA que a su vez estas serán nombres de campos de la db 
* No crearemos getters ni setters, ni el resto  ya que utilizaremos Lombok ( Asegurarse de haber instalado todo correctamente )
* Las anotaciones para lombok son `@Data` , `@AllArgsConstructor` y `@NoArgsConstructor` , la primera para la generacion de los getters y setters y el resto de metodos, la segunda para los constructores sobrecargados de la Entidad y la tercera para constructor vacio 
* Código..
```java

package com.gestion.microelectronica.mypackages.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="componentes")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ComponenteEntity {
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	@Column(name="id") 
	private int id;
	
	@Column(name="codigo")
	private String codigo;
	
	@Column(name="imagen")
	private String imagen;
	
	@Column(name="nro_pieza")
	private String nroPieza;
	
	@Column(name="categoria")
	private String categoria;
	
	@Column(name="descripcion") 
	private String descripcion;
	
	@Column(name="fabricante")
	private String fabricante;
	
	@Column(name="stock")
	private int stock;
	
	@Column(name="precio")
	private double precio;
	

}


```


</br>

### Paso 7) Creación y Configuración de la Clase Entidad/Modelo `ComponenteDetalleEntity`
#### (Se realiza el mismo procedimiento descrito detalladamente en el Paso Anterior )
* Código..
```java

package com.gestion.microelectronica.mypackages.entities;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="componentes_detalles")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ComponenteDetalleEntity {
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	@Column(name="id") 
	private int id;
	
	@Column(name="id_componente")
	private int idComponente;
	
	@Column(name="hoja_de_datos")
	private String hojaDeDatos;
	
	@Column(name="longitud")
	private String longitud;
	
	@Column(name="ancho")
	private String ancho;
	
	@Column(name="peso")
	private String peso;
	
	@Column(name="material")
	private String material;
	
	@Column(name="voltaje_recomendado") 
	private String voltajeRecomendado;
	
	@Column(name="voltaje_min_entrada")
	private String voltajeMinEntrada;
	
	@Column(name="voltaje_max_entrada")
	private String voltajeMaxEntrada;
	

}


```



</br>

## Sección 4) Creación y Configuración de las Interfaces Repositories  

</br>

#### Paso x) Creación y Configuración de la Interfaz Repository `I_ComponenteRepository` 
* Dentro de la jerarquia de paquetes `com.gestion.microelectronica` creamos el paquete `repositories`
* Dentro del mismo la Interfaz `I_ComponenteRepository`
* Agregamos la annotation `@Repository` de la clase para JPA y usamos la interfaz  `JpaRepository<ComponenteEntity, Serializable>` junto con la Interfaz de Paginación `PagingAndSortingRepository<ComponenteEntity, Long>` para toda la funcionalidad para la creación de los métodos Jpa.
* Creamos y Definimos todos los métodos abstractos haciendo referencia a los campos de la entidad tentativos de uso. 
* No creamos los métodos CRUD (add, save, update) en la interfaz, ya que declaramos todos los métodos abstractos sin devolución de valores. El método `findAll` será para Paginados
* Código..

```java
package com.gestion.microelectronica.mypackages.repositories;

import java.awt.print.Pageable;
import java.io.Serializable;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.gestion.microelectronica.mypackages.entities.ComponenteEntity;


@Repository
public interface I_ComponenteRepository extends JpaRepository<ComponenteEntity, Serializable>, PagingAndSortingRepository<ComponenteEntity, Serializable>{

	//============================ MÉTODOS DE BÚSQUEDA ============================== 
	
		public abstract ComponenteEntity findById(int id);
		
		public abstract List<ComponenteEntity> findByCodigo(String codigo);
	
		public abstract List<ComponenteEntity> findByImagen(String imagen);
		
		public abstract List<ComponenteEntity> findByNroPieza(String nroPieza);
		
		public abstract List<ComponenteEntity> findByCategoria(String categoria);
		
		public abstract List<ComponenteEntity> findByDescripcion(String descripcion);
	
		public abstract List<ComponenteEntity> findByFabricante(String fabricante);
		
		public abstract List<ComponenteEntity> findByStock(int stock);

		public abstract List<ComponenteEntity> findByPrecio(double precio);

	
		public abstract Page<ComponenteEntity> findAll(Pageable pageable);
		
	
}


```



































</br>

## Uso de Cygwin.
#### (Esta es una magnífica herramienta para trabajar con git a nivel consola desde algún IDE. Desde mi punto de vista simplifica muchísimo
la integración del Proyecto con Git).

#### 1)Descargar la herramienta en https://cygwin.com/install.html dependiendo la arquitectura que se tenga (32-64 bits)
* --> Como toda aplicacion siguiente.... siguiente....
* --> (IMPORTANTE:NO TENER ABIERTO EL IDE DURANTE LA INSTALACION, SINO NO RECONOCE EL PATH)

#### 2) Seleccionar el proyecto en Eclipse Ide para implementar git.
* --> Click Der 
* --> Show in Local Terminal
* --> Seleccionas Git Console o Terminal
* --> Si seleccionaste git console, te debería aparecer algo parecido a esto(Ruta Absoluta de tu proyecto)...
* --> andre@DESKTOP-7BN69K1 MINGW64 /c/Users/andre/OneDrive/Escritorio/LenguajesProgramacion/JAVA_AplicacionesWeb/Formu
larioMavenJSP/FormularioMaven (master)

#### 4)Creación de un Nuevo Repositorio git o usar el ya creado
* --> Debajo de esta sección, explico como usar git de forma detallada.

#### 5) Más Información https://ourcodeworld.com/articles/read/680/how-to-configure-an-integrated-terminal-command-prompt-in-netbeans-for-windows

</br>

## Subir el proyecto al repositorio con la terminal a traves de Cygwin en Eclipse
#### 1)Creamos un nuevo repositorio en GitHub.

#### 2)Inicializamos nuestro repositorio local .git desde la terminal.
* git init

#### 3)Agregamos lo desarrollado a nuestro repo local desde la terminal.
* git add *

#### 4)Agregamos lo que tenemos en nuestro repo local al área de Trabajo desde la terminal.
* git commit -m "agrega un comentario entre comillas"

#### 5)Le indicamos a git donde se va a almacenar nuestro proyecto(fijate en tu repositorio de github cual es el enlace de tu proyecto(esta en code)).
* git remote add origin https://github.com/andresWeitzel/AppGestionMicroelectronica_SpringBoot

#### 6)Subimos nuestro proyecto.
* git push -u origin master


</br>


## Actualización de el proyecto al repositorio con la terminal a traves de Cygwin en Netbeans

#### 1)Visualizamos las modificaciones realizadas en local
* git status

#### 2)Agregamos lo modificado al area de trabajo
* git add *

#### 3)Confirmamos las modificaciones realizadas
* git commit -m "tu commit entre comillas"

#### 4)Sincronizamos y traemos todos los cambios del repositorio remoto a la rama en la que estemos trabajando actualmente.
##### (SOLO SI SE REALIZARON CAMBIOS DESDE OTRA LADO, ej: en github u/o/y un equipo de trabajo)
* git pull https://github.com/andresWeitzel/AppGestionMicroelectronica_SpringBoot

#### 5)Enviamos todos los cambios locales al repo en github
* git push https://github.com/andresWeitzel/AppGestionMicroelectronica_SpringBoot

#### 6) En casos extremos pisamos todo el repositorio
* git push -f --set-upstream origin master


</br>


