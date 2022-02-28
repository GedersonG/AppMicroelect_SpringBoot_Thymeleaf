# AppGestionMicroelectronica_SpringBoot

* Aplicación Web para la Gestión de Productos de Microelectrónica implementando Spring Boot, Spring Data JPA, Maven, Lombok, Thymeleaf, Bootstrap y Oracle
* Repositorio de la Base de Datos : https://github.com/andresWeitzel/db_microelectronica_Oracle




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




#### Sección 5) Creación y Configuración de los Services 

   - [Paso f) Creación y Configuración del Service ComponenteService](#paso-f-creación-y-configuración-del-service-componenteservice)
   
   - [Paso k) Creación y Configuración del Service ComponenteDetalleService](#paso-k-creación-y-configuración-del-service-componentedetalleservice) 




#### Sección 6) Creación y Configuración de los Controllers
	
   - [Paso w) Creación y Configuración del Controller ComponenteController](#paso-w-creación-y-configuración-del-controller-componentecontroller)
   
   - [Paso z) Creación y Configuración del Controller ComponenteDetalleController](#paso-z-creación-y-configuración-del-service-componentedetallecontroller) 


#### Sección 7) Prueba del Servicio Rest Desarrollado

   - [Paso zz) Prueba del Servicio de la Tabla componentes](#paso-zz-prueba-del-servicio-de-la-tabla-componentes) 
   - [Paso zx) Prueba del Servicio de la Tabla componentes_detalles](#paso-zz-prueba-del-servicio-de-la-tabla-componentes-detalles) 


#### Sección 8) Creación de la Vista con Thymeleaf

   - [Paso zy) Creación de la Vista](#paso-zy-creacion-de-la-vista) 








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

* Creamos un paquete llamado `entities` dentro de com.gestion.microelectronica (src/main/java/com.gestion.microelectronica). Es importante que este dentro del mismo ya que sino Spring no desplegará la app de forma correcta.
	* --> Click Der sobre la ruta mencionada  
	* --> New --> Package
	* --> En Name seguido de `com.gestion.microelectronica` colocamos `entities` (com.api.productos.entities)
	* --> Finish

* Creamos la Entity
 	* --> Click Der sobre el paquete creado
 	* --> New --> Class
 	* --> Siempre asegurarse la ruta de creación a través del Source Folder y Package
 	* --> En Name colocamos ComponenteEntity
 	* --> Finish

```java

package com.gestion.microelectronica.entities;

public class ComponenteEntity {

}

```


</br>

#### 6.2) Configuración de la Clase `ComponenteEntity`
* Creamos los atributos o campos de la Clase, usaremos las anotations correspondientes de JPA que a su vez estas serán nombres de campos de la db 
* No crearemos getters ni setters, ni el resto  ya que utilizaremos Lombok ( Asegurarse de haber instalado todo correctamente )
* Es importante tener en consideración que si se tiene registros en la db al momento de insertar uno nuevo desde el servicio rest que desarrollaremos por defecto oracle posee un sistema de seguridad para los id en relación a otros sgdb. Entonces debemos crear una secuencia id en java que relacione a la secuencia id ya creada en la base de datos. La secuencia que crearemos se llamará `seq_comp` que se relacionará con la de la db `id_seq_comp`..
```java
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_comp")
	@SequenceGenerator(name = "seq_comp", sequenceName = "id_seq_comp" , allocationSize=1)
	@Id
	@Column(name="id") 
	private int id;
```
* Las anotaciones para lombok son `@Data` , `@AllArgsConstructor` y `@NoArgsConstructor` , la primera para la generacion de los getters y setters y el resto de metodos, la segunda para los constructores sobrecargados de la Entidad y la tercera para constructor vacio 
* Código..
```java
package com.gestion.microelectronica.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
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
	
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_comp")
	@SequenceGenerator(name = "seq_comp", sequenceName = "id_seq_comp" , allocationSize=1)
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
package com.gestion.microelectronica.entities;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
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
	
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_comp_det")
	@SequenceGenerator(name = "seq_comp_det", sequenceName = "id_seq_comp_det" , allocationSize=1)
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
* No creamos los métodos CRUD (add, save, update) en la interfaz, ya que declaramos todos los métodos abstractos sin devolución de valores. El método `findAllPageable` será para Paginados.
* Crearemos dos métodos de tipo findAll para diferentes usos posteriores
* Código..

```java
package com.gestion.microelectronica.repositories;


import java.io.Serializable;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.gestion.microelectronica.entities.ComponenteEntity;


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

		public abstract List<ComponenteEntity> findAll();
		
		public abstract Page<ComponenteEntity> findAll(Pageable pageable);
		
	
	
}



```


</br>

#### Paso y) Creación y Configuración de la Interfaz Repository `I_ComponenteDetalleRepository` 
#### (Se realiza el mismo procedimiento descrito detalladamente en el Paso Anterior)
* Código..
```java
package com.gestion.microelectronica.repositories;


import java.io.Serializable;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.gestion.microelectronica.entities.ComponenteDetalleEntity;
@Repository
public interface I_ComponenteDetalleRepository extends JpaRepository<ComponenteDetalleEntity, Serializable>, PagingAndSortingRepository<ComponenteDetalleEntity, Serializable>{


	//============================ MÉTODOS DE BÚSQUEDA ============================== 
	
		public abstract ComponenteDetalleEntity findById(int id);
		
		public abstract ComponenteDetalleEntity findByIdComponente(int id);
		
		public abstract List<ComponenteDetalleEntity> findByHojaDeDatos(String hojaDeDatos);
	
		public abstract List<ComponenteDetalleEntity> findByLongitud(String longitud);
		
		public abstract List<ComponenteDetalleEntity> findByAncho(String ancho);
		
		public abstract List<ComponenteDetalleEntity> findByPeso(String peso);
		
		public abstract List<ComponenteDetalleEntity> findByMaterial(String material);
		
		public abstract List<ComponenteDetalleEntity> findByVoltajeRecomendado(String voltajeRecomendado);
		
		public abstract List<ComponenteDetalleEntity> findByVoltajeMinEntrada(String voltajeMinEntrada);
	
		public abstract List<ComponenteDetalleEntity> findByVoltajeMaxEntrada(String voltajeMaxEntrada);
	
		public abstract List<ComponenteDetalleEntity> findAll();
		
		public abstract Page<ComponenteDetalleEntity> findAll(Pageable pageable);
		
	
}

```


</br>

## Sección 5) Creación y Configuración de los Services 

</br>

#### Paso f) Creación y Configuración del Service `ComponenteService` 
* Dentro de la jerarquia de paquetes `com.gestion.microelectronica` creamos el paquete `services`
* Dentro del mismo la Clase `ComponenteService`
* Agregamos la annotation `@Service` de la clase haciendo referencia para Spring y `@Autowired` para implementar Inyección de Dependencias de la interfaz creada.
* Usamos log4j para los logs de error en los métodos CRUD para la persistencia. 
* Desarrollamos el cuerpo de cada método de busqueda de la interfaz creada
* Cada uno de los Métodos CRUD tiene su comprobación de Persistencia y devolverán un booleano según el resultado de la operación, los mismos pueden ser modificados para adicionar mayor seguridad.
* Aplicaremos el metodo de listado de tipo getAll para paginados y el otro método getAll para el listado completo de componentes
* Código..
```java
package com.gestion.microelectronica.services;


import java.util.List;


import org.springframework.data.domain.Pageable;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.microelectronica.entities.ComponenteEntity;
import com.gestion.microelectronica.repositories.I_ComponenteRepository;


@Service
public class ComponenteService {

	@Autowired
	private I_ComponenteRepository iComponenteRepository;

	// =============== LOGS ====================
	private static final Logger logger = org.apache.logging.log4j.LogManager.getLogger(ComponenteService.class);

	// =============== MÉTODOS CRUD ====================

	// ------ INSERT --------
	public boolean addComponente(ComponenteEntity componente) {
		try {
			if (componente == null) {
				logger.error("ERROR addComponente : EL COMPONENTE " + componente + " ES NULO!!");
				return false;
			} else {
				iComponenteRepository.save(componente);
				return true;
			}

		} catch (Exception e) {
			logger.error("ERROR addComponente : EL COMPONENTE " + componente + " NO SE HA INSERTADO EN LA DB!!");
			return false;
		}
	}

	// ------ UPDATE --------
	public boolean updateComponente(ComponenteEntity componente) {
		try {
			if (componente == null) {
				logger.error("ERROR updateComponente : EL COMPONENTE " + componente + " ES NULO!!");
				return false;
			} else {
				iComponenteRepository.save(componente);
				return true;
			}

		} catch (Exception e) {
			logger.error("ERROR updateComponente : EL COMPONENTE " + componente + " NO SE HA ACTUALIZADO EN LA DB!!");
			return false;
		}
	}

	// ------ DELETE --------
	public boolean deleteComponente(int id) {
		try {
			if (id <= 0) {
				logger.error("ERROR deleteComponente : EL COMPONENTE CON EL " + id + " NO EXISTE!!");
				return false;
			} else {
				iComponenteRepository.delete(iComponenteRepository.findById(id));
				return true;
			}

		} catch (Exception e) {
			logger.error("ERROR deleteComponente : EL COMPONENTE CON EL " + id + " NO SE HA ELIMINADO DE LA DB!!");
			return false;
		}
	}

	// ------ SELECT --------
	//------- LISTADO COMPLETO ---------
	public List<ComponenteEntity> getAllComponente() {

		return iComponenteRepository.findAll();
	}

	// ------ SELECT --------
	//------- LISTADO PAGINADO ---------
	public List<ComponenteEntity> getAllComponente(Pageable pageable) {

		return iComponenteRepository.findAll(pageable).getContent();
	}

	// =============== MÉTODOS DE BUSQUEDA ====================

	// ------ ID --------
	public ComponenteEntity findById(int id) {
		return iComponenteRepository.findById(id);
	}

	// ------ CODIGO --------
	public List<ComponenteEntity> findByCodigo(String codigo) {
		return iComponenteRepository.findByCodigo(codigo);
	}

	// ------ IMAGEN --------
	public List<ComponenteEntity> findByImagen(String imagen) {
		return iComponenteRepository.findByImagen(imagen);
	}

	// ------ NRO_PIEZA --------
	public List<ComponenteEntity> findByNroPieza(String nroPieza) {
		return iComponenteRepository.findByNroPieza(nroPieza);
	}
	// ------ CATEGORIA --------
	public List<ComponenteEntity> findByCategoria(String categoria) {
		return iComponenteRepository.findByCategoria(categoria);
	}
	// ------ DESCRIPCION --------
	public List<ComponenteEntity> findByDescripcion(String descripcion) {
		return iComponenteRepository.findByDescripcion(descripcion);
	}
	// ------ FABRICANTE --------
	public List<ComponenteEntity> findByFabricante(String fabricante) {
		return iComponenteRepository.findByFabricante(fabricante);
	}
	// ------ STOCK --------
	public List<ComponenteEntity> findByStock(int cantidad) {
		return iComponenteRepository.findByStock(cantidad);
	}
	// ------ PRECIO --------
	public List<ComponenteEntity> findByPrecio(double precio) {
		return iComponenteRepository.findByPrecio(precio);
	}

	
}

```




</br>

#### Paso k) Creación y Configuración del Service `ComponenteDetalleService` 
#### (Se realiza el mismo procedimiento descrito detalladamente en el Paso Anterior)
* Código..
```java
package com.gestion.microelectronica.services;


import java.util.List;

import org.springframework.data.domain.Pageable;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.microelectronica.entities.ComponenteDetalleEntity;
import com.gestion.microelectronica.repositories.I_ComponenteDetalleRepository;

@Service
public class ComponenteDetalleService {

	@Autowired
	private I_ComponenteDetalleRepository iComponenteDetalleRepository;

	// =============== LOGS ====================
	private static final Logger logger = org.apache.logging.log4j.LogManager.getLogger(ComponenteService.class);

	// =============== MÉTODOS CRUD ====================

	// ------ INSERT --------
	public boolean addComponente(ComponenteDetalleEntity componenteDetalle) {
		try {
			if (componenteDetalle == null) {
				logger.error("ERROR addComponente : EL COMPONENTE " + componenteDetalle + " ES NULO!!");
				return false;
			} else {
				iComponenteDetalleRepository.save(componenteDetalle);
				return true;
			}

		} catch (Exception e) {
			logger.error("ERROR addComponente : EL COMPONENTE " + componenteDetalle + " NO SE HA INSERTADO EN LA DB!!");
			return false;
		}
	}

	// ------ UPDATE --------
	public boolean updateComponente(ComponenteDetalleEntity componenteDetalle) {
		try {
			if (componenteDetalle == null) {
				logger.error("ERROR updateComponente : EL COMPONENTE " + componenteDetalle + " ES NULO!!");
				return false;
			} else {
				iComponenteDetalleRepository.save(componenteDetalle);
				return true;
			}

		} catch (Exception e) {
			logger.error(
					"ERROR updateComponente : EL COMPONENTE " + componenteDetalle + " NO SE HA ACTUALIZADO EN LA DB!!");
			return false;
		}
	}

	// ------ DELETE --------
	public boolean deleteComponente(int id) {
		try {
			if (id <= 0) {
				logger.error("ERROR deleteComponente : EL COMPONENTE CON EL " + id + " NO EXISTE!!");
				return false;
			} else {
				iComponenteDetalleRepository.delete(iComponenteDetalleRepository.findById(id));
				return true;
			}

		} catch (Exception e) {
			logger.error("ERROR deleteComponente : EL COMPONENTE CON EL " + id + " NO SE HA ELIMINADO DE LA DB!!");
			return false;
		}
	}

	// ------ SELECT --------
	//------- LISTADO COMPLETO ---------
	public List<ComponenteDetalleEntity> getAllComponente() {

		return iComponenteDetalleRepository.findAll();
	}

	// ------ SELECT --------
	//------- LISTADO PAGINADO ---------
	public List<ComponenteDetalleEntity> getAllComponente(Pageable pageable) {

		return iComponenteDetalleRepository.findAll(pageable).getContent();
	}

	// =============== MÉTODOS DE BUSQUEDA ====================

	// ------ ID --------
	public ComponenteDetalleEntity findById(int id) {
		return iComponenteDetalleRepository.findById(id);
	}

	// ------ ID DE COMPONENTE --------
	public ComponenteDetalleEntity findByIdComponente(int id) {
		return iComponenteDetalleRepository.findByIdComponente(id);
	}

	// ------ HOJA DE DATOS --------
	public List<ComponenteDetalleEntity> findByHojaDeDatos(String hojaDeDatos) {
		return iComponenteDetalleRepository.findByHojaDeDatos(hojaDeDatos);
	}

	// ------ LONGITUD --------
	public List<ComponenteDetalleEntity> findByLongitud(String longitud) {
		return iComponenteDetalleRepository.findByLongitud(longitud);
	}

	// ------ ANCHO --------
	public List<ComponenteDetalleEntity> findByAncho(String ancho) {
		return iComponenteDetalleRepository.findByAncho(ancho);
	}

	// ------ PESO --------
	public List<ComponenteDetalleEntity> findByPeso(String peso) {
		return iComponenteDetalleRepository.findByPeso(peso);
	}

	// ------ MATERIAL --------
	public List<ComponenteDetalleEntity> findByMaterial(String material) {
		return iComponenteDetalleRepository.findByMaterial(material);
	}

	// ------ VOLTAJE RECOMENDADO --------
	public List<ComponenteDetalleEntity> findByVoltajeRecomendado(String voltajeRecomendado) {
		return iComponenteDetalleRepository.findByVoltajeRecomendado(voltajeRecomendado);
	}

	// ------ VOLTAJE MINIMO DE ENTRADA --------
	public List<ComponenteDetalleEntity> findByVoltajeMinEntrada(String voltajeMinEntrada) {
		return iComponenteDetalleRepository.findByVoltajeMinEntrada(voltajeMinEntrada);
	}

	// ------ VOLTAJE MAXIMO DE ENTRADA --------
	public List<ComponenteDetalleEntity> findByVoltajeMaxEntrada(String voltajeMaxEntrada) {
		return iComponenteDetalleRepository.findByVoltajeMinEntrada(voltajeMaxEntrada);
	}

}


```


</br>

##  Sección 6) Creación y Configuración de los Controllers

</br>

#### Paso w) Creación y Configuración del Controller  `ComponenteController` 
* Dentro de la jerarquia de paquetes `com.inmueble.service` creamos el paquete `controller`
* Dentro del mismo la Clase Controller `ComponenteController`
* Agregamos la annotation `@RestController` de la clase haciendo referencia al controlador y la annotation `@RequestMapping` haciendo referencia a la ruta principal de acceso para Spring.
* Implementamos `@Autowired` para Inyección de Dependencias del service creado.
* Utilizamos `@PostMapping` y `@GetMapping` para el uso de los métodos del protocolo HTTP 
* También hacemos uso de las annotations `@RequestBody` para recuperar el cuerpo de la solicitud HTTP y el `@PathVariable` para el manejo de las variables declaradas
* Usamos log4j para los logs de error en los métodos CRUD para la persistencia. 
* Desarrollamos el cuerpo de cada método de la interfaz
* Cada Método CRUD de Tipo HTTP (POST, DELETE, PUT, GET) tiene su comprobación de Persistencia y los métodos devolverán un booleano según el resultado de la operación, menos el get que trae el Componente. Los mismos pueden ser modificados para adicionar mayor seguridad.
* Además crearemos un método que nos devolverá la vista del front(index) y a su vez seteamos un objeto que representará la lista de componentes , dicho método se llamará ModelandView y nos devolverá el index
 ```java
	//---GET---
	//---VISTA Y LISTA DE COMPONENTES---
	@GetMapping("/")
	public ModelAndView listarModelAndView() {
	    ModelAndView mav = new ModelAndView();
	    mav.addObject("listaComponentes", componenteService.getAllComponente());
	    mav.setViewName("index");
	    return mav;
	}
 
 ```
 * Código del Controller...
 </br>
 
 ```java
package com.gestion.microelectronica.controllers;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.gestion.microelectronica.entities.ComponenteEntity;
import com.gestion.microelectronica.services.ComponenteService;

@RestController
@RequestMapping("/componentes")
public class ComponenteController {

	@Autowired
	private ComponenteService componenteService;

	// ============= MÉTODOS HTTP CRUD ==============

	// ----POST----
	@PostMapping("/")
	public boolean addComponente(@RequestBody ComponenteEntity componente) {

		return componenteService.addComponente(componente);
	}

	// ----PUT-----
	@PutMapping("/")
	public boolean updateComponente(@RequestBody ComponenteEntity componente) {

		return componenteService.updateComponente(componente);
	}

	// ---DELETE---
	@DeleteMapping("/{id}")
	public boolean deleteComponente(@PathVariable("id") int id) {

		return componenteService.deleteComponente(id);
	}
	
	// ---GET---
	//---LISTADO PAGINADO Y COMPLETO---
	@GetMapping("/listado")
	public List<ComponenteEntity> getAll(Pageable pageable) {

		return componenteService.getAllComponente(pageable);
	}
	
	//---GET---
	//---VISTA Y LISTA DE COMPONENTES---
	@GetMapping("/")
	public ModelAndView listarModelAndView() {
	    ModelAndView mav = new ModelAndView();
	    mav.addObject("listaComponentes", componenteService.getAllComponente());
	    mav.setViewName("componentes");
	    return mav;
	}
	// ============= MÉTODOS HTTP BÚSQUEDA ==============

	// ---GET---
	@GetMapping("/{id}")
	public ComponenteEntity getById(@PathVariable("id") int id) {

		return componenteService.findById(id);
	}
	
	// ---GET---
	@GetMapping("/{codigo}")
	public List<ComponenteEntity> getByCodigo(@PathVariable("codigo") String codigo) {

		return componenteService.findByCodigo(codigo);
	}

}


 ```
 
 </br>


#### Paso w) Creación y Configuración del Controller `ComponenteDetalleController` 
* Mismos Procedimientos que el controlador anterior..
 ```java	
package com.gestion.microelectronica.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.gestion.microelectronica.entities.ComponenteDetalleEntity;
import com.gestion.microelectronica.entities.ComponenteEntity;
import com.gestion.microelectronica.services.ComponenteDetalleService;

@RestController
@RequestMapping("/componentes_detalles")
public class ComponenteDetalleController {
	

	@Autowired
	private ComponenteDetalleService componenteDetalleService;

	// ============= MÉTODOS HTTP CRUD ==============

	// ----POST----
	@PostMapping("/")
	public boolean addComponenteDetalle(@RequestBody ComponenteDetalleEntity componenteDetalle) {

		return componenteDetalleService.addComponente(componenteDetalle);
	}

	// ----PUT-----
	@PutMapping("/")
	public boolean updateComponenteDetalle(@RequestBody ComponenteDetalleEntity componenteDetalle) {

		return componenteDetalleService.updateComponente(componenteDetalle);
	}

	// ---DELETE---
	@DeleteMapping("/{id}")
	public boolean deleteComponenteDetalle(@PathVariable("id") int id) {

		return componenteDetalleService.deleteComponente(id);
	}


	
	// ---GET---
	// --- LISTADO PAGINADO Y COMPLETO---
	@GetMapping("/listado")
	public List<ComponenteDetalleEntity> getAll(Pageable pageable) {

		return componenteDetalleService.getAllComponente(pageable);
	}
	
	
	
	//---GET---
	//---VISTA Y LISTA DE COMPONENTES---
	@GetMapping("/")
	public ModelAndView listarModelAndView() {
	    ModelAndView mav = new ModelAndView();
	    mav.addObject("listaComponentesDetalles", componenteDetalleService.getAllComponente());
	    mav.setViewName("componentes_detalles");
	    return mav;
	}
	
	// ============= MÉTODOS HTTP BÚSQUEDA ==============

	// ---GET---
	@GetMapping("/{id}")
	public ComponenteDetalleEntity getById(@PathVariable("id") int id) {

		return componenteDetalleService.findById(id);
	}
	
	// ---GET---
	@GetMapping("/{id_componente}")
	public ComponenteDetalleEntity getByIdComponente(@PathVariable("id_componente") int id_componente) {

		return componenteDetalleService.findByIdComponente(id_componente);
	}
	
	

	
	
	


}


 ```

</br>

##  Sección 7) Prueba del Servicio Rest Desarrollado

</br>



### Paso zz) Prueba del Servicio de la Tabla `componentes`
#### (Vamos a testear los métodos desarrollados con Postman, es importante que se hayan ejecutado los pasos anteriores de forma correcta y se hayan agregado a la db sus registros y tablas correctamente según el repositorio de la db)

 </br>
 
 
  * Testeamos el Método GET junto con la paginación creada para visualizar los componentes de la db con la siguiente uri `http://localhost:8092/componentes/listado?page=0&size=0`
 * Obtenemos un Status 200 OK junto con el listado total de componentes..
 * Response..
  ```json
[
    {
        "id": 1,
        "codigo": "HDGHFK-KSH13006",
        "imagen": "https://images.alldatasheet.es/semiconductor/electronic_parts/datasheet/335783/HUASHAN/KSH13005.GIF",
        "nroPieza": "KSH13006",
        "categoria": "Transistores BJT",
        "descripcion": "Transistor BJT NPN",
        "fabricante": "SHANTOU HUASHAN",
        "stock": 300,
        "precio": 2.0
    },
    {
        "id": 2,
        "codigo": "DFHSDK-3CD010G",
        "imagen": "https://http2.mlstatic.com/D_NQ_NP_906581-MLA32747237952_112019-O.webp",
        "nroPieza": "3CD010G",
        "categoria": "Transistores BJT",
        "descripcion": "Transistor BJT PNP",
        "fabricante": "INCHANGE SEMICONDUCTOR",
        "stock": 400,
        "precio": 5.0
    },
    {
        "id": 3,
        "codigo": "JDHFYT-AP4519GED",
        "imagen": "https://alltransistors.com/adv/pdfdatasheet_ape/image/ap4511gh-hf_0001.jpg",
        "nroPieza": "AP4519GED",
        "categoria": "Transistores MOSFET",
        "descripcion": "Transistor Mosfet NP",
        "fabricante": "Advanced Power",
        "stock": 200,
        "precio": 4.0
    },
    {
        "id": 4,
        "codigo": "HJDGHF-SL60N06",
        "imagen": "https://http2.mlstatic.com/D_NQ_NP_2X_893006-MLA41523372205_042020-F.webp",
        "nroPieza": "SL60N06",
        "categoria": "Transistores MOSFET",
        "descripcion": "Transistor Mosfet N",
        "fabricante": "Slkor",
        "stock": 50,
        "precio": 7.0
    },
    {
        "id": 5,
        "codigo": "009-KLDIUAOASS",
        "imagen": "https://http2.mlstatic.com/D_NQ_NP_757161-MLA41722189255_052020-O.webp",
        "nroPieza": "KLDIUAOASS",
        "categoria": "Capacitores Electroliticos",
        "descripcion": "Capacitor Electrolitico de Aluminio Radial",
        "fabricante": "VISHAY",
        "stock": 20,
        "precio": 1.0
    },
    {
        "id": 6,
        "codigo": "3097-JKSJHSBS6DVBDG",
        "imagen": "https://http2.mlstatic.com/D_NQ_NP_2X_938147-MLA47364644565_092021-F.webp",
        "nroPieza": "BS6DVBDG",
        "categoria": "Capacitores Electroliticos",
        "descripcion": "Capacitor Electrolitico de Aluminio Axial",
        "fabricante": "VISHAY",
        "stock": 18,
        "precio": 1.6
    },
    {
        "id": 7,
        "codigo": "594-MIF2500BFKMGNHT5",
        "imagen": "https://ar.mouser.com/images/vishay/images/mif1000afkmgnht5_SPL.jpg",
        "nroPieza": "FKMGNHT5",
        "categoria": "Resistores de Alta Frecuencia",
        "descripcion": "Resistores de alta frecuencia RF 25ohms 1% 100ppm",
        "fabricante": "VISHAY",
        "stock": 800,
        "precio": 5.0
    },
    {
        "id": 8,
        "codigo": "581-CS12010T0100GTR",
        "imagen": "https://ar.mouser.com/images/americantechnicalceramics/images/ATCFT.jpg",
        "nroPieza": "T0100GTR",
        "categoria": "Resistores de Alta Frecuencia",
        "descripcion": "Resistores de alta frecuencia RF 100ohms 2% 10W",
        "fabricante": "KYSHOCERA",
        "stock": 1200,
        "precio": 3.0
    },
    {
        "id": 9,
        "codigo": "HSFGDTTEE-KY0-PIC18F4520-I/PT",
        "imagen": "https://www.kynix.com/uploadfiles/small/PIC18F4520-I2fPT_10386.jpg",
        "nroPieza": "KY0-PIC18F4520-I/PT",
        "categoria": "Microcontroladores PICS",
        "descripcion": "Microcontrolador PIC18F4520-I/PT",
        "fabricante": "Microchip",
        "stock": 40,
        "precio": 20.0
    },
    {
        "id": 10,
        "codigo": "HJDYETU-KY32-PIC-00130-001",
        "imagen": "https://www.kynix.com/images/ic-package/SOP.jpg",
        "nroPieza": "KY32-PIC-00130-001",
        "categoria": "Microcontroladores PICS",
        "descripcion": "Microcontrolador PIC-00130-001",
        "fabricante": "T-Wins",
        "stock": 34,
        "precio": 30.0
    },
    {
        "id": 11,
        "codigo": "ATMEGA32-16AURTR-ND",
        "imagen": "https://media.digikey.com/Renders/Atmel%20Renders/313;44A;A;44.jpg",
        "nroPieza": "16AURTR-ND",
        "categoria": "Microcontroladores AVRS",
        "descripcion": "Microcontrolador AVR ATMEGA32-16AUR",
        "fabricante": "Microchip Technology",
        "stock": 10,
        "precio": 30.0
    },
    {
        "id": 12,
        "codigo": "ATMEGA328P-MUR-JKSHJ67",
        "imagen": "https://es.farnell.com/productimages/standard/en_GB/GE32QFN-40.jpg",
        "nroPieza": "MUR-JKSHJ67",
        "categoria": "Microcontroladores AVRS",
        "descripcion": "Microcontrolador AVR ATMEGA328P-MUR",
        "fabricante": "Microchip Technology",
        "stock": 15,
        "precio": 25.0
    },
    {
        "id": 13,
        "codigo": "KSHJETA-ARDUINO-UNO",
        "imagen": "https://http2.mlstatic.com/D_NQ_NP_2X_603035-MLA41509685506_042020-F.webp",
        "nroPieza": "ETA-ARDUINO-UNO",
        "categoria": "Placas Arduino",
        "descripcion": "Placa Arduino Uno R3",
        "fabricante": "Arduino",
        "stock": 30,
        "precio": 10.0
    },
    {
        "id": 14,
        "codigo": "JSHYUTT-ARDUINO-NANO",
        "imagen": "https://http2.mlstatic.com/D_NQ_NP_2X_728208-MLA40243275480_122019-F.webp",
        "nroPieza": "UTT-ARDUINO-NANO",
        "categoria": "Placas Arduino",
        "descripcion": "Placa Arduino Nano V3.0",
        "fabricante": "Arduino",
        "stock": 40,
        "precio": 8.0
    },
    {
        "id": 15,
        "codigo": "2471S0A-ESP8266",
        "imagen": "https://upload.wikimedia.org/wikipedia/commons/thumb/8/84/ESP-01.jpg/375px-ESP-01.jpg",
        "nroPieza": "0A-ESP8266",
        "categoria": "Placas Esp8266",
        "descripcion": "Placa Esp8266 EX",
        "fabricante": "Espressif Systems",
        "stock": 10,
        "precio": 10.0
    },
    {
        "id": 16,
        "codigo": "JD76FG6-DOIT-WEMOS-Mini",
        "imagen": "https://www.esploradores.com/wp-content/uploads/2017/01/DOIT-WEMOS-Mini-NodeMCU-768x641.jpg",
        "nroPieza": "DOIT-WEMOS-Mini",
        "categoria": "Placas Esp8266",
        "descripcion": "Placa Wemos D1 Mini",
        "fabricante": "Wemos",
        "stock": 12,
        "precio": 8.0
    },
    {
        "id": 17,
        "codigo": "HJSHKWROOM-ESP32",
        "imagen": "https://ar.mouser.com/images/espressifsystems/lrg/ESP32-DevKitC-32UE_SPL.jpg",
        "nroPieza": "WROOM-ESP32",
        "categoria": "Placas Esp32",
        "descripcion": "Placa Esp32 WROOM 32ue",
        "fabricante": "Espressif Systems",
        "stock": 5,
        "precio": 20.0
    },
    {
        "id": 18,
        "codigo": "H789DHJUi-ESP32",
        "imagen": "https://tienda.ityt.com.ar/23642-large_default/modulo-wifi-bluetooth-esp32-esp-wroom-32-espressif-itytarg.jpg",
        "nroPieza": "DHJUi-ESP32i",
        "categoria": "Placas Esp32",
        "descripcion": "Placa ESP32 WROOM",
        "fabricante": "Espressif Systems",
        "stock": 5,
        "precio": 15.0
    }
]
 ```
  * Se puede obtener mayor información acerca del manejo y uso de una API Rest con los paginados en otro repositorio https://github.com/andresWeitzel/Api_Rest_Spring_Productos
 
</br>

* Para la inserción de Registros recordar que se debio haber modificados la anotation de la entity correspondiente haciendo relacion a la secuencia creada de java con la de la base de datos, para que no se presente el error de id duplicado
* Testeamos el método POST de inserción de registros mediante la siguiente uri `http://localhost:8092/listado/` y agregando en el Body en formato Json el Registro de Inserción..
 ```json
{
        "codigo": "UKGLUIO555-FG99",
        "imagen": "https://www.industriasgsl.com/pub/media/wysiwyg/mosfet_panamahitek.jpg",
        "nroPieza": "55-FG99",
        "categoria": "Transistores BJT",
        "descripcion": "Transistor BJT PNP",
        "fabricante": "Genérico",
        "stock": 100,
        "precio": 1.0

}
 ```
 * Obtenemos un Status 200 OK  además del true devuelto por el método desarrollado.
 * La función se ejecuta correctamente.
 
  </br>
  
 * Visualizamos el Listado de Componentes para Verificar lo Insertado`http://localhost:8092/componentes/listado?page=0&size=0`
 * Obtenemos un Status 200 OK junto con el listado total de componentes..
 * Response..
  ```json
  [
    {
        "id": 1,
        "codigo": "HDGHFK-KSH13006",
        "imagen": "https://images.alldatasheet.es/semiconductor/electronic_parts/datasheet/335783/HUASHAN/KSH13005.GIF",
        "nroPieza": "KSH13006",
        "categoria": "Transistores BJT",
        "descripcion": "Transistor BJT NPN",
        "fabricante": "SHANTOU HUASHAN",
        "stock": 300,
        "precio": 2.0
    },
    {
        "id": 2,
        "codigo": "DFHSDK-3CD010G",
        "imagen": "https://http2.mlstatic.com/D_NQ_NP_906581-MLA32747237952_112019-O.webp",
        "nroPieza": "3CD010G",
        "categoria": "Transistores BJT",
        "descripcion": "Transistor BJT PNP",
        "fabricante": "INCHANGE SEMICONDUCTOR",
        "stock": 400,
        "precio": 5.0
    },
    {
        "id": 3,
        "codigo": "JDHFYT-AP4519GED",
        "imagen": "https://alltransistors.com/adv/pdfdatasheet_ape/image/ap4511gh-hf_0001.jpg",
        "nroPieza": "AP4519GED",
        "categoria": "Transistores MOSFET",
        "descripcion": "Transistor Mosfet NP",
        "fabricante": "Advanced Power",
        "stock": 200,
        "precio": 4.0
    },
    {
        "id": 4,
        "codigo": "HJDGHF-SL60N06",
        "imagen": "https://http2.mlstatic.com/D_NQ_NP_2X_893006-MLA41523372205_042020-F.webp",
        "nroPieza": "SL60N06",
        "categoria": "Transistores MOSFET",
        "descripcion": "Transistor Mosfet N",
        "fabricante": "Slkor",
        "stock": 50,
        "precio": 7.0
    },
    {
        "id": 5,
        "codigo": "009-KLDIUAOASS",
        "imagen": "https://http2.mlstatic.com/D_NQ_NP_757161-MLA41722189255_052020-O.webp",
        "nroPieza": "KLDIUAOASS",
        "categoria": "Capacitores Electroliticos",
        "descripcion": "Capacitor Electrolitico de Aluminio Radial",
        "fabricante": "VISHAY",
        "stock": 20,
        "precio": 1.0
    },
    {
        "id": 6,
        "codigo": "3097-JKSJHSBS6DVBDG",
        "imagen": "https://http2.mlstatic.com/D_NQ_NP_2X_938147-MLA47364644565_092021-F.webp",
        "nroPieza": "BS6DVBDG",
        "categoria": "Capacitores Electroliticos",
        "descripcion": "Capacitor Electrolitico de Aluminio Axial",
        "fabricante": "VISHAY",
        "stock": 18,
        "precio": 1.6
    },
    {
        "id": 7,
        "codigo": "594-MIF2500BFKMGNHT5",
        "imagen": "https://ar.mouser.com/images/vishay/images/mif1000afkmgnht5_SPL.jpg",
        "nroPieza": "FKMGNHT5",
        "categoria": "Resistores de Alta Frecuencia",
        "descripcion": "Resistores de alta frecuencia RF 25ohms 1% 100ppm",
        "fabricante": "VISHAY",
        "stock": 800,
        "precio": 5.0
    },
    {
        "id": 8,
        "codigo": "581-CS12010T0100GTR",
        "imagen": "https://ar.mouser.com/images/americantechnicalceramics/images/ATCFT.jpg",
        "nroPieza": "T0100GTR",
        "categoria": "Resistores de Alta Frecuencia",
        "descripcion": "Resistores de alta frecuencia RF 100ohms 2% 10W",
        "fabricante": "KYSHOCERA",
        "stock": 1200,
        "precio": 3.0
    },
    {
        "id": 9,
        "codigo": "HSFGDTTEE-KY0-PIC18F4520-I/PT",
        "imagen": "https://www.kynix.com/uploadfiles/small/PIC18F4520-I2fPT_10386.jpg",
        "nroPieza": "KY0-PIC18F4520-I/PT",
        "categoria": "Microcontroladores PICS",
        "descripcion": "Microcontrolador PIC18F4520-I/PT",
        "fabricante": "Microchip",
        "stock": 40,
        "precio": 20.0
    },
    {
        "id": 10,
        "codigo": "HJDYETU-KY32-PIC-00130-001",
        "imagen": "https://www.kynix.com/images/ic-package/SOP.jpg",
        "nroPieza": "KY32-PIC-00130-001",
        "categoria": "Microcontroladores PICS",
        "descripcion": "Microcontrolador PIC-00130-001",
        "fabricante": "T-Wins",
        "stock": 34,
        "precio": 30.0
    },
    {
        "id": 11,
        "codigo": "ATMEGA32-16AURTR-ND",
        "imagen": "https://media.digikey.com/Renders/Atmel%20Renders/313;44A;A;44.jpg",
        "nroPieza": "16AURTR-ND",
        "categoria": "Microcontroladores AVRS",
        "descripcion": "Microcontrolador AVR ATMEGA32-16AUR",
        "fabricante": "Microchip Technology",
        "stock": 10,
        "precio": 30.0
    },
    {
        "id": 12,
        "codigo": "ATMEGA328P-MUR-JKSHJ67",
        "imagen": "https://es.farnell.com/productimages/standard/en_GB/GE32QFN-40.jpg",
        "nroPieza": "MUR-JKSHJ67",
        "categoria": "Microcontroladores AVRS",
        "descripcion": "Microcontrolador AVR ATMEGA328P-MUR",
        "fabricante": "Microchip Technology",
        "stock": 15,
        "precio": 25.0
    },
    {
        "id": 13,
        "codigo": "KSHJETA-ARDUINO-UNO",
        "imagen": "https://http2.mlstatic.com/D_NQ_NP_2X_603035-MLA41509685506_042020-F.webp",
        "nroPieza": "ETA-ARDUINO-UNO",
        "categoria": "Placas Arduino",
        "descripcion": "Placa Arduino Uno R3",
        "fabricante": "Arduino",
        "stock": 30,
        "precio": 10.0
    },
    {
        "id": 14,
        "codigo": "JSHYUTT-ARDUINO-NANO",
        "imagen": "https://http2.mlstatic.com/D_NQ_NP_2X_728208-MLA40243275480_122019-F.webp",
        "nroPieza": "UTT-ARDUINO-NANO",
        "categoria": "Placas Arduino",
        "descripcion": "Placa Arduino Nano V3.0",
        "fabricante": "Arduino",
        "stock": 40,
        "precio": 8.0
    },
    {
        "id": 15,
        "codigo": "2471S0A-ESP8266",
        "imagen": "https://upload.wikimedia.org/wikipedia/commons/thumb/8/84/ESP-01.jpg/375px-ESP-01.jpg",
        "nroPieza": "0A-ESP8266",
        "categoria": "Placas Esp8266",
        "descripcion": "Placa Esp8266 EX",
        "fabricante": "Espressif Systems",
        "stock": 10,
        "precio": 10.0
    },
    {
        "id": 16,
        "codigo": "JD76FG6-DOIT-WEMOS-Mini",
        "imagen": "https://www.esploradores.com/wp-content/uploads/2017/01/DOIT-WEMOS-Mini-NodeMCU-768x641.jpg",
        "nroPieza": "DOIT-WEMOS-Mini",
        "categoria": "Placas Esp8266",
        "descripcion": "Placa Wemos D1 Mini",
        "fabricante": "Wemos",
        "stock": 12,
        "precio": 8.0
    },
    {
        "id": 17,
        "codigo": "HJSHKWROOM-ESP32",
        "imagen": "https://ar.mouser.com/images/espressifsystems/lrg/ESP32-DevKitC-32UE_SPL.jpg",
        "nroPieza": "WROOM-ESP32",
        "categoria": "Placas Esp32",
        "descripcion": "Placa Esp32 WROOM 32ue",
        "fabricante": "Espressif Systems",
        "stock": 5,
        "precio": 20.0
    },
    {
        "id": 18,
        "codigo": "H789DHJUi-ESP32",
        "imagen": "https://tienda.ityt.com.ar/23642-large_default/modulo-wifi-bluetooth-esp32-esp-wroom-32-espressif-itytarg.jpg",
        "nroPieza": "DHJUi-ESP32i",
        "categoria": "Placas Esp32",
        "descripcion": "Placa ESP32 WROOM",
        "fabricante": "Espressif Systems",
        "stock": 5,
        "precio": 15.0
    },
    {
        "id": 19,
        "codigo": "UKGLUIO555-FG99",
        "imagen": "https://www.industriasgsl.com/pub/media/wysiwyg/mosfet_panamahitek.jpg",
        "nroPieza": "55-FG99",
        "categoria": "Transistores BJT",
        "descripcion": "Transistor BJT PNP",
        "fabricante": "Genérico",
        "stock": 100,
        "precio": 1.0
    }
]
  ```
  
  
  </br>
  
  * Ahora Testeamos el método PUT, vamos a modificar el Último Componente Insertado (cambiamos el Código y Nro de Pieza)  a través de la siguiente uri `http://localhost:8092/componentes/`, pasandole en el body el registro completo junto a su id ..
  ```json
 {
        "id": 19,
        "codigo": "JGKURISSDK-47363933",
        "imagen": "https://www.industriasgsl.com/pub/media/wysiwyg/mosfet_panamahitek.jpg",
        "nroPieza": "DK-47363933",
        "categoria": "Transistores BJT",
        "descripcion": "Transistor BJT PNP",
        "fabricante": "Genérico",
        "stock": 100,
        "precio": 1.0
    }
  
  ```
  * Obtenemos un Status 200 OK y un true, si visualizamos la lista con el GET podremos ver allí la modificación realizada
  
  </br>
  
    
 * Visualizamos el Listado de Componentes para Verificar lo Insertado`http://localhost:8092/componentes/listado?page=0&size=0`
 * Obtenemos un Status 200 OK junto con el listado total de componentes..
 * Response..
  ```json
 [
    {
        "id": 1,
        "codigo": "HDGHFK-KSH13006",
        "imagen": "https://images.alldatasheet.es/semiconductor/electronic_parts/datasheet/335783/HUASHAN/KSH13005.GIF",
        "nroPieza": "KSH13006",
        "categoria": "Transistores BJT",
        "descripcion": "Transistor BJT NPN",
        "fabricante": "SHANTOU HUASHAN",
        "stock": 300,
        "precio": 2.0
    },
    {
        "id": 2,
        "codigo": "DFHSDK-3CD010G",
        "imagen": "https://http2.mlstatic.com/D_NQ_NP_906581-MLA32747237952_112019-O.webp",
        "nroPieza": "3CD010G",
        "categoria": "Transistores BJT",
        "descripcion": "Transistor BJT PNP",
        "fabricante": "INCHANGE SEMICONDUCTOR",
        "stock": 400,
        "precio": 5.0
    },
    {
        "id": 3,
        "codigo": "JDHFYT-AP4519GED",
        "imagen": "https://alltransistors.com/adv/pdfdatasheet_ape/image/ap4511gh-hf_0001.jpg",
        "nroPieza": "AP4519GED",
        "categoria": "Transistores MOSFET",
        "descripcion": "Transistor Mosfet NP",
        "fabricante": "Advanced Power",
        "stock": 200,
        "precio": 4.0
    },
    {
        "id": 4,
        "codigo": "HJDGHF-SL60N06",
        "imagen": "https://http2.mlstatic.com/D_NQ_NP_2X_893006-MLA41523372205_042020-F.webp",
        "nroPieza": "SL60N06",
        "categoria": "Transistores MOSFET",
        "descripcion": "Transistor Mosfet N",
        "fabricante": "Slkor",
        "stock": 50,
        "precio": 7.0
    },
    {
        "id": 5,
        "codigo": "009-KLDIUAOASS",
        "imagen": "https://http2.mlstatic.com/D_NQ_NP_757161-MLA41722189255_052020-O.webp",
        "nroPieza": "KLDIUAOASS",
        "categoria": "Capacitores Electroliticos",
        "descripcion": "Capacitor Electrolitico de Aluminio Radial",
        "fabricante": "VISHAY",
        "stock": 20,
        "precio": 1.0
    },
    {
        "id": 6,
        "codigo": "3097-JKSJHSBS6DVBDG",
        "imagen": "https://http2.mlstatic.com/D_NQ_NP_2X_938147-MLA47364644565_092021-F.webp",
        "nroPieza": "BS6DVBDG",
        "categoria": "Capacitores Electroliticos",
        "descripcion": "Capacitor Electrolitico de Aluminio Axial",
        "fabricante": "VISHAY",
        "stock": 18,
        "precio": 1.6
    },
    {
        "id": 7,
        "codigo": "594-MIF2500BFKMGNHT5",
        "imagen": "https://ar.mouser.com/images/vishay/images/mif1000afkmgnht5_SPL.jpg",
        "nroPieza": "FKMGNHT5",
        "categoria": "Resistores de Alta Frecuencia",
        "descripcion": "Resistores de alta frecuencia RF 25ohms 1% 100ppm",
        "fabricante": "VISHAY",
        "stock": 800,
        "precio": 5.0
    },
    {
        "id": 8,
        "codigo": "581-CS12010T0100GTR",
        "imagen": "https://ar.mouser.com/images/americantechnicalceramics/images/ATCFT.jpg",
        "nroPieza": "T0100GTR",
        "categoria": "Resistores de Alta Frecuencia",
        "descripcion": "Resistores de alta frecuencia RF 100ohms 2% 10W",
        "fabricante": "KYSHOCERA",
        "stock": 1200,
        "precio": 3.0
    },
    {
        "id": 9,
        "codigo": "HSFGDTTEE-KY0-PIC18F4520-I/PT",
        "imagen": "https://www.kynix.com/uploadfiles/small/PIC18F4520-I2fPT_10386.jpg",
        "nroPieza": "KY0-PIC18F4520-I/PT",
        "categoria": "Microcontroladores PICS",
        "descripcion": "Microcontrolador PIC18F4520-I/PT",
        "fabricante": "Microchip",
        "stock": 40,
        "precio": 20.0
    },
    {
        "id": 10,
        "codigo": "HJDYETU-KY32-PIC-00130-001",
        "imagen": "https://www.kynix.com/images/ic-package/SOP.jpg",
        "nroPieza": "KY32-PIC-00130-001",
        "categoria": "Microcontroladores PICS",
        "descripcion": "Microcontrolador PIC-00130-001",
        "fabricante": "T-Wins",
        "stock": 34,
        "precio": 30.0
    },
    {
        "id": 11,
        "codigo": "ATMEGA32-16AURTR-ND",
        "imagen": "https://media.digikey.com/Renders/Atmel%20Renders/313;44A;A;44.jpg",
        "nroPieza": "16AURTR-ND",
        "categoria": "Microcontroladores AVRS",
        "descripcion": "Microcontrolador AVR ATMEGA32-16AUR",
        "fabricante": "Microchip Technology",
        "stock": 10,
        "precio": 30.0
    },
    {
        "id": 12,
        "codigo": "ATMEGA328P-MUR-JKSHJ67",
        "imagen": "https://es.farnell.com/productimages/standard/en_GB/GE32QFN-40.jpg",
        "nroPieza": "MUR-JKSHJ67",
        "categoria": "Microcontroladores AVRS",
        "descripcion": "Microcontrolador AVR ATMEGA328P-MUR",
        "fabricante": "Microchip Technology",
        "stock": 15,
        "precio": 25.0
    },
    {
        "id": 13,
        "codigo": "KSHJETA-ARDUINO-UNO",
        "imagen": "https://http2.mlstatic.com/D_NQ_NP_2X_603035-MLA41509685506_042020-F.webp",
        "nroPieza": "ETA-ARDUINO-UNO",
        "categoria": "Placas Arduino",
        "descripcion": "Placa Arduino Uno R3",
        "fabricante": "Arduino",
        "stock": 30,
        "precio": 10.0
    },
    {
        "id": 14,
        "codigo": "JSHYUTT-ARDUINO-NANO",
        "imagen": "https://http2.mlstatic.com/D_NQ_NP_2X_728208-MLA40243275480_122019-F.webp",
        "nroPieza": "UTT-ARDUINO-NANO",
        "categoria": "Placas Arduino",
        "descripcion": "Placa Arduino Nano V3.0",
        "fabricante": "Arduino",
        "stock": 40,
        "precio": 8.0
    },
    {
        "id": 15,
        "codigo": "2471S0A-ESP8266",
        "imagen": "https://upload.wikimedia.org/wikipedia/commons/thumb/8/84/ESP-01.jpg/375px-ESP-01.jpg",
        "nroPieza": "0A-ESP8266",
        "categoria": "Placas Esp8266",
        "descripcion": "Placa Esp8266 EX",
        "fabricante": "Espressif Systems",
        "stock": 10,
        "precio": 10.0
    },
    {
        "id": 16,
        "codigo": "JD76FG6-DOIT-WEMOS-Mini",
        "imagen": "https://www.esploradores.com/wp-content/uploads/2017/01/DOIT-WEMOS-Mini-NodeMCU-768x641.jpg",
        "nroPieza": "DOIT-WEMOS-Mini",
        "categoria": "Placas Esp8266",
        "descripcion": "Placa Wemos D1 Mini",
        "fabricante": "Wemos",
        "stock": 12,
        "precio": 8.0
    },
    {
        "id": 17,
        "codigo": "HJSHKWROOM-ESP32",
        "imagen": "https://ar.mouser.com/images/espressifsystems/lrg/ESP32-DevKitC-32UE_SPL.jpg",
        "nroPieza": "WROOM-ESP32",
        "categoria": "Placas Esp32",
        "descripcion": "Placa Esp32 WROOM 32ue",
        "fabricante": "Espressif Systems",
        "stock": 5,
        "precio": 20.0
    },
    {
        "id": 18,
        "codigo": "H789DHJUi-ESP32",
        "imagen": "https://tienda.ityt.com.ar/23642-large_default/modulo-wifi-bluetooth-esp32-esp-wroom-32-espressif-itytarg.jpg",
        "nroPieza": "DHJUi-ESP32i",
        "categoria": "Placas Esp32",
        "descripcion": "Placa ESP32 WROOM",
        "fabricante": "Espressif Systems",
        "stock": 5,
        "precio": 15.0
    },
    {
        "id": 19,
        "codigo": "JGKURISSDK-47363933",
        "imagen": "https://www.industriasgsl.com/pub/media/wysiwyg/mosfet_panamahitek.jpg",
        "nroPieza": "DK-47363933",
        "categoria": "Transistores BJT",
        "descripcion": "Transistor BJT PNP",
        "fabricante": "Genérico",
        "stock": 100,
        "precio": 1.0
    }
]
  ```
  
  
  </br>
  
  
  * Testeamos el Método DELETE, eliminaremos el ultimo registro modificado e insertado, a través de la siguiente uri `http://localhost:8092/inmuebles/19`
  * Obtenemos un Status 200 OK junto con el true .
  
  </br>
  
  * Traemos la Lista de Inmuebles con el GET para comprobar tacitamente lo realizado `http://localhost:8092/inmuebles/listado?page=0&size=0`..
  
  ```json
[
    {
        "id": 1,
        "codigo": "HDGHFK-KSH13006",
        "imagen": "https://images.alldatasheet.es/semiconductor/electronic_parts/datasheet/335783/HUASHAN/KSH13005.GIF",
        "nroPieza": "KSH13006",
        "categoria": "Transistores BJT",
        "descripcion": "Transistor BJT NPN",
        "fabricante": "SHANTOU HUASHAN",
        "stock": 300,
        "precio": 2.0
    },
    {
        "id": 2,
        "codigo": "DFHSDK-3CD010G",
        "imagen": "https://http2.mlstatic.com/D_NQ_NP_906581-MLA32747237952_112019-O.webp",
        "nroPieza": "3CD010G",
        "categoria": "Transistores BJT",
        "descripcion": "Transistor BJT PNP",
        "fabricante": "INCHANGE SEMICONDUCTOR",
        "stock": 400,
        "precio": 5.0
    },
    {
        "id": 3,
        "codigo": "JDHFYT-AP4519GED",
        "imagen": "https://alltransistors.com/adv/pdfdatasheet_ape/image/ap4511gh-hf_0001.jpg",
        "nroPieza": "AP4519GED",
        "categoria": "Transistores MOSFET",
        "descripcion": "Transistor Mosfet NP",
        "fabricante": "Advanced Power",
        "stock": 200,
        "precio": 4.0
    },
    {
        "id": 4,
        "codigo": "HJDGHF-SL60N06",
        "imagen": "https://http2.mlstatic.com/D_NQ_NP_2X_893006-MLA41523372205_042020-F.webp",
        "nroPieza": "SL60N06",
        "categoria": "Transistores MOSFET",
        "descripcion": "Transistor Mosfet N",
        "fabricante": "Slkor",
        "stock": 50,
        "precio": 7.0
    },
    {
        "id": 5,
        "codigo": "009-KLDIUAOASS",
        "imagen": "https://http2.mlstatic.com/D_NQ_NP_757161-MLA41722189255_052020-O.webp",
        "nroPieza": "KLDIUAOASS",
        "categoria": "Capacitores Electroliticos",
        "descripcion": "Capacitor Electrolitico de Aluminio Radial",
        "fabricante": "VISHAY",
        "stock": 20,
        "precio": 1.0
    },
    {
        "id": 6,
        "codigo": "3097-JKSJHSBS6DVBDG",
        "imagen": "https://http2.mlstatic.com/D_NQ_NP_2X_938147-MLA47364644565_092021-F.webp",
        "nroPieza": "BS6DVBDG",
        "categoria": "Capacitores Electroliticos",
        "descripcion": "Capacitor Electrolitico de Aluminio Axial",
        "fabricante": "VISHAY",
        "stock": 18,
        "precio": 1.6
    },
    {
        "id": 7,
        "codigo": "594-MIF2500BFKMGNHT5",
        "imagen": "https://ar.mouser.com/images/vishay/images/mif1000afkmgnht5_SPL.jpg",
        "nroPieza": "FKMGNHT5",
        "categoria": "Resistores de Alta Frecuencia",
        "descripcion": "Resistores de alta frecuencia RF 25ohms 1% 100ppm",
        "fabricante": "VISHAY",
        "stock": 800,
        "precio": 5.0
    },
    {
        "id": 8,
        "codigo": "581-CS12010T0100GTR",
        "imagen": "https://ar.mouser.com/images/americantechnicalceramics/images/ATCFT.jpg",
        "nroPieza": "T0100GTR",
        "categoria": "Resistores de Alta Frecuencia",
        "descripcion": "Resistores de alta frecuencia RF 100ohms 2% 10W",
        "fabricante": "KYSHOCERA",
        "stock": 1200,
        "precio": 3.0
    },
    {
        "id": 9,
        "codigo": "HSFGDTTEE-KY0-PIC18F4520-I/PT",
        "imagen": "https://www.kynix.com/uploadfiles/small/PIC18F4520-I2fPT_10386.jpg",
        "nroPieza": "KY0-PIC18F4520-I/PT",
        "categoria": "Microcontroladores PICS",
        "descripcion": "Microcontrolador PIC18F4520-I/PT",
        "fabricante": "Microchip",
        "stock": 40,
        "precio": 20.0
    },
    {
        "id": 10,
        "codigo": "HJDYETU-KY32-PIC-00130-001",
        "imagen": "https://www.kynix.com/images/ic-package/SOP.jpg",
        "nroPieza": "KY32-PIC-00130-001",
        "categoria": "Microcontroladores PICS",
        "descripcion": "Microcontrolador PIC-00130-001",
        "fabricante": "T-Wins",
        "stock": 34,
        "precio": 30.0
    },
    {
        "id": 11,
        "codigo": "ATMEGA32-16AURTR-ND",
        "imagen": "https://media.digikey.com/Renders/Atmel%20Renders/313;44A;A;44.jpg",
        "nroPieza": "16AURTR-ND",
        "categoria": "Microcontroladores AVRS",
        "descripcion": "Microcontrolador AVR ATMEGA32-16AUR",
        "fabricante": "Microchip Technology",
        "stock": 10,
        "precio": 30.0
    },
    {
        "id": 12,
        "codigo": "ATMEGA328P-MUR-JKSHJ67",
        "imagen": "https://es.farnell.com/productimages/standard/en_GB/GE32QFN-40.jpg",
        "nroPieza": "MUR-JKSHJ67",
        "categoria": "Microcontroladores AVRS",
        "descripcion": "Microcontrolador AVR ATMEGA328P-MUR",
        "fabricante": "Microchip Technology",
        "stock": 15,
        "precio": 25.0
    },
    {
        "id": 13,
        "codigo": "KSHJETA-ARDUINO-UNO",
        "imagen": "https://http2.mlstatic.com/D_NQ_NP_2X_603035-MLA41509685506_042020-F.webp",
        "nroPieza": "ETA-ARDUINO-UNO",
        "categoria": "Placas Arduino",
        "descripcion": "Placa Arduino Uno R3",
        "fabricante": "Arduino",
        "stock": 30,
        "precio": 10.0
    },
    {
        "id": 14,
        "codigo": "JSHYUTT-ARDUINO-NANO",
        "imagen": "https://http2.mlstatic.com/D_NQ_NP_2X_728208-MLA40243275480_122019-F.webp",
        "nroPieza": "UTT-ARDUINO-NANO",
        "categoria": "Placas Arduino",
        "descripcion": "Placa Arduino Nano V3.0",
        "fabricante": "Arduino",
        "stock": 40,
        "precio": 8.0
    },
    {
        "id": 15,
        "codigo": "2471S0A-ESP8266",
        "imagen": "https://upload.wikimedia.org/wikipedia/commons/thumb/8/84/ESP-01.jpg/375px-ESP-01.jpg",
        "nroPieza": "0A-ESP8266",
        "categoria": "Placas Esp8266",
        "descripcion": "Placa Esp8266 EX",
        "fabricante": "Espressif Systems",
        "stock": 10,
        "precio": 10.0
    },
    {
        "id": 16,
        "codigo": "JD76FG6-DOIT-WEMOS-Mini",
        "imagen": "https://www.esploradores.com/wp-content/uploads/2017/01/DOIT-WEMOS-Mini-NodeMCU-768x641.jpg",
        "nroPieza": "DOIT-WEMOS-Mini",
        "categoria": "Placas Esp8266",
        "descripcion": "Placa Wemos D1 Mini",
        "fabricante": "Wemos",
        "stock": 12,
        "precio": 8.0
    },
    {
        "id": 17,
        "codigo": "HJSHKWROOM-ESP32",
        "imagen": "https://ar.mouser.com/images/espressifsystems/lrg/ESP32-DevKitC-32UE_SPL.jpg",
        "nroPieza": "WROOM-ESP32",
        "categoria": "Placas Esp32",
        "descripcion": "Placa Esp32 WROOM 32ue",
        "fabricante": "Espressif Systems",
        "stock": 5,
        "precio": 20.0
    },
    {
        "id": 18,
        "codigo": "H789DHJUi-ESP32",
        "imagen": "https://tienda.ityt.com.ar/23642-large_default/modulo-wifi-bluetooth-esp32-esp-wroom-32-espressif-itytarg.jpg",
        "nroPieza": "DHJUi-ESP32i",
        "categoria": "Placas Esp32",
        "descripcion": "Placa ESP32 WROOM",
        "fabricante": "Espressif Systems",
        "stock": 5,
        "precio": 15.0
    }
]
  ```
  
</br>

### Paso zz) Prueba del Servicio de la Tabla `componentes-detalles`
#### (Vamos a testear los métodos desarrollados con Postman, es importante que se hayan ejecutado los pasos anteriores de forma correcta y se hayan agregado a la db sus registros y tablas correctamente según el repositorio de la db)


 </br>
 
 
  * Testeamos el Método GET junto con la paginación creada para visualizar los componentes de la db con la siguiente uri `http://localhost:8092/componentes_detalles/listado?page=0&size=0`
 * Obtenemos un Status 200 OK junto con el listado total de componentes_detalles..
 * Response..
  ```json
[
    {
        "id": 1,
        "idComponente": 1,
        "hojaDeDatos": "https://www.alldatasheet.com/datasheet-pdf/pdf/335783/HUASHAN/KSH13005.html?gclid=CjwKCAiAlrSPBhBaEiwAuLSDUFeS6YrIZoRclGdfPAGVxkvXDpENZQ76uvZ1PCot50KcnlLYfYgNwBoCdwoQAvD_BwE",
        "longitud": null,
        "ancho": null,
        "peso": null,
        "material": null,
        "voltajeRecomendado": "20-25 VDC",
        "voltajeMinEntrada": "20 VDC",
        "voltajeMaxEntrada": "25 VDC"
    },
    {
        "id": 2,
        "idComponente": 2,
        "hojaDeDatos": "https://alltransistors.com/adv/pdfdatasheet_inchange_semiconductor/3cd010g.pdf",
        "longitud": null,
        "ancho": null,
        "peso": null,
        "material": null,
        "voltajeRecomendado": "3.5-5 VDC",
        "voltajeMinEntrada": "3.5 VDC",
        "voltajeMaxEntrada": "12 VDC"
    },
    {
        "id": 3,
        "idComponente": 3,
        "hojaDeDatos": "https://alltransistors.com/es/mosfet/transistor.php?transistor=18313",
        "longitud": null,
        "ancho": null,
        "peso": null,
        "material": null,
        "voltajeRecomendado": "35 VDC",
        "voltajeMinEntrada": "20 VDC",
        "voltajeMaxEntrada": "100 VDC"
    },
    {
        "id": 4,
        "idComponente": 4,
        "hojaDeDatos": "https://alltransistors.com/adv/pdfdatasheet_slkor/sl60n06.pdf",
        "longitud": null,
        "ancho": null,
        "peso": null,
        "material": null,
        "voltajeRecomendado": "40 VDC",
        "voltajeMinEntrada": "5 VDC",
        "voltajeMaxEntrada": "60 VDC"
    },
    {
        "id": 5,
        "idComponente": 5,
        "hojaDeDatos": "https://ar.mouser.com/datasheet/2/427/136rvi-2888792.pdf",
        "longitud": null,
        "ancho": null,
        "peso": null,
        "material": null,
        "voltajeRecomendado": "10 - 100 VDC",
        "voltajeMinEntrada": "10 VDC",
        "voltajeMaxEntrada": "100 VDC"
    },
    {
        "id": 6,
        "idComponente": 6,
        "hojaDeDatos": "https://ar.mouser.com/datasheet/2/212/1/KEM_A4095_PEG228-1919468.pdf",
        "longitud": null,
        "ancho": null,
        "peso": null,
        "material": null,
        "voltajeRecomendado": "25 - 64 VDC",
        "voltajeMinEntrada": "10 VDC",
        "voltajeMaxEntrada": "100 VDC"
    },
    {
        "id": 7,
        "idComponente": 7,
        "hojaDeDatos": "https://www.vishay.com/docs/61038/mif.pdf",
        "longitud": null,
        "ancho": null,
        "peso": null,
        "material": null,
        "voltajeRecomendado": "0 - 300 VDC",
        "voltajeMinEntrada": "0 VDC",
        "voltajeMaxEntrada": "400 VDC"
    },
    {
        "id": 8,
        "idComponente": 8,
        "hojaDeDatos": "https://ar.mouser.com/datasheet/2/40/resistive_prod_cs-1920496.pdf",
        "longitud": null,
        "ancho": null,
        "peso": null,
        "material": null,
        "voltajeRecomendado": "0 - 300 VDC",
        "voltajeMinEntrada": "0 VDC",
        "voltajeMaxEntrada": "400 VDC"
    },
    {
        "id": 9,
        "idComponente": 9,
        "hojaDeDatos": "https://www.kynix.com/uploadfiles/pdf8798/PIC18F4520-I2fPT_10386.pdf",
        "longitud": null,
        "ancho": null,
        "peso": null,
        "material": null,
        "voltajeRecomendado": "2 - 5.5 VDC",
        "voltajeMinEntrada": "2.0 VDC",
        "voltajeMaxEntrada": "5.5 VDC"
    },
    {
        "id": 10,
        "idComponente": 10,
        "hojaDeDatos": "https://www.alldatasheet.com/view.jsp?Searchword=PIC-00130-001",
        "longitud": null,
        "ancho": null,
        "peso": null,
        "material": null,
        "voltajeRecomendado": "4.5 - 17 VDC",
        "voltajeMinEntrada": "4.5 VDC",
        "voltajeMaxEntrada": "17 VDC"
    },
    {
        "id": 11,
        "idComponente": 11,
        "hojaDeDatos": "https://ww1.microchip.com/downloads/en/DeviceDoc/2503S.pdf",
        "longitud": null,
        "ancho": null,
        "peso": null,
        "material": null,
        "voltajeRecomendado": "2.7 - 5.5 VDC",
        "voltajeMinEntrada": "2.7 VDC",
        "voltajeMaxEntrada": "5.5 VDC"
    },
    {
        "id": 12,
        "idComponente": 12,
        "hojaDeDatos": "https://www.farnell.com/datasheets/2047852.pdf",
        "longitud": null,
        "ancho": null,
        "peso": null,
        "material": null,
        "voltajeRecomendado": "1.8 - 5.5 VDC",
        "voltajeMinEntrada": "1.8 VDC",
        "voltajeMaxEntrada": "5.5 VDC"
    },
    {
        "id": 13,
        "idComponente": 13,
        "hojaDeDatos": "https://docs.arduino.cc/resources/datasheets/A000066-datasheet.pdf",
        "longitud": null,
        "ancho": null,
        "peso": null,
        "material": null,
        "voltajeRecomendado": "3.3 - 5.0 VDC",
        "voltajeMinEntrada": "3.3 VDC",
        "voltajeMaxEntrada": "5.0 VDC"
    },
    {
        "id": 14,
        "idComponente": 14,
        "hojaDeDatos": "http://www.agspecinfo.com/pdfs/M/MB0016.PDF",
        "longitud": null,
        "ancho": null,
        "peso": null,
        "material": null,
        "voltajeRecomendado": "3.0 - 3.3 VDC",
        "voltajeMinEntrada": "3.0 VDC",
        "voltajeMaxEntrada": "3.3 VDC"
    },
    {
        "id": 15,
        "idComponente": 15,
        "hojaDeDatos": "https://cdn-shop.adafruit.com/product-files/2471/0A-ESP8266__Datasheet__EN_v4.3.pdf",
        "longitud": null,
        "ancho": null,
        "peso": null,
        "material": null,
        "voltajeRecomendado": "3.0 - 3.6 VDC",
        "voltajeMinEntrada": "3.0 VDC",
        "voltajeMaxEntrada": "3.6 VDC"
    },
    {
        "id": 16,
        "idComponente": 16,
        "hojaDeDatos": "https://www.esploradores.com/doitwemos-d1-mini-nodemcu/",
        "longitud": null,
        "ancho": null,
        "peso": null,
        "material": null,
        "voltajeRecomendado": "3.3 - 5.0 VDC",
        "voltajeMinEntrada": "3.3 VDC",
        "voltajeMaxEntrada": "5.0 VDC"
    },
    {
        "id": 17,
        "idComponente": 17,
        "hojaDeDatos": "https://pdf1.alldatasheet.com/datasheet-pdf/view/1148034/ESPRESSIF/ESP-WROOM-02U.html",
        "longitud": null,
        "ancho": null,
        "peso": null,
        "material": null,
        "voltajeRecomendado": "2.7 - 3.6 VDC",
        "voltajeMinEntrada": "2.7 VDC",
        "voltajeMaxEntrada": "3.6 VDC"
    },
    {
        "id": 18,
        "idComponente": 18,
        "hojaDeDatos": "https://www.mouser.com/datasheet/2/891/esp-wroom-32_datasheet_en-1223836.pdf",
        "longitud": null,
        "ancho": null,
        "peso": null,
        "material": null,
        "voltajeRecomendado": "2.7 - 3.6 VDC",
        "voltajeMinEntrada": "2.7 VDC",
        "voltajeMaxEntrada": "3.6 VDC"
    }
]
 ```
* Se puede obtener mayor información acerca del manejo y uso de una API Rest con los paginados en otro repositorio https://github.com/andresWeitzel/Api_Rest_Spring_Productos 
* La Prueba del Resto de los Métodos HTTP siguen el mismo proceso que el testeo realizado anteriormente, no se anexa paso a paso el resultado de la tabla componentes-detalles por temas de simplificación.
* Hay que tener en consideración que para insertar un registro en esta tabla se debe tener registrado el Componente que hace referencia al campo id_componente de esta Tabla. Insertar un Registro en `componentes` y luego en `componentes-detalles`
* Nuestra API REST cumple y es completamente funcional con lo desarrollado



</br>

##  Sección 8) Creación de las Vistas con Thymeleaf

</br>



### Paso zy) Creación de la Vista `componentes.html`
#### (Esta vista contendrá el listado de componentes de la tabla componentes)

 </br>
 
 * Para el uso y manejo de Thymeleaf debemos tener instalado el plugin a través de Eclipse Marketplace
 * Click en Help, luego Eclipse Marketplace, buscamos Thymeleaf e instalamos el plugin según la versión de cada IDE
 * Seguidamente creamos un archivo de tipo HTML dentro del directorio templates , click derecho sobre templates (src/main/resources/templates)
 * Buscamos en Other html, selecionamos html file, asignamos el nombre `componentes.html`
 * 




























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


