# Servicio Cálculadora

Se utiliza Maven, HEROKU, GIT, Spark y GITHUB.

Se desarrolla este servicio para calcular los valores de un numero respecto a operaciones sin,con,tan.

# _Despliegue en Heroku_ 
[![Deployed to Heroku](https://www.herokucdn.com/deploy/button.png)](https://dashboard.heroku.com/apps/davidvargasarepfachada)
 ## _Calidad del código_ 
[![Codacy Badge](https://app.codacy.com/project/badge/Grade/302877a090c84a80a396b359dc45fb72)](https://www.codacy.com/gh/GEARSHORDA3/ParcialSparkCliente/dashboard?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=GEARSHORDA3/ParcialSparkCliente&amp;utm_campaign=Badge_Grade)
 ## _Integración continua_ 
 [![CircleCI](https://circleci.com/gh/circleci/circleci-docs.svg?style=svg)](https://app.circleci.com/pipelines/github/GEARSHORDA3/ParcialArep_1_Calculo)

### Requisitos

* Git
* Java 8
* Maven

### Instrucciones de compilado y ejecución

1. Clonar repositorio:

```
git clone https://github.com/GEARSHORDA3/ParcialArep_1_Calculo

```

2. Acceder al taller:

```
cd ParcialArep_1_Calculo
```

3. En cmd para compilar el taller:

```
mvn package
```

4. Ejecutar la aplicación

Windows

```
java -cp target/classes;target/dependency/* du.escuelaing.arep.SparkWebApp

```

Linux

```
java $JAVA_OPTS -cp target/classes:target/dependency/* du.escuelaing.arep.SparkWebApp

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

## Para probar el servicio en localHost manjear la siguiente estructura

```
http://localhost:4567/data?number={number}&operation={operation}
```

## Construcción

* [Maven](https://maven.apache.org/)
* [java 8](https://www.oracle.com/java/technologies/java8.html)
* [Spark](https://sparkjava.com/)

## Autores 

* **David Andrés Vargas León**
 
## Licencia

Este proyecto está bajo la Licencia GNU - mira el archivo [LICENSE](LICENSE) para más detalles.





 
