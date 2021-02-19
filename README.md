# Arep Taller # 2

Se utiliza Maven, HEROKU, GIT, Spark y GITHUB.

Se desarrolla una aplicación web para calcular la desviación estándar y media de un conjunto de n
numeros reales. El programa lee los n números reales de una página web y se utiliza una lista vinculada para almacenar los n números para los cálculos.

# _Despliegue en Heroku_ 
[![Deployed to Heroku](https://www.herokucdn.com/deploy/button.png)](https://fast-tundra-04632.herokuapp.com/)
 ## _Calidad del código_ 
[![Codacy Badge](https://app.codacy.com/project/badge/Grade/290187f6a7bf4cf9ae91eb0b502ba594)](https://www.codacy.com/gh/GEARSHORDA3/TallerHeroku/dashboard?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=GEARSHORDA3/TallerHeroku&amp;utm_campaign=Badge_Grade)
 ## _Integración continua_ 
 [![CircleCI](https://circleci.com/gh/circleci/circleci-docs.svg?style=svg)](https://app.circleci.com/pipelines/github/GEARSHORDA3/TallerHeroku)

## Documentación

Documentación del diseño del taller en latex: [Documento](DocumentoTaller2.pdf)

### Requisitos

* Git
* Java 8
* Maven

### Instrucciones de compilado y ejecución

1. Clonar repositorio:

```
git clone https://github.com/GEARSHORDA3/Arep_Taller_1

```

2. Acceder al taller:

```
cd Arep_Taller_1
```

3. En cmd para compilar el taller:

```
mvn package
```

4. Ejecutar la aplicación

```
mvn exec:java -D "exec.mainClass"="edu.escuelaing.arep.SparkWebApp"
```

4. Para abrir la interfaz gráfica en la web escribir como dominio

```
localhost:5000
```

6. Ver la documentación javadoc o abrir el html en la carpeta Javadoc overview-summary.html.
Si es ejecutado por el siguiente comando se busca en el  directorio /target/site.

```
mvn javadoc:javadoc
```

## Ejecutar pruebas test

```
mvn test
```

## Construcción

* [Maven](https://maven.apache.org/)
* [java 8](https://www.oracle.com/java/technologies/java8.html)
* [JUnit](https://junit.org/junit4/)
* [Spark](https://sparkjava.com/)
* [Axios](https://desarrolloweb.com/articulos/axios-ajax-cliente-http-javascript.html)


## Autores 

* **David Andrés Vargas León**
 
## Licencia

Este proyecto está bajo la Licencia GNU - mira el archivo [LICENSE](LICENSE) para más detalles.




 
