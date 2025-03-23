# 🐾 Projeto Pet Shop - Exercício Generation  

Este repositório contém o código desenvolvido como parte do exercício da **Generation Brasil**. O projeto consiste em um sistema de **Pet Shop**, onde é possível gerenciar informações sobre os animais e os serviços oferecidos pela loja. A aplicação permite a realização de operações como cadastro, consulta, atualização e remoção de registros de pets e serviços.

🚀 **Tecnologias utilizadas**:  
![Java](https://img.shields.io/badge/Java-007396?style=flat&logo=java&logoColor=white)  
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-6DB33F?style=flat&logo=spring-boot&logoColor=white)  
![MySQL](https://img.shields.io/badge/MySQL-00618A?style=flat&logo=mysql&logoColor=white)  
![Insomnia](https://img.shields.io/badge/Insomnia-4000BF?style=flat&logo=insomnia&logoColor=white)

---

## 📌 Funcionalidades  

- **Cadastro de Pets**: Permite registrar informações de novos animais, incluindo nome, tipo, idade e dono.
- **Cadastro de Serviços**: Registra os serviços oferecidos pelo pet shop, como banho, tosa e consultas veterinárias.
- **Consultas**: Permite a busca por animais e serviços cadastrados.
- **Atualização e Remoção**: Atualiza ou exclui registros de pets e serviços conforme necessário.

---

## 🚀 Como Executar  

1. **Clone o repositório**  
```bash
git clone https://github.com/sandramastrogiacomo/projeto-javade-lei.git
cd projeto-javade-lei
Configure o banco de dados

Certifique-se de que o banco de dados MySQL esteja configurado corretamente no arquivo application.properties.

Compile e execute

bash
Copiar
Editar
mvn clean install
mvn spring-boot:run
A aplicação estará disponível em http://localhost:8080.

📡 Testes com Insomnia
O projeto foi testado utilizando o Insomnia para garantir que os endpoints funcionem corretamente. Alguns dos principais endpoints são:

Cadastro de Pet
POST http://localhost:8080/pets/cadastrar

Listar Pets
GET http://localhost:8080/pets

Cadastro de Serviço
POST http://localhost:8080/servicos/cadastrar

Listar Serviços
GET http://localhost:8080/servicos

🤝 Contribuições
💡 Contribuições são bem-vindas! Se tiver sugestões, melhorias ou encontrar problemas, abra uma issue ou envie um pull request.

📜 Licença
📝 Este projeto está licenciado sob a MIT License.

📬 Contato
🔗 GitHub: sandramastrogiacomo
🔗 LinkedIn: Sandra Mastrogiacomo

📌 Este projeto foi desenvolvido como parte de um exercício da Generation Brasil para demonstrar habilidades em Java, Spring Boot e MySQL.
