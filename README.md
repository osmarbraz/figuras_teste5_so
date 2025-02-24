[![Github Actions Status for osmarbraz/figuras_teste5_so](https://github.com/osmarbraz/figuras_teste5_so/workflows/Integra%C3%A7%C3%A3o%20continua%20de%20Java%20com%20Maven/badge.svg)](https://github.com/osmarbraz/figuras_teste5_so/actions) 
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=osmarbraz_figuras_teste5_so&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=osmarbraz_figuras_teste5_so)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=osmarbraz_figuras_teste5_so&metric=coverage)](https://sonarcloud.io/component_measures?id=osmarbraz_figuras_teste5_so&metric=coverage)

# Exemplo de Pipeline de CI.

Utiliza 3 ambientes:
- dev - Desenvolvimento.
- hmg - Homologação.
- prd - Produção.

Pipeline 
- dev - Compilação e testes do desenvolvimento nas diversas arquiteturas. 
- hmg - Análise e cobertura código.
- prd - Empacotamento.

<br>
- O projeto foi desenvolvido no NetBeans deve ser chamado calculadora_teste.<br>
- Utiliza o Apache Maven para a automatização da construção.<br>
- A pasta test contêm os testes unitários do projeto utilizando JUnit 5.<br>
- Os testes são realizados no SO ubuntu-lastest, windows-lastest e macos-lastest e JDK 16, 17 e 18.<br>
- A cobertura do código é realizada através do JaCoCo e relatório enviado para o Sonarcloud.<br>
