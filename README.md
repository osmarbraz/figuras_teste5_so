[![Github Actions Status for osmarbraz/figuras_teste5](https://github.com/osmarbraz/figuras_teste5/workflows/Integra%C3%A7%C3%A3o%20continua%20de%20Java%20com%20Maven/badge.svg)](https://github.com/osmarbraz/figuras_teste5/actions) 
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=osmarbraz_figuras_teste5&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=osmarbraz_figuras_teste5)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=osmarbraz_figuras_teste5&metric=coverage)](https://sonarcloud.io/component_measures?id=osmarbraz_figuras_teste5&metric=coverage)

# Exemplo de Pipeline de CI.

Utiliza 3 ambientes:
- dev - Desenvolvimento
- hmg - Homologação
- prd - Produção

Pipeline 
- dev - Compilação 
- hmg - Compilação, Testes, Análise Código, Cobertura Código
- prd - Empacotamento

<br>
- O projeto foi desenvolvido no NetBeans deve ser chamado calculadora_teste.<br>
- Utiliza o Apache Maven para a automatização da construção.<br>
- A pasta test contêm os testes unitários do projeto utilizando JUnit 5.<br>
- A cobertura do código é realizada através do JaCoCo.<br>