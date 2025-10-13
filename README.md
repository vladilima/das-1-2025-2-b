# DESIGN E ARQUITETURA DE SOFTWARE I
### [Repositório do Professor](https://github.com/waltercoan/das-1-2025-2-b)

## Aula 31/07
### Padronização de código
Padronizar o código significa seguir convenções consistentes ao escrever o programa, variando conforme a linguagem utilizada. Isso inclui, por exemplo, adotar estilos uniformes para nomes de variáveis e funções, como camelCase (ex: minhaVariavel) ou snake_case (ex: minha_variavel). Essa prática melhora a legibilidade, facilita a compreensão e a manutenção do software, principalmente em equipes, pois cria um código mais claro e organizado para todos.
### Ocultamento de Informação
A ocultação ocorre quando a implementação interna de uma função, classe ou módulo é escondida, permitindo que outras partes do sistema utilizem seus recursos sem precisar conhecer os detalhes do funcionamento interno. Isso ajuda a proteger o código e a manter a modularidade do sistema.

## Aula 04/08
### Coesão
Coesão se refere ao grau em que os elementos dentro de uma classe ou método estão focados em uma única responsabilidade. Quando cada classe ou método realiza apenas uma tarefa específica, o código se torna mais organizado, fácil de entender e de manter. Usar a coesão com bom senso contribui para a clareza e qualidade do sistema.
### Acoplamento
Acoplamento é o nível de dependência entre diferentes partes de um sistema, como classes ou módulos. Um alto acoplamento indica que essas partes estão muito ligadas entre si, o que dificulta mudanças e manutenção. Já o baixo acoplamento significa que os componentes funcionam de forma mais independente, o que é desejável, pois facilita a reutilização, testes e evolução do software com menos impacto em outras áreas do código.

## Aula 07/08
### SOLID
  - Princípio da responsabilidade única
  - Princípio da segregação de interfaces

## Aula 11/08
### SOLID
  - Princípio da inversão de dependências
  - Prefira composição a herança
  - Princípio de Demeter (menor conhecimento)
  - Princípio Aberto/Fechado

## Aula 14/08
### SOLID
  - Princípio Liskov

## Aula 21/08
### Padrões de Projeto Guru - Implementação Observer
Observer é um Design Pattern que lhe permite definir um mecanismo de Subscription para notificar múltiplos objetos sobre quaisquer eventos que ocorram com o objeto que estão observando.

## Aula 25/08
### [Implementar o Design Pattern: Observer](designpatterns/src/main/java/br/univille/observer)

## Aula 28/08
### Definir Introdução a arquitetura (características, princípios e decisões)
A Arquitetura de Software é a estrutura fundamental de um sistema de software, composta por seus componentes, suas relações e os princípios que governam seu design e evolução. Ela serve como um guia para a construção, integração e manutenção do sistema, garantindo que ele atenda aos requisitos funcionais e não funcionais.

## Aula 01/09
### Expectativas de um arquiteto
### Decisões de arquitetura
### Analisar continuamento a arquitetura
### Manter-se atualizado
### Domínio do negócio
### DevOps

## Aula 04/09
### Diferença entre: Arquitetura e Design
  - Arquitetura de Software define a estrutura geral do sistema, seus principais componentes, suas interações e decisões de alto nível que impactam toda a aplicação. Foca em aspectos como escalabilidade, desempenho e organização global.
  - Design de Software detalha como os componentes arquiteturais são implementados internamente, incluindo algoritmos, estruturas de dados e padrões de programação. Foca em resolver problemas específicos dentro dos módulos.
### Como é a formação do conhecimento de um arquiteto modelo T?
A formação do conhecimento de um "T-Shaped Professional" é baseada em uma combinação de amplitude e profundidade de habilidades e conhecimentos, refletindo a forma da letra "T".

## Aula 08/09 e 11/09
### Fundamentos da Arquitetura de Software - Análise de Trade-offs
Análise de Trade-offs é o processo de avaliar as consequências das decisões arquiteturais, considerando que melhorar uma qualidade do sistema pode afetar negativamente outra. Como requisitos muitas vezes são conflitantes (por exemplo, segurança versus desempenho), a análise de trade-offs ajuda a encontrar um equilíbrio entre diferentes aspectos, como custo, tempo, escalabilidade, manutenibilidade e usabilidade. Essa análise orienta escolhas conscientes, alinhadas aos objetivos do projeto, garantindo que os benefícios superem os impactos negativos.

## Aula 15/09 e 18/09
### [Implementação do Publisher e Subscriber](eventos/src/main/java/br/univille)

# 2 Bimestre

## Aula 06/10

- [Definições das características arquiteturais](https://integrada.minhabiblioteca.com.br/reader/books/9788550819754/epubcfi/6/26[%3Bvnd.vst.idref%3Dcap4.xhtml]!/4)

(Resumir Capítulo 4)

## Aula 09/10

- [circuit-breaker](https://learn.microsoft.com/en-us/azure/architecture/patterns/circuit-breaker)
- [Definições das características arquiteturais](https://integrada.minhabiblioteca.com.br/reader/books/9788550819754/epubcfi/6/26[%3Bvnd.vst.idref%3Dcap4.xhtml]!/4)

## Aula 13/10

- [CQRS](https://learn.microsoft.com/en-us/azure/architecture/patterns/cqrs)
- [Fundamentos dos Padrões de Arquiteturas](https://app.minhabiblioteca.com.br/reader/books/9788550819754/epubcfi/6/38%5B%3Bvnd.vst.idref%3Dcap9.xhtml%5D!/4)