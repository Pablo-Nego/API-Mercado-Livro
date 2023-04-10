FROM openjdk:11

COPY build/libs/mercado-livro.jar /app/mercadolivro.jar

WORKDIR /app

CMD ["java", "-jar", "mercadolivro.jar"]