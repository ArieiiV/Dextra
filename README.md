# A aplicação foi desenvolvida baseada na API da Marvel proposto pelo desafio da Dextra.


## Overview  
Para o desenvolvimento desta aplicação foram utilizadas as ferramentas : 

Swagger 2.7.0

Mysql Server 5.7

MySql Workbench 8.0 CE

Spring Tool Suite 4  Version: 4.11.0.RELEASE

Java 1.8.0_261

Apache Maven 3.6.3



# Endpoints implementados:

/v1/characters

/v1/characters/{characterId}

/v1/characters/{characterId}/comics

/v1/characters/{characterId}/events

/v1/characters/{characterId}/series

/v1/characters/{characterId}/stories



#Requisitos para rodar a aplicação :

- Baixar o projeto;
- Importar dentro do STS; 
- Realizar um Maven update ( clean , install ) para atualização das dependências; 
- Executar a classe Swagger2SpringBoot para subir o projeto ( Run as > Spring Boot App );
- O banco será criado e populado através da dependência flywaydb executando o script V01__criar_e_registrar.sql ao iniciar a aplicação.
- Chamar a url http://localhost:8080/v1/marvel , para testar os endpoints implementados( Lembre-se de utilizar o ID 1 para realizar os testes na aplicação).



Obs: para fins de estudo , pretende-se melhorar a aplicação futuramente.