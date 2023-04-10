FROM openjdk

WORKDIR /app

COPY target/mercado-livro-0.0.1-SNAPSHOT.jar /app

CMD ["java", "-jar", "mercadolivro.jar"]