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

### [Definições das características arquiteturais](https://integrada.minhabiblioteca.com.br/reader/books/9788550819754/epubcfi/6/26[%3Bvnd.vst.idref%3Dcap4.xhtml]!/4)

Uma característica da arquitetura atende a três critérios:

- Especifica uma consideração de design fora do domínio.
- Influencia algum aspecto estrutural de design.
- É essencial ou importante para o sucesso da aplicação.

As seções a seguir descrevem algumas características, com alguns exemplos, mas qualquer lista de características da arquitetura será necessariamente incompleta; qualquer software pode inventar características importantes com base em fatores únicos.

### Características Operacionais da Arquitetura
| Termo | Definição |
|---|---|
| Disponibilidade | Por quanto tempo o sistema precisa ficar disponível (se for 24/7, é preciso ter etapas para permitir que o sistema fique ativo rápido no caso de qualquer falha). |
| Continuidade | Capacidade de recuperação de desastres. |
| Desempenho | Inclui teste de estresse, análise de pico, análise da frequência das funções usadas, capacidade requerida e tempos de resposta. Por vezes, a aceitação do desempenho requer um exercício próprio, levando meses para concluir. |
| Recuperabilidade | Requisitos de continuidade do negócio (por exemplo, no caso de desastres, com que rapidez o sistema precisa ficar online de novo?). Isso afetará a estratégia de backup e os requisitos para o hardware duplicado. |
| Confiabilidade/ segurança | Avalia se o sistema precisa ser à prova de falhas ou se tem uma missão crítica no modo como afeta a vida das pessoas. Se ele falha, custará muito dinheiro para a empresa? |
| Robustez | A capacidade de lidar com condições de erro e limites durante a execução, caso a conexão de internet caia ou se há falta de energia ou falha no hardware. |
| Escalabilidade | A capacidade de o sistema rodar e operar quando o número de usuários ou requisições aumenta. |

### Características Estruturais da Arquitetura
| Termo | Definição |
|---|---|
| Configuração | A capacidade dos usuários finais de mudar com facilidade os aspectos de configuração do software (com interfaces úteis). |
| Extensão | Como é importante ligar as novas partes da funcionalidade. |
| Instabilidade | Facilidade de instalação do sistema em todas as plataformas necessárias. |
| Aproveitamento/ reutilização | Capacidade de aproveitar os componentes comuns em vários produtos. |
| Localização | Suporte para vários idiomas nas telas de entrada/consulta nos campos de dados; nos relatórios, requisitos de caracteres multibytes e unidades de medidas ou moedas. |
| Manutenção | Quão facilmente aplica as alterações e melhora o sistema? |
| Portabilidade | O sistema precisa rodar em mais de uma plataforma? (Por exemplo, o front-end precisa rodar no Oracle e no banco de dados SAP?) |
| Suporte | De qual nível de suporte técnico a aplicação precisa? Qual nível de registro e outras facilidades são requeridos para depurar os erros no sistema? |
| Atualização | A capacidade de atualizar com facilidade/rapidez uma versão prévia dessa aplicação/solução para uma versão mais nova nos servidores e nos clientes. |

### Características Transversais da Arquitetura
| Termo | Definição |
|---|---|
| Acessibilidade | Acesso a todos os usuários, inclusive com deficiências, como daltonismo e perda auditiva. |
| Armazenamento | Os dados precisarão ser armazenados ou excluídos após um período de tempo? (Por exemplo, as contas do cliente serão excluídas após três meses ou marcadas como obsoletas e armazenadas em um banco de dados secundário para futuro acesso.) |
| Autenticação | Requisitos de segurança para assegurar que os usuários são quem dizem ser. |
| Autorização | Requisitos de segurança para assegurar que os usuários possam acessar apenas certas funções na aplicação (por caso de uso, subsistema, página web, regra comercial, nível do campo etc.). |
| Legalidade | Com quais restrições legais o sistema opera (proteção de dados, Sarbanes Oxley, GDPR etc.)? Quais direitos de reserva a empresa requer? Alguma regulação no modo como a aplicação será criada ou implantada? |
| Privacidade | A capacidade de ocultar as transações dos funcionários internos da empresa (transações criptografadas para que até os DBAs e os arquitetos de rede não possam vê-las). |
| Segurança | Os dados precisam ser criptografados no banco de dados? Criptografados para a comunicação de rede entre os sistemas internos? Qual tipo de autenticação precisa existir para o acesso remoto do usuário? |
| Suporte | De qual nível de suporte técnico a aplicação precisa? Qual nível de registro e outras facilidades são necessários para depurar os erros no sistema? |
| Usabilidade/viabilidade | O nível de treinamento requerido para os usuários atingirem seus objetivos com a aplicação/solução. Os requisitos de utilização precisam ser tratados com a mesma seriedade de qualquer outra questão arquitetural. |

## Aula 09/10

### [Circuit Breaker](https://learn.microsoft.com/en-us/azure/architecture/patterns/circuit-breaker)
O Circuit Breaker é um padrão de arquitetura usado para impedir que uma aplicação continue tentando executar uma operação que provavelmente vai falhar. Ele evita desperdício de recursos, permite que a aplicação continue funcionando mesmo diante de falhas persistentes e ainda detecta quando o problema foi resolvido, voltando a permitir a operação. Seu comportamento é descrito por três estados:

<b>Closed (Fechado):</b> As chamadas são enviadas normalmente. O proxy conta falhas recentes e, se ultrapassar um limite dentro de um período, muda para Open e inicia um temporizador.

<b>Open (Aberto):</b> As chamadas falham imediatamente; nenhuma tentativa é feita até o temporizador expirar. Esse intervalo permite que o sistema se recupere.

<b>Half-Open (Meio Aberto):</b> Apenas algumas chamadas são permitidas. Se forem bem-sucedidas, o Circuit Breaker volta ao estado Closed e reseta o contador de falhas. Se qualquer falha ocorrer, ele retorna ao estado Open e reinicia o temporizador.

Esse mecanismo protege a aplicação, reduz carga desnecessária e ajuda na recuperação controlada após falhas.

## Aula 13/10

### [CQRS](https://learn.microsoft.com/en-us/azure/architecture/patterns/cqrs)
O padrão CQRS (Command Query Responsibility Segregation) separa as operações de escrita (commands) e leitura (queries) de um sistema em modelos diferentes, permitindo otimizar cada um de forma independente. Isso pode melhorar desempenho, escalabilidade e segurança.

#### Problema
Em arquiteturas tradicionais, o mesmo modelo de dados é usado para ler e escrever. À medida que a aplicação cresce, surgem dificuldades porque leitura e escrita têm necessidades diferentes. Isso pode causar:
- Diferenças entre os dados usados para ler e para atualizar.
- Contenção de locks em acessos paralelos.
- Quedas de desempenho por consultas complexas ou alta carga.
- Dificuldade para aplicar regras de segurança adequadas.
- Modelos de dados mais complexos que o necessário.

#### Solução
Separar commands e queries:
- Commands alteram o estado do sistema e representam tarefas de negócio, não simples atualizações de campos:
  - Validação no cliente: evitar enviar comandos que já se sabe que vão falhar.
  - Lógica no servidor: tratar concorrência e falhas (como vários usuários tentando reservar o último quarto).
  - Processamento assíncrono: enfileirar comandos quando apropriado.
- Queries apenas retornam dados, sem modificar o estado, normalmente como DTOs simplificados para leitura.

Essa separação reduz complexidade, facilita otimizações específicas e melhora a organização da lógica de negócio.

## Aula 16/10
### [Retry Pattern](https://learn.microsoft.com/en-us/azure/architecture/patterns/retry)
O padrão Retry permite que uma aplicação lide com falhas transitórias ao acessar serviços ou recursos de rede, repetindo automaticamente operações que falharam. Isso aumenta a estabilidade do sistema.

#### Contexto e problema

Em ambientes de nuvem, é comum ocorrerem falhas temporárias, como:
- Perda momentânea de conexão,
- Indisponibilidade temporária de um serviço,
- Timeouts causados por serviços sobrecarregados.

#### Solução
A aplicação deve ser projetada para esperar e tratar falhas transitórias, repetindo operações de forma transparente e controlada. O padrão Retry é a abordagem mais comum para lidar com esse tipo de cenário em sistemas distribuídos.

### [Fundamentos dos Padrões de Arquiteturas](https://app.minhabiblioteca.com.br/reader/books/9788550819754/epubcfi/6/38%5B%3Bvnd.vst.idref%3Dcap9.xhtml%5D!/4)
Os estilos de arquitetura, por vezes chamados de padrões de arquitetura, descrevem uma relação nomeada de componentes que cobrem várias características da arquitetura. Um nome de estilo de arquitetura, parecido com os padrões de projeto, cria um único nome que atua como atalho entre os arquitetos experientes. Por exemplo, quando um arquiteto fala sobre um bloco monolítico em camadas, seu objetivo na conversa é entender os aspectos da estrutura, quais características da arquitetura funcionam bem (e quais podem causar problemas), os modelos comuns de implementação, as estratégias de dados e muitas outras informações. Assim, os arquitetos devem estar familiarizados com os nomes básicos dos estilos de arquitetura fundamentais e genéricos.

## Aula 20/10 e 23/10
### [Estilo de Arquitetura em Camadas](https://app.minhabiblioteca.com.br/reader/books/9788550819754/epubcfi/6/40%5B%3Bvnd.vst.idref%3Dcap10.xhtml%5D!/4)
A arquitetura em camadas é um dos estilos mais comuns devido à sua simplicidade, baixo custo e por refletir naturalmente a organização das equipes (lei de Conway). Ela organiza a aplicação em camadas horizontais, cada uma com uma responsabilidade técnica específica, como apresentação, negócio, persistência e banco de dados.

#### Estrutura Geral
Aplicações geralmente possuem 3 a 5 camadas, sendo as mais comuns:
- Apresentação – interface com o usuário.
- Negócio (ou comercial) – regras e processamento da aplicação.
- Persistência – mediação com o armazenamento.
- Banco de dados – armazenamento físico dos dados.

As camadas podem ser organizadas física e logicamente de diferentes formas: todas juntas em um único deploy, separadas em múltiplas unidades ou até incluindo o banco de dados embutido.

#### Principais Características
- Separação de responsabilidades: cada camada cuida apenas da sua função (UI, lógica, persistência etc.).
- Abstração: camadas superiores não precisam conhecer detalhes das inferiores.
- Especialização: desenvolvedores podem atuar em áreas específicas (UI, backend, banco).
- Particionamento técnico: os componentes são organizados por função técnica, não por domínio.

## Aula 27/10 
### [Estilo de Arquitetura em Pipeline](https://integrada.minhabiblioteca.com.br/reader/books/9788550819754/epubcfi/6/42%5B%3Bvnd.vst.idref%3Dcap11.xhtml%5D!/4)
A arquitetura de pipelines organiza o processamento em uma sequência de etapas independentes, onde cada etapa (filtro) executa uma tarefa específica e os dados fluem por canais unidirecionais (pipes). É um estilo simples, modular e muito reutilizável, bastante conhecido a partir dos shells Unix (Bash, Zsh) e presente em ferramentas como MapReduce, ETL, EDI, Apache Camel e pipelines de dados em geral.

#### Topologia
- Composta por canais (pipes) e filtros (filters).
- Os canais conectam filtros de forma unidirecional e ponto a ponto, transportando pequenas quantidades de dados para maximizar desempenho.
- Os filtros são componentes autônomos, geralmente sem estado, cada um realizando apenas uma tarefa.

#### Tipos de filtros
- Produtor – origem dos dados; só produz.
- Transformador – recebe dados, transforma e repassa.
- Verificador – filtra com base em critérios; pode descartar ou encaminhar.
- Consumidor – etapa final; pode persistir, exibir ou terminar o fluxo.

#### Características e benefícios
- Forte separação de responsabilidades.
- Composição simples: filtros podem ser combinados de diversas formas.
- Alta reutilização: a mesma etapa pode servir a diferentes pipelines.
- Adequado para processos lineares, sequenciais e unidirecionais.

## Aula 30/10
Implementação de Arquitetura de Pipelines

## Aula 03/11
### [Estilo de Arquitetura Microkernel](https://integrada.minhabiblioteca.com.br/reader/books/9788550819754/epubcfi/6/44%5B%3Bvnd.vst.idref%3Dcap12.xhtml%5D!/4)
A arquitetura microkernel divide uma aplicação em dois grandes blocos:
- <b>Sistema central (microkernel):</b> contém apenas a funcionalidade mínima necessária, o “caminho feliz” e a infraestrutura essencial.
- <b>Plug-ins:</b> módulos independentes que estendem, personalizam ou adicionam funcionalidades ao sistema.

É muito usada em softwares baseados em produto (como IDEs, ferramentas instaladas localmente), mas também aparece em diversos sistemas corporativos.

## Aula 06/11
Implementação de Arquitetura de Microkernel

## Aula 10/11
### [Estilo de Arquitetura Microsserviços](https://integrada.minhabiblioteca.com.br/reader/books/9788550819754/epubcfi/6/54%5B%3Bvnd.vst.idref%3Dcap17.xhtml%5D!/4)
A arquitetura de microsserviços organiza uma aplicação como um conjunto de serviços pequenos, independentes e altamente desacoplados, cada um responsável por um domínio ou fluxo de trabalho específico. Cada serviço tem sua própria lógica, dados e infraestrutura, funcionando de maneira autônoma.

## Aula 13/11
Implementação de Arquitetura de Microsserviços

## Aula 17/11
Finalização da Implementação de Arquitetura de Microsserviços