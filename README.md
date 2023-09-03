# HATEOAS com spring
![Java](https://img.shields.io/badge/Java-17%2B-blue) 
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3-blue)  

### Contact:
[![email](https://img.shields.io/badge/Gmail-D14836?style=for-the-badge&logo=gmail&logoColor=white)](mailto:matheusvictorhenrique@gmailcom)
[![Linkedin](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/matheus-victor-henrique/)


## Tópicos:

- [Introdução](#introdução)
- [Ferramentas](#ferramentas)
- [Patterns](#patterns)
- [Executando](#executando)
- [Endpoints](#endpoints)

## Introdução:
> Um projeto que visa mostrar a simplicidade e fácil uso do HATEOAS em uma API spring boot, onde foi construida
![nesse vídeo](https://www.youtube.com/@matheusvictorhenrique)

## Ferramentas:
- [Spring boot 3](https://spring.io/projects/spring-boot)
- [Java 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- [H2 database](https://www.h2database.com/html/main.html)
- [Spring HATEOAS](https://spring.io/projects/spring-hateoas)
- [Lombok](https://projectlombok.org/)

## Patterns:

- [S.O.L.I.D](https://medium.com/desenvolvendo-com-paixao/o-que-%C3%A9-solid-o-guia-completo-para-voc%C3%AA-entender-os-5-princ%C3%ADpios-da-poo-2b937b3fc530)

## Executando:

- Clone o repositório com o comando ```git clone https://github.com/MatheusVict/HATEOAS-youtube```
- Se desejar pode mudar a url do banco de dados no `application.yml`
- Faça o build do projeto utilizando a linha de comando:

**Unix**

```bash
./mvnw clean install
```

**Windows**

```bash
mvnw.cmd clean install
```

- Rode o projeto utilizando o spring:

**Unix**

```bash
./mvnw spring-boot:run
```

**Windows**

```bash
mvnw.cmd spring-boot:run
```

- Abra no link [localhost](http://localhost:8080) e você entrará na API

## Endpoints:

`POST | /clients`

```json
{
  "name": "Muryllo"
}
```

`GET /clients`

```json
{
  "id": "1",
  "name": "Muryllo",
  "links": [
    self: "http://localhost:8080/clients/1"
  ]
}
```

`GET /clients/{id}`

```json
{
  "id": "1",
  "name": "Muryllo",
  "links": [
    self: "http://localhost:8080/clients/1"
  ]
}
```

