 FROM eclipse-temurin:17
 WORKDIR /home
 COPY ./target/prime_number-0.0.1-SNAPSHOT.jar primes-number.jar
 ENTRYPOINT ["java","-jar","primes-number.jar"]