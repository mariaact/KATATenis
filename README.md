# KATATenis

## Para intalar el entorno se necesitará descargar maven y java. 

### Para instalar maven

- Para descargarlo, necesitaremos ejecutar los siguientes comandos:  
```
~$ cd /tmp/
~$ wget -c http://mirrors.advancedhosters.com/apache/maven/maven-3/3.6.3/binaries/apache-maven-3.6.3-bin.zip
```


- Descomprimir la carpeta
```
~$ unzip apache-maven-3.6.3-bin.zip
```

- Y lo mueves a /opt 
```
~$ sudo mv apache-maven-3.6.3 /opt/maven
```

- Configurar el fichero 
```
~$ sudo nano /etc/profile.d/maven.sh
```

-Y escribir:
```
export M2_HOME=/opt/maven/
export M2=$M2_HOME/bin
export PATH=$M2:$PATH
```

- Y para comprobar que se ha instalado correctamente: 
```
~$ mvn -v
```

### Para instalar java 
- Necesitamos ejecutar los siguientes comandos: 
```
~$ sudo zypper up
~$ sudo zypper in java-11-openjdk java-11-openjdk-devel
```

- Para comprobar que se ha instalado correctamente: 
```
~$ java --version
```

## Para crear un proyecto con maven: 
```
~$ mvn archetype:generate
```

```
groupId: com.proyecto
artifactid: primer-proyecto
version: 1.0
package: com.proyecto.demo
```

## Para pasar los test 

-Te tienes que ir a la carpeta donde se encuentre el fichero de pom.xml

- Y ejecutar el comando:
```
mvn test
```


